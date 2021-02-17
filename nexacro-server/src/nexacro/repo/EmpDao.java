package nexacro.repo;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.nexacro17.xapi.data.DataSet;
import com.nexacro17.xapi.data.DataTypes;

import nexacro.entity.Emp;

public class EmpDao {
	
	public static final String URL = "jdbc:oracle:thin:@localhost:1521:xe";
	public static final String USERNAME = "web";
	public static final String PASSWORD = "web";
	
	//목록 메소드
	public DataSet select() throws Exception {
		Class.forName("oracle.jdbc.OracleDriver");
		Connection con = DriverManager.getConnection(URL, USERNAME, PASSWORD);
		
		String sql = "select * from emp";
		PreparedStatement ps = con.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();
		
		// 데이터셋 생성
		DataSet ds = new DataSet("emp");
		
		// 헤더 정의
		ds.addColumn("emp_no", DataTypes.STRING, 256);
		ds.addColumn("emp_name", DataTypes.STRING, 256);
		ds.addColumn("position", DataTypes.STRING, 256);
		ds.addColumn("department", DataTypes.STRING, 256);
		ds.addColumn("hire_date", DataTypes.DATE, 256);
		ds.addColumn("emp_phone", DataTypes.STRING, 256);
		ds.addColumn("emp_email", DataTypes.STRING, 256);

		// 데이터 이동 : 데이터 개수만큼 ds.newRow() 명령을 이용하여 줄을 생성하고 ds.set()을 이용해서 설정한다.
		while(rs.next()) {
			int row = ds.newRow();
			ds.set(row, "emp_no", rs.getInt("emp_no"));//결과보고 고민!
			ds.set(row, "emp_name", rs.getString("emp_name"));
			ds.set(row, "position", rs.getString("position"));
			ds.set(row, "department", rs.getString("department"));
			ds.set(row, "hire_date", rs.getDate("hire_date"));
			ds.set(row, "emp_phone", rs.getString("emp_phone"));
			ds.set(row, "emp_email", rs.getString("emp_email"));
		}
		
		con.close();
		
		return ds;
	}
	
	//저장 메소드
	// = ds에 데이터가 몇 개 들어있을 지 모르기 때문에 반복하며 작업을 수행해야 한다.
	// = 명령 실행 개수와 관계없이 연결은 1회만 수행해야 성능이 좋아진다.
	// = 이럴 경우에는 PreparedStatement를 여러 번 사용하게 되므로 close()를 ps에 수행해야 한다.
	public void save(DataSet ds) throws Exception {
		Class.forName("oracle.jdbc.OracleDriver");
		Connection con = DriverManager.getConnection(URL, USERNAME, PASSWORD);
		
		for(int row = 0; row < ds.getRowCount(); row++) {
			String sql = "merge into emp e using dual on(e.emp_no = ?) " //만약 번호가 있다면!
							+ "when matched then " 
							+" update set emp_name=?, position=?, department=?, hire_date=?, emp_phone=?, emp_email=? " 
							+" when not matched then " 
							+" insert(e.emp_no, e.emp_name, e.position, e.department, e.hire_date, e.emp_phone, e.emp_email) " 
							+" values(emp_seq.nextval, ?, ?, ?, ?, ?, ?)";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, ds.getInt(row, "emp_no"));
			ps.setString(2, ds.getString(row, "emp_name"));
			ps.setString(3, ds.getString(row, "position"));
			ps.setString(4, ds.getString(row, "department"));
			ps.setDate(5, new Date(ds.getDateTime(row, "hire_date").getTime()));
			ps.setString(6, ds.getString(row, "emp_phone"));
			ps.setString(7, ds.getString(row, "emp_email"));
			ps.setString(8, ds.getString(row, "emp_name"));
			ps.setString(9, ds.getString(row, "position"));
			ps.setString(10, ds.getString(row, "department"));
			ps.setDate(11, new Date(ds.getDateTime(row, "hire_date").getTime()));
			ps.setString(12, ds.getString(row, "emp_phone"));
			ps.setString(13, ds.getString(row, "emp_email"));
			
			
			ps.execute();
			ps.close();//ps를 반복적으로 사용하기 때문에 새로운 ps가 생기기 전에 close() 수행
		}
		
		con.close();
	}
}