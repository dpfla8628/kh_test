<%@page import="beans.WorkerDto"%>
<%@page import="java.util.List"%>
<%@page import="beans.WorkerDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- 
	WorkerListServlet 코드를 옮기자!
	jsp에서는 기본 글자를 "text/html"로 인식한다
	따라서 자바 코드를 작설할 때에는 특별한 표시를 해야한다(html에서는 불가능)
	import는? ctrl+space를 눌러서 추가하자
 -->
 <%
 	WorkerDao dao = new WorkerDao();
	List<WorkerDto> list = dao.select();
 %>
 <h1>데이터 개수 : <%=list.size()%></h1>
 
 <% for(WorkerDto dto : list){%>
 	<div>
 		<%=dto.getWorker_no() %>
 		/
 		<%=dto.getWorker_name() %>
 		/
 		<%=dto.getPosition() %>
 	</div>
 <%} %>
 
 