package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import beans.MemberDto;

public class Test04_1 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//DAO, DTO없이 member테이블에 insert 하는 코드 작성
		
		//데이터 준비(8개중에 4개 준비)
		MemberDto dto = new MemberDto();
		dto.setMember_id("test5");
		dto.setMember_pw("test5");
		dto.setMember_nick("테스트5");
		dto.setMember_birth("2020-11-30");
		
		//데이터 처리(등록)
		Class.forName("oracle.jdbc.OracleDriver");
		Connection con = DriverManager.getConnection(
				"jdbc:oracle:thin:@localhost:1521:xe", "web", "web");
		
		String sql = "insert into member values("
				+ "member_seq.nextval, ?, ?, ?, ?, '일반', 0, sysdate)";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, dto.getMember_id());
		ps.setString(2, dto.getMember_pw());
		ps.setString(3, dto.getMember_nick());
		ps.setString(4, dto.getMember_birth());
		ps.execute();
		
		con.close();
	}
}