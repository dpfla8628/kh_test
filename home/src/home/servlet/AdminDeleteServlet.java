package home.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import home.beans.MemberDao;

@WebServlet(urlPatterns = "/admin/delete.do")
public class AdminDeleteServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			//준비
			//자신이 탈퇴하는 페이지인 /member/delete.do는 세션에서 본인의 회원번호를 가져온다
			//다른 회원을 탈퇴시키는 페이지인 /admin/delete.do 는 파라미터를 통해 회원번호 가져온다
			int member_no = Integer.parseInt(req.getParameter("member_no"));
			
			//처리
			MemberDao dao = new MemberDao();
			boolean result = dao.delete(member_no);
			
			//출력
			if(result) {
				resp.sendRedirect("list.jsp");
			}
			else {
				resp.sendError(404);//404는 not found라는 의미(해당 데이터 없음)
			}
		}
		catch(Exception e) {
			e.printStackTrace();
			resp.sendError(500);
		}
	}
}
