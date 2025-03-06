<%@ page import="java.util.ArrayList"%>
<%@ page import="com.centrosanluis.model.Rol"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registro de usuario</title>
</head>
<body>
<div class="register-container">
	<h2>Registro de usuario</h2>
	<form action="registro" method="post">
		<input type="text" name="nombre" placeholder="Nombre" required>
		<input type="text" name="apellidos" placeholder="Apellidos" required>
		<input type="text" name="email" placeholder="Correo electronico" required>
		<input type="text" name="telefono" placeholder="Telefono" required>
		<input type="text" name="usuario" placeholder="Usuario" required>
		<input type="text" name="contrasena" placeholder="Contraseña" required>
		
	<select name="rol">
	
			<%ArrayList<Rol> listadoRoles = (ArrayList<Rol>) request.getSession().getAttribute("roles");%>
			<% for(Rol rol :listadoRoles){%>
			
			<option value="<%=rol.getRol()%>"><%=rol.getRol()%></option>
		
			<%}%>
			
			
	
		
	</select>	
		
		
		<button type="submit">Registrarse</button>
	</form>
	<a href="login.jsp">Volver al login</a>
</div>
</body>
</html>