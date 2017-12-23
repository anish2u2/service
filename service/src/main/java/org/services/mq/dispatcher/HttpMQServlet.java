package org.services.mq.dispatcher;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;

import org.jboss.resteasy.plugins.server.servlet.HttpServletDispatcher;

/**
 * This Servlet will serve for handling messaging over http.
 * 
 * @author Anish Singh
 *
 */
public class HttpMQServlet extends HttpServletDispatcher {

	private static final long serialVersionUID = 14564565L;

	@Override
	public void init(ServletConfig config) throws ServletException {

		super.init(config);
	}

	@Override
	public void destroy() {

		super.destroy();
	}
}
