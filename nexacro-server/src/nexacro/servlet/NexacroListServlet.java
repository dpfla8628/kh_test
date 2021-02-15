package nexacro.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.nexacro17.xapi.data.DataSet;
import com.nexacro17.xapi.data.DataTypes;
import com.nexacro17.xapi.data.PlatformData;
import com.nexacro17.xapi.tx.HttpPlatformResponse;
import com.nexacro17.xapi.tx.PlatformType;

@WebServlet(urlPatterns = "/list.do")
public class NexacroListServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			//1. 데이터셋 생성 및 데이터 추가
			//emp는 데이터셋의 이름으로써 나중에 클라이언트가 사용하여 접근할 값이다.
			DataSet ds = new DataSet("emp");
			ds.addColumn("emp_no",DataTypes.STRING, 256);
			ds.addColumn("emp_name",DataTypes.STRING, 256);
			ds.addColumn("position",DataTypes.STRING, 256);
			ds.addColumn("department",DataTypes.STRING, 256);
			ds.addColumn("hire_date",DataTypes.DATE_TIME, 256);
			ds.addColumn("emp_phone",DataTypes.STRING, 256);
			ds.addColumn("emp_email",DataTypes.STRING, 256);
			
			//데이터 추가
			int row = ds.newRow();
			ds.set(row,"emp_no","10001");
			ds.set(row,"emp_name","홍길동");
			ds.set(row,"position","사장");
			ds.set(row,"department","");
			ds.set(row,"hire_date","2010-01-01");
			ds.set(row,"emp_phone","010-1234-5678");
			ds.set(row,"emp_email","master@test.com");
			
			ds.set(row,"emp_no","10002");
			ds.set(row,"emp_name","이소룡");
			ds.set(row,"position","인턴");
			ds.set(row,"department","홍보");
			ds.set(row,"hire_date","2020-02-01");
			ds.set(row,"emp_phone","010-1111-2222");
			ds.set(row,"emp_email","tester@kh.com");
			
			//2. PlatfromDate를 만들고 데이터셋 추가
			PlatformData pd = new PlatformData();
			pd.addDataSet(ds);
			
			//3. 넥사크로 전용 응답객체 생성
			HttpPlatformResponse nxcrResp =
					new HttpPlatformResponse(resp,PlatformType.CONTENT_TYPE_XML,"utf-8");
			
			//4. 전송
			nxcrResp.setData(pd);
			nxcrResp.sendData();
		}
		catch(Exception e) {
			e.printStackTrace();
			resp.sendError(500);
		}
	}
}
