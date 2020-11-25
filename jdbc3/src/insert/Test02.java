package insert;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Test02 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("oracle.jdbc.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","kh","kh");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("이름 입력");
		String name = sc.next();
		System.out.println("자바 점수 입력");
		int java = sc.nextInt();
		System.out.println("디비 점수 입력");
		int db = sc.nextInt();
		System.out.println("성별 입력");
		String gender = sc.next();
		
		String sql = "insert into person(person_name, javascore,dbscore,gender) values(?,?,?,?)";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, name);
		ps.setInt(2, java);
		ps.setInt(3, db);
		ps.setString(4, gender);
		
		ps.execute();
		
		sc.close();
		con.close();
	}

}
