package update;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Test01 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("번호 입력");
		int no = sc.nextInt();
		System.out.println("자바 점수 입력");
		int java = sc.nextInt();
		System.out.println("디비 점수 입력");
		int db = sc.nextInt();
		
		sc.close();
		
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","kh","kh");
		
			//con.setAutoCommit(false);//수동커밋으로 설정
			
			String sql = "update person set javascore= ?, dbscore= ? where person_no =?";
			
			PreparedStatement ps = con.prepareStatement(sql);
	
			ps.setInt(1,java);
			ps.setInt(2,db);
			ps.setInt(3, no);
			
			ps.execute();
		
			//con.commit();//커밋을 실행하라!
			con.close();
			System.out.println("완료!");
		}
		catch(Exception e) {
			e.printStackTrace();//예외 메세지를 화면에 출력(처리 안한 것 처럼.. 개발자용)
		}
		
		
	}

}
