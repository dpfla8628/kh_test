<%@page import="mvc.entity.Student"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%--
	만약 저장소에 문자열이나 원시형 데이터가 아닌 객체가 들어있다면? 
 --%>
 <%
 	request.setAttribute("a", 10);
 
 	Student s = new Student();
 	s.setName("홍길동");
 	s.setScore(90);
 	request.setAttribute("s", s);
 
 %>
 
 <h1>a=${a }</h1>

 <h1>이름 : ${s.name }</h1>
 <h1>점수 : ${s.score }</h1>
  
 
 
 