package home.beans;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import home.util.JdbcUtil;

public class BoardDao {
	public void insert(BoardDto dto) throws Exception{
		Connection con = JdbcUtil.getConnection("web", "web");
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
	public List<BoardDto> select() throws Exception{
		Connection con = JdbcUtil.getConnection("web", "web");
		
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
		Connection con = JdbcUtil.getConnection("web", "web");
		
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
		Connection con = JdbcUtil.getConnection("web", "web");
		
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
		Connection con = JdbcUtil.getConnection("web", "web");
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
		}
		else {
			dto=null;
		}
		
		con.close();
		return dto;
		
	}
		
	//업데이트
	public boolean update(BoardDto dto) throws Exception{
		Connection con = JdbcUtil.getConnection("web", "web");
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
		Connection con = JdbcUtil.getConnection("web", "web");
		String sql = "delete board where board_no=?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, board_no);
		int count = ps.executeUpdate();
		
		con.close();	
		return count>0;
	}
}
