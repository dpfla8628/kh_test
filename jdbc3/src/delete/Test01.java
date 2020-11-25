package delete;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Test01 {
	public static void main(String[] args) {
		
		int person_no = 1;
		
		
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","kh","kh");
			
			String sql = "delete person where person_no=?";
			
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, person_no);
			
			//ps.execute();
			int result = ps.executeUpdate();
			
			con.close();
			
			if(result>0) {
				System.out.println(result+"개 삭제 성공");
			}
			
			else {
				System.out.println("삭제 실해");
			}
			
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		
		
		
		
	}

}
