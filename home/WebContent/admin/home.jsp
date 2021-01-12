<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
	//이 페이지는 "관리자"만 들어오는 페이지
	//관리자를 제외한 다른 계층이 접근할 경우 403 상태번호를 전송하자
//	String auth = (String)session.getAttribute("auth");
	//null(비회원)/일반/VIP/관리자
	
	//관리자가 아니면 404에러 메세지+중지
//	if(!auth.equals("관리자") || auth == null){
//		response.sendError(403);
		//jsp는 나중에 메소드로 처리가됨
//		return;
//	}
%>

<jsp:include page="/template/header.jsp"></jsp:include>

<div class="outbox center" style="width: 600px">
	<div class="row">
		<h2>관리자 메뉴</h2>
	</div>
	<div class="row">
		<h4><a href="list.jsp">회원 검색</a></h4>
	</div>
	<div class="row">
		<h4><a href="rank.jsp">포인트 현황</a></h4>
	</div>

</div> 

<jsp:include page="/template/footer.jsp"></jsp:include>