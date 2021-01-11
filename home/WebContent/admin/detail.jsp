<%@page import="home.beans.MemberDto"%>
<%@page import="home.beans.MemberDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:include page="/template/header.jsp"></jsp:include>

<%
	int member_no = Integer.parseInt(request.getParameter("member_no"));
	MemberDao dao = new MemberDao();
	MemberDto dto = dao.find(member_no);

%>

<div class="outbox" style="width:400px">
	<div class="row center">
		<h3>회원정보</h3>
	</div>
	<div class="row center">
		<table class="table table-border">
			<tr>
				<th>
			</tr>
			<tr>
				<th width="25%">ID</th>
				<td><%=dto.getMember_id() %></td>
			</tr>
			<tr>
				<th>NICK</th>
				<td><%=dto.getMember_nick() %></td>
			</tr>
			<tr>
				<th>포인트</th>
				<td><%=dto.getMember_point() %></td>
			</tr>
			<tr>
				<th>가입일</th>
				<td><%=dto.getMember_join() %></td>
			</tr>
		</table>
	</div>
	
	<!-- 각종 메뉴 -->
	<div class="row center">
		<a href="list.jsp">목록으로 돌아가기</a>
	</div>
	
</div>


<jsp:include page="/template/footer.jsp"></jsp:include>