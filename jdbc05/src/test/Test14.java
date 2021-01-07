package test;

import java.util.List;

import beans.PersonDao;
import beans.PersonDto;
import beans.WorkerDao;
import beans.WorkerDto;

public class Test14 {
	public static void main(String[] args) throws Exception {
		//worker 테이블의 모든 데이터를 조회하여 출력
	
		//조회
		WorkerDao dao = new WorkerDao();
		List<WorkerDto> list = dao.select();
		
		System.out.println("개수 : "+list.size());
		
		for(WorkerDto dto : list) {
			System.out.println("근무자:"+dto.getWorker_name());
			System.out.println("입사일:"+dto.getHire_date());
		}
	}
}