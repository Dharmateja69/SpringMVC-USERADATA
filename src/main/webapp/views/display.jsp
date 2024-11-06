<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<title>User List</title>
</head>
<body>
	<h2>User List</h2>
	<table border="1">
		<thead>
			<tr>
				<th>ID</th>
				<th>Name</th>
				<th>Password</th>
				<th>Number</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="u" items="${user}">
				<tr>
					<td>${u.id}</td>
					<td>${u.name}</td>
					<td>${u.password}</td>
					<td>${u.number}</td>

				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>
