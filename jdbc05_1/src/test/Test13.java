package test;

import java.sql.SQLException;
import java.util.List;

import beans.MemberDao;
import beans.MemberDto;

public class Test13 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//memberdao를 이용한 목록 조회
		
		//데이터 준비(x)
		
		//데이터 조회
		MemberDao dao = new MemberDao();
		List<MemberDto> list = dao.select();

		for(MemberDto dto : list) {
			System.out.println(dto.getMember_id());
			System.out.println(dto.getMember_nick());
		}
	}



}
