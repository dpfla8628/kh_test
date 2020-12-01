package test;

import java.sql.SQLException;

import beans.MemberDao;
import beans.MemberDto;
import beans.WorkerDao;
import beans.WorkerDto;

public class Test08 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		WorkerDto dto = new WorkerDto();
		dto.setWorker_name("테스트");
		dto.setHire_date("20201010");
		
		
		WorkerDao dao = new WorkerDao();
		boolean success = dao.update(dto);
		System.out.println(success);
	
	}

}
