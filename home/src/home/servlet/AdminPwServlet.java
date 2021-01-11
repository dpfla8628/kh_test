package home.servlet;

import java.io.IOException;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import home.beans.MemberDao;
import home.util.StringUtil;

//유일하게 서블릿(.do)->jsp로 이동한다

@WebServlet(urlPatterns = "/admin/pw.do")
public class AdminPwServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			//관리자라서 기존의 비밀번호 필요 없음!
			int member_no = Integer.parseInt(req.getParameter("member_no"));
			
			String new_pw = StringUtil.generateRandomString(10);
			
			MemberDao dao = new MemberDao();
			boolean result = dao.a_editpw(member_no, new_pw);
			
			if(result) {
				//방법1. 리다이렉트에 파라미터를 추가하여 데이터를 전달하는 방법
				//= 사용자가 이 페이지를 떠나서 다시 들어오도록 하는 방식
				//= 전화로치면 끊고 다시 연락주세요
				//resp.sendRedirect("pw.jsp?new_pw="+new_pw);
				
				//방법2. forward
				//= 사용자의 연결을 유지한 채 다른 페이지로 전달하는 방식
				//= 전화로치면 통화가 연결된 상태로 다른 부서로 전달되는 방식
				//= 뒷페이지는 앞페이지와 이어진다(합쳐서 한 페이지가 된다)
				//= 데이터를 원하는만큼 전달할 수 있다.
				// 서블릿에서 처리하고 그 다음 화면으로 무엇인가 보내야 할 때 사용한다
				req.setAttribute("password", new_pw);//뒷페이지에서 사용할 데이터 추가(연결 종료 전까지만 사용)
				req.getRequestDispatcher("pw.jsp").forward(req, resp);
			}
			else {
				resp.sendError(404);
			}
		}
		catch(Exception e){
			e.printStackTrace();
			resp.sendError(500);
		}
		
	}
}
