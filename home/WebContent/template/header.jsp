<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!-- 
	template페이지는 자체적으로 실행되는 것이 아니라 특정 페이지에 붙어서 실행된다.
	따라서 작성되는 경로의 기준점이 이 페이지가 아니라 붙어서 실행되는 대상 페이지가 된다.
	
	상대경로를 사용하면 요류의 발생 가능성이 높다(경로가 다양하니까)
	= 절대경로를 사용하면 경로와 관계없이 동일한 위치를 가리키게 된다
	하지만 절대경로를 사용하여 context path를 직접 입력하면 변화에 대처가 어렵다
	=> request 객체를 이용하여 context path를 구해올 수 있다
	 : request.getContextPath() = /home
 -->
<%
	//사용자가 로그인 상태인지 계산하는 코드
	//로그인 상태 : session에 check
	boolean isLogin = session.getAttribute("check")==null;
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>내가 만든 홈페이지</title>
<link rel="stylesheet" type="text/css" href="/home/css/common.css">

<style>
	/* 화면 레이아웃 스타일 */
	/*
		-모든 영역 점선 테두리 표시
		-전체 화면 폭 : 1024px
		-레이아웃 여백 설정
		-본문 최소 높이 설정
	*/
	main,header,nav,section,aside,article,footer,
	div, label, span, p{
		border : 1px dotted gray;
	}
	main{
		width:1024px;
		margin:auto;
	}
	header,footer,nav,section{
		padding:1rem; 
	}
	section{
		min-height: 450px; 
	}
</style>

<script src="https://code.jquery.com/jquery-3.5.1.js"></script>
<script>
</script>
</head>

<body>
	<main>
		<header class="center">
			<h1>JSP로 홈페이지 만들기</h1>
		</header>
		<nav>
			<!-- 비회원 메뉴 -->
			<!-- 
			상대경로 적절하지 않음!! template에서는 무조건 절대경로 사용자하자!
			이 코드는 사용자가 보는 링크! "/home/index.jsp" 컨텍스트 경로까지 쓴 절대경로로 써주자
			
			이와 반대로 index.jsp에서 쓰이는 링크는 서버에서 사용하는 링크이므로
			"/template/header.jsp>인 상대경로로 써줘도 된다
			
			context경로
			=<a href="../">홈</a>
			=<a href="home/index.jsp">홈</a>
			=<a href="< %=request.getContextPath()%>/index.jsp">홈</a>
			=<a href="< %=request.getContextPath()%>">홈</a>
			-->
			<% if(isLogin){%>		
			<a href="<%=request.getContextPath()%>">홈</a>
			<a href="<%=request.getContextPath()%>/member/join.jsp">회원가입</a>
			<a href="<%=request.getContextPath()%>/member/login.jsp">로그인</a>
			<!-- 회원 메뉴 -->
			<%}else{ %>
			<a href="<%=request.getContextPath()%>">홈</a>
			<a href="<%=request.getContextPath()%>/member/logout.do">로그아웃</a>
			<a href="<%=request.getContextPath()%>/member/my.jsp">내정보</a>
			<a href="<%=request.getContextPath()%>/member/board.jsp">게시판</a>
			<%} %>
		</nav>
	<section>