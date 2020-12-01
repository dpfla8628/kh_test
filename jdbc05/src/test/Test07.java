package test;

import java.sql.SQLException;

import beans.MemberDao;
import beans.MemberDto;

public class Test07 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		MemberDto dto = new MemberDto();
		dto.setMember_id("아이디");
		dto.setMember_pw("비번");
		dto.setMember_nick("닉네임");
		dto.setMember_birth("2020-20-20");
		
		
		MemberDao dao = new MemberDao();
		boolean success = dao.update(dto);
		System.out.println(success);
	}

}
