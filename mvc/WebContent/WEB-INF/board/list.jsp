<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<link rel =stylesheet" type="text/css" href="${pageconText.request.contextPath }/css/common.css">

<table class="table table-border">
	<thead>
		<tr>
			<th>번호</th>
			<th>제목</th>
			<th>작성자</th>
			<th>작성일</th>
			<th>조회수</th>
	</thead>
	<tbody>
		<c:forEach var="list" items="${list }">
			<tr>
			<td>${list.board_no}</td>
			<td>${list.board_title}</td>
			<td><c:if test="${not empty list.board_header }">  
				[${list.board_header}]
			</c:if>
			${list.board_content}</td>
			<td>${list.board_writer}</td>
			<td>${list.board_time}</td>
			<td>${list.board_read}</td>
			</tr>
		</c:forEach>
	</tbody>
</table>