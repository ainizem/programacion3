<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%@page import="java.util.ArrayList"%>
<%@page import="com.centrosanluis.model.Producto"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>home</title>
</head>
<body>
<h1>Mi tienda</h1>

<form method="post" action="ListadoController">
<button type="submit">Ver productos</button>
</form>

<table>
		<tr>
			<th>Nombre</th>
			<th>Desc</th>
			<th>precio</th>
		</tr>
		<c:forEach var="p" items="${productos}">
			<tr>
				<td>${p.nombre}</td>
				<td>${p.descripcion}</td>
				<td>${p.precio}</td>
			</tr>
		</c:forEach>

	</table>


</body>
</html>