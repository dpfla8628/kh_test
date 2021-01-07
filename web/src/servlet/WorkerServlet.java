package servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import beans.JdbcUtil;
import beans.WorkerDao;
import beans.WorkerDto;
import jdk.nashorn.internal.ir.ForNode;

@WebServlet(urlPatterns = "/worker/join.do")
public class WorkerServlet extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

	try {
	//준비
		req.setCharacterEncoding("utf-8");
		String worker_name = req.getParameter("worker_name");
		String hire_date = req.getParameter("hire_date");
		int salary = Integer.parseInt(req.getParameter("salary"));
		String position = req.getParameter("position");
		
	//처리
	//WorkerDao에서!!
		WorkerDto dto = new WorkerDto();
		dto.setWorker_name(worker_name);
		dto.setHire_date(hire_date);
		dto.setSalary(salary);
		dto.setPosition(position);
		
		WorkerDao dao = new WorkerDao();
		dao.insert(dto);
		
	//결과
		resp.setContentType("text/plain");
		resp.setCharacterEncoding("utf-8");
	
		resp.getWriter().println("근무자 이름 : "+worker_name);
		resp.getWriter().println("고용일 : "+hire_date);
		resp.getWriter().println("급여 : " + salary);
		resp.getWriter().println("직급 : " + position);
	}
	catch(Exception e) {
		e.printStackTrace();
		resp.sendError(500);
	}
	
	}
}
