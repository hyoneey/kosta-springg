<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page session="false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style>
iframe {
	width: 0px;
	height: 0px;
	border: 0px
}
</style>
</head>
<body>

	<form id='form1' action="uploadForm" method="post" enctype="multipart/form-data" target="zeroFrame">
		<input type='file' name='file'> <input type='submit'>
	</form>
	
	<!-- 숨겨진 페이지를 이용해서 전송을 실행, 숨겨진페이지 바깥쪽에서 페이지 함수 호출 -->
	<iframe name="zeroFrame"></iframe>

	<script>
	//부모 창을 호출하는 함수
		function addFilePath(msg) {
			alert(msg);
			document.getElementById("form1").reset();
		}
	</script>
	
</body>
</html>