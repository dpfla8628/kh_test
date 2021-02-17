package mvc.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mvc.beans.BoardDao;
import mvc.beans.BoardDto;

//이 서블릿에서는 게시글 등록과 관련된 2가지 작업을 방식으로 구분하여 처리
//1.GET 방식으로 요청이 오면 "작성 페이지"로 포워드
//2.POST 방식으로 요청이 오면 "등록 페이지"로 포워드
@WebServlet(urlPatterns = "/board/write.do")
public class BoardWriteServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			req.getRequestDispatcher("/WEB-INF/board/write.jsp").forward(req, resp);
		}
		catch(Exception e) {
			e.printStackTrace();
			resp.sendError(500);
		}
	}
	
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException ,IOException {
		try {
			req.setCharacterEncoding("utf-8");
			BoardDto dto = new BoardDto();
			dto.setBoard_header(req.getParameter("board_header"));
			dto.setBoard_title(req.getParameter("board_title"));
			dto.setBoard_content(req.getParameter("board_content"));
			dto.setBoard_writer("admin");
			
			BoardDao dao = new BoardDao();
			int board_no = dao.getSequence();
			dto.setBoard_no(board_no);
			dao.writeWithPrimaryKey(dto);
			
			//forward의 경우 새로고침시 삽입이 중복 발생하기때문에 rediect로 새로고침 방지!
			resp.sendRedirect("detail.do?board_no="+board_no);
		}
		catch(Exception e) {
			e.printStackTrace();
			resp.sendError(500);
		}
	}
}
