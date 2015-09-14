<%@ include file="/WEB-INF/jsp/include.jsp"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Price Increase</title>
<style>
	.error {color : red}
</style>
</head>
<body>
	<h1>Price Increase</h1>
	<form:form method ="post" commandName="priceIncrease">
		<table>
			<tr>
				<td>
					<form:input path = "percentage"/>
				</td>
				<td>
					<form:errors path = "percentage" cssClass = "error"/>
				</td>
			</tr>
		</table>
		<input type ="submit" align = "center" value = "Execute"/>
	</form:form>
</body>
</html>