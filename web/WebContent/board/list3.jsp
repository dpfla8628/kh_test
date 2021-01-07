<%@page import="beans.MemberDto"%>
<%@page import="beans.MemberDao"%>
<%@page import="beans.BoardDto"%>
<%@page import="java.util.List"%>
<%@page import="beans.BoardDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
	//상황1 : http://localhost:8888/web/board/list3.jsp?type=board_title&keyword=hello
	//상황2 : http://localhost:8888/web/board/list3.jsp
	//상황3 : http://localhost:8888/web/board/list3.jsp?type=board_title
	//상황1 : http://localhost:8888/web/board/list3.jsp?keyword=hello
	
	//검색 : 상황1
	//목록 : 상황2,3,4
	
	String type = request.getParameter("type");
	String keyword = request.getParameter("keyword");
	
	boolean isSearch = type!=null && keyword!=null;//둘 다 값이 있으면
	
	BoardDao dao = new BoardDao();
	List<BoardDto> list;
	
	if(isSearch){
		list = dao.select(type,keyword);
	}
	else{
		list=dao.select();
	}
%>
<html>
	<head>
		<link rel="stylesheet" type="text/css" href="../css/common.css">
		<style>
			.table {
				width:500px;
			}
		</style>
	</head>
	<body>
		<div class="outbox">
			<div class="row center">
				<h1>2차 검색 샘플</h1>
			</div>
			<div class="row">
				<table class="table table-border">
					<thead>
						<tr>
							<th>번호</th>
							<th>작성자</th>
							<th>말머리</th>
							<th width="40%">제목</th>
							<th>조회수</th>
						</tr>
					</thead>
					<tbody>
						<%for(BoardDto dto : list){ %>
						<tr>
							<td><%=dto.getBoard_no()%></td>
							<td>
								<a href="detail.jsp?board_no=<%=dto.getBoard_no()%>">
									<%=dto.getBoard_writer()%>
								</a>
							</td>
							<td><%=dto.getBoard_header()%></td>
							<td><%=dto.getBoard_title()%></td>
							<td><%=dto.getBoard_read()%></td>
						</tr>
						<%} %>
					</tbody>
				</table>
			</div>
			<!-- 
				검색 데이터 입력 및 전송 영역
				- name="type" : 검색 분류 선택 및 전송
				- name="keyword" : 검색어를 입력 및 전송
			 -->
			<div class="row center">
				<form action="list3.jsp" method="get">
				
					<select class="input input-inline" name="type">
					<!-- 보기 좋게 value 값으로 날리자 -->
						<option value="board_title">제목</option>
						<option value="board_writer">작성자</option>
					</select>
					
					<input type="text" name="keyword" placeholder="검색어" class="input input-inline">
					<input type="submit" value="검색" class="input input-inline">
					<a href="write.jsp">추가</a>
				</form>
			</div>
		</div>
	</body>
</html>