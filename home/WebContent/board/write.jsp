<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:include page="/template/header.jsp"></jsp:include>

<div class="outbox" style="width:800px">
	<div class="row center">
		<h2>게시글 작성</h2>
	</div>
	<div class="row center">
		자유롭게 작성하세요
	</div>
	
	<form action="write.do" method="post">
		<div class="row">
			<label>말머리</label>
			<select name="board_header" class="input">
				<option value="">말머리를 입력하세요</option>
				<option value="정보">정보</option>
				<option value="공지">공지</option>
				<option value="유머">유머</option>
				<option value="자유">자유</option>
			</select>
		</div>
		
		<div class="row">
			<label>제목</label>
			<input type="text" class="input" name="board_title" required>
		</div>
		
		<div class="row">
			<label>내용</label>
			<textarea name="board_content" class="input" rows="10" required></textarea>
		</div>
	
		<div class="row">
			<input type="submit" class="input" value="작성하기">
		</div>

	</form>
</div>