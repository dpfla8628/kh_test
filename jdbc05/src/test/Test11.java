package test;

import java.sql.SQLException;

import beans.MemberDao;
import beans.MemberDto;
import beans.WorkerDao;
import beans.WorkerDto;

public class Test11 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		int worker_no = 26;
		
		
		WorkerDao dao = new WorkerDao();
		boolean success = dao.delete(worker_no);
		if(success) {
			System.out.println("퇴사 완료");
		}
		else {
			System.out.println("없는 직원");
		}
	}

}
