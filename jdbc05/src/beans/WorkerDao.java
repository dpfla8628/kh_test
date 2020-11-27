package beans;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

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
}
