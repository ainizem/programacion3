<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Elimina y edita productos</title>
</head>
<body>


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
				<td><img alt="camiAzul" src="../images/${p.imagen}" width="100px"></td>
				<td><form method="post" action="borrarProducto">
						<button type="submit">Borrar</button>
						<input type="hidden" name="id" value="${p.id}">
					</form></td>

			</tr>
		</c:forEach>
</body>
</html>