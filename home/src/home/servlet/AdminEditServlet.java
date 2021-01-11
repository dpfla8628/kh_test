package home.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import home.beans.MemberDao;
import home.beans.MemberDto;

@WebServlet(urlPatterns = "/admin/edit.do")
public class AdminEditServlet extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			//준비
			req.setCharacterEncoding("utf-8");
			MemberDto dto = new MemberDto();
			dto.setMember_no(Integer.parseInt(req.getParameter("member_no")));
			dto.setMember_nick(req.getParameter("member_nick"));
			dto.setMember_birth(req.getParameter("member_birth"));
			dto.setMember_point(Integer.parseInt(req.getParameter("member_point")));
			dto.setMember_auth(req.getParameter("member_auth"));
			
			MemberDao dao = new MemberDao();
			boolean result = dao.a_update(dto);
			
			//출력
			if(result) {
				resp.sendRedirect("detail.jsp?member_no="+dto.getMember_no());
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
