<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>테스트 1</h1>
	<h1> msg : ${msg }</h1>
	<h1> requestScope.msg : ${ requestScope.msg }</h1>
	<h1> request.getAttribute("msg") : <%= request.getAttribute("msg") %></h1>
</body>
</html>