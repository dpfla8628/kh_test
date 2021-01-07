<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
  
  <!-- 
  	test01의 session을 가져온다!(test01을 실행시킨 후 test02를 실행하면 적용됨)
  	하지만 브라우저에 따라 세션아이디가 다르다는점을 기억하자
  	
  	이걸로 어떻게 로그인 상태를 유지할까?
  	로그인 상태라면? 세션에 값이 하나 저장된 상태
  	아니라면? 세션에 값이 없는 상태
  	
   -->
<h1>sample = <%=session.getAttribute("sample") %></h1>