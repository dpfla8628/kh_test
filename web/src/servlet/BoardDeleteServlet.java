package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import beans.BoardDao;
import beans.BoardDto;

@WebServlet(urlPatterns = "/board/delete.do")
public class BoardDeleteServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			//1.번호를 받는다
			int board_no = Integer.parseInt(req.getParameter("board_no"));
			
			//2.삭제한다
			BoardDao dao = new BoardDao();
			boolean result = dao.delete(board_no);
			
			//3.결과에 따라 리다이렉스 처리
			if(result) {
				//resp.sendRedirect("delete_success.jsp");
				resp.sendRedirect("list3.jsp");
			}
			else {
				resp.sendRedirect("delete_fail.jsp");
			}
		}
		catch(Exception e) {
			e.printStackTrace();
			resp.sendError(500);
		}
	}
}
