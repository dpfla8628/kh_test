<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ page import="java.util.*" %>
    
<%for(int i=1; i<=100; i++){
	if(i%2==0){%>
		<%=i +"- 짝수 "%><br>
		<%}
	else{%>
		<%=i +"- 홀수 "%><br>
	<%}
}%>