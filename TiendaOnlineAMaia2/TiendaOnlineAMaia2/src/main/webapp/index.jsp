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
			<th>imagen</th>
		</tr>
		<c:forEach var="p" items="${productos}">
			<tr>
				<td>${p.nombre}</td>
				<td>${p.descripcion}</td>
				<td>${p.precio}</td>
				<td><img alt="camiAzul" src="images/${p.imagen}" width="100px"></td>
				
				
				
				
				
			</tr>
		</c:forEach>

	</table>
	<p>
		<a href="private/index.jsp">Editar/eliminar o añadir productos</a>
	</p>

</body>
</html>