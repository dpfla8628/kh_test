package mvc.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mvc.beans.BoardDao;
import mvc.beans.BoardDto;

public class BoardDetailController implements Controller {
	public String process(HttpServletRequest req, HttpServletResponse resp)throws Exception{
		int board_no = Integer.parseInt(req.getParameter("board_no"));
		
		BoardDao dao = new BoardDao();
		BoardDto dto = dao.find(board_no);
		
		req.setAttribute("board", dto);
		return "/WEB-INF/board/detail.jsp";
	}
}
