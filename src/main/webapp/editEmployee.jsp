<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
 <form:form action="updateUser" modelAttribute="employee">
 		Id: <form:input path="id" readonly="true"/><br><br>
		Name:<form:input path="name"/><br><br> <!-- name email phonenumbe.. are Employee class varible name -->
		Email:<form:input path="email" readonly="true"/><br><br>
		Phone Number:<form:input path="phonenumber" readonly="true"/><br><br>
		Password:<form:input path="password"/><br><br>
		Salary:<form:input path="salary"/><br><br>
		<form:button>Register</form:button>
	
	</form:form>

</body>
</html>