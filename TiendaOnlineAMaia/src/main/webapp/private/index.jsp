<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="com.centrosanluis.model.Administrador"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
	Administrador administrador = (Administrador) request.getSession().getAttribute("usuario");
	%>

	<p>
		<a href="../listadoEditarController">Editar/eliminar Productos</a>
	</p>
	<p>
		<a href="../listadoEditarController">Añadir Productos</a>
	</p>

</body>
</html>