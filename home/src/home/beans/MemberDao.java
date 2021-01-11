package home.beans;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import home.util.JdbcUtil;


public class MemberDao {
	
	public static final String USERID="web";
	public static final String USERPW="web";
	
	//삽입
	public void insert(MemberDto dto) throws Exception{
		Connection con = JdbcUtil.getConnection(USERID,USERPW);
		String sql = "insert into member values(member_seq.nextval, ?, ?, ?, ?,'일반',0,sysdate)";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, dto.getMember_id());
		ps.setString(2, dto.getMember_pw());
		ps.setString(3, dto.getMember_nick());
		ps.setString(4, dto.getMember_birth());
	
		ps.execute();
		con.close();
	}
	//선택
	public List<MemberDto> select() throws Exception{
		Connection con = JdbcUtil.getConnection(USERID,USERPW);
		
		String sql = "select * from member order by member_id";
		PreparedStatement ps = con.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();
		
		List<MemberDto> list = new ArrayList<>();
		while(rs.next()) {
			MemberDto dto = new MemberDto();
			dto.setMember_no(rs.getInt("member_no"));
			dto.setMember_id(rs.getString("member_id"));
			dto.setMember_pw(rs.getString("member_pw"));
			dto.setMember_nick(rs.getString("member_nick"));
			dto.setMember_birth(rs.getString("member_birth"));
			dto.setMember_auth(rs.getString("member_auth"));
			dto.setMember_point(rs.getInt("member_point"));
			dto.setMember_join(rs.getDate("member_join"));
			
			list.add(dto);
		}
		return list;
	}
	//아이디 시작 검사
	// member_id||'%'
	//= instr(member_id , ?)=1
	public List<MemberDto> select(String search_id) throws Exception{
		Connection con = JdbcUtil.getConnection(USERID,USERPW);
		
		String sql = "select * from member where member_id like ?||'%' order by member_id";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, search_id);
		ResultSet rs = ps.executeQuery();
		
		List<MemberDto> list = new ArrayList<>();
		while(rs.next()) {
			MemberDto dto = new MemberDto();
			dto.setMember_no(rs.getInt("member_no"));
			dto.setMember_id(rs.getString("member_id"));
			dto.setMember_pw(rs.getString("member_pw"));
			dto.setMember_nick(rs.getString("member_nick"));
			dto.setMember_birth(rs.getString("member_birth"));
			dto.setMember_auth(rs.getString("member_auth"));
			dto.setMember_point(rs.getInt("member_point"));
			dto.setMember_join(rs.getDate("member_join"));
			
			list.add(dto);
		}
		return list;
	}
	
	//2차 검사
	public List<MemberDto> select(String type, String keyword) throws Exception{
		
		//둘중 하나라도 없으면 null반환
		if(type==null || keyword==null) return null;
		
		Connection con = JdbcUtil.getConnection(USERID,USERPW);
		
		String sql = "select * from member where instr(#1,?)>0 order by member_id";
		sql = sql.replace("#1", type);
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, keyword);
		ResultSet rs = ps.executeQuery();
		
		List<MemberDto> list = new ArrayList<>();
		while(rs.next()) {
			MemberDto dto = new MemberDto();
			dto.setMember_no(rs.getInt("member_no"));
			dto.setMember_id(rs.getString("member_id"));
			dto.setMember_nick(rs.getString("member_nick"));
			dto.setMember_birth(rs.getString("member_birth"));
			dto.setMember_auth(rs.getString("member_auth"));
			dto.setMember_point(rs.getInt("member_point"));
			dto.setMember_join(rs.getDate("member_join"));
			
			list.add(dto);
		}
		return list;
	}
	
	public MemberDto find(String member_id) throws Exception{
		Connection con = JdbcUtil.getConnection(USERID,USERPW);
		String sql = "select * from member where member_id=?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, member_id);
		ResultSet rs = ps.executeQuery();
		
		MemberDto dto = new MemberDto();
		if(rs.next()) {
			dto.setMember_no(rs.getInt("member_no"));
			dto.setMember_id(rs.getString("member_id"));
			dto.setMember_nick(rs.getString("member_nick"));
			dto.setMember_birth(rs.getString("member_birth"));
			dto.setMember_auth(rs.getString("member_auth"));
			dto.setMember_point(rs.getInt("member_point"));
			dto.setMember_join(rs.getDate("member_join"));
		}
		else {
			dto=null;
		}
		con.close();
		return dto;
		
	}
	public MemberDto find(int member_no) throws Exception{
		Connection con = JdbcUtil.getConnection(USERID,USERPW);
		String sql = "select * from member where member_no=?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, member_no);
		ResultSet rs = ps.executeQuery();
		
		MemberDto dto = new MemberDto();
		if(rs.next()) {
			dto.setMember_no(rs.getInt("member_no"));
			dto.setMember_id(rs.getString("member_id"));
			dto.setMember_nick(rs.getString("member_nick"));
			dto.setMember_birth(rs.getString("member_birth"));
			dto.setMember_auth(rs.getString("member_auth"));
			dto.setMember_point(rs.getInt("member_point"));
			dto.setMember_join(rs.getDate("member_join"));
		}
		else {
			dto=null;
		}
		con.close();
		return dto;
		
	}
	public boolean update(MemberDto dto) throws Exception{
		Connection con = JdbcUtil.getConnection(USERID,USERPW);
		String sql = "update member set member_nick=?,member_birth=?"
				+ "where member_no=? and member_pw=?";
		PreparedStatement ps = con.prepareStatement(sql);
		
		ps.setString(1, dto.getMember_nick());
		ps.setString(2, dto.getMember_birth());
		ps.setInt(3, dto.getMember_no());
		ps.setString(4, dto.getMember_pw());
		
		int count = ps.executeUpdate();
		con.close();
		return count>0;
	}
	//관리자용 회원 수정
	public boolean a_update(MemberDto dto) throws Exception{
		Connection con = JdbcUtil.getConnection(USERID,USERPW);
		String sql = "update member set member_nick=?,member_birth=?,member_point=?,member_auth=?"
				+ "where member_no=?";
		PreparedStatement ps = con.prepareStatement(sql);
		
		ps.setString(1, dto.getMember_nick());
		ps.setString(2, dto.getMember_birth());
		ps.setInt(3, dto.getMember_point());
		ps.setString(4, dto.getMember_auth());
		ps.setInt(5, dto.getMember_no());
		
		int count = ps.executeUpdate();
		con.close();
		return count>0;
	}
	
	//아이디 비번 찾기
	public boolean find(MemberDto dto) throws Exception{
		Connection con = JdbcUtil.getConnection(USERID,USERPW);
		String sql = "select * from member where member_id=? and member_pw=? ";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, dto.getMember_id());
		ps.setString(2, dto.getMember_pw());
		ResultSet rs = ps.executeQuery();//쿼리문이 실행되어 결과로 반환된 데이터들을 관리
		
		boolean result = rs.next();//데이터 가져올 필요 없음! 그냥 있어요?라고만 물어보자
		
		con.close();
		return result;
		
	}
	public boolean delete(int member_no) throws Exception{
		Connection con = JdbcUtil.getConnection("web", "web");
		String sql = "delete member where member_no=?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, member_no);
		int count = ps.executeUpdate();
		
		con.close();
		
		return count>0;
	
	}
	public boolean editpw(int member_no , String member_pw, String new_pw) throws Exception{
		Connection con = JdbcUtil.getConnection(USERID, USERPW);
		String sql = "update member set member_pw = ? where member_no=? and member_pw=?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1,new_pw);
		ps.setInt(2, member_no);
		ps.setString(3, member_pw);
		
		int count = ps.executeUpdate();
		
		con.close();
		return count>0;
	
	}
	//관리자용 비밀번호 변경
	public boolean a_editpw(int member_no ,String new_pw) throws Exception{
		Connection con = JdbcUtil.getConnection(USERID, USERPW);
		String sql = "update member set member_pw = ? where member_no=?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1,new_pw);
		ps.setInt(2, member_no);
		
		int count = ps.executeUpdate();
		
		con.close();
		return count>0;
	
	}
}