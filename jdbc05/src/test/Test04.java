package test;

//DAO + DTO생성

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import beans.MemberDto;
import beans.MemberDao;
import beans.PersonDao;
import beans.PersonDto;
import util.JdbcUtil;

public class Test04 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//insert = 등록
		
		//데이터 준비(한덩어리로) -> PersonDto
		MemberDto dto = new MemberDto();
		dto.setMember_id("test");
		dto.setMember_pw("test1234");
		dto.setMember_nick("테스트");
		dto.setMember_birth("2020-10-10");	
		
		//등록구문(모듈화를 통해 이용을 편하게) -> PersonDao
		MemberDao dao = new MemberDao();
		dao.insert(dto);	
	}
}
