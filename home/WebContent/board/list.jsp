<%@page import="home.beans.BoardReplyCountVo"%>
<%@page import="home.beans.BoardDto"%>
<%@page import="home.beans.BoardDao"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 
<%
	//한글 깨지는 문제 해결! 맨 위에 작성
	request.setCharacterEncoding("utf-8");
%>

<%
 	//페이지 분할 계산 코드 작성
 	//보드사이즈에 따라 페이지에 나타나는 데이터 설정
 	int boardSize=10;
	int p;
	//list.jsp에 파라미터가 없어도 예외를 발생시키지말고 ,그 페이지가 1페이지가 되도록 설정
	try{
		p = Integer.parseInt(request.getParameter("p"));
		
		if(p<=0) throw new Exception();//강제예외! 0이하면 컴퓨터는 인식 못하니까 따로 처리해준다
	}
	catch(Exception e){
		p=1;
	}
	
	//p의 값에 따라 시작 row번호와 종료 row번호를 계산
	int endRow = p*10;
	int startRow = endRow-9;
		
%>

 <h1><%=p %></h1>



    
<%
	//목록,검색을 위해 필요한 프로그래밍 코드
	//type : 분류, key : 검색어
	request.setCharacterEncoding("UTF-8");
	String type = request.getParameter("type");
	String keyword = request.getParameter("keyword");
	boolean isSearch = type!=null && keyword!=null;

	BoardDao dao = new BoardDao();
	List<BoardReplyCountVo> list;
	if(isSearch){
//		list = dao.select(type,keyword);
		list=dao.pagingReplyCountList(type,keyword,startRow, endRow);
	}
	else{
//		list = dao.select();
		list=dao.pagingReplyCountList(startRow,endRow);
	}

%>


<%
	//페이지 네비게이터 계산 코드를 작성
 	//1~10페이지 : 1-10 / 11~20페이지 : 11-20 ...
	//(p-1)/blockSize*blockSize+1부터 (앞의값)+(blockSize-1)
	
	int blockSize=10;	
	int startBlock = (p-1)/blockSize*blockSize+1;
	int endBlock = startBlock + blockSize-1;
	
	//페이지 마지막 번호
	int count;
	if(isSearch){
		count=dao.getCount(type,keyword);
	}
	else{
		count=dao.getCount();
	}
	
	//페이지개수 = (게시글수 + 9) / 10 = (게시글 수 + 페이지 크기-1)/페이지크기
	int pageSize = (count+boardSize-1)/boardSize;		
			
	if(endBlock>pageSize){
		endBlock=pageSize;
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
				<%for(BoardReplyCountVo dto : list){ %>
				<tr>
					<td><%=dto.getBoard_no() %></td>
					<td class="left">
<!-- 말머리 null인 경우 -->
						<%if(dto.getBoard_header()!=null) {%>
							[<%=dto.getBoard_header() %>]
						<%} %>
<!-- 글제목 클릭시 상세페이지 -->
						<a href="detail.jsp?board_no=<%=dto.getBoard_no()%>"><%=dto.getBoard_title() %></a>
<!-- 댓글 개수 표시 -->					
						<%if(dto.getReply_count()>0){ %>		
							[<%=dto.getReply_count() %>]
						<%} %>
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
			
				<%if(isSearch) {%>
				<li><a href="list.jsp?p=<%=startBlock-1%>&type=<%=type%>&keyword=<%=keyword%>">&lt;</a></li>
			<%}else {%>	
				<li><a href="list.jsp?p=<%=startBlock-1%>">&lt;</a></li>
			<%} %>
			
			<%for(int i=startBlock; i<=endBlock; i++) {%>
				<!--현재 페이지라면 -->
				<%if(i == p){ %>
				<li class="active">
				<%}else{ %>
				<li>
				<%} %>
				<!-- 검색용 링크 -->
				<%if(isSearch) {%>
					<li><a href="list.jsp?p=<%=i%>&type=<%=type%>&keyword=<%=keyword%>"><%=i %></a></li>
			
				<!-- 목록용 링크 -->
				<%}else {%>	
					<li><a href="list.jsp?p=<%=i%>"><%=i %></a></li>
				<%} %>
			<%} %>
			
			<%if(isSearch) {%>
				<li><a href="list.jsp?p=<%=endBlock+1%>&type=<%=type%>&keyword=<%=keyword%>">&gt;</a></li>
			<%}else {%>	
				<li><a href="list.jsp?p=<%=endBlock+1%>">&gt;</a></li>
			<%} %>
			</ul>
		</div>
</div>

<jsp:include page="/template/footer.jsp"></jsp:include>


