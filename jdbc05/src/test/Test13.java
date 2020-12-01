package test;

import java.sql.SQLException;
import java.util.List;

import beans.MemberDao;
import beans.MemberDto;
import beans.PersonDao;
import beans.PersonDto;

public class Test13 {
	public static void main(String[] args) throws Exception {
		//member 테이블의 모든 데이터를 조회하여 출력
			
		//조회
		MemberDao dao = new MemberDao();
		List<MemberDto> list = dao.select();
		
		System.out.println("개수 : "+list.size());
		
		for(MemberDto dto : list) {
			System.out.println("아이디 "+dto.getMember_id());
			System.out.println("비번 :"+dto.getMember_pw());
			System.out.println("닉네임:"+dto.getMember_nick());
			System.out.println("생일:"+dto.getMember_birth());
		}
	}
}