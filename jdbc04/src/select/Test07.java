
//web 계정의 product 테이블을 조회 : 종류(type)별 개수(cnt),평균판매가,가장비싼가격

package select;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Test07 {
	public static void main(String[] args) {
	
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			Connection con = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:xe","web","web");
			
			String sql = ("select type , count(*) cnt, avg(price) avg, max(price) max from product group by type");
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				System.out.println(rs.getString("type"));
				System.out.println(rs.getInt("cnt"));
				System.out.println(rs.getDouble("avg"));
				System.out.println(rs.getInt("max"));
			}
			
			con.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}

	}
	
}
