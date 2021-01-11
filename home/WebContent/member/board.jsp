<%@page import="home.beans.BoardDto"%>
<%@page import="home.beans.BoardDao"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
	
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

<jsp:include page="/template/header.jsp"></jsp:include>

<div class="outbox" style="width:800px">
	<div class="row center">
		<h1>게시판</h1>
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
	<div class="row right" >
		<button><a href="write.jsp" style="text-decoration: none">게시글 작성하기</a></button>
	</div>
</div>
		
<jsp:include page="/template/footer.jsp"></jsp:include>