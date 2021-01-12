package hone.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebFilter(urlPatterns = {
		"/member/my.jsp",//내정보
		"/member/logout.do",//로그아웃
		"/member/edit.jsp","/member/edit.do",//수정
		"/member/delete.do",//삭제
		"/member/pw.jsp","/member/pw.do",//비밀번호 변경
		"/board/*"//게시판
		})
public class MemberFilter implements Filter{
	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		//DB를 불러오면 느려지기때문에 웬만하면 쓰지말자! 그러므로 지금은 try catch가 필요없음
		
		HttpServletRequest req = (HttpServletRequest)request;
		HttpServletResponse resp = (HttpServletResponse)response;
		
		//int는 null이 없으니 조심하자! 쓰고싶다면 Integer 사용
		boolean result = req.getSession().getAttribute("check")!=null;
		
		if(result) {
			chain.doFilter(request, response);
		}
		else {
			//resp.sendError(401);
			//필터도 어느 페이지에서 실행될지 모르기 때문에 절대경로 사용
			//사용자의 재접속
			resp.sendRedirect(req.getContextPath()+"/member/login.jsp");
		}
		
	
	}
}
