
//목표 : select count(*) from person을 자바에서 실행한 뒤 결과 출력

package select;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Test08 {
	public static void main(String[] args) {
	
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			Connection con = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:xe","kh","kh");
			
			String sql = ("select count(*) cnt from person");
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			
			//count(*)처럼 숫자 하나만 나오는 경우라도 결과집합을 사용한다!
			//cnt도 테이블의 데이터임! exeupdate로 구할수는 없음
			
			//주의 : count(*)는 무조건 결과가 1개 나온다!!!
			//따라서 while문을 쓸 필요가 없음!
			rs.next();
			System.out.println(rs.getInt("cnt"));
			
			con.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}

	}
	
}
