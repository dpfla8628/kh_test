package select;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Test01 {
	public static void main(String[] args) {
		//select 를 이해해보자
		// - 사용할 명령 : select * from student;
		
		// - 예상 결과 
		//피카츄/60
		//파이리/60
		//....
		
		
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			Connection con = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:xe","kh","kh");
			
			String sql ="select * from student";
			PreparedStatement ps = con.prepareStatement(sql);
			//ps.execute(); 실행을 원하는게 아니라 값을 보고싶어
			
			//실행한 뒤 결과집합(ResultSet)에 접근할 수 있는 기능을 가진 객체(rs)를 얻어내는 명령
			//표에 접근하고싶어!!
			ResultSet rs = ps.executeQuery();
			
			//첫번째줄
			rs.next();//데이터가 있으면(true 한줄 단위 접근! 
			System.out.println(rs.getString(1));
			System.out.println(rs.getInt(2));
			//위와 같음
			//System.out.print(rs.getString("name"));
			//System.out.print(rs.getInt("score"));

			//두번째줄
			rs.next();
			System.out.println(rs.getString(1));
			System.out.println(rs.getInt(2));
			//세번째줄
			rs.next();
			System.out.println(rs.getString(1));
			System.out.println(rs.getInt(2));

			//네번째줄
			rs.next();
			System.out.println(rs.getString(1));
			System.out.println(rs.getInt(2));
			
			
			
			con.close();
			System.out.println("조회완료!");
		
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		
		
	}

}
