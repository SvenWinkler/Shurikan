package org.jedev.domain.org.jedev.control;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Copyright by Jedev
 * User: bskert
 * Date: 24/05/14
 * Time: 18:02
 */
@WebServlet( name = "Backlog", urlPatterns = "/" )
public class BacklogServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		resp.getWriter().write("Backlog");
	}
}
