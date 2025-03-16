<%@page import="com.centrosanluis.model.Rol"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <% ArrayList<Rol> listadoRoles = (ArrayList<Rol>)request.getAttribute("listadoRoles"); %><!recoge el atribute del doget >
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>I</title>
</head>
<body>
<h1>hiiii</h1>

<table>
<tr>
	<th>Rol </th>
	<th>Acciones</th>
</tr>

<%for(Rol r: listadoRoles){%>
<tr>
	<td><%=r.getNombre() %> </td>
	<td> <form action="listadoRol" method="post">
	<button type="submit" name="borrar" value="">Borrar</button>
	<input type="hidden" name="id" value="<%=r.getId() %>">
	</form>
	
	
	</td>
</tr>

<%} %>

</table>

</body>
</html>