package select;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Test06 {
	// 목표 : 그룹 조건을 설정하여 조회
	public static void main(String[] args) {
	
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			Connection con = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:xe","kh","kh");
			
			String sql = ("select gender, count(*)CNT from person group by gender");
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				System.out.println(rs.getString("gender"));
				System.out.println(rs.getInt("CNT"));//별칭으로 꺼내기
			}
			
			con.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}

	}
	
}
