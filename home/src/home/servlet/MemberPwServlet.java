package home.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import home.beans.MemberDao;
import home.beans.MemberDto;

@WebServlet(urlPatterns = "/member/pw.do")
public class MemberPwServlet extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

	try {
		int member_no = (int)req.getSession().getAttribute("check");
		String member_pw = (req.getParameter("member_pw"));
		String new_pw = req.getParameter("new_pw");
		
		MemberDao dao = new MemberDao();
		boolean result = dao.editpw(member_no, member_pw, new_pw);
		
		if(result) {
			if(member_pw.equals(new_pw)) {
				resp.sendRedirect("pw.jsp?error2");
			}
			else {
				resp.sendRedirect("my.jsp");
			}
		}
		else {
			resp.sendRedirect("pw.jsp?error1");
		}
	}
	catch(Exception e) {
		e.printStackTrace();
		resp.sendError(500);
	}
	
	}
}
