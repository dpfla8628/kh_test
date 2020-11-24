package connect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Test03 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("oracle.jdbc.OracleDriver");//준비
		Connection con = DriverManager.getConnection(
				"jdbc:oracle:thin:@localhost:1521:xe","kh","kh");//연결

		//SQL명령을 준비하여 실행하도록 코드를 준비
		// - 세미콜론 금지(자바가 대신 찍어줌)
		String sql = "create sequence java_seq";
		PreparedStatement ps = con.prepareStatement(sql);//전송도구
		ps.execute();
		
		
		con.close();//종료
		System.out.println("완료!");
	}
}
