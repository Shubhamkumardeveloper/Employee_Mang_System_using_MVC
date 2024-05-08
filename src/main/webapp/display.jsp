<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false" %>
    
    <!-- jstl tag -->
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Employee info</title>
</head>
<body>
	<table border="1px solid red">
	 	<tr>
	 		<th>Employee Id:</th>
	 		<th>Employee Name:</th>
	 		<th>Employee Email:</th>
	 		<th>Employee PhoneNumber:</th>
	 		<th>Employee Salary:</th>
	 		<th>Edit</th>
	 		<th>Delete</th>
	 	</tr>
	 	
	 	<c:forEach var="employee" items="${employees}">
	 	 <tr>
	 	 	<td>${employee.getId() }</td>
	 	 	<td>${employee.getName() }</td>
	 	 	<td>${employee.getEmail() }</td>
	 	 	<td>${employee.getPhonenumber() }</td>
	 	 	<td>${employee.getSalary() }</td>
	 	 	<td><a href="edit?id=${employee.getId() }">EDIT</a></td>
	 	 	<td><a href="delete?id=${employee.getId() }">DELETE</a></td>
	 	 </tr>
	 	</c:forEach>
	
	</table>
</body>
</html>