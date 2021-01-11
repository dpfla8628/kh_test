<%@page import="home.beans.MemberDto"%>
<%@page import="home.beans.MemberDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	int member_no = (int)session.getAttribute("check");
	MemberDao dao = new MemberDao();
	MemberDto dto = dao.find(member_no);
%>

<jsp:include page="/template/header.jsp"></jsp:include>


<form action="edit.do" method="post">
	<div class="outbox" style="width:500px">
		<div class="row">
			<label>닉네임</label> 
			<input type="text" name="member_nick" class="input" value="<%=dto.getMember_nick() %>" required>
		</div>
		<div class="row">
			<label>생년월일</label> 
			<input type="date" name="member_birth" class="input" value="<%=dto.getMember_birth() %>" required>
		</div>
		<hr>
		<div class="row">
			<label >수정을 원한다면 비밀번호를 한번 더 입력하세요</label> 
			<input type="password" name="member_pw" class="input" placeholder="비밀번호 입력" required>
		</div>
		<div class="row center">
			<%if(request.getParameter("error")!=null) {%>
				<h3 style="color: red">비밀번호를 잘못 입력하셨습니다</h3>
			<%}%>
		</div>
		<div class="row center">
			<button type="submit">수정</button>
		</div>
	</div>
</form>
		


<jsp:include page="/template/footer.jsp"></jsp:include>