<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Saved data</title>
</head>
<body>
	<h2>User Added Successfully!!</h2>

	<c:if test="${not empty user}">
		<div>ID: ${user.id}</div>
		<div>Name: ${user.name}</div>
		<div>Password: ${user.password}</div>
		<div>Number: ${user.number}</div>
	</c:if>

	<a href="adduser">Add another User</a>
	<a href="viewall">View existing user data</a>
</body>
</html>