<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %> 
    
    <!-- to enable the jstl tag ,1st add jstl dependency and write the above code  -->
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Save Employee Page</title>
</head>
<body>

	<form:form action="saveemployee" modelAttribute="employee">
		Name:<form:input path="name"/><br><br> <!-- name email phonenumbe.. are Employee class varible name -->
		Email:<form:input path="email"/><br><br>
		Phone Number:<form:input path="phonenumber"/><br><br>
		Password:<form:input path="password"/><br><br>
		Salary:<form:input path="salary"/><br><br>
		
		<form:button>Register</form:button>
	
	</form:form>

</body>
</html>