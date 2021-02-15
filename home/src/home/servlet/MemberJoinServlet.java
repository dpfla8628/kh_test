package home.servlet;

import java.io.IOException;
import java.sql.SQLIntegrityConstraintViolationException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import home.beans.MemberDao;
import home.beans.MemberDto;

@WebServlet(urlPatterns = "/member/join.do")
public class MemberJoinServlet extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		try {
			//준비
			req.setCharacterEncoding("utf-8");
			MemberDto dto = new MemberDto();
			dto.setMember_id(req.getParameter("member_id"));
			dto.setMember_pw(req.getParameter("member_pw"));
			dto.setMember_nick(req.getParameter("member_nick"));
			dto.setMember_birth(req.getParameter("member_birth"));
			
			//처리
			MemberDao dao = new MemberDao();
			dao.insert(dto);
			
			//결과
			resp.sendRedirect("join_success.jsp");
			
		}
		//아이디,닉네임 중복시 발생하는 예외
		catch(SQLIntegrityConstraintViolationException e) {
			resp.sendRedirect("join_fail.jsp");
		}
		catch(Exception e) {
			e.printStackTrace();
			resp.sendError(500);
		}
	}
}
