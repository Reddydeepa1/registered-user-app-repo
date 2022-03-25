<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<body>
	<div class="container">
		<h2 align="center">User List</h2>

		<table class="table">
			<thead>
				<tr>					
					<th>UserID</th>
					<th>UserName</th>
					<th>Password</th>
					
				</tr>
			</thead>
			<tbody>
				<c:forEach var="e" items="${userList}">
					<tr>						
						<td>${e.userid}</td>
						<td>${e.username}</td>
						<td>${e.password}</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>