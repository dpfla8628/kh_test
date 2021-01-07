<%@page import="beans.BoardDto"%>
<%@page import="java.util.List"%>
<%@page import="beans.BoardDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	BoardDao dao = new BoardDao();
	List<BoardDto> list = dao.select();
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
				<h1>Board 테이블 목록</h1>
			</div>
			<div class="row">
				<table class="table table-border">
					<thead>
						<tr>
							<th>번호</th>
							<th>작성자</th>
							<th>말머리</th>
							<th>제목</th>
							<th>내용</th>
							<th>조회수</th>
							<th>등록일시</th>
						</tr>
					</thead>
					<tbody>
						<%for(BoardDto dto : list){ %>
						<tr>
							<td><%=dto.getBoard_no()%></td>
							<td><%=dto.getBoard_writer()%></td>
							<td><%=dto.getBoard_header()%></td>
							<td><%=dto.getBoard_title()%></td>
							<td><%=dto.getBoard_content()%></td>
							<td><%=dto.getBoard_read()%></td>
							<td><%=dto.getBoard_time()%></td>
						</tr>
						<%} %>
					</tbody>
				</table>
			</div>
		</div>
	</body>
</html>