<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form:form commandName="producto">
<h1>El producto es</h1>
<h2>${producto.nombre}</h2>
<h2>${producto.precio}</h2>
<h2>${producto.stock}</h2>


<table>
		<tr>
			<td>Cuantos deseas? </td>
			<td><form:input path="comprados"/></td>
		</tr>
		<tr>
			<td colspan="2">
				<input type="submit" value="Aceptar"/>
			</td>
		</tr>
	</table>

</form:form>
</body>
</html>