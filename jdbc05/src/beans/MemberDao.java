package beans;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import util.JdbcUtil;

//기능

public class MemberDao {
	//등록메소드

	//데이터 한 덩어리로 준비
	public void insert(MemberDto dto) throws SQLException, ClassNotFoundException {		
		Connection con = JdbcUtil.getConnection("web","web");
		String sql = "insert into member values(2,?,?,?,?,'일반',0,sysdate)";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, dto.getMember_id());
		ps.setString(2, dto.getMember_pw());
		ps.setString(3, dto.getMember_nick());
		ps.setString(4, dto.getMember_birth());
		ps.execute();
		System.out.println("성공!");
		con.close();		
	}
	
	public boolean update(MemberDto dto) throws SQLException, ClassNotFoundException {		
		Connection con = JdbcUtil.getConnection("web","web");
		String sql = "update member set member_id =? ,"
				+ "member_pw = ?,member_nick= ? ,member_birth= ? "
				+ "where member_no =1";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, dto.getMember_id());
		ps.setString(2, dto.getMember_pw());
		ps.setString(3, dto.getMember_nick());
		ps.setString(4, dto.getMember_birth());
		
		int result = ps.executeUpdate();
	
		con.close();	
		
		if(result > 0)
			return true;
		else
			return false;
	}
	
	public boolean delete(int member_no) throws ClassNotFoundException, SQLException {
		Connection con = JdbcUtil.getConnection("web", "web");
		String sql = "delete member where member_no=?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, member_no);
		
		int count = ps.executeUpdate();
		return count>0;
		
	}
	
	//조회 메소드
	//- 회원 목록(List<MemberDto>)을 반환한다
	public List<MemberDto> select() throws Exception {
		Connection con = JdbcUtil.getConnection("web", "web");
		
		String sql = "select * from member";
		PreparedStatement ps = con.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();//select용 명령
		
		List<MemberDto> list = new ArrayList<>();
		
		while(rs.next()) {
			MemberDto dto = new MemberDto();
			dto.setMember_id(rs.getString("member_id"));
			dto.setMember_pw(rs.getString("member_pw"));
			dto.setMember_nick(rs.getString("member_nick"));
			dto.setMember_birth(rs.getString("member_nick"));
			
			list.add(dto);
		}
		
		con.close();
		
		return list;
	}
}
