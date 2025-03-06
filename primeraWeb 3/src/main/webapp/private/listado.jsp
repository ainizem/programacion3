<%@ page import="java.util.ArrayList"%>
<%@ page import="com.centrosanluis.model.Usuario"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Listado</title>
</head>
<body>
	<table>
		<tr>
			<th>Nombre</th>
			<th>Apellidos</th>
			<th>Email</th>
			<th>Telefono</th>
			<th>Usuario</th>
		</tr>

		<%
		// Recuperamos la lista de usuarios desde el request
		ArrayList<Usuario> listadoUsuarios = (ArrayList<Usuario>) request.getAttribute("listadoUsuarios");

		if (listadoUsuarios == null || listadoUsuarios.isEmpty()) {
			out.println("<tr><td colspan='5'>No hay usuarios disponibles.</td></tr>");
		} else {
			for (Usuario u : listadoUsuarios) {
		%>
		<tr>
			<th><%=u.getNombre()%></th>
			<th><%=u.getApellidos()%></th>
			<th><%=u.getEmail()%></th>
			<th><%=u.getTelefono()%></th>
			<th><%=u.getUsuario()%></th>
		</tr>
		<%
		}
		}
		%>

	</table>


</body>
</html>