package servlet;

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import beans.PersonDao;
import beans.PersonDto;

@WebServlet(urlPatterns = "/person/regist.do")
public class PersonServlet extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		try {
			//
			req.setCharacterEncoding("utf-8");

			//준비(DTO)
			PersonDto dto = new PersonDto();
			dto.setPerson_name(req.getParameter("person_name"));
			dto.setJavascore(Integer.parseInt(req.getParameter("javascore")));
			dto.setDbscore(Integer.parseInt(req.getParameter("dbscore")));
			dto.setGender(req.getParameter("gender"));
			
			//처리(DAO)
			PersonDao dao = new PersonDao();
			dao.insert(dto);
			
			//출력
			//결과를 보여줄 때 일반 글자("text/plain")가 아니라 ("text/html") 형식으로 보여줘야 한다!
			//하지만 문자열로 직접 출력하면 효율성이 매우 낮음	
			//해결책 : 외부에 html 파일을 만들고 해당 파일로 재접속을 지시한다
				//resp.setContentType("text/html");
				//resp.setCharacterEncoding("utf-8");
				//resp.getWriter().println("<h1>등록완료!</h1>");
			//**redirect : 다시 접속해라
			//[화면 : regist.html] -> (서블릿(내부페이지) : regist.do) -> [화면 : regist_result.html]
			//resp.sendRedirect("다시 접속할 페이지 주소");
			resp.sendRedirect("regist_result.html");//상대경로
		}
		catch(Exception e) {
			e.printStackTrace();
			resp.sendError(500);
		}
		
	
	}
}
