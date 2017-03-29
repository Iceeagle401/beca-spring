
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>    
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Subir Producto</title>
</head>
<body>
<h1><a href="home.html">Añada su producto</a></h1>
Language : <a href="?language=en">English</a> | <a href="?language=es">Spanish</a>
<form:form commandName="producto" >
	<table>
		<tr>
			<td><h3>Ingrese el nombre del producto</h3> </td>
			<td><form:input path="nombre"/></td>
		</tr>
		<tr>
			<td><h3>Ingrese el precio del producto</h3> </td>
			<td><form:input path="precio"/></td>
		</tr>
		<tr>
			<td><h3>Ingrese la cantidad de articulos disponibles</h3> </td>
			<td><form:input path="stock"/></td>
		</tr>
		<tr>
			<td colspan="2">
				<input type="submit" value="Enter Exercise"/>
			</td>
		</tr>
	</table>
</form:form>

</body>
</html>