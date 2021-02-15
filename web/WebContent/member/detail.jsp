<%@page import="movi.beans.MemberDto"%>
<%@page import="movi.beans.MemberDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
	int member_no = Integer.parseInt(request.getParameter("member_no"));
	MemberDao dao = new MemberDao();
	MemberDto dto = dao.find(member_no);
 %>
 <table border="1">
 	<thead>
 		<tr>
 			<th>번호</th>
			<th>아이디</th>
			<th>닉네임</th>
			<th>생년월일</th>
			<th>권한</th>
			<th>포인트</th>
			<th>가입일</th>
 		</tr>
 	</thead>
 	<tbody>
 		<tr>
 			<td><%=dto.getMember_no()%></td>
			<td><%=dto.getMember_id()%></td>
			<td><%=dto.getMember_nick()%></td>
			<td><%=dto.getMember_birth()%></td>
			<td><%=dto.getMember_auth()%></td>
			<td><%=dto.getMember_point()%></td>
			<td><%=dto.getMember_join()%></td>
 		</tr>
 	</tbody>
 </table>
 <a href="edit.jsp?member_no=<%=dto.getMember_no()%>">수정</a>
 <a href="delete.jsp?member_no=<%=dto.getMember_no()%>">삭제</a>