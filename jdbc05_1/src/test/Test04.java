package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Test04 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//DAO, DTO없이 member테이블에 insert 하는 코드 작성
		
		//데이터 준비(8개중에 4개 준비)
		String member_id = "test3";
		String member_pw = "test3";
		String member_nick = "테스트3";
		String member_birth = "2020-11-30";
		
		//데이터 처리(등록)
		Class.forName("oracle.jdbc.OracleDriver");
		Connection con = DriverManager.getConnection(
				"jdbc:oracle:thin:@localhost:1521:xe", "web", "web");
		
		String sql = "insert into member values("
				+ "member_seq.nextval, ?, ?, ?, ?, '일반', 0, sysdate)";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, member_id);
		ps.setString(2, member_pw);
		ps.setString(3, member_nick);
		ps.setString(4, member_birth);
		ps.execute();
		
		con.close();
	}
}