<%@page import="home.beans.BoardDto"%>
<%@page import="home.beans.BoardDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
	//번호를 이용해 글을 불러온다
	int board_no = Integer.parseInt(request.getParameter("board_no"));
	BoardDao boardDao = new BoardDao();
	BoardDto boardDto = boardDao.find(board_no);

%>    
<jsp:include page="/template/header.jsp"></jsp:include>

<script>
	//유형에 따른 select 선택
	$(function(){
		$("select[name=board_header]").val(<%=boardDto.getBoard_header_string()%>)
	});
</script>

<div class="outbox" style="width:800px">
	<div class="row center">
		<h2>게시글 수정</h2>
	</div>
	<div class="row center">
		<form action="<%=request.getContextPath()%>/board/edit.do" method="post">
			<input type="hidden" name="board_no" value="<%=boardDto.getBoard_no() %>">
			
			<div class="row">
				<select name="board_header">
					<option value="">말머리를 입력하세요</option>
					<option value="정보">정보</option>
					<option value="공지">공지</option>
					<option value="유머">유머</option>
					<option value="자유">자유</option>			
				</select>
			</div>
			<div class="row">
				<label>제목</label>
				<input type="text" class="input" name="board_title" value="<%=boardDto.getBoard_title()%>">
			</div>
			<div class="row">
				<label>내용</label>
				<textarea class="input" name="board_content"><%=boardDto.getBoard_content() %></textarea>
			</div>
			<div class="row">
				<input type="submit" value="수정">
			</div>
		</form>
	</div>
</div>

<jsp:include page="/template/footer.jsp"></jsp:include>