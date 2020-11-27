package test;

//DAO + DTO생성

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import beans.PersonDao;
import beans.PersonDto;
import util.JdbcUtil;

public class Test03 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//insert = 등록
		
		//데이터 준비(한덩어리로) -> PersonDto
		PersonDto dto = new PersonDto();
		dto.setPerson_name("테스트");
		dto.setJavascore(90);
		dto.setDbscore(80);
		dto.setGender("여자");
		
		//등록구문(모듈화를 통해 이용을 편하게) -> PersonDao
		PersonDao dao = new PersonDao();
		dao.insert(dto);
		
		
	}

}
