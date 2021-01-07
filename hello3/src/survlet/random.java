package survlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/random.do")//주소생성 및 등록
public class random extends HttpServlet{//상속

	@Override
	//service 재정의
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		List a = new ArrayList<>();
		
		for(int i=0; i<6; i++) {
			int random = (int)(Math.random()*45)+1;
			if(!a.contains(random)) {
				a.add(random);
			}
			else {
				i--;
			}
		}
		resp.getWriter().println(a);
	}
}
