package test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import beans.PersonDao;
import util.JdbcUtil;

public class Test09 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//일반적인 삭제는 무슨 항목으로 할까?(person기준)
		//전체 삭제는 있을 수 없다
		//삭제는 Primary Key를 이용해서 하나씩 지운다
		
		//데이터 준비
		///하나 있으니까 굳이 dto 만들 필요는 없음
		int person_no =26;
		
		//DB처리(DAO)
		PersonDao dao = new PersonDao();
		boolean result = dao.delete(person_no);
		
		if(result) {
			System.out.println("삭제가 완료되었습니다");
		}
		else {
			System.out.println("해당하는 번호에 대한 정보가 존재하지 않습니다");
		}
		
	}

}
