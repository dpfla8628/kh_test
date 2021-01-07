package survlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/quiz2.do")
public class Quiz2Servlet extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//입력 : people, day, month
		
		int people = Integer.parseInt(req.getParameter("people"));
		int day = Integer.parseInt(req.getParameter("day"));
		int month = Integer.parseInt(req.getParameter("month"));
		
//		String weather;
//		int price=people*100000;
//		double total;
//		
//		if(month>=3 && month<=5) {
//			weather="봄";
//			total=price*0.7;
//		}
//		else if(month>=6 && month<=8) {
//			weather="여름";
//			total=price;
//		}
//		else if(month>=9 && month<=11) {
//			weather="가을";
//			total=price*0.85;
//		}
//		else {
//			weather="겨울";
//			total=price*0.95;
//		}
	
//		resp.setCharacterEncoding("utf-8");
//		resp.setContentType("text/plain");
//		resp.getWriter().print(weather+" / "+total);
		
		int rate;
		if(month/3==1)		rate=30;
		else if(month/3==2) rate=0;
		else if(month/3==3) rate=15;
		else				rate=5;
		
		int total = people * day * 10000;
		int discount = total * rate/100;
		int result = total - discount;
		
		//출력
		resp.setContentType("text/plain");
		resp.setCharacterEncoding("UTF-8");
		resp.getWriter().println(result);
		
	}
}
