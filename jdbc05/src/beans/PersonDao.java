package beans;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import util.JdbcUtil;

//기능

public class PersonDao {
	//등록메소드
	// - 등록을 하려면 사용자가 이름, 자바점수, DB점수, 성별을 입력해야한다(프로그램이 할 수 없는 것) : 매개변수
	// - 등록을 마치면 사용자에게 알려줄 정보가 없다 : 반환x
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

	//수정메소드
	//PersonDto를 전달받아 수정을하고 반환은 없다(void)
	//아래 코드는 설공 실패 여부를 알 수 없어!!!
	// => PersonDto를 전달받아 수정을하고 성공/실패를 반환하자(boolean)
	//public void update(PersonDto dto) throws SQLException, ClassNotFoundException {
	public boolean update(PersonDto dto) throws SQLException, ClassNotFoundException {
		Connection con = JdbcUtil.getConnection("kh", "kh");
		
		String sql = "update person set person_name = ? , "
				+ "javascore = ? , dbscore = ? , gender = ? "
				+ "where person_no = ? ";
		
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, dto.getPerson_name());
		ps.setInt(2, dto.getJavascore());
		ps.setInt(3, dto.getDbscore());
		ps.setString(4, dto.getGender());
		ps.setInt(5, dto.getPerson_no());
		
		//결과 행수를 알기 위한 실행구문~~
		int result =  ps.executeUpdate();//boolean
		
		con.close();
		
		//실행 결과가 수정된 행이 1개 이상이라면? 성공! 아니면? 실패! 반환
		if(result > 0) 	return true;
		else 			return false;
	}

	//삭제 메소드
	public boolean delete(int person_no) throws ClassNotFoundException, SQLException {
		Connection con = JdbcUtil.getConnection("kh", "kh");
		String sql = "delete person where person_no =?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, person_no);
		
		//성공실패여부 확인하기
		int count = ps.executeUpdate();
		
		con.close();

		return count>0;
	}
	
	
	//조회 메소드
	//- 회원 목록(List<PersonDto>)을 반환한다
	public List<PersonDto> select() throws Exception {
		Connection con = JdbcUtil.getConnection("kh", "kh");
		
		String sql = "select * from person";
		PreparedStatement ps = con.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();//select용 명령
		
		//rs는 연결 끊어지면 사용이 불가능해서 원하는 시점에 원하는 장소에 출력하기가 매우 어렵다
		//기왕 이렇게 된거 rs에 들어있는 데이터를 연결 끊어지기 전에 List<PersonDto>로 변환하자!
		//1. 비어있는 List를 준비한다.
		List<PersonDto> list = new ArrayList<>();
		
		//2. 데이터 개수만큼 압축하여 List에 추가한다.
		while(rs.next()) {
			PersonDto dto = new PersonDto();//비어있는 객체를 생성
			//int person_no = rs.getInt("person_no");//rs에서 person_no를 꺼내라!
			//dto.setPerson_no(person_no);//dto에 person_no를 넣어라!
			dto.setPerson_no(rs.getInt("person_no"));//person_no를 rs에서 dto로 옮겨라!
			dto.setPerson_name(rs.getString("person_name"));//person_name을 rs에서 dto로 옮겨라!
			dto.setJavascore(rs.getInt("javascore"));//javascore를 rs에서 dto로 옮겨라!
			dto.setDbscore(rs.getInt("dbscore"));//dbscore를 rs에서 dto로 옮겨라!
			dto.setGender(rs.getString("gender"));//gender를 rs에서 dto로 옮겨라!
			dto.setRegist_date(rs.getDate("regist_date"));//regist_date를 rs에서 dto로 옮겨라!
			
			//정보가 담긴 dto를 list에 추가해라!
			list.add(dto);
		}
		
		con.close();
		
		//준비완료된 목록을 반환하겠다!
		return list;
	}
	
}
