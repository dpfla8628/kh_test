package home.beans;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import home.util.JdbcUtil;

public class BoardDao {
	
	public static final String UESRNAME="web";
	public static final String USERPW="web";

//삽입
	public void insert(BoardDto dto) throws Exception{
		Connection con = JdbcUtil.getConnection(UESRNAME, USERPW);
		String sql = "insert into board(board_no, board_writer, board_header, board_title, board_content)"
				+ "values(board_seq.nextval,?,?,?,?)";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, dto.getBoard_writer());
		ps.setString(2, dto.getBoard_header());
		ps.setString(3, dto.getBoard_title());
		ps.setString(4, dto.getBoard_content());
	
		ps.execute();
		con.close();
	}
//조회	
	public List<BoardDto> select() throws Exception{
		Connection con = JdbcUtil.getConnection(UESRNAME, USERPW);
		
		String sql = "select * from board order by board_no desc";//=>최신순 : 인덱스가 있는 pk로 하는게 좋다! 
		PreparedStatement ps = con.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();
		
		List<BoardDto> list = new ArrayList<>();
		while(rs.next()) {
			BoardDto dto = new BoardDto();
			dto.setBoard_no(rs.getInt("board_no"));
			dto.setBoard_writer(rs.getString("board_writer"));
			dto.setBoard_header(rs.getString("board_header"));
			dto.setBoard_title(rs.getString("board_title"));
			dto.setBoard_content(rs.getString("board_content"));
			dto.setBoard_read(rs.getInt("board_read"));
			dto.setBoard_time(rs.getDate("board_time"));
			list.add(dto);
		}
		return list;
	}
	
//1차 검색 - keyword값으로 제목 유사 검색
	public List<BoardDto> select(String keyword) throws Exception{
		Connection con = JdbcUtil.getConnection(UESRNAME, USERPW);
		
		String sql = "select * from board where instr(board_title,?)>0 order by board_no desc";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, keyword);
		ResultSet rs = ps.executeQuery();
		
		List<BoardDto> list = new ArrayList<>();
		while(rs.next()) {
			BoardDto dto = new BoardDto();
			dto.setBoard_no(rs.getInt("board_no"));
			dto.setBoard_writer(rs.getString("board_writer"));
			dto.setBoard_header(rs.getString("board_header"));
			dto.setBoard_title(rs.getString("board_title"));
			dto.setBoard_content(rs.getString("board_content"));
			dto.setBoard_read(rs.getInt("board_read"));
			dto.setBoard_time(rs.getDate("board_time"));
			list.add(dto);
		}
		return list;
	}
	
//2차 검색 - type에 들어있는 분류와 keyword값으로 검색어 유사 검색
	public List<BoardDto> select(String type, String keyword) throws Exception{
		Connection con = JdbcUtil.getConnection(UESRNAME, USERPW);
		
		//String sql = "select * from board where instr("+type+",?)>0 order by board_no desc";
		//ps.setString(1, keyword);
		String sql = "select * from board where instr(#1,?)>0 order by board_no desc";
		sql = sql.replace("#1", type);
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, keyword);
		ResultSet rs = ps.executeQuery();
		
		List<BoardDto> list = new ArrayList<>();
		while(rs.next()) {
			BoardDto dto = new BoardDto();
			dto.setBoard_no(rs.getInt("board_no"));
			dto.setBoard_writer(rs.getString("board_writer"));
			dto.setBoard_header(rs.getString("board_header"));
			dto.setBoard_title(rs.getString("board_title"));
			dto.setBoard_content(rs.getString("board_content"));
			dto.setBoard_read(rs.getInt("board_read"));
			dto.setBoard_time(rs.getDate("board_time"));
			list.add(dto);
		}
		return list;
	}
		
//상세보기
	public BoardDto find(int board_no) throws Exception{
		Connection con = JdbcUtil.getConnection(UESRNAME, USERPW);
		String sql ="select * from board where board_no=?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, board_no);
		ResultSet rs = ps.executeQuery();
		
		//rs는 예상 결과가 1개 or 0개
		//따라서 if문으로 처리, while문 필요 없고 list 만들어서 add할 필요도 없음
		BoardDto dto = new BoardDto();
		if(rs.next()) {
			dto.setBoard_no(rs.getInt("board_no"));
			dto.setBoard_writer(rs.getString("board_writer"));
			dto.setBoard_header(rs.getString("board_header"));
			dto.setBoard_title(rs.getString("board_title"));
			dto.setBoard_content(rs.getString("board_content"));
			dto.setBoard_time(rs.getDate("board_time"));
			dto.setBoard_read(rs.getInt("board_read"));
		}
		else {
			dto=null;
		}
		
		con.close();
		return dto;
		
	}
		
