<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="javatime" uri="http://sargue.net/jsptags/time" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>회원 리스트</h2>
	<a href="register">회원가입하기</a>
	<table border="1">
		<tr>
			<th align="center" width="80">아이디</th>
			<th align="center" width="80">닉네임</th>
			<th align="center" width="80">생년월일</th>
			<th align="center" width="80">권한</th>
			<th align="center" width="80">포인트</th>
			<th align="center" width="80">가입일</th>
		</tr>
		
		<c:choose>
			<c:when test="${empty list}">
				<tr>
					<td colspan="7">
						회원이 없습니다.
					</td>
				</tr>
			</c:when>
			<c:otherwise>
				<c:forEach items="${list}" var="member">
					<tr>
						<td align="center">
							<a href="/member/read?member_no=${member.member_no}">
								${member.member_id}
							</a>
						</td>
						<td align="center">${member.member_nick}</td>
						<td align="center">${member.member_birth}</td>
						<td align="center">${member.member_auth}</td>
						<td align="center">${member.member_point}</td>
						<td align="center">${member.member_join}</td>
					</tr>
				</c:forEach>
			</c:otherwise>
		</c:choose>
	</table>
</body>
</html>