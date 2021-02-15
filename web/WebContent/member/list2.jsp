<%@page import="movi.beans.MemberDto"%>
<%@page import="movi.beans.MemberDao"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
	String search_id = request.getParameter("search_id");

	MemberDao dao = new MemberDao();
	List<MemberDto> list;
	
	if(search_id==null){
		list= dao.select();
	}
	else{
		list=dao.select(search_id);
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
							<th>비밀번호</th>
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
							<td><%=dto.getMember_pw()%></td><!-- 원래 비번은 절대 나타내면 안됨 -->
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
			
			<!-- 검색창 영역 -->
			<div class="row center">
				<form action="list2.jsp" method="get">
					<input type="text" name="search_id" class="input input-inline">
					<input type="submit" value="검색">
				</form>
			</div>
		</div>
	</body>
</html>
	