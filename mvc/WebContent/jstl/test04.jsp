<%@page import="java.util.ArrayList"%>
<%@page import="mvc.entity.Student"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%--
	List<Dto> 형태의 저장소가 있을 때 JSTL 반복태그를 이용하여 화면에 출력
--%>

<%
	List<Student> list = new ArrayList<>();

	Student s = new Student();
	Student s1 = new Student();
	
	s.setName("피카츄");
	s.setScore(100);
	
	s1.setName("파이리");
	s1.setScore(90);
	
	list.add(s);
	list.add(s1);
	request.setAttribute("list", list);
	
%>


<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<c:forEach var="stu" items="${list }" varStatus="status">
	<h1>${status.index }</h1>
	<h1>${status.count }</h1>
	<h1>${status.first }</h1>
	<h1>${status.last }</h1>
	<h1>${stu.name }</h1>
	<h1>${stu.score }</h1>
	<hr>
</c:forEach>



