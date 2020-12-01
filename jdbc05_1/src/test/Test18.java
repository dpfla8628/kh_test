package test;

import java.sql.SQLException;
import java.util.List;

import beans.WorkerDao;
import beans.WorkerDto;

public class Test18 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		//데이터 준비 (dto로 처리 불가능)
		int salary1=100;
		int salary2=1000;
		
		//데이터 구간 검색
		WorkerDao dao = new WorkerDao();
		List<WorkerDto> list = dao.salary_search(salary1, salary2);

		//출력(결과가 없을경우)
		if(list.size()==0) {//list.isEmpty()도 가능
			System.out.println("조회 결과가 존재하지 않습니다");
		}
		else {
			for(WorkerDto dto : list) {
				System.out.println(dto.getWorker_no());
				System.out.println(dto.getWorker_name());
			}
		}
	}

}
