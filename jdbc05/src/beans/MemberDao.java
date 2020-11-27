package beans;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import util.JdbcUtil;

//기능

public class MemberDao {
	//등록메소드

	//데이터 한 덩어리로 준비
	public void insert(MemberDto dto) throws SQLException, ClassNotFoundException {		
		Connection con = JdbcUtil.getConnection("web","web");
		String sql = "insert into member values(1,?,?,?,?,'일반',0,sysdate)";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, dto.getMember_id());
		ps.setString(2, dto.getMember_pw());
		ps.setString(3, dto.getMember_nick());
		ps.setString(4, dto.getMember_birth());
		ps.execute();
		System.out.println("성공!");
		con.close();		
	}
}
