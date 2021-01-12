<%@page import="java.util.List"%>
<%@page import="home.beans.MemberRankVO"%>
<%@page import="home.beans.MemberDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>


<%
	//포인트 보유량이 많은 순으로 1위부터 3위까지 조회하는 페이지
	MemberDao dao = new MemberDao();
	List<MemberRankVO> list= dao.getPointRank(1,3);
	
%>
<jsp:include page="/template/header.jsp"></jsp:include>

<div class="outbox center" style="width:500px">
	<div class="row">
		<h2>랭킹</h2>
	</div>
	<div class="row">
		<table class="table table-border">	
			<thead>
			<tr>
				<th>순위</th>
				<th>아이디</th>
				<th>포인트</th>
			</tr>
			</thead>	
			<tbody>
				<%for(MemberRankVO vo : list) {%>
					<tr>
						<td><%=vo.getRank()%></td>
						<td><%=vo.getMember_id() %></td>
						<td><%=vo.getMember_point() %></td>	
					</tr>
				<%} %>
			</tbody>
		</table>
	</div>
<jsp:include page="/template/footer.jsp"></jsp:include>