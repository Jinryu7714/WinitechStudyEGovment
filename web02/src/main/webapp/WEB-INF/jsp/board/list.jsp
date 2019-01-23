<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>등록 화면</title>
</head>
<body>
	<h1>등록화면</h1>
	
	<fieldset>
	<legend>글 조 회</legend>
	<table>
	<tr>
		<th>게시물 번호</th>
		<th>제목</th>
		<th>작성자</th>
		<th>게시일</th>
	</tr>
		<c:forEach var="boardVO" items="${boardVOs }">
		<tr>
			<td>${boardVO.no }</td>
			<td><a href="boardJoin.do?no=${boardVO.no}">${boardVO.title }</a></td>
			<td>${boardVO.writer }</td>
			<td>${boardVO.regdate }</td>
		</tr>
		</c:forEach>
	</table>
	</fieldset>
</body>
</html>