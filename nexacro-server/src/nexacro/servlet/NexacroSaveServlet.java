package nexacro.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.nexacro17.xapi.data.DataSet;
import com.nexacro17.xapi.data.PlatformData;
import com.nexacro17.xapi.tx.HttpPlatformRequest;

import nexacro.repo.EmpDao;

@WebServlet(urlPatterns = "/save.do")
public class NexacroSaveServlet extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			System.out.println("요청방식 : "+req.getMethod());
			
			//Nexacro Client에서 전달되는 데이터(PlatformData)에서 데이터셋(Dataset)을 추출하여 저장
			// - 넥사크로 전용 요청 객체를 이용해야만 수신이 가능(데이터가 넥사크로 전용이므로)
			
			HttpPlatformRequest nxcrReq = new HttpPlatformRequest(req);
			nxcrReq.receiveData();
			
			// - 클라이언트에서 보낸 데이터 중 empList라는 이름의 데이터셋을 추출
			PlatformData data = nxcrReq.getData();
			DataSet ds = data.getDataSet("empList");
			
			//System.out.println(ds.getRowCount());//데이터셋의 데이터 줄 수 
			EmpDao empDao = new EmpDao();
			empDao.save(ds);
		}
		catch(Exception e) {
			e.printStackTrace();
			resp.sendError(500);
		}
	}
}