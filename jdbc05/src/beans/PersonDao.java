package beans;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import util.JdbcUtil;

//기능

public class PersonDao {
	//등록메소드
	// - 등록을 하려면 사용자가 이름, 자바점수, DB점수, 성별을 입력해야한다(프로그램이 할 수 없는 것) : 매개변수
	// - 등록을 마치면 사용자에게 알려줄 정보가 없다 : 반환형
	public void insert(String person_name, int javascore, int dbscore, String gender) throws ClassNotFoundException, SQLException {		
		Connection con = JdbcUtil.getConnection("kh","kh");
		String sql = "insert into person values(person_seq.nextval,?,?,?,?,sysdate)";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, person_name);
		ps.setInt(2, javascore);
		ps.setInt(3, dbscore);
		ps.setString(4, gender);
		ps.execute();
		System.out.println("성공!");
		con.close();		
	}

	//데이터 한 덩어리로 준비
	public void insert(PersonDto dto) throws SQLException, ClassNotFoundException {		
		Connection con = JdbcUtil.getConnection("kh","kh");
		String sql = "insert into person values(person_seq.nextval,?,?,?,?,sysdate)";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, dto.getPerson_name());
		ps.setInt(2, dto.getJavascore());
		ps.setInt(3, dto.getDbscore());
		ps.setString(4, dto.getGender());
		ps.execute();
		System.out.println("성공!");
		con.close();		
	}


}
