<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Cinema View |CinemaApp</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
</head>
<body>
<div class = "pt-5 container">
			<h2>Cinema ${cinema.id}</h2>
			<hr>
		<div class = " row justify-content-center">

			<div class = "col-md-8 mb-5">
					<p>Name: ${cinema.name}</p>
					<p>Schedule: ${cinema.schedule}</p>
					<p>Room: ${cinema.rooms}</p>
					<p>PostalCode: ${cinema.postalCode}</p>
					
					
			        
						<a class="btn btn-info" href = "${pageContext.request.contextPath}/cinemas">Volver</a> 
						<a class="btn btn-success" href = "${pageContext.request.contextPath}/cinemas/${cinema.id}/edit">Editar</a> 
						<a class="btn btn-danger" href = "${pageContext.request.contextPath}/cinemas/${cinema.id}/delete">Borrar</a>
						 
					
			</div>

		</div>
	</div>
	

<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
</body>
</body>
</html>