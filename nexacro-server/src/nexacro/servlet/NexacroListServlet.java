package nexacro.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.nexacro17.xapi.data.DataSet;
import com.nexacro17.xapi.data.PlatformData;
import com.nexacro17.xapi.tx.HttpPlatformResponse;
import com.nexacro17.xapi.tx.PlatformType;

import nexacro.repo.EmpDao;

@WebServlet("/list.do")
public class NexacroListServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//Nexacro client와 통신하기 위해서는 넥사크로 전용 요청객체, 넥사크로 전용 응답객체가 필요하다.
		// - HttpPlatformRequest : 넥사크로 전용 요청객체
		// - HttpPlatformResponse : 넥사크로 전용 응답객체
		// - PlatformData : 넥사크로 서버와 클라이언트가 주고받는 데이터
		
		//목표 : 넥사크로 클라이언트에게 데이터셋을 전달한다(= 넥사크로 전용 응답객체에 데이터셋을 첨부한다)
		// - 데이터셋(Dataset) → PlatformData → HttpPlatformResponse → 클라이언트
		
		//DataSet ds = new DataSet("emp");
		//ds.addColumn("emp_no",DataTypes.String,256);
		try {
			//1. 데이터셋 생성 및 데이터 추가(EmpDao 사용)
			EmpDao empDao = new EmpDao();
			DataSet ds = empDao.select();
			
			//2. PlatformData를 만들고 데이터셋 추가
			PlatformData pd = new PlatformData();
			pd.addDataSet(ds);
			
			//3. 넥사크로 전용 응답객체 생성
			HttpPlatformResponse nxcrResp = 
					new HttpPlatformResponse(resp, PlatformType.CONTENT_TYPE_XML, "UTF-8");
			
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
