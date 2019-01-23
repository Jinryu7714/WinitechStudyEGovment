<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
	<ul>
		<li>제목 - ${vo.title }</li>
		<li>작성자 - ${vo.writer }</li>
		<li>콘텐츠 - ${vo.content }</li>
		

		<hr>
		<a href="list.do">게시물 목록</a>
					
	</ul>
	</fieldset>
</body>
</html>