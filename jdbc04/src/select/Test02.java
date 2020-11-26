package select;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Test02 {
	public static void main(String[] args) {
		//select 를 이해해보자

		try {
			Class.forName("oracle.jdbc.OracleDriver");
			Connection con = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:xe","kh","kh");
			
			String sql ="select * from student";
			PreparedStatement ps = con.prepareStatement(sql);

			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				System.out.println(rs.getString("name"));
				System.out.println(rs.getInt("score"));				
			}
			
			con.close();
			System.out.println("조회완료!");
		
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		
		
	}

}
