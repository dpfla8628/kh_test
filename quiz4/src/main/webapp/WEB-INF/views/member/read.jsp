<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>

<script src="https://code.jquery.com/jquery-latest.min.js"></script>

<script>
	$(document).ready(function () {
		var formObj = $("#member")
		
		$("#btnModify").on("click", function () {
			formObj.attr("action", "/member/modify")
			formObj.attr("method", "post")
			formObj.submit();
		})
		
		$("#btnList").on("click", function () {
			self.location = "/member/list"
		})
		
		$("#btnRemove").on("click", function () {
			formObj.attr("action", "/member/remove")
			formObj.submit();
		})
	})
</script>

<body>
	<h2>회원가입</h2>
	<form:form modelAttribute="member">
	<form:hidden path="member_no"/>
		<table>
			<tr>
				<td>아이디</td>
				<td><form:input path="member_id" readonly="true"/></td>
			</tr>
			<tr>
				<td>비밀번호</td>
				<td><form:input path="member_pw"/></td>
			</tr>
			<tr>
				<td>닉네임</td>
				<td><form:input path="member_nick"/></td>
			</tr>
		</table>
	</form:form>
	
	<div>
		<button type="submit" id="btnModify">수정</button>
		<button type="submit" id="btnRemove">삭제</button>
		<button type="submit" id="btnList">회원 목록</button>
	</div>
</body>
</html>