//업데이트
	public boolean update(BoardDto dto) throws Exception{
		Connection con = JdbcUtil.getConnection(UESRNAME, USERPW);
		String sql = "update board set board_header=?, board_title=?, board_content=?"
						+"where board_no=?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, dto.getBoard_header());
		ps.setString(2, dto.getBoard_title());
		ps.setString(3, dto.getBoard_content());
		ps.setInt(4, dto.getBoard_no());
		int count = ps.executeUpdate();
		
		con.close();
		return count>0;
	}
	
	public boolean delete(int board_no) throws Exception{
		Connection con = JdbcUtil.getConnection(UESRNAME, USERPW);
		String sql = "delete board where board_no=?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, board_no);
		int count = ps.executeUpdate();
		
		con.close();	
		return count>0;
	}
	
//시퀀스 번호를 미리 생성하는 기능
	//시퀀스는 유일한 하나의 값
	//sql select문은 resultset이랑 짝꿍
	public int getSequence() throws Exception{
		Connection con = JdbcUtil.getConnection(UESRNAME, USERPW);
		String sql = "select board_seq.nextval from dual";
		PreparedStatement ps = con.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();
		rs.next();//무조건 나오기 때문에 조건문을 통해 나타낼 필요가 없음
		
		//int seq = rs.getInt("NEXTVAL");
		int seq = rs.getInt(1);
		
		con.close();
		return seq;
	}
//번호까지 함께 등록하는 기능
	public void writeWithPrimaryKey(BoardDto boardDto) throws Exception{
		Connection con = JdbcUtil.getConnection(UESRNAME, USERPW);
		String sql = "insert into board values(?,?,?,?,?,0,sysdate)";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, boardDto.getBoard_no());//sequence
		ps.setString(2, boardDto.getBoard_writer());
		ps.setString(3, boardDto.getBoard_header());
		ps.setString(4, boardDto.getBoard_title());
		ps.setString(5, boardDto.getBoard_content());
		
		ps.execute();
		
		con.close();
	}
	
	//결과값으로 아무것도 안할거야!반환값 없음 => void
//조회수 증가 메소드
	public void plusReadcount(int board_no) throws Exception{
		Connection con = JdbcUtil.getConnection(UESRNAME, USERPW);
		String sql = "update board set board_read=board_read+1 where board_no=?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, board_no);
		
		ps.execute();
		//=int count = ps.executeUpdate();
		con.close();
		}
	
//페이징을 이용한 검색
	public List<BoardDto> paginglist(String type, String keyword, int startRow, int endRow) throws Exception{
		Connection con = JdbcUtil.getConnection(UESRNAME, USERPW);
		String sql = "select * from("
						+ "select rownum rn, TMP.* from("
						+ "select * from board "
						+ "where instr(#1,?)>0"
						+ "order by board_no desc"
						+ ")TMP"
					+ ")where rn between ? and ?";
		sql=sql.replace("#1", type);
		
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, keyword);
		ps.setInt(2, startRow);
		ps.setInt(3, endRow);
		ResultSet rs = ps.executeQuery();
		
		List<BoardDto> list = new ArrayList<>();
		while(rs.next()) {
			BoardDto dto = new BoardDto();
			dto.setBoard_no(rs.getInt("board_no"));
			dto.setBoard_writer(rs.getString("board_writer"));
			dto.setBoard_header(rs.getString("board_header"));
			dto.setBoard_title(rs.getString("board_title"));
			dto.setBoard_content(rs.getString("board_content"));
			dto.setBoard_read(rs.getInt("board_read"));
			dto.setBoard_time(rs.getDate("board_time"));
			list.add(dto);
		}
		con.close();
		return list;
	}
//페이징을 이용한 목록
	public List<BoardDto> paginglist(int startRow, int endRow) throws Exception{
		Connection con = JdbcUtil.getConnection(UESRNAME, USERPW);
		String sql = "select * from("
						+ "select rownum rn, TMP.* from("
						+ "select * from board order by board_no desc"
						+ ")TMP"
					+ ")where rn between ? and ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, startRow);
		ps.setInt(2, endRow);
		ResultSet rs = ps.executeQuery();
		
		List<BoardDto> list = new ArrayList<>();
		while(rs.next()) {
			BoardDto dto = new BoardDto();
			dto.setBoard_no(rs.getInt("board_no"));
			dto.setBoard_writer(rs.getString("board_writer"));
			dto.setBoard_header(rs.getString("board_header"));
			dto.setBoard_title(rs.getString("board_title"));
			dto.setBoard_content(rs.getString("board_content"));
			dto.setBoard_read(rs.getInt("board_read"));
			dto.setBoard_time(rs.getDate("board_time"));
			list.add(dto);
		}
		con.close();
		return list;
	}
	
