
<%@page import="beans.BoardDto"%>
<%@page import="beans.BoardDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- 
	이 페이지는 무조건 "어떤 항목을 볼 것인지에 대한 값"이 존재해야 한다
	일반적으로 primary key가 이 역할을 수행한다
	
	즉, 이 페이지에서는 시작하자마자 전달되는 데이터를 받아서 데이터베이스에 존재하는 값을 불러온 뒤 출력해야 한다.
	게시판에서는 board_no가 이에 해당
	해당 파라미터가 없으면 오류가 남
	
 -->
 <%
 	int board_no = Integer.parseInt(request.getParameter("board_no"));
 
 	BoardDao dao = new BoardDao();
 	
 	//List로 할 필요가 없음 원하는 no의 게시글 하나만 찾는거니까!
 	BoardDto dto = dao.find(board_no);
 	
 %>
 
 글번호 : <%= dto.getBoard_no() %>
 <br>
 작성자 : <%= dto.getBoard_writer() %>
 <br>
 말머리 : <%= dto.getBoard_header()%>
 <br>
 제목 : <%= dto.getBoard_title()%>
 <br>
 내용 : <%= dto.getBoard_content()%>
 <br>
 작성일 : <%= dto.getBoard_time()%>
<hr>
<a href="edit.jsp?board_no=<%=dto.getBoard_no()%>">수정</a>
<a href = "delete.do?board_no=<%=dto.getBoard_no()%>">삭제</a>