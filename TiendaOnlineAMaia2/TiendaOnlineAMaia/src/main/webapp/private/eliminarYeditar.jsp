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
		</tr>
		<c:forEach var="p" items="${productos}">
			<tr>
				<td>${p.nombre}</td>
				<td>${p.descripcion}</td>
				<td>${p.precio}</td>
				
				<td>
						<form action="borrarProducto" method="post">
							<input type="hidden" value="${ p.getId()}" name="id">
							<button type="submit">Borrar</button>
						</form>
					</td>
			</tr>
		</c:forEach>

</body>
</html>