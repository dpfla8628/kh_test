
//목표 : select count(*) from person을 자바에서 실행한 뒤 결과 출력

package select;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class Test09 {
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("시작 구간");
		int first = sc.nextInt();
		System.out.println("마지막 구간");
		int last = sc.nextInt();
		
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			Connection con = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:xe","kh","kh");
			
			String sql = ("select * from ("
					+ "			select rownum rn , TMP.* from("
					+ "				select * from person order by javascore desc)"
					+ "			TMP)"
					+ "		where rn between ? and ?");
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, first);
			ps.setInt(2, last);
			ResultSet rs = ps.executeQuery();
			

			while(rs.next()) {
				System.out.print(rs.getInt("rn")+"/");
				System.out.print(rs.getInt("person_no")+"/");
				System.out.print(rs.getString("person_name")+"/");
				System.out.print(rs.getInt("javascore")+"/");
				System.out.print(rs.getInt("dbscore")+"/");
				System.out.print(rs.getString("gender")+"/");
				System.out.print(rs.getDate("regist_date")+"\n");
			
			}
			con.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}

	}
	
}
