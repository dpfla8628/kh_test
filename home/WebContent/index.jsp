<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!-- header.jsp 불러오기 -->
<!--< %@ include file="template/header.jsp" %> -정적 : 의존성.종속성이 강함,충돌발생 / 아래는 동적 -->
<jsp:include page="/template/header.jsp"></jsp:include>


<div class="outbox" style="width:640px">
	<div class="row center">
		<h2>환영합니다!</h2>
	</div>
	<div class="row center">
		<img alt="환영이미지" src="http://placeimg.com/640/480/any">
	</div>
</div>



<!-- footer.jsp 불러오기 -->
<jsp:include page="/template/footer.jsp"></jsp:include>


