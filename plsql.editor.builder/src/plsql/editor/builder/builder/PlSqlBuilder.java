package plsql.editor.builder.builder;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Map;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceDelta;
import org.eclipse.core.resources.IResourceDeltaVisitor;
import org.eclipse.core.resources.IResourceVisitor;
import org.eclipse.core.resources.IncrementalProjectBuilder;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;

public class PlSqlBuilder extends IncrementalProjectBuilder {

	public static final String BUILDER_ID = "plsql.builder.plsqlBuilder";

	private static final String MARKER_TYPE = "plsql.builder.plsqlProblem";

	private Connection connection;

	public PlSqlBuilder() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			this.connection = DriverManager.getConnection("db-url", "db-user", "db-password");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void checkPlSql(IResource resource) {
		if (resource instanceof IFile && resource.getName().endsWith(".pls")) {
			IFile file = (IFile) resource;
			deleteMarkers(file);

			try {
				Statement createStatement = connection.createStatement();
				String text = getFileContents(file);
				createStatement.execute("create or replace " + text);

				Statement errorStatement = connection.createStatement();
				ResultSet errorResult = errorStatement
				    .executeQuery("select line, position, text from user_errors");
				while (errorResult.next()) {
					int line = errorResult.getInt("line");
					int position = errorResult.getInt("position");
					String message = errorResult.getString("text");

					addMarker(file, message, line, IMarker.SEVERITY_ERROR);
				}

				connection.commit();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	@Override
	protected IProject[] build(int kind, Map args, IProgressMonitor monitor) throws CoreException {
		if (kind == FULL_BUILD) {
			fullBuild(monitor);
		} else {
			IResourceDelta delta = getDelta(getProject());
			if (delta == null) {
				fullBuild(monitor);
			} else {
				incrementalBuild(delta, monitor);
			}
		}
		return null;
	}

	private void fullBuild(final IProgressMonitor monitor) throws CoreException {
		try {
			getProject().accept(new PlSqlResourceVisitor());
		} catch (CoreException e) {
			e.printStackTrace();
		}
	}

	private void incrementalBuild(IResourceDelta delta, IProgressMonitor monitor)
	    throws CoreException {
		// the visitor does the work.
		delta.accept(new PlSqlDeltaVisitor());
	}

	private void addMarker(IFile file, String message, int lineNumber, int severity) {
		try {
			IMarker marker = file.createMarker(MARKER_TYPE);
			marker.setAttribute(IMarker.MESSAGE, message);
			marker.setAttribute(IMarker.SEVERITY, severity);
			if (lineNumber == -1) {
				lineNumber = 1;
			}
			marker.setAttribute(IMarker.LINE_NUMBER, lineNumber);
		} catch (CoreException e) {
			e.printStackTrace();
		}
	}

	private void deleteMarkers(IFile file) {
		try {
			file.deleteMarkers(MARKER_TYPE, false, IResource.DEPTH_ZERO);
		} catch (CoreException e) {
			e.printStackTrace();
		}
	}

	private static String getFileContents(IFile file) {
		StringBuffer sb = new StringBuffer();
		try {
			java.io.InputStream input = file.getContents();
			byte[] buffer = new byte[1024];

			try {
				while ((input.read(buffer)) >= 0)
					sb.append(new String(buffer));
			} finally {
				if (input != null)
					input.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return sb.toString();
	}

	private class PlSqlDeltaVisitor implements IResourceDeltaVisitor {

		@Override
		public boolean visit(IResourceDelta delta) throws CoreException {
			IResource resource = delta.getResource();
			switch (delta.getKind()) {
			case IResourceDelta.ADDED:
				// handle added resource
				checkPlSql(resource);
				break;
			case IResourceDelta.REMOVED:
				// handle removed resource
				break;
			case IResourceDelta.CHANGED:
				// handle changed resource
				checkPlSql(resource);
				break;
			}
			// return true to continue visiting children.
			return true;
		}
	}

	private class PlSqlResourceVisitor implements IResourceVisitor {

		@Override
		public boolean visit(IResource resource) {
			checkPlSql(resource);
			// return true to continue visiting children.
			return true;
		}
	}
}
