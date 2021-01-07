<%@page import="beans.PersonDao"%>
<%@page import="beans.PersonDto"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	PersonDao dao = new PersonDao();
	List<PersonDto> list = dao.select();
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
			<div class="row center">
				<h1>Person 테이블 목록</h1>
			</div>
			<div class="row">
				<table class="table table-border">
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
					<!-- 확장반복문 (데이터형  접근변수명 : 배열변수명) -->
						<%for(PersonDto dto : list){ %>
						<tr>
							<td><%=dto.getPerson_no()%></td>
							<!-- 이름에 링크를 걸어서 상세 페이지로 연결(반드시 번호 전달) -->
							<td>
								<a href="detail.jsp?person_no=<%=dto.getPerson_no()%>">
									<%=dto.getPerson_name()%>
								</a>
							</td>
							<td><%=dto.getJavascore()%></td>
							<td><%=dto.getDbscore()%></td>
							<td><%=dto.getGender()%></td>
							<td><%=dto.getRegist_date()%></td>
						</tr>
						<%} %>
					</tbody>
				</table>
			</div>
		</div>
	</body>
</html>