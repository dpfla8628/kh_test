package test;

import java.sql.SQLException;
import java.util.List;

import beans.WorkerDao;
import beans.WorkerDto;

public class Test14 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		WorkerDao dao = new WorkerDao();
		List<WorkerDto> list = dao.select();
		
		for(WorkerDto dto : list) {
			System.out.println(dto.getWorker_name());
			System.out.println(dto.getPosition());
		}
	}

}
