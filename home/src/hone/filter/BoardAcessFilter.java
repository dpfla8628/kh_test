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

import home.beans.BoardDao;
import home.beans.BoardDto;
import home.beans.MemberDao;
import home.beans.MemberDto;

@WebFilter(urlPatterns = {
		"/board/edit.jsp", "/board/edit.do",
		"/board/delete.do"
})
public class BoardAcessFilter implements Filter{
	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		
		HttpServletResponse resp = (HttpServletResponse)response;
		HttpServletRequest req = (HttpServletRequest) request;
		
		try {
			//준비 : 게시글번호, 세션의 회원번호, 세션의 권한
			//계산 : 관리자인지 검증, 본인인지 검증
			//처리 : 요건 충족시 통과, 아니면 403오류 송출
			
			//관리자면 통과
			String auth = (String)req.getSession().getAttribute("auth");
			if(auth!=null && auth.equals("관리자")) {
				chain.doFilter(req, resp);
				return;//else대신 return을 써서 빠져나오자
			}
			
			//본인이면 통과 (로그인아이디랑 게시글작성자랑 같으면)
			int board_no = Integer.parseInt(req.getParameter("board_no"));
			BoardDao boardDao = new BoardDao();
			BoardDto boardDto = boardDao.find(board_no);
			
			int member_no = (int)req.getSession().getAttribute("check");
			MemberDao memberDao = new MemberDao();
			MemberDto memberDto = memberDao.find(member_no);
			
			if(memberDto.getMember_id().equals(boardDto.getBoard_writer())) {
				chain.doFilter(req, resp);
				return;
			}
			
			//위에서 통과하지 못한 경우 오류
			resp.sendError(403);
			
		}
		catch(Exception e) {
			e.printStackTrace();
			resp.sendError(500);
		}
	}
}
