<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%--
	JSTL을 이용한 조건 구문 구현
	- <c:forEach>
	- <c:forTokens>
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<c:forEach var="i" begin="1" end="10" step="1">
	<h1>Hello!${i }</h1>
</c:forEach>

<c:set var="arr" value="10,20,30,40,50"></c:set>
<c:forEach var="i" items="${arr }">
	<h2>${i }</h2>
</c:forEach>


<c:forTokens var="i" items="${arr }" delims=",">
	<h2>${i }</h2>
</c:forTokens>

