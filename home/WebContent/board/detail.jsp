<%@page import="java.text.SimpleDateFormat"%>
<%@page import="home.beans.ReplyDto"%>
<%@page import="java.util.List"%>
<%@page import="home.beans.ReplyDao"%>
<%@page import="home.beans.MemberDto"%>
<%@page import="home.beans.MemberDao"%>
<%@page import="home.beans.BoardDto"%>
<%@page import="home.beans.BoardDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    
<!-- 조회수 조회 -->    
<%
	//1. 번호를 받는다
	int board_no = Integer.parseInt(request.getParameter("board_no"));	
	//2. 조회수를 증가시킨 후 내용을 구한다
	BoardDao boardDao = new BoardDao();	
	boardDao.plusReadcount(board_no);
	BoardDto boardDto = boardDao.find(board_no);	
	//3. 회면에 출력한다
%>	

<!-- 작성자 본인인지 관리자인지 파악하기 위한 검사코드 -->	
<%	
	//관리자 : 세션에 auth항목을 조사하여 관리자인지 확인
	//본인 : 로그인한 사용자의 아이디와 게시글의 작성자가 같은지 확인
	
	String auth = (String)session.getAttribute("auth");
	int member_no = (int)session.getAttribute("check");
	
	boolean isAdmin = auth.equals("관리자");
	
	MemberDao memberDao = new MemberDao();
	MemberDto memberDto = memberDao.find(member_no);
	
	boolean isOwner = memberDto.getMember_id().equals(boardDto.getBoard_writer());
%>   
   

<!-- 댓글 목록 구하는 코드 --> 
<%
	ReplyDao replyDao = new ReplyDao();
	List<ReplyDto> replyList = replyDao.select(board_no);
%>   
    
<jsp:include page="/template/header.jsp"></jsp:include>


<!-- 새글, 수정, 삭제, 목록 -->
<script>
	//각종 버튼들을 누르면 해당 위치로 이동
	$(function(){
		//새글 버튼을 누르면 write.jsp로 보낸다
		$(".write-btn").click(function(){
			//location.href="write.jsp";//상대경로
			location.href="<%=request.getContextPath()%>/board/write.jsp";//절대경로
		});
		
		$(".edit-btn").click(function(){
			location.href = "edit.jsp?board_no=<%=board_no%>";
		});
		
		$(".delete-btn").click(function(){
			if(confirm("정말 지우시겠습니까?")){
				location.href="<%=request.getContextPath()%>/board/delete.do?board_no=<%=board_no%>";	
			}
		});
		
		//목록 버튼을 누르면 list.jsp
		$(".list-btn").click(function(){
			//location.href="list.jsp";
			location.href="<%=request.getContextPath()%>/board/list.jsp";
		});
		
//댓글관련 처리
		//1. 최초에 수정화면(.reply-edit)를 숨김 처리
		$(".reply-edit").hide();
		
		//2. 수정버튼(.reply-edit-btn)을 누르면 일반화면(.reply-normal)을 숨기고 수정화면(.reply-edit)을 표시
		// = a태그이므로 기본이벤트를 차단해야한다
		$(".reply-edit-btn").click(function(e){
			e.preventDefault();
			
			//this를 기준으로 dom 탐색을 수행(this == 링크 버튼)
			//$(this).parent().parent().hide();
			//$(this).parent().parent().next().show();
			$(this).parents(".reply-normal").hide();
			$(this).parents(".reply-normal").next().show();
		});
		
		//3. 작성 취소 버튼(.reply-edit-cancel-btn)을 누르면 수정화면을 숨기고 일반화면을 표시한다.
		$(".reply-edit-cancel-btn").click(function(){
			//$(this).parent().parent().parent().hide();
			//$(this).parent().parent().parent().prev().show();
			$(this).parents(".reply-edit").hide();
			$(this).parents(".reply-edit").prev().show();
		});
	});
</script>

<div class="outbox" style="width:800px">
	<div class="row center">
		<h2><%=board_no %>번 게시글</h2>
	</div>
	<div class="row">
		<table class="table table-border">