//검색 페이지 마지막 페이지 계산
	public int getCount(String type , String keyword) throws Exception{
		Connection con = JdbcUtil.getConnection(UESRNAME, USERPW);
		String sql ="select count(*) from board where instr(#1,?)>0";
		sql=sql.replace("#1", type);
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, keyword);
		
		ResultSet rs = ps.executeQuery();
		rs.next();
		int count = rs.getInt(1);
		
		con.close();
		
		return count;
	}
//목록 페이지 마지막 페이지 계산
	public int getCount() throws Exception{
		Connection con = JdbcUtil.getConnection(UESRNAME, USERPW);
		String sql ="select count(*) from board";
		PreparedStatement ps = con.prepareStatement(sql);
		
		ResultSet rs = ps.executeQuery();
		rs.next();
		int count = rs.getInt(1);
		
		con.close();
		
		return count;	
	}
	
//페이징 + 갯글 개수까지 불러오는 목록 메소드
	public List<BoardReplyCountVo> pagingReplyCountList(int startRow, int endRow) throws Exception{
		Connection con = JdbcUtil.getConnection(UESRNAME, USERPW);
		String sql = "select * from(" + 
					"    select rownum rn , TMP.* from(" + 
					"        select " + 
					"           B.board_no, B.board_header, B.board_writer, B.board_title, B.board_content, B.board_read, B.board_time, " + 
					"           count(R.reply_no) reply_count"  + 
					"        from " + 
					"            board B left outer join reply R on B.board_no = R.reply_origin" + 
					"        group by B.board_no, B.board_header, B.board_writer, B.board_title, B.board_content, B.board_read, B.board_time" + 
					"        order by B.board_no desc" + 
					"    )TMP" + 
					")where rn between ? and ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, startRow);
		ps.setInt(2, endRow);
		ResultSet rs = ps.executeQuery();
		
		List<BoardReplyCountVo> list = new ArrayList<>();
		while(rs.next()) {
			BoardReplyCountVo dto = new BoardReplyCountVo();
			dto.setBoard_no(rs.getInt("board_no"));
			dto.setBoard_writer(rs.getString("board_writer"));
			dto.setBoard_header(rs.getString("board_header"));
			dto.setBoard_title(rs.getString("board_title"));
			dto.setBoard_content(rs.getString("board_content"));
			dto.setBoard_read(rs.getInt("board_read"));
			dto.setBoard_time(rs.getDate("board_time"));
			dto.setReply_count(rs.getInt("reply_count"));
			list.add(dto);
		}
		con.close();
		return list;
	}
	public List<BoardReplyCountVo> pagingReplyCountList(String type, String key, int startRow, int endRow) throws Exception{
		Connection con = JdbcUtil.getConnection(UESRNAME, USERPW);
		String sql = "select * from(" + 
					"    select rownum rn , TMP.* from(" + 
					"        select " + 
					"           B.board_no, B.board_header, B.board_writer, B.board_title, B.board_content, B.board_read, B.board_time, " + 
					"           count(R.reply_no) reply_count"  + 
					"        from " + 
					"            board B left outer join reply R on B.board_no = R.reply_origin " + 
					"		where instr(#1,?)>0 "+
					"        group by B.board_no, B.board_header, B.board_writer, B.board_title, B.board_content, B.board_read, B.board_time" + 
					"        order by B.board_no desc" + 
					"    )TMP" + 
					")where rn between ? and ?";
		sql = sql.replace("#1", type);
		
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, key);
		ps.setInt(2, startRow);
		ps.setInt(3, endRow);
		ResultSet rs = ps.executeQuery();
		
		List<BoardReplyCountVo> list = new ArrayList<>();
		while(rs.next()) {
			BoardReplyCountVo dto = new BoardReplyCountVo();
			dto.setBoard_no(rs.getInt("board_no"));
			dto.setBoard_writer(rs.getString("board_writer"));
			dto.setBoard_header(rs.getString("board_header"));
			dto.setBoard_title(rs.getString("board_title"));
			dto.setBoard_content(rs.getString("board_content"));
			dto.setBoard_read(rs.getInt("board_read"));
			dto.setBoard_time(rs.getDate("board_time"));
			dto.setReply_count(rs.getInt("reply_count"));
			list.add(dto);
		}
		con.close();
		return list;
	}
}
