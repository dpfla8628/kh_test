package home.servlet;
/*
 * 게시글 작성 서블릿
 * =등록한 글의 번호를 무조건 알아내야 한다
 */

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import home.beans.BoardDto;

@WebServlet(urlPatterns = "/board/write.do")
public class BoardWriteServlet extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			//준비
			req.setCharacterEncoding("utf-8");
			BoardDto dto = new BoardDto();
			dto.setBoard_header(req.getParameter("board_header"));
			dto.setBoard_title(req.getParameter("board_title"));
			dto.setBoard_content(req.getParameter("board_content"));
			
			//처리
			
			//출력
			resp.sendRedirect("detail.jsp?board_no=");
		}
		catch(Exception e) {
			e.printStackTrace();
			resp.sendError(500);
		}
	}
}
