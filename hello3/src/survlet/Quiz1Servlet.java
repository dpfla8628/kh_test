package survlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/quiz1.do")
public class Quiz1Servlet extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//[html/jsp]  webcontent(정적).html
		//form을 통해 서블릿으로 전송 시키자!
		//[서블릿]/.do
		//req.getParameter("")        :  사용자에게 데이터(파라미터)를 받는다
		//resp.getWriter().print("")  :  화면에 나타낸다
		
		int age = Integer.parseInt(req.getParameter("age"));
		
		int fare;
		if(age>=65||age<8) {
			fare=0;
		}
		else if(age>=20) {
			fare=1250;
		}
		else if(age>=14) {
			fare=720;
		}
		else{
			fare=450;
		}
		resp.setContentType("text/plain");
		resp.setCharacterEncoding("UTF-8");
		resp.getWriter().println(fare);
	}
}
