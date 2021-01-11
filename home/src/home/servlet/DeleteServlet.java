package home.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import home.beans.MemberDao;
import home.beans.MemberDto;

@WebServlet(urlPatterns = "/member/delete.do")
public class DeleteServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			//파라미터로 값을 받아오면 보안에 취약, 세션을 받아오자
			//int member_no = Integer.parseInt(req.getParameter("member_no"));
			int member_no = (int)req.getSession().getAttribute("check");
			
			MemberDao dao = new MemberDao();
			//boolean result = 
			dao.delete(member_no);
			
			//if(result) {
				req.getSession().removeAttribute("check");
				resp.sendRedirect("delete.jsp");		
			//}
		}
		catch(Exception e) {
			e.printStackTrace();
			resp.sendError(500);
		}
	
	
	}
}
