<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>간단 계산기 화면</title>

</head>
<body>
<form action="calc.do" method="post">
	<div id="calcbox">
		<h1>간단 계산기 화면</h1>
		숫자 1 <input type="number" name="n1" size="3">
		<select name="opr">
			<option >+</option>
			<option >-</option>
			<option >*</option>
			<option >/</option>
		</select>
		숫자 2 <input type="number" name="n2" size="3">
		
		<input type="submit" value="계산하기">
	</div>
</form>
</body>
</html>