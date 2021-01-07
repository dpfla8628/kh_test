package servlet;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(urlPatterns = "/member/joinA.do")
public class QuizAservlet extends HttpServlet{

	//dopost : post 방식의 요청만 받는 처리 메소드! /대부분의 경우에 사용!
	//doget : get 방식의 요청만 수신
	//service : 모든 요청 방식을 전부 수식 / 선호되지 않는 메소드
	
	//디비를 가져오려면? Jdbc Driver 파일이 꼭 필요하다!
	
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		//처리
		//예외 추가 안되는 이유? dopost 메소드가 재정의 된거라 더 늘어날 수 없다 =>try-catch사용
		//앞으로는 try-catch로 전체를 감싼 뒤, 예외가 발생하면 사용자에게 알림+에러 로그 출력
		try {
			//수신(준비)
			req.setCharacterEncoding("utf-8");//한글복구
			String member_id = req.getParameter("member_id");
			String member_pw = req.getParameter("member_pw");
			String member_nick = req.getParameter("member_nick");
			String member_birth = req.getParameter("member_birth");
			
			//처리
			Class.forName("oracle.jdbc.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","web","web");
			String sql = "insert into member values(member_seq.nextval,?,?,?,?,'일반',0,sysdate)";
			
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, member_id);
			ps.setString(2, member_pw);
			ps.setString(3, member_nick);
			ps.setString(4, member_birth);
			
			ps.execute();
			con.close();	
			
			//출력
			resp.setContentType("text/plain");
			resp.setCharacterEncoding("utf-8");
			
			resp.getWriter().println("아이디 : "+member_id);
			resp.getWriter().println("비밀번호 : "+member_pw);
			resp.getWriter().println("닉네임 : "+member_nick);
			resp.getWriter().println("생년월일 : "+member_birth);
			
		}
		catch(Exception e) {
			e.printStackTrace();//에러 로그 출력
			resp.sendError(HttpURLConnection.HTTP_INTERNAL_ERROR);//사용자에게 오류가 발생했음을 알려준다(500)
		}
	}
}
