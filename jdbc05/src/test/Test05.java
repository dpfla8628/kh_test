package test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import beans.WorkerDao;
import beans.WorkerDto;
import util.JdbcUtil;

public class Test05 {
	public static void main(String[] args) {
		
		try {
			WorkerDto dto = new WorkerDto();
			dto.setWorker_name("test");
			dto.setHire_date("20201010");
			
			WorkerDao dao = new WorkerDao();
			dao.insert(dto);
			
		} catch (Exception e) {
			e.printStackTrace();
			}	
	}
}
