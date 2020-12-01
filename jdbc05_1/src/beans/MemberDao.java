package beans;

import java.sql.Connection;
import java.sql.PreparedStatement;

import util.JdbcUtil;

//DAO : Data Access Object
//DB와의 연결 및 처리를 담당하는 클래스
public class MemberDao {
	
	//회원등록 메소드
	// - 회원정보(MemberDto)를 받아서 등록한다. 결과는 없다(void).
	public void insert(MemberDto dto) throws Exception{
		Connection con = JdbcUtil.getConnection("web", "web");
		
		String sql = "insert into member values("
				+ "member_seq.nextval, ?, ?, ?, ?, '일반', 0, sysdate)";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, dto.getMember_id());
		ps.setString(2, dto.getMember_pw());
		ps.setString(3, dto.getMember_nick());
		ps.setString(4, dto.getMember_birth());
		ps.execute();
		
		con.close();
	}
	
	//회원수정 메소드
	// - 회원정보(MemberDto)를 받아서 수정한 뒤 성공/실패(boolean)를 반환하다
	public boolean update(MemberDto dto) throws Exception{
		Connection con = JdbcUtil.getConnection("web", "web");
		
		String sql = "update member "
				+ "set member_id=?, member_pw=?, member_nick=?, member_birth=? "
				+ "where member_no=?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, dto.getMember_id());
		ps.setString(2, dto.getMember_pw());
		ps.setString(3, dto.getMember_nick());
		ps.setString(4, dto.getMember_birth());
		ps.setInt(5, dto.getMember_no());
		int result = ps.executeUpdate();
		
//		아래 두 개는 같은 코드
//		if(result > 0) {
//			return true;
//		}
//		else {
//			return false;
//		}
		return result > 0;
	}
	
	//삭제 메소드
	//- 회원 번호(int)를 전달받아 삭제 후 성공/실패(boolean)를 반환한다
	public boolean delete(int member_no) throws Exception {
		Connection con = JdbcUtil.getConnection("web", "web");
		
		String sql = "delete member where member_no=?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, member_no);
		int count = ps.executeUpdate();
		
		con.close();
		
		return count > 0;
	}
}
