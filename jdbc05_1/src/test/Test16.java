package test;

import java.util.List;

import beans.PersonDao;
import beans.PersonDto;

public class Test16 {
	public static void main(String[] args) throws Exception {
		//person 테이블의 데이터를 검색
		//select * from person where javascore = ?
		
		//데이터 준비
		int javascore = 99;
		
		//데이터 검색
		PersonDao dao = new PersonDao();
		List<PersonDto> list = dao.search(javascore);
		
		//출력
		for(PersonDto dto : list) {
			System.out.println(dto.getPerson_no());
			System.out.println(dto.getPerson_name());
			System.out.println(dto.getJavascore());
			System.out.println(dto.getDbscore());
			System.out.println(dto.getGender());
			System.out.println(dto.getRegist_date());
		}
	}

}
