package test;

import java.sql.SQLException;
import java.util.List;

import beans.MemberDao;
import beans.MemberDto;

public class Test17 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		String member_nick="테";
		
		MemberDao dao = new MemberDao();
		List<MemberDto> list = dao.search(member_nick);
		for(MemberDto dto : list) {
			System.out.println(dto.getMember_no());
			System.out.println(dto.getMember_id());
			System.out.println(dto.getMember_nick());
		}
		
		
	}

}
