package mvc.servlet;

import java.io.IOException;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/dice.do")
public class DiceServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			//주사위 생성 코드
			Random r = new Random();
			int dice = r.nextInt(6)+1;
			
			//첨부 코드
			//dice란 이름으로 dice 변수의 값을 첨수
			req.setAttribute("dice", dice);
			
			//forward코드
			req.getRequestDispatcher("/WEB-INF/views/dice.jsp").forward(req, resp);
		}
		catch(Exception e) {
			e.printStackTrace();
			resp.sendError(500);
		}
	}
}
