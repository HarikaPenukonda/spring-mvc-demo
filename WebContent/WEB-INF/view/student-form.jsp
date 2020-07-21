<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Student-Registration Form</title>
</head>
<body>

	<form:form action="processForm" modelAttribute="student"> <!-- theModel.addAttribute("student", theStudent); -->
	
		First Name : <form:input path="firstName"/> <!-- Property of student class, spring MVC calls student.getFirstName()  -->
		<br><br>
		Last Name : <form:input path="lastName"/> <!-- Property of student class, spring MVC calls student.getLastName() -->
		<br><br>
		<input type="submit" value="submit"> <!-- when we submit the data spring MVC calls student.setFirstName and student.setLastName -->
	</form:form>

</body>
</html>