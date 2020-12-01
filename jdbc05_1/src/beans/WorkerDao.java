package beans;

import java.sql.Connection;
import java.sql.PreparedStatement;

import util.JdbcUtil;

//WorkerDao는 한글로 "직원데이터 관리도우미"라고 생각한다.
//worker테이블에 CRUD작업을 수행한다.
public class WorkerDao {
	
	//직원등록 메소드
	// - 직원(사원)정보를 전달받아 등록 수행. 결과 없음(void)
	public void insert(WorkerDto dto) throws Exception{
		Connection con = JdbcUtil.getConnection("web", "web");
		
		String sql = "insert into worker values(worker_seq.nextval, ?, ?, ?, ?)";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, dto.getWorker_name());
		ps.setString(2, dto.getHire_date());
		ps.setInt(3, dto.getSalary());
		ps.setString(4, dto.getPosition());
		ps.execute();
		
		con.close();
	}
	
	//직원정보 수정메소드
	//- 직원정보(WorkerDto)를 받아서 수정한 뒤 성공/실패(boolean)를 반환
	public boolean update(WorkerDto dto) throws Exception {
		Connection con = JdbcUtil.getConnection("web", "web");
		
		String sql = "update worker "
						+ "set worker_name=?, hire_date=?, salary=?, position=? "
						+ "where worker_no=?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, dto.getWorker_name());
		ps.setString(2, dto.getHire_date());
		ps.setInt(3, dto.getSalary());
		ps.setString(4, dto.getPosition());
		ps.setInt(5, dto.getWorker_no());
		int count = ps.executeUpdate();
		
		con.close();
		
		return count > 0;
	}

	//삭제 메소드
	//- 직원번호(int)를 전달받아 삭제 후 성공/실패(boolean)를 반환!
	public boolean delete(int worker_no) throws Exception {
		Connection con = JdbcUtil.getConnection("web", "web");
		
		String sql = "delete worker where worker_no = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, worker_no);
		int count = ps.executeUpdate();
		
		con.close();
		
		return count > 0;
	}
}

