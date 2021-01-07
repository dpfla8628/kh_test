package survlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/dice.do")
public class dice extends HttpServlet{

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//Random r = new Random();
		//int dice = e.nextInt(6)+1;
		int a =(int)(Math.random()*6)+1;
		resp.getWriter().println(a);
	}

}
