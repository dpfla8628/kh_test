<%@page import="beans.MemberDto"%>
<%@page import="beans.MemberDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	int member_no = Integer.parseInt("member_no");
	MemberDao dao = new MemberDao();
	MemberDto dto = dao.find(member_no);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	아이디:<input type="text" value="<%=dto.getMember_id()%>">
	비밀번호 변경 :<input type="password" value="<%=dto.getMember_pw()%>">
	닉네임 변경 :<input type="text" value="<%=dto.getMember_nick()%>">
	생년월일 :<input type="text" value="<%=dto.getMember_birth()%>">
</body>
</html>