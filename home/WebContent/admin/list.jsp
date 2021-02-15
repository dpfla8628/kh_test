<%@page import="home.beans.MemberDto"%>
<%@page import="java.util.List"%>
<%@page import="home.beans.MemberDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:include page="/template/header.jsp"></jsp:include>

<!-- 
	회원 검색 페이지
	검색에 필요한 값들을 파라미터로 전달받아야 한다(유형 : type , 검색어 : key)
 -->
<%
	request.setCharacterEncoding("utf-8");
	String type = request.getParameter("type");
	String key = request.getParameter("key");

	boolean isSearch = type!=null & key!=null;
	
	MemberDao dao = new MemberDao();
	List<MemberDto> list = dao.select(type,key);
	//받는 파라미터가 null인 경우? Dao select()를 수정하자 
	
%>

<script>
	$(function(){
		$(".delete-link").click(function(e){
			e.preventDefault();//a,form태그는 기본 설정된 이벤트를 방지해야한다.
			
			var choice = window.confirm("정말 회원탈퇴를 진행하시겠습니까?");
			if(choice){
				//location.href=$(this).attr("href")
				$(location).attr("href",$(this).attr("href"));
			}
		});
	});
</script>

<div class="outbox" style="width:800px">
	
	<!-- 제목 -->
	<div class="row center">
		<h2>회원 검색</h2>
	</div>
	
	<!-- 검색 폼 -->
	<form action="list.jsp" method="get">
	
		<div class="row center">
			<select name="type" class="input input-inline" required>
				<option value="">분류 선택</option>
				<option value="member_no" <%if(type!=null&&type.equals("member_no")){%>selected<%}%>>번호</option>
				<option value="member_id" <%if(type!=null&&type.equals("member_id")){%>selected<%}%>>아이디</option>
				<option value="member_nick" <%if(type!=null&&type.equals("member_nick")){%>selected<%}%>>닉네임</option>
				<option value="member_birth" <%if(type!=null&&type.equals("member_birth")){%>selected<%}%>>생년월일</option>
				<option value="member_auth" <%if(type!=null&&type.equals("member_auth")){%>selected<%}%>>등급</option>
			</select>
				<%if(isSearch){ %>
				<input type="text" name="key" placeholder="검색어 입력" required class="input input-inline" value="<%=key%>">
				<%}else{ %>
				<input type="text" name="key" placeholder="검색어 입력" required class="input input-inline">
				<%} %>
				<input type="submit" value="검색" class="input input-inline">
		</div>

	</form>
	
	<!-- 결과화면 -->
	
	<%if(list==null){ %>
		<!-- 처음 들어온 경우 -->
		<div class="row center">
			<h4>분류와 검색어를 입력해주세요</h4>
		</div>
	<%}else if(list.isEmpty()) {%>
		<!-- 결과값이 없는 경우 -->
		<div class="row center">
			<h5>검색 결과가 존재하지 않습니다.</h5>
		</div>
	<%}else{ %>
		<!-- 결과값이 있는 경우 -->
		<div class="row">
			<table class="table table-border table-pattern">
				<thead>
					<tr>
						<th>회원번호</th>
						<th>아이디</th>
						<th>닉네임</th>
						<th>생년월일</th>
						<th>등급</th>
						<th>관리메뉴</th>
					</tr>
				</thead>
				<tbody>
				<%for(MemberDto dto : list) {%>
					<tr>
						<td><%=dto.getMember_no()%></td>
						<td><%=dto.getMember_id() %></td>
						<td><%=dto.getMember_nick() %></td>
						<td><%=dto.getMember_birth() %></td>
						<td><%=dto.getMember_auth() %></td>
						<td>
							<a href="detail.jsp?member_no=<%=dto.getMember_no()%>">상세</a>
							<a href="edit.jsp?member_no=<%=dto.getMember_no()%>">수정</a>
							<a class="delete-link" href="delete.do?member_no=<%=dto.getMember_no()%>">탈퇴</a>
							<a href="pw.do?member_no=<%=dto.getMember_no()%>">임시 비빌번호 발금</a>
							
						</td>
					</tr>
					<%} %>
				</tbody>
			</table>
		</div>	
		<%} %>
</div>

<jsp:include page="/template/footer.jsp"></jsp:include>