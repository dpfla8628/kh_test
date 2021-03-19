<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<script src="https://code.jquery.com/jquery-latest.min.js"></script>

<script type="text/javascript">
	$(document).ready(function () {
		$("#getBtn").on("click", function () {
			var boardNo = $("#boardNo")
			var boardNoVal = boardNo.val()
			
			$.get("/boards/" + boardNoVal, function (data) {
				// JSON 데이터를 출력할 때 사용한다.
				// 보통 JSON 데이터는 { ~~~ } 형태니까
				// 이전에 Java에서 HashMap 얘기했던 이유를 상기하면 됨
				alert(JSON.stringify(data))
			})
		})
		$("#getJsonBtn").on("click", function () {
			var boardNo = $("#boardNo")
			var boardNoVal = boardNo.val()
			
			$.ajax({
				type: "get",
				url: "/boards/" + boardNoVal,
				// 나는 json만 처리가능하니까 딴거 주지마
				headers: {
					"Accept": "application/json"
				},
				success: function (result) {
					alert(JSON.stringify(result))
				}
			})
		})
		
		$("#getXmlBtn").on("click", function () {
			var boardNo = $("#boardNo")
			var boardNoVal = boardNo.val()
			
			$.ajax({
				type: "get",
				url: "/boards/" + boardNoVal,
				// 나는 json만 처리가능하니까 딴거 주지마
				headers: {
					"Accept": "application/xml"
				},
				success: function (result) {
					alert(xmlToString(result))
				}
			})
		})
	})
	
	function xmlToString (xmlData) {
		var xmlString;
		
		if (window.ActiveXObject) {
			xmlString = xmlData.xml;
		} else {
			xmlString = (new XMLSerializer()).serializeToString(xmlData);
		}
		
		return xmlString;
	}
</script>

<body>
	<h1>Ajax Home</h1>
	
	<form>
		게시물 번호: <input type="text" name="boardNo" value="" id="boardNo"><br>
		제목: <input type="text" name="title" value="" id="title"><br>
		내용: <input type="text" name="content" value="" id="content"><br>
		작성자: <input type="text" name="writer" value="" id="writer"><br>
	</form>
	
	<div>
		<button id="getBtn">Read</button>
		<button id="getJsonBtn">Read Json</button>
		<button id="getXmlBtn">Read Xml</button>
	</div>
</body>
</html>