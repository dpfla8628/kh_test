<%@page import="java.sql.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Session예제</h1>
	Session ID : <%=session.getId() %>
	Session MaxInaxtiveInterval : <%=session.getMaxInactiveInterval() %><br>
	
	<% 
		long mseconds = session.getCreationTime();
		Date time = new Date(mseconds); 
	%>
	
	Session CreationTime : <%=mseconds %><br>
	Session CreationTime : <%=time.toLocaleString() %>
	
</body>
</html>