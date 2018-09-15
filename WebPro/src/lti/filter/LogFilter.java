package lti.filter;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;


public class LogFilter implements Filter {
	public void init(FilterConfig fConfig) throws ServletException {
	}

	public void destroy() {
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {

		
		System.out.println("Visit time "+new Date());
		System.out.println("Visitor IP"+request.getRemoteAddr());
		
		//long time=System.currentTimeMillis();
		
		chain.doFilter(request, response);
		
		//System.out.println("Page served in "+(System.currentTimeMillis()-time)+" ms");
		PrintWriter out = response.getWriter();
		out.println("<hr><center>&copy; 201 L&amp;T Infotech</center>");
	}


}
