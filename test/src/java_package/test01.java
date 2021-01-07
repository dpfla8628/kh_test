package java_package;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.Date;

public class test01 {
	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		Class.forName("oracle.jdbc.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","web","web");
		
		String id = "admin";
		String pass = "admin123";
		String nick = "운영자";
		String birth = "2020-11-11";
		
		//String seq = "create sequence member_seq";
		String sql = "insert into member values(member_seq.nextval,?,?,?,?,'일반',0,sysdate)";
		
		//PreparedStatement ps1 = con.prepareStatement(seq);
		PreparedStatement ps2 = con.prepareStatement(sql);
			
		ps2.setString(1, id);
		ps2.setString(2, pass);
		ps2.setString(3, nick);
		ps2.setString(4,birth);
		
		//ps1.execute();
		ps2.execute();
		System.out.println("성공!");
		con.close();
		
		
		
	}

}