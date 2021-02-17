package mvc.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mvc.beans.BoardDao;
import mvc.beans.BoardDto;

@WebServlet(urlPatterns = "/board/list.do")
public class BoardListServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			
			BoardDao dao = new BoardDao();
			List<BoardDto> dto = dao.select();
			
			req.setAttribute("list", dto);
			req.getRequestDispatcher("/WEB-INF/board/list.jsp").forward(req, resp);
			
		}
		catch(Exception e) {
			e.printStackTrace();
			resp.sendError(500);
		}
	}
}
