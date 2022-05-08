<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Welcome to JAVA web application!!</h1><br>
	<h2>LOGIN PAGE:</h2>
	<form action="<%=request.getContextPath()%>/test">
		<input type = "text" name = "uname" placeholder ="type username"/> <br><br>
		<input type = "password" name = "pwd" placeholder = "type password"/><br><br>
		
		<hr>
		<h1>Let's do some testing</h1><br>
		Put the url you want to test: <input type = "text" name = "url" size = "100" placeholder ="type url"/> <br><br>
		<input type = "submit" value = "start testing"/>
	</form>
	
	
</body>
</html>