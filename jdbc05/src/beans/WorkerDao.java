package beans;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import util.JdbcUtil;

//기능

public class WorkerDao {
	//등록메소드

	//데이터 한 덩어리로 준비
	public void insert(WorkerDto dto) throws SQLException, ClassNotFoundException {		
		Connection con = JdbcUtil.getConnection("web","web");
		String sql1 = "create table Worker("
				+ "		worker_no number primary key,"
				+ "		worker_name varchar2(21) not null,"
				+ "		hire_date char(8) not null,"
				+ "		salary number default 0,"
				+ "		position char(6) check(position in ('인턴','사원','주임','대리','과장','차장','부장','임원','사장')))";
		String sql2 = "insert into worker values(worker_seq.nextval,?,?,1000000,'인턴')";
		
		PreparedStatement ps1 = con.prepareStatement(sql1);
		PreparedStatement ps2 = con.prepareStatement(sql2);

		ps2.setString(1, dto.getWorker_name());
		ps2.setString(2, dto.getHire_date());
		
		ps1.execute();
		ps2.execute();
		
		System.out.println("성공!");
		con.close();		
	}
	public boolean update(WorkerDto dto) throws SQLException, ClassNotFoundException {		
		Connection con = JdbcUtil.getConnection("web","web");
		String sql = "update worker set worker_name = ?, hire_date = ? where worker_no = 26 ";
		
		PreparedStatement ps = con.prepareStatement(sql);

		ps.setString(1, dto.getWorker_name());
		ps.setString(2, dto.getHire_date());
		
		int result = ps.executeUpdate();
		
		con.close();		

//		if(result >0 ) return true;
//		else return false;
		return result>0;
	
	}
	
	
	public boolean delete(int worker_no) throws ClassNotFoundException, SQLException {
		Connection con = JdbcUtil.getConnection("web","web");
		String sql = "delete worker where worker_no =?";
		PreparedStatement ps = con.prepareStatement(sql);
		
		ps.setInt(1, worker_no);
		
		int result = ps.executeUpdate();
		con.close();
		
		return result>0;
	}
	
	public List<WorkerDto> select() throws ClassNotFoundException, SQLException{
		Connection con = JdbcUtil.getConnection("web", "web");
		String sql = "select * from worker";
		PreparedStatement ps = con.prepareStatement(sql);
		
		ResultSet rs = ps.executeQuery();
		
		List<WorkerDto> list = new ArrayList<>();
		
		while(rs.next()) {
			WorkerDto dto = new WorkerDto();
			dto.setWorker_name(rs.getString("worker_name"));
			dto.setHire_date(rs.getString("hire_date"));
			
			list.add(dto);
		}
		
		con.close();
		
		return list;
	}
	
}
