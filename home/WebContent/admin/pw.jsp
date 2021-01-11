<%@page import="home.beans.MemberDto"%>
<%@page import="home.beans.MemberDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
	//1. 파라미터로 전달된 경우
	//String new_pw = request.getParameter("new_pw");

	//2. forward일때
	String password = (String)request.getAttribute("password");
%>    
    
<jsp:include page="/template/header.jsp"></jsp:include>

<div class="row center">
	<h3>임시 비밀번호로 변경되었습니다!</h3>
	<h4><%=password %></h4>
</div>

<jsp:include page="/template/footer.jsp"></jsp:include>

