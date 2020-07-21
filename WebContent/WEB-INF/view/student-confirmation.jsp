<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Student Confirmation Page</title>
</head>
<body>
	The student is Registered successfully : ${student.firstName} ${student.lastName} 
	
	<br><br>
	
	Country : ${student.country}
	
	<br><br>
	
	Favourite Language : ${student.favouriteLanguage} <!-- Spring will call student.getFavouriteLanguage() -->
	
	<br><br>
</body>
</html>