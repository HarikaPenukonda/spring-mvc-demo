<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Customer Registration Form</title>
<style>
	.error {color:red}
</style>
</head>
<body>

<i> Fill out the form. Asterisk(*) means required </i>
<br><br>
	<form:form action="processForm" modelAttribute="customer">
	
		<br><br>
		
		First name 	  : <form:input path="firstName"/>
		
		<br><br>
		
		Last name (*) : <form:input path="lastName"/> <!-- (message="is required") -->
		<form:errors path="lastName" cssClass="error"/>
		
		<br><br>
		
		Free Passes   : <form:input path="freePasses"/>
		<form:errors path="freePasses" cssClass="error"/>
		
		<br><br>
		
		Postal Code   : <form:input path="postalCode"/>
		<form:errors path="postalCode" cssClass="error"/>
		
		<br><br>
		
		<input type="submit" value="submit">
		
	</form:form>
</body>
</html>