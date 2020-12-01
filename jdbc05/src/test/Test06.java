package test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import util.JdbcUtil;

public class Test06 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//목표 : person테이블의 데이터 수정
		// - 다양한 종류의 수정이 있지만 가장 기본적인 수정 형태를 생각해본다
		// - 모든 정보를 바꾸는것(pk제외)
		
		//데이터 준비(5개 : 4개 수정 + 1개 pk)
		int person_no = 10;
		String person_name = "고친이름";
		int javascore = 99;
		int dbscore = 99;
		String gender = "남자";
		//가입일은 바뀌지 않음
		
		//데이터 수정(update)
		Connection con = JdbcUtil.getConnection("kh", "kh");
		
		String sql = "update person set person_name = ? , "
				+ "javascore = ? , dbscore = ? , gender = ? "
				+ "where person_no = ? ";
		
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, person_name);
		ps.setInt(2, javascore);
		ps.setInt(3, dbscore);
		ps.setString(4, gender);
		ps.setInt(5, person_no);
		
		ps.execute();
		
		con.close();
		
	}
}
