<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

</head>
<body style="background-image: url(images/bg.jpeg);">

<form action="guess">
<table border="1px" align="center">
<h1 align="center">Number Guessing Game</h1>
<tr>
<td>Enter guessing Number</td>
<td><input type="text" name="guessNum"></td>
</tr>
<tr>
<td><input type="submit" value="check"></td>
</tr>


</table>

</form>
<h2 align="center">${msg}</h2>
</body>
</html>