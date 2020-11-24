package insert;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Test01 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("oracle.jdbc.OracleDriver");//준비
		Connection con = DriverManager.getConnection(
				"jdbc:oracle:thin:@localhost:1521:xe","kh","kh");//연결
		
		//(1)
		String sql1 = "create sequence java_seq";
		String sql2 = "insert into person values ( java_seq.nextval, '자바왕', 100, 99, '여자', sysdate)";
		PreparedStatement ps1 = con.prepareStatement(sql1);//전송도구
		PreparedStatement ps2 = con.prepareStatement(sql2);
		ps1.execute();
		ps2.execute();
		
		//(2)
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("이름을 입력하세요");
			String name = sc.next();
		
			if (name.equals("종료")) {
				break;
			}
			String sql3 = "insert into person values(java_seq.nextval, '"+name+"',100, 99, '여자', sysdate)";
			PreparedStatement ps3 = con.prepareStatement(sql3);//전송도구
			ps3.execute();
		}
		con.close();//종료
	}
}
