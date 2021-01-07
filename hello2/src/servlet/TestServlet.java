package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
 * 서블릿(Servlet)
 * -웹에서 서비스가 가능한 자바파일
 
 * 1.처음부터 다 만들것이 아니므로 제공되는 HttpServlet을 상속
 *  - HttpServlet은 자바 표준 API가 아니라 Apache Tomcat에서 제공)
 
 * 2. 전송방식에 따른 처리메소드 결정
 *  - 처리방식을 구분하지 않으면 service메소드를 재정의, 구분한다면 해당하는 방식의 메소드를 재정의
 
 * 3. 주소를 부여하며 등록
 *  - @WebServlet으로 사용할 서블릿을 등록(옵션으로 주소 설정)
 */

@WebServlet(urlPatterns = "/test.do")
public class TestServlet extends HttpServlet{

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//req : 사용자(손님) 정보
		//resp : 사용자가 가져갈 결과물(화면)의 정보
		
		//사용자가 받게 될 화면은 resp의 명령을 이용하여 만들어 낼 수 있다.
		//홈페이지에서 출력하는거라 System.out.println()은 안됨
		resp.getWriter().println("Hello");
	
	}

}
