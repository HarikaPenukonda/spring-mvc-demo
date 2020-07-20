<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Hello World Page</title>
</head>
<body>
	<h2>Hello World of Spring!</h2>
	<br><br>
	Student name : ${param.studentName} <!-- name of HTML form field -->
	<br><br>
	The message : ${message} <!-- Attribute name : model.addAttribute("message",result) -->
	
</body>
</html>