package beans;

import java.sql.Date;

//정보

public class WorkerDto {
	
	private String worker_name;
	private String hire_date;

	public WorkerDto() {
		super();
	}

	public String getWorker_name() {
		return worker_name;
	}

	public void setWorker_name(String worker_name) {
		this.worker_name = worker_name;
	}

	public String getHire_date() {
		return hire_date;
	}

	public void setHire_date(String hire_date) {
		this.hire_date = hire_date;
	}
}
