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
		//커밋을 안해도 기본적으로 자동커밋이 되도록 설정되어 있다
		// - 수동 커밋으로 변경하면 내가 직접 커밋을 실행할 수 있다
		
		//(2)
		Scanner sc = new Scanner(System.in);

		System.out.println("이름을 입력하세요");
		String name = sc.next();
			
		//name에 '||(select person_name from person where rownum=1)||'와같은 구문도 넣을 수 있다
		//의도적으로 따옴표를 붙여서 추출했다. 이런걸 sql인젝션이라고 부른다(공격)

	//정적 sql 방식 : 구문과 값을 있는 그대로 합쳐서 전송
		// 문제점 : 특수문자 오류 방생 가능, sql 인젝션 공격 가능 ( 강제 구문 삽입 공격)
		String sql3 = "insert into person values("
				+ "java_seq.nextval, '"+name+"',100, 99, '여자', sysdate)";
		PreparedStatement ps3 = con.prepareStatement(sql3);//전송도구
		ps3.execute();
		
		
	//동적 sql 방식 : 구문은 그대로 두고 값을 변조시켜 합친 뒤 전송
		//PreparedStatement에 존재하는 "값 채우기 기능"을 사용하려 변조된 값을 삽입
		String sql = "insert into person values("
				+ "java_seq.nextval, ? ,100, 99, '여자', sysdate)";
		PreparedStatement ps = con.prepareStatement(sql);//전송도구
		
		//ps님! 1번째 물음표에 person_name을 String 형태로 알아서 채워주세요!
		ps.setString(1, name);
		
		ps.execute();
		System.out.println(sql);
		
		
			
		con.close();//종료
		
		
	}
}
