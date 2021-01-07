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
			//서블릿에서는 session대신 req.getSession()을 이용해 세션에 접근
			req.getSession().removeAttribute("check");
			resp.sendRedirect(req.getContextPath()); //=../index.jsp
		}
		catch(Exception e) {
			e.printStackTrace();
			resp.sendError(500);
		}
	
	}
}
