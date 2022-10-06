<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
		<h1>Calculator</h1>
		<form action="calculate.htm">
			First Number: <input type="number" name="fno">
			<br>
			Second Number: <input type="number" name="sno">
			<br>
			<br>
			<button type="submit" name="op" value = "ADD">ADD</button>
			<button type="submit" name="op" value = "SUB">SUB</button>
			<button type="submit" name="op" value = "DIV">DIV</button>
			<button type="submit" name="op" value = "MUL">MUL</button>
		</form>
		<br>
		<br>
		Result : ${ Result }
		
	</body>
</html>