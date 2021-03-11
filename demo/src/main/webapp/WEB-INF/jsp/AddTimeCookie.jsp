<%@page import="java.util.Calendar"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	Calendar day = Calendar.getInstance();<br>
	String now = day.get(Calendar.YEAR) + "=" + (day.get(Calendar.Month)+1);<br>
	now += "-" + day.get(Calendar.DAY_OF_MONTH);
	
	Cookie cookie = new Cookie("lastconnect",now);
	cookie.setMaxAge(10);<br>
	response.addCookie(cookie);<br>
	
	<%
		Calendar day = Calendar.getInstance();
		String now = day.get(Calendar.YEAR) + "=" + (day.get(Calendar.MONTH)+1);
		now += "-" + day.get(Calendar.DAY_OF_MONTH);
		
		Cookie cookie = new Cookie("lastconnect",now);
		//살이있는 시간 10초
		cookie.setMaxAge(10);
		response.addCookie(cookie);
	%>
	<hr><a href="cookieLookUp">쿠키 조회하기</a>
</body>
</html>