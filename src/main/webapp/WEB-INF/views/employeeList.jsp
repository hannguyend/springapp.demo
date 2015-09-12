<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Spring 4 MVC - Employee List</title>
</head>
<body>
	<center>
	
		<c:forEach items = "${employeeList}" var = "employee">
			${employee.id}, ${employee.lastName}, ${employee.firstName}, ${employee.address}<br> 
		</c:forEach>
		
	</center>
</body>
</html>