<!-- 게시글 내용 -->
			<tbody>
				<tr>
					<th width="20%">작성자</th>
					<td class="left"><%=boardDto.getBoard_writer() %></td>
				</tr>
				<tr>
					<th width="20%">제목</th>
					<td class="left"><%=boardDto.getBoard_title() %></td>
				</tr>
				<tr height="200">
					<th width="20%">내용</th>
					<td class="left" valign="top"><%=boardDto.getBoard_content() %></td>
				</tr>
				<tr>
					<th width="20%">작성일</th>
					<td class="left"><%=boardDto.getBoard_time() %></td>
				</tr>
				<tr>
					<th width="20%">조회수</th>
					<td class="left"><%=boardDto.getBoard_read() %></td>
				</tr>
			
<!-- 댓글 목록 -->
				<tr>
					<td colspan="2">
						<div class="outbox">
							<%for(ReplyDto replyDto : replyList){ %>
						
						<!-- 일반 출력 화면 -->
						<div class="row left reply-normal">
							<div>
								<%=replyDto.getReply_writer()%>
<!-- 작성자면 이름을 다르게 표시 -->
								<%if(boardDto.getBoard_writer().equals(replyDto.getReply_writer())){ %>
									<span style="color: red">(작성자)</span>						
								<%} %>
								</div>
								
								
								<div><%=replyDto.getReply_content() %></div>
								<div>
<!-- 최근 작성한 순서대로-->
									<%
									SimpleDateFormat f = new SimpleDateFormat("yyyy-mm-dd h:mm:ss");
									String time = f.format(replyDto.getReply_time());
									%>
									<%=time %>
									
<!-- 댓글 수정은 본인만, 삭제는 본인과 관리자만 -->
									<%
										boolean isReplyOwner = memberDto.getMember_id().equals(replyDto.getReply_writer());
									%>
<!-- 댓글 수정 -->
									<%if(isReplyOwner){ %>
										<a href="#" class="reply-edit-btn">수정</a>
									<%} %>
									
<!-- 댓글 삭제  (해당 댓글 reply_no를 삭제하고 board_no를 통해 다시 게시글으로 돌아온다) =필요한 파라미터 두개-->
									<%if(isAdmin || isReplyOwner){ %>
										<a href="reply_delete.do?reply_no=<%=replyDto.getReply_no()%>&board_no=<%=board_no%>">삭제</a>
									<%} %>
								</div>							
							</div>
							<%if(isReplyOwner){ %>
<!-- 수정을 위한 화면 : 본인에게만 나오도록 조건을 설정 -->
							<div class="row left reply-edit">
								<form action="reply_edit.do" method="post">
									<input type="hidden" name="reply_no" value="<%=replyDto.getReply_no()%>">
									<input type="hidden" name="reply_origin" value="<%=board_no%>">
									
									<div class="row">
										<textarea class="input" name="reply_content" required rows="5" 
											placeholder="댓글 작성"><%=replyDto.getReply_content()%></textarea>
									</div>
									<div class="row">
										<input type="submit" value="댓글 수정" class="input input-inline">
										<input type="button" value="작성 취소" class="input input-inline reply-edit-cancel-btn">
									</div>
								</form>
							</div>
							<%} %>
						<%} %>
						</div>
					</td>
				</tr>
<!-- 댓글 작성란 -->			
				<tr>
					<td colspan="2">
						<form action="reply_insert.do" method="post">
							<!-- 화면에 나오지 않는 게시글 번호를 숨겨서 보낸다 -->
							<input type="hidden" name="reply_origin" value="<%=board_no %>">
								
								<div class="row">
									<textarea class="input" name="reply_content" rows="5" placeholder="댓글 작성"></textarea>
								</div>
								<div class="row">
									<input type="submit" value="댓글 작성" class="input">
								</div>
							</form>
						</td>
					</tr>
				</tbody>
<!-- 새글/수정/삭제/목록 -->			
			<tfoot>
				<tr>
					<th class="right" colspan="2">
						<button class="input input-inline write-btn">새글</button>
						
						<!-- 본인/관리자만 접근할 수 있도록 필터링 해주자! -->
						<%if(isAdmin || isOwner){%>
						<button class="input input-inline edit-btn">수정</button>
						<button class="input input-inline delete-btn">삭제</button>
						<%} %>
						<button class="input input-inline list-btn">목록</button>		
					</th>
				</tr>
			</tfoot>
		</table> 
	</div>
</div>

<jsp:include page="/template/footer.jsp"></jsp:include>