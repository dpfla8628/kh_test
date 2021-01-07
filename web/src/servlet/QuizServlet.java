package servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import sun.print.resources.serviceui;
@WebServlet(urlPatterns = "/member/join.do")
public class QuizServlet extends HttpServlet{

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
			req.setCharacterEncoding("utf-8");
			resp.setContentType("text/plain");
			resp.setCharacterEncoding("utf-8");
		
			String member_id = req.getParameter("member_id");
			String member_pw = req.getParameter("member_pw");
			String member_nick = req.getParameter("member_nick");
			String member_birth = req.getParameter("member_birth");
			
			resp.getWriter().println("아이디 : "+member_id);
			resp.getWriter().println("비밀번호 : "+member_pw);
			resp.getWriter().println("닉네임 : "+member_nick);
			resp.getWriter().println("생년월일 : "+member_birth);
			
			try {
				//데이터베이스 등록
				Class.forName("oracle.jdbc.OracleDriver");
				Connection con = DriverManager.getConnection(
							"jdbc:oracle:thin:@localhost:1521:xe", "web", "web");				
				
				String sql = "insert into member values(member_seq.nextval,?,?,?,?,'일반',0,sysdate)";
				
				PreparedStatement ps = con.prepareStatement(sql);
				ps.setString(1, member_id);
				ps.setString(2, member_pw);
				ps.setString(3, member_nick);
				ps.setString(4,member_birth);
				
				ps.execute();
				System.out.println("완료!");
				con.close();							
			}
			catch(SQLException e) {
				e.printStackTrace();
			}catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
			
	}
}
