package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class Test10 {
	public static void main(String[] args) {
	
		try {
			//미리 만들어둔 메소드를 불러서 연결 생성
			Connection con = JdbcUtil.getConnection();
			String sql = "select * from person";
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				System.out.println(rs.getString("person_name"));
			}
			
			//rs.close(); 굳이? 아래 con.close()를 통해 연쇄적으로 다 닫힌다!
			//ps.close();
			con.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}

	}
	
}
