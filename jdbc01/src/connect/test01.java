package connect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class test01 {
public static void main(String[] args) throws ClassNotFoundException, SQLException {
	//JDBC(Java DataBase Connectivity)
	// - java에서 db에 연결하기 위한 모든 형태의 작업
	// - db는 oracle인데... java에서 이 정보를 알아야한다
	// - oracle에서 제공하는 자바를 위한 라이브러리를 등록해야한다.(ojdbc.jar)
	// - 프로젝트 우클릭 -> build path -> configure build path 후 등록
	
	//오라클에 연결하기 위한 과정
	//1. 연결을 준비한다. (오라클에서 제공하는 준비 도우미 호출)
	//2. 연결을 실행한다. (로그인 - 아이디/비번/+접속주소)
	//3. 연결을 종료한다. (명령 실행)
	
	//1. oracle.jdbc > OracleDriver 불러오기
	//	 oracle.jdbc.driver > OracleDriver은 예전버전(x)
	Class.forName("oracle.jdbc.OracleDriver");
	System.out.println("준비 성공!");
	
	//2. 
	//주소가 뭐지? conn kh/kh = conn kh/kh@localhost:1521/xe;
	//jdbc:oracle:thin : 연결을 위해 사용되는 도구의 종류
	//localhost : 데이터베이스의 위치(IP)
	//1521 : 테이버 베이스의 접속 포트(port)
	//xe : 데이터베이스 SID(식별자)
	//DriverManager.getConnection(주소,계정,비번);
	Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","kh","kh");
	System.out.println("로그인 성공!");
	
	//3.
	con.close();
	System.out.println("로그아웃 성공!");

	}
}
