package home.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/member/logout.do")
public class LogoutServlet extends HttpServlet{
	@Override
	//매우 간단한 작업이니까 get으로 보냄
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
		//세션 유지하면서 데이터만 삭제
			//서블릿에서는 session대신 req.getSession()을 이용해 세션에 접근
			req.getSession().removeAttribute("check");
			//auth도 삭제
			req.getSession().removeAttribute("auth");
			
		// = 위 두줄과 같은 코드. 세션을 파괴하라!(세션 만료)
			//req.getSession().invalidate();
			
			resp.sendRedirect(req.getContextPath()); //=../index.jsp
		}
		catch(Exception e) {
			e.printStackTrace();
			resp.sendError(500);
		}
	
	}
}
