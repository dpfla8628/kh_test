package home.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLIntegrityConstraintViolationException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import home.beans.MemberDao;
import home.beans.MemberDto;

@WebServlet(urlPatterns = "/member/login.do")
public class LoginServlet extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			//정보수신
			
			req.setCharacterEncoding("utf-8");

//			방법1
//			String member_id = req.getParameter("member_id");
//			String member_pw = req.getParameter("member_pw");

			//방법2
			MemberDto dto = new MemberDto();
			dto.setMember_id(req.getParameter("member_id"));
			dto.setMember_pw(req.getParameter("member_pw"));
			
			//디비 조회
			MemberDao dao = new MemberDao();
			boolean result = dao.find(dto);
		
			//리다이렉트처리
			if(result) {
				//서블릿에서는 내장객체가 없어서 요청 객체인 req를 이용하여 세션에 접근하도록 설계되어있다
				MemberDto m = dao.find(dto.getMember_id());
				// + 로그인에 성공한 경우 세션에 check란 이름으로 사용자의 번호를 저장
				req.getSession().setAttribute("check", m.getMember_no());

				//상대경로 : ("../");
				//절대경로 : (req.getContextPath()+"/index.jsp");
				resp.sendRedirect("/home/index.jsp");
			}
			else {
	            resp.sendRedirect("login.jsp?error");
			}	
		}
		catch(Exception e) {
			e.printStackTrace();
			resp.sendError(500);
		}
	}
}


