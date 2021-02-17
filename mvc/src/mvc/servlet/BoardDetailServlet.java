package mvc.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mvc.beans.BoardDao;
import mvc.beans.BoardDto;

@WebServlet(urlPatterns = "/board/detail.do")
public class BoardDetailServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			
			int board_no = Integer.parseInt(req.getParameter("board_no"));
			
			BoardDao dao = new BoardDao();
			BoardDto dto = dao.find(board_no);
			
			req.setAttribute("board", dto);
			req.getRequestDispatcher("/WEB-INF/board/detail.jsp").forward(req, resp);
			
		}
		catch(Exception e) {
			e.printStackTrace();
			resp.sendError(500);
		}
	}
}
