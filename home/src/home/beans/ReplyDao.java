package home.beans;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import home.util.JdbcUtil;

public class ReplyDao {
	public static final String USERNAME = "web";
	public static final String PASSWORD = "web";
	
	public void insert(ReplyDto replyDto) throws Exception{
		Connection con = JdbcUtil.getConnection(USERNAME, USERNAME);
		String sql = "insert into reply values(reply_seq.nextval,?,sysdate,?,?)";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, replyDto.getReply_content());
		ps.setInt(2, replyDto.getReply_origin());
		ps.setString(3, replyDto.getReply_writer());
		ps.execute();
		
		con.close();
	}
	
	public List<ReplyDto> select(int reply_origin) throws Exception{
		Connection con = JdbcUtil.getConnection(USERNAME, USERNAME);
		//최근 작성한 글이 위로 가려면 날짜를 최신순으로 정렬하기보다 고유번호인 reply_no를 오름차순(1,2,3,...)으로 정렬하자
		String sql = "select * from reply where reply_origin=? order by reply_no asc";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, reply_origin);
		ResultSet rs = ps.executeQuery();
		
		List<ReplyDto> list = new ArrayList<>();
		while(rs.next()) {
			ReplyDto replyDto = new ReplyDto();
			replyDto.setReply_no(rs.getInt("reply_no"));
			replyDto.setReply_content(rs.getString("reply_content"));
			replyDto.setReply_time(rs.getDate("reply_time"));
			replyDto.setReply_origin(rs.getInt("reply_origin"));
			replyDto.setReply_writer(rs.getString("reply_writer"));
			list.add(replyDto);
			}
		con.close();
		return list;
		
	}
	
	public void delete(int reply_no) throws Exception{
		Connection con = JdbcUtil.getConnection(USERNAME, USERNAME);
		String sql = "delete reply where reply_no=?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, reply_no);
		ps.execute();
		
		con.close();
	}
	
//	댓글 수정
	public void update(ReplyDto replyDto) throws Exception {
		Connection con = JdbcUtil.getConnection(USERNAME, PASSWORD);
		
		String sql = "update reply set reply_content = ? where reply_no = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, replyDto.getReply_content());
		ps.setInt(2, replyDto.getReply_no());
		ps.execute();
//		int count = ps.executeUpdate();
		
		con.close();
	}
}
