<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Producto</title>
</head>
<body>

<form action='${"addProducto"}' method="post">
		<input type="text" name="nombre2" value="${usuario!=null?usuario.getNombre():''}" placeholder="Nombre" required>
		<input type="text" name="apellidos" value="${usuario!=null?usuario.getApellidos():''}" placeholder="Apellidos" required>
		<input type="text" name="email" value="${usuario!=null?usuario.getEmail():''}" placeholder="Correo electronico" required>
		<input type="text" name="telefono" value="${usuario!=null?usuario.getTelefono():''}" placeholder="Telefono" required>
		<input type="text" 
			name="usuario" 
			value="${usuario!=null?usuario.getUsuario():''}" 
			${ usuario!=null?"readonly":'' }
			placeholder="Usuario" 
			required>
		
		<c:if test="${usuario == null}">
			<input type="text" name="contrasena" placeholder="Contraseña" required>
		</c:if>



</body>
</html>