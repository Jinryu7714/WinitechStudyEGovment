<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>숫자 추리</title>

</head>
<body>

	<h1> 1 - 100 사이 난수를 맞춰 보세요.</h1>
	<div>${msg }</div>
	
	<form action="find_number.do" method="post">
		<fieldset> <!-- 실선 테두리 -->
			<legend>숫자를 입력 하세요.</legend>  <!--  실선 테두리의 제목 -->
			<input type="number" name="num">
			<input type="submit" value="맞춰보기">
		</fieldset>  
	</form>
	<c:if test=""></c:if>
</body>
</html>