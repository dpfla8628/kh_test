package test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import util.JdbcUtil;

public class Test01 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//insert = 등록
		
		//데이터 준비
		String person_name = "가나다";
		int javascore = 66;
		int dbscore = 85;
		String gender = "남자";
		
		//등록구문
		Connection con = JdbcUtil.getConnection("kh","kh");
		String sql = "insert into person values(person_seq.nextval,?,?,?,?,sysdate)";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, person_name);
		ps.setInt(2, javascore);
		ps.setInt(3, dbscore);
		ps.setString(4, gender);
		ps.execute();
		con.close();
		
		
		
	}

}
