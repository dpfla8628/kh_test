package test;

//DAO생성

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import beans.PersonDao;
import util.JdbcUtil;

public class Test02 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//insert = 등록
		
		//데이터 준비 -> PersonDto
		String person_name = "가나다";
		int javascore = 66;
		int dbscore = 85;
		String gender = "남자";
		
		//등록구문(모듈화를 통해 이용을 편하게) -> PersonDao
		PersonDao dao = new PersonDao();
		dao.insert(person_name, javascore, dbscore, gender);
		
		
		
	}

}
