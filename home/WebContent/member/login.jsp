<%@page import="java.util.List"%>
<%@page import="home.beans.MemberDto"%>
<%@page import="home.beans.MemberDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<jsp:include page="/template/header.jsp"></jsp:include>

<form action="login.do" method="post">
	<div class="outbox" style="width:500px">
		<div class="row">
			<label>아이디 </label>
			<input type="text" name="member_id" class="input" required>
		</div>
		<div class="row">
			<label>비밀번호</label> 
			<input type="password" name="member_pw" class="input" required>
		</div>
		
		<%if(request.getParameter("error")!=null){%>
			<div class="row center" style="color: red">
				입력하신 정보가 맞지 않습니다.
			</div>
		<%}%>
		
		<div class="center">
		<input type="submit" value="로그인">
		</div>
	</div>
</form>
		

<jsp:include page="/template/footer.jsp"></jsp:include>

