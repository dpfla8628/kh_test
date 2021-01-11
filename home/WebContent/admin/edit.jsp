<%@page import="home.beans.MemberDto"%>
<%@page import="home.beans.MemberDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	int member_no = Integer.parseInt(request.getParameter("member_no"));
	MemberDao dao = new MemberDao();
	MemberDto dto = dao.find(member_no);
%>

<jsp:include page="/template/header.jsp"></jsp:include>


<form action="edit.do" method="post">

<input type="hidden" name="member_no" value="<%=dto.getMember_no() %>">

	<div class="outbox" style="width:500px">
		<div class="row">
			<label>닉네임</label> 
			<input type="text" name="member_nick" class="input" value="<%=dto.getMember_nick() %>" required>
		</div>
		<div class="row">
			<label>생년월일</label> 
			<input type="text" name="member_birth" class="input" value="<%=dto.getMember_birth() %>" required>
		</div>
		<div class="row">
			<label>포인트</label> 
			<input type="text" name="member_point" class="input" value="<%=dto.getMember_point() %>" required>
		</div>
		<div class="row">
			<label>권한</label> 
			<select name="member_auth" class="input">
				<option <%if(dto.is("일반")){%>selected<%}%>>일반</option>
				<option <%if(dto.is("VIP")){%>selected<%}%>>VIP</option>
				<option <%if(dto.is("관리자")){%>selected<%}%>>관리자</option>
			</select>
		</div>
		<div class="row center">
			<button type="submit">수정</button>
		</div>
	</div>
</form>
		


<jsp:include page="/template/footer.jsp"></jsp:include>