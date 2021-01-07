<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!--
	< %@ include file="../template/header.jsp" %>
	위처럼 상대경로로 불러와도 되지만 간편하게 절대경로로 /~~ 작성하자
	그리고 위의 방식은 종속적이라 header에서 쓰인 자바코드가 join에도 영향을 미친다
	join에서 코드를 사용할 때  header에서 입력된 코드들을 다 기억해야하기 때문에 불편함
	그래서 아래처럼 입력하면 동적,독립적으로 사용할 수 있다. => 서로의 자바코드가 서로에게 영향을 미치지 않음
-->
<jsp:include page="/template/header.jsp"></jsp:include>

<form action="join.do" method="post">
	<div class="outbox" style="width:500px">
		<div class="row">
			<label>아이디 </label>
			<input type="text" name="member_id" class="input" required>
		</div>
		<div class="row">
			<label>비밀번호</label> 
			<input type="password" name="member_pw" class="input" required>
		</div>
		<div class="row">
			<label>닉네임</label> 
			<input type="text" name="member_nick" class="input" required>
		</div>
		<div class="row">
			<label>생년월일</label> 
			<input type="date" name="member_birth" class="input" required>
		</div>
		<div class="row center">
			<button type="submit">회원가입</button>
		</div>
	</div>
</form>
		


<jsp:include page="/template/footer.jsp"></jsp:include>