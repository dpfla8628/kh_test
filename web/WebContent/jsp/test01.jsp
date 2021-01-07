<!-- 
	JSP에서는 html과 java코드를 합칠 수 있다
	
	*Directive : 페이지 내부의 설정  - < %@ %>
	-page
		-language : 언어 설정
		-contentType : 화면에 보여질 타입 : 기본값 - text/html / ISO-8859-1 : 아스키 코드
		-pageEncoding
		-import
		
	*Scriptlet : 자바 일반 실행코드 - < % %>
	*Expression : 자바 출력구문 - < %= %>
		
	
 -->
 
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import = "java.util.*" %>
<%@ page import = "java.sql.*" %>

<% for(int i=0; i<10; i++){%>
<h1>Hello<%=i %></h1>
<%}%>



