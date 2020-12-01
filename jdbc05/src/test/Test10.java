package test;

import java.sql.SQLException;

import beans.MemberDao;
import beans.MemberDto;

public class Test10 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		int member_no =1;
		
		
		MemberDao dao = new MemberDao();
		boolean success = dao.delete(member_no);
		System.out.println(success);
	}

}
