<%@page import="home.beans.BoardDto"%>
<%@page import="home.beans.BoardDao"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
	//목록,검색을 위해 필요한 프로그래밍 코드
	//type : 분류, key : 검색어
	request.setCharacterEncoding("UTF-8");
	String type = request.getParameter("type");
	String keyword = request.getParameter("keyword");
	boolean isSearch = type!=null && keyword!=null;

	BoardDao dao = new BoardDao();
	List<BoardDto> list;
	if(isSearch){
		list = dao.select(type,keyword);
	}
	else{
		list = dao.select();
	}

%>
<jsp:include page="/template/header.jsp"></jsp:include>

<script>
	$(function(){
		//.write-btn을 누르면 글쓰기 페이지로 이동
		$(".write-btn").click(function(){
			//상대경로
			//$(location).attr("href","write.jsp");
		
			//절대경로
			$(location).attr("href","<%=request.getContextPath()%>/board/write.jsp");
		});
	});
</script>

<div class="outbox center" style="width:800px">
	<div class="row">
		<h2>자유 게시판</h2>
	</div>
	<div class="row">
		자유롭게 작성하세요
	</div>
	
	<div class="row">
		<table class="table table-border table-pattern">
			<thead>
				<tr>
					<th>번호</th>
					<th width="45%">제목</th>
					<th>작성자</th>
					<th>작성일</th>
					<th>조회수</th>
				</tr>
			</thead>
			<tbody>
				<%for(BoardDto dto : list){ %>
				<tr>
					<td><%=dto.getBoard_no() %></td>
					<td class="left">
						<!-- 말머리 null인 경우 -->
						<%if(dto.getBoard_header()!=null) {%>
							[<%=dto.getBoard_header() %>]
						<%} %>
						<!-- 글제목 클릭시 상세페이지 -->
						<a href="#"><%=dto.getBoard_title() %></a>
					</td>
					<td><%=dto.getBoard_writer() %></td>
					<td><%=dto.getBoard_time() %></td>
					<td><%=dto.getBoard_read() %></td>
				</tr>
				<%} %>
			</tbody>
		</table>
	</div>
	
	<!-- 글쓰기 버튼 -->
	<div class="row right">
		<button class="write-btn input input-inline">글쓰기</button>
	</div>
	
	<!-- 검색창 -->
	<form action="list.jsp" method="post">
		<div class="row">
			<select name="type" class="input input-inline">
				<option value="board_header"<%if(type!=null&&type.equals("board_header")){%>selected<%} %>>말머리</option>
				<option value="board_title"<%if(type!=null&&type.equals("board_title")){%>selected<%} %>>제목</option>
				<option value="board_writer"<%if(type!=null&&type.equals("board_writer")){%>selected<%} %>>작성자</option>
			</select>
			<%if(isSearch) {%>
			<input type="text" class="input input-inline" name="keyword" required value="<%=keyword%>">
			<%} else{%>
			<input type="text" class="input input-inline" name="keyword" required>
			<%} %>
			<input type="submit" class="input input-inline" value="검색">
		</div>
	</form>
	
	<!-- 페이지 네비게이션 -->
	<div class="row">
		<ul class="pagination">
			<li><a href="#">&lt;</a></li>
			<%for(int i=1; i<11; i++) {%>
			<li><a href="#"><%=i%></a></li>
			<%} %>
			<li><a href="#">&gt;</a></li>
		</ul>
	</div>
</div>

<jsp:include page="/template/footer.jsp"></jsp:include>