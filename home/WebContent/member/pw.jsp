<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<jsp:include page="/template/header.jsp"></jsp:include>

<form action="pw.do" method="post">
	<div class="outbox" style="width:500px">
		<div class="row">
			<label>현재 비밀번호 </label>
			<input type="text" name="member_pw" class="input" required>
		</div>
		<div class="row">
			<label>변경할 비밀번호</label> 
			<input type="text" name="new_pw" class="input" required>
		</div>		
		<%if(request.getParameter("error1")!=null){ %>
			<div class="row" style="color:red">
				현재 비밀번호를 잘못 입력하셨습니다.
			</div>
		<%} %>
		<%if(request.getParameter("error2")!=null){ %>
			<div class="row" style="color:red">
				현재 비밀번호와 바뀔 비밀번호가 같습니다.
			</div>
		<%} %>
		<div class="center">
		<input type="submit" value="변경">
		</div>
	</div>
</form>
		

<jsp:include page="/template/footer.jsp"></jsp:include>