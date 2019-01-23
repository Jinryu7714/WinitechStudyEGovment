<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>등록 화면</title>
</head>
<body>
	<h1>등록화면</h1>
	
	<form action="insert.do" method="post">
	<fieldset>
	<legend>글 등 록</legend>
		<label>제목 -<input type="text" name="title"></label> <br> <br>
		<label>작성자 - </label><input type="text" name="writer"> <br> <br>
		<label>내용  - </label><textarea name="content" rows="3" cols="55"></textarea> <br>
		<div style="float:right;">
		<a href="list.do">게시물 목록</a>
		<input type="submit" value="글등록">
		</div> 
	</fieldset>
	</form>
</body>
</html>