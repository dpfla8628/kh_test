package test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import beans.PersonDao;
import beans.PersonDto;
import util.JdbcUtil;

public class Test06_1 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//목표 : person테이블의 데이터 수정
		// - 다양한 종류의 수정이 있지만 가장 기본적인 수정 형태를 생각해본다
		// - 모든 정보를 바꾸는것(pk제외)
		
		//데이터 준비(5개 : 4개 수정 + 1개 pk)
		PersonDto dto = new PersonDto();
		dto.setPerson_no(11);
		dto.setPerson_name("아무개");
		dto.setJavascore(99);
		dto.setDbscore(99);
		dto.setGender("남자");
		
		//데이터 수정(update)
		PersonDao dao = new PersonDao();
		
		//dao.update(dto); 불린형으로 처리결과를 확인해보자~
		boolean success = dao.update(dto);
		System.out.println("처리결과 : "+success);
	}
}
