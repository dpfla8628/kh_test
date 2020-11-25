
//개수 증가하기
//executeUpdate()

package update;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Test02 {
	public static void main(String[] args) {
		
		//번호가 주어졌을 때 해당하는 번호 제품의 수량을 1 증가(조회수 증가와 같은 원리)
		// - 실행 명령의 종류가 여러 가지이다.
		//	- ps.execute() : 실행만 하는 명령(INSERT, UPDATE, DELETE)
		//	- ps.executeUpdate() : 실행 후 성공한 행의 개수를 반환(INSERT, UPDATE, DELETE)
		//	- ps.executeQuery() : 실행 후 결과집합을 반환(SELECT)		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("번호 입력");
		int serial = sc.nextInt();
			
		sc.close();
		
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			Connection con = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:xe","kh","kh");
		
			String sql = "update product "
							+ "set stock=(stock+1)"
							+ "where serial = ? ";
			
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1,serial);
			
			//ps.execute();
			int result = ps.executeUpdate();//:result개의 행이 수정되었다!!
	
			System.out.println("result = " + result);
			if(result > 0) {
				System.out.println("수정 성공");
			}
			else {
				System.out.println("대상이 없습니다");
			}
			
			con.close();
			System.out.println("완료!");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		
	}

}
