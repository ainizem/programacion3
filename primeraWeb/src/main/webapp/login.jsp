<%@ page language="java" contentType="text/html; charset=ISO-8859-1" 
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
</head>
<body>
<div>
	<h2>Iniciar Sesi�n</h2>
	<form action="Login" method="post"><!-- Esto es un formulario (se envia), si un boton est� dentro de un formulario, el comportamiento por defecto es un submit -->
		<!-- si no ponga nadad, por defecto el formulacio hace un get -->
		<input type ="text" name="username" placeholder="Nombre de usuario"> <!--username importante, placeholder es lo que se ver� en la caja de texto-->
		<input type="password" name="password" placeholder="Contrase�a"> 
		<button type="submit">Entrar</button>
		<button type="reset">Borrar</button>
	</form>

</div>

</body>
</html>