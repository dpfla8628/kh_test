package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import beans.BoardDao;
import beans.BoardDto;

@WebServlet(urlPatterns = "/board/write.do")
public class BoardWriteServlet extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		try {
			req.setCharacterEncoding("utf-8");
			
			BoardDto dto = new BoardDto();
			dto.setBoard_writer(req.getParameter("board_writer"));
			dto.setBoard_header(req.getParameter("board_header"));
			dto.setBoard_title(req.getParameter("board_title"));
			dto.setBoard_content(req.getParameter("board_content"));
			
			BoardDao dao = new BoardDao();
			dao.insert(dto);
			
			//resp.sendRedirect("write_result.html");
			resp.sendRedirect("write_result.jsp");
		}
		catch(Exception e) {
			e.printStackTrace();
			resp.sendError(500);
		}
	}
}
