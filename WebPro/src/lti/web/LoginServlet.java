package lti.web;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
			//reading request parameters
		String paramUser = request.getParameter("user");
		String paramPass = request.getParameter("pass");

		// getting init params

		ServletConfig config = getServletConfig();
		String initUser = config.getInitParameter("User");
		String initPass = config.getInitParameter("Pass");

		if (paramUser.equals(initUser) && paramPass.equals(initPass)) {
			//successful login
			response.sendRedirect("hello.jsp");

		}

		else {
			//login failed
			response.sendRedirect("login.jsp?invalid=yes");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
