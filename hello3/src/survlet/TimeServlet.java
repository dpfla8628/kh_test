package survlet;

import java.io.IOException;
import java.time.LocalDateTime;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/time.kh")
public class TimeServlet extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		//resp의 과정
		//http://localhost:8888/hello3/time.kh => 아파치톰켓으로 요청 => @WebServlet(urlPatterns = "/time.kh")
		
		//resp의 상황(가게 주문결과에 비유)
		//1. 주문한 메뉴를 완성해서 전달 (OK , 200)
		//2. 잘못 주문했음을 알림 (Not found, 404)
		//3. 주문이 불가능함을 알림(재고소진, 내부사정) (Internal Server Error, 500)
		//4. 다른 메뉴를 권유 (Redirect, 302)
		
		//확인하는법
		//개발자도구(f12)->network =>200?ok /404?주소잘못씀
		
		//resp는 응답 정보 객체로서 사용자에게 보여질 정보들을 설정하거나 제어할 수 있다.
		//내장된 출력도구를 이용하여 메세지를 화면에 출력해라(Sysout대신)
		
		//인코딩에 대한 설명이 없으면 아스키코드(ASCII)로 인식하기때문에 한글 인식이 안됨
		//resp를 이용해 사용자가 받을 화면의 인코딩 방식을 정할 수 있다!
		//EUC-KR , CP949(MS949), UTF-8
		resp.setCharacterEncoding("UTF-8"); //형태를 text라고 정해줘야 잘 나옴
		resp.getWriter().println("현재시각 : "+LocalDateTime.now());
		
		//resp를 이용하면 사용자가 받을 화면의 형태를 정할 수 있다.
		// = 텍스트 문서 , HTML 파일, 음악 파일, 동영상 파일, RDF, PPTX	
		// = MIME type이라고 부르며, ("대분류/소분류") 형태로 작성
		resp.setContentType("text/plain");
	
	}

}
