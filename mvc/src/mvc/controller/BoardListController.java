package mvc.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mvc.beans.BoardDao;
import mvc.beans.BoardDto;

public class BoardListController implements Controller{
	@Override
	public String process(HttpServletRequest req, HttpServletResponse resp) throws Exception {
		BoardDao dao = new BoardDao();
		List<BoardDto> dto = dao.select();
	
		req.setAttribute("list",dto);
		return "/WEB-INF/board/list.jsp";
	}
}
