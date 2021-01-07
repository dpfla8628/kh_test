<%@page import="beans.MemberDto"%>
<%@page import="beans.MemberDao"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
	String type = request.getParameter("type");
	String keyword = request.getParameter("keyword");

	MemberDao dao = new MemberDao();
	List<MemberDto> list;
	
	boolean search = type!=null && keyword!=null;
	
	if(search){
		list=dao.select(type,keyword);
	}
	else{
		list=dao.select();
	}
%>

<html>
	<head>
		<link rel="stylesheet" type="text/css" href="../css/common.css">
			<style>
				.outbox {
					width:800px;
				}
			</style>
	</head>
	<body>
		<div class="outbox">
		
			<!-- 제목 영역 -->
			<div class="row center">
				<h1>Member 테이블 목록</h1>
			</div>
			
			<!-- 표시 영역 -->
			<div class="row">
				<table class="table table-border">
					<thead>
						<tr>
							<th>번호</th>
							<th>아이디</th>
							<th>닉네임</th>
							<th>생년월일</th>
							<th>권한</th>
							<th>포인트</th>
							<th>가입일</th>
						</tr>
					</thead>
					<tbody>
						<%for(MemberDto dto : list){ %>
						<tr>
							<td><%=dto.getMember_no()%></td>
							<td><%=dto.getMember_id()%></td>
							<td><%=dto.getMember_nick()%></td>
							<td><%=dto.getMember_birth()%></td>
							<td><%=dto.getMember_auth()%></td>
							<td><%=dto.getMember_point()%></td>
							<td><%=dto.getMember_join()%></td>
						</tr>
						<%} %>
					</tbody>
				</table>
			</div>
			
			<!--아이디,닉네임,권한으로 검색하는 검색창 -->
			<div class="row center">
				<form action="list3.jsp" method="get">
					<select class="input input-inline" name="type">
						<option value="member_id">아이디</option>
						<option value="member_nick">닉네임</option>
						<option value="member_auth">권한</option>
					</select>
					<input type="text" name="keyword" class="input input-inline">
					<input type="submit" value="검색">
				</form>
			</div>
		</div>
	</body>
</html>
	