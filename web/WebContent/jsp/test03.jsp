<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="beans.WorkerDao"%>
<%@page import="beans.WorkerDto"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
 	WorkerDao dao = new WorkerDao();
 	List<WorkerDto> list = dao.select();%>
 	
 	<h1>데이터개수 : 
 	<%= list.size()%></h1>
 	<table border=1>
 		<tr>
 			<th>worker_no</th>
 			<th>worker_name</th>
 			<th>hire_date</th>
 			<th>salary</th>
 			<th>position</th>
 		</tr>
 		<%for(WorkerDto dto : list){%>
 		<tr>	
			<!-- 
				= < % out.println(dto.getWorker_no());%>
			 -->	 	
 			<td><%=dto.getWorker_no()%></td>
 			<td><%=dto.getWorker_name()%></td>
 			<td><%=dto.getHire_date()%></td>
 			<td><%=dto.getSalary()%></td>
 			<td><%=dto.getPosition()%></td>
 		</tr>
 		<%	}%>
 	</table>	

 