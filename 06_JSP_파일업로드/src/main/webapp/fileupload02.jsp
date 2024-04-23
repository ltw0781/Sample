<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>파일 업로드</title>
</head>
<body>
	<form action="fileupload02_pro.jsp" method="post" enctype="multipart/form-data">
	<!-- Servlet 으로 파일 업로드 처리 -->
<%-- 	<form action="<%= request.getContextPath() %>/fileupload/cos" method="post" enctype="multipart/form-data"> --%>
		<p>이 름 : <input type="text" name="name"> </p>	
		<p>제 목 : <input type="text" name="title"> </p>	
		<!-- multiple : 여러 파일을 선택하도록 지정 -->
		<p>파 일 : <input type="file" name="file1" > </p>
		<p>파 일 : <input type="file" name="file2" > </p>
		<p>
			<input type="submit" value="업로드" />
		</p>
	</form>
</body>
</html>