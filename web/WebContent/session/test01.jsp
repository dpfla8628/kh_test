<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!-- 
	JSP와 Servlet은 각각 HttpSession에 접근하는 방법이 다르다
	-JSP는 내장객체중에 session이라는 객체가 존재, 바로 사용 가능
	-Servlet은 요청객체 req에서 session을 꺼내서 사용해야한다
	- 세션은 Map<String , Object>의 형태이다
 -->
 
 <%
 	//세션에 데이터를 설정(key=value)
 	session.setAttribute("sample", "hello");
 %>
 
 <h1>sample = <%=session.getAttribute("sample") %></h1>