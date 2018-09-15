package lti.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloServlet
 */
public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private int visitor;
	
	
	
	@Override
	public void init() throws ServletException {

visitor =1001;
	}



	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		
		// response MIME type
		response.setContentType("text/html");

		// getting response stream to write generated HTML output
		PrintWriter out = response.getWriter();

		// writing html to response stream
		out.println("<h1>HelloWorld</h1><hr>");
		out.println("<h2>Welcome to JavaServlet</h2>");

		// getting servlet config object

		ServletConfig config = getServletConfig();
		// reading init-param from config
		String author = config.getInitParameter("Author");
		out.println("<h2>Author is " + author + "</h2>");
		out.println("<h2>Servlet Name" + config.getServletName() + "</h2>");

		LocalDate now = LocalDate.now();
		out.println("<h2>Visit Date :"+now+"</h2>");
		out.println("<h2>Visitor Number:"+visitor++ +"</h2>");
	}

}
