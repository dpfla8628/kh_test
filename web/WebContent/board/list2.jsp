<%@page import=beans.BoardDto"%>
<%@page import="java.util.List"%>
<%@page import="beans.BoardDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	//서블릿에서는 메소드 매개변수(req)를 이용해서 , jsp에서는 내장객체(request)를 이용해서 Parameter를  불러올 수 있다
	String keyword = request.getParameter("keyword");

	BoardDao dao = new BoardDao();
	//List<BoardDto> list = dao.select(); 다 불러옴
	//검색된 것만 불러오자
	List<BoardDto> list;
	if(keyword==null){//키워드가 없으면 그냥 원래 목록으로 간주
		list=dao.select();
	}
	else{//키워드가 있으면 검색 목록으로 간주
		list=dao.select(keyword);
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
			
			<div class="row center">
				<form action="list2.jsp" method="get">
					<input type="text" name="keyword" placeholder="검색어" class="input input-inline">
					<input type="submit" value="검색" class="input input-inline">
				</form>
			</div>
		</div>
	</body>
</html>