package test;

import java.util.List;

import beans.PersonDao;
import beans.PersonDto;

public class Test15 {
	public static void main(String[] args) throws Exception {
		//person 테이블의 데이터를 검색
		//select * from person where person_name=?
		//select * from person where person_name like'%'||?||'%'
		//select * from person where instr(person_name,?)>0
		//select * from person where javascore = ?
		
		//데이터 준비
		String person_name = "가나다";
		
		//데이터 검색
		PersonDao dao = new PersonDao();
		List<PersonDto> list = dao.search(person_name);
		
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
