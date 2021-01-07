package survlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/quiz3.do")
public class Quiz3Servlet extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String type = req.getParameter("type");
		double amount = Double.parseDouble(req.getParameter("amount"));
		
		double result = 0;
		
		resp.setContentType("text/plain");
		resp.setCharacterEncoding("UTF-8");
		
		if(type.equals("kr-us")) {
			result=amount*0.00091;	
			resp.getWriter().println(result+"달러");
		}
		else if(type.contentEquals("us-kr")) {
			result = amount*1093.89;
			resp.getWriter().println(result+"원");
		}
				
	}
}
