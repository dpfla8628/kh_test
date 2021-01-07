<%@page import="beans.PersonDao"%>
<%@page import="beans.PersonDto"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
	int person_no = Integer.parseInt(request.getParameter("person_no"));

	PersonDao dao = new PersonDao();
	PersonDto dto = dao.find(person_no);
	
%>
<html>
	<head>
		<link rel="stylesheet" type="text/css" href="../css/common.css">
		<style>
			.outbox {
				width:800px;
			}
		</style>
		<script>
		</script>
	</head>
	<body>
		<div class="outbox">
			<div class="row center">
				<h1>Person 테이블 목록</h1>
			</div>
			<div class="row">
				<table class="table table-border table-hightlight">
					<thead>
						<tr>
							<th>번호</th>
							<th>이름</th>
							<th>자바점수</th>
							<th>디비점수</th>
							<th>성별</th>
							<th>등록일</th>
						</tr>
					</thead>
					<tbody>
						<tr>
							<td><%=dto.getPerson_no()%></td>
							<td><%=dto.getPerson_name()%></td>
							<td><%=dto.getJavascore()%></td>
							<td><%=dto.getDbscore()%></td>
							<td><%=dto.getGender()%></td>
							<td><%=dto.getRegist_date()%></td>
						</tr>
					</tbody>
				</table>
			</div>
		</div>
	</body>
</html>