<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
<title>Problema 2 </title>
</head>
<body>


<div class="jumbotron text-center">
<div class="text-center">
	<form action="LoginServlet" method="post" class="text-center">
		<table>
			<tr>
				<td><label>Nombre de  Usuario</label></td>
				<td><input type="text" name="usuario"></td>
			</tr>
			<tr>
				<td><label>Clave</label></td>
				<td><input type="password" name="clave"></td>
			</tr>
			<tr>
				<td colspan="2">
					<input type="submit" value="ingresar">
				</td>
			</tr>
		</table>
	</form>
	</div>
</div>


</body>
</html>