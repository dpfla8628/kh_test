package mvc.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mvc.beans.BoardDao;
import mvc.beans.BoardDto;

@WebServlet(urlPatterns = "/board/edit.do")
public class BoardEditServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {

			int board_no = Integer.parseInt(req.getParameter("board_no"));
			
			BoardDao dao = new BoardDao();
			BoardDto dto = dao.find(board_no);
			
			req.setAttribute("boardDto", dto);
			
			req.getRequestDispatcher("/WEB-INF/board/edit.jsp").forward(req, resp);
		}
		catch(Exception e) {
			e.printStackTrace();
			resp.sendError(500);
		}
	}
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			req.setCharacterEncoding("utf-8");
			
			BoardDao dao = new BoardDao();
			BoardDto dto = new BoardDto();
			dto.setBoard_no(Integer.parseInt(req.getParameter("board_no")));
			dto.setBoard_header(req.getParameter("board_header"));
			dto.setBoard_title(req.getParameter("board_title"));
			dto.setBoard_content(req.getParameter("board_content"));
			boolean result = dao.update(dto);
			if(result) {
				resp.sendRedirect("detail.do?board_no="+dto.getBoard_no());
			}
		}
		catch(Exception e) {
			e.printStackTrace();
			resp.sendError(500);
		}
	}
}
