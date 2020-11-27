package select;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class Test05 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("찾고싶은 이름을 입력하세요.");
		String name = sc.next();
		
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","kh","kh");
			
			String sql = "select * from person where instr(person_name,?)>0 ";
//			String sql = "select * from person where person_name like '%'||?||'%' ";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, name);
			
			//resultset을 얻어내고 실행시켜 데이터를 가져오자!!!
			ResultSet rs = ps.executeQuery();
			
			//데이터가 없을때는?
			int count = 0;
			
			while(rs.next()) {
				System.out.print(rs.getInt(1)+"/");	
				System.out.print(rs.getString(2)+"/");
				System.out.print(rs.getInt(3)+"/");
				System.out.print(rs.getInt(4)+"/");
				System.out.print(rs.getString(5)+"/");
				System.out.print(rs.getDate(6)+"\n");
				count++;
			}
			if(count==0) {
				System.out.println("검색 결과가 존재하지 않습니다!");
			}
			System.out.println("총"+count+"개의 결과가 조회되었습니다");
			
			con.close();
		
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		
		
	}

}
