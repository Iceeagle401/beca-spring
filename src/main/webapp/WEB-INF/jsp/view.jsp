<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>    
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Seleccione su producto</h1>
	<form:form commandName="carrito">
	<tr>
	<td><form:checkboxes items="${lista}" path="productoElegido"></form:checkboxes></td>
	</tr>
	<tr>
				<td colspan="3"><input type="submit" /></td>
	</tr>
</form:form>

</body>
</html>