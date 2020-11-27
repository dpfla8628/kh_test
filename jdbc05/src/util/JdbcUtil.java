package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/*
	이 클래스는 어떻게하면 데이터베이스에서 발생하는 중복코드를 간소화할지 고민한 결과입니다
	매번 나오는 드라이버 호출과 연결을 간소화 시킬 수 있도록 메소드를 만듭니다.
	그리고 쉽고 편하게 부를 수 있도록 등록합니다(static) 다른곳에서도 사용 사능
*/
public class JdbcUtil {

	//연결 생성 메소드(getConnection)
	public static Connection getConnection(String a , String b) throws ClassNotFoundException, SQLException {
		Class.forName("oracle.jdbc.OracleDriver");
		Connection con = DriverManager.getConnection(
				"jdbc:oracle:thin:@localhost:1521:xe",a,b);
		return con;
		
	}

	
}
