<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<title>Cinemas List | Awesome App</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">

</head>
<body>
	
	<div class = "pt-5 container">
		
		<h1>Cinemas</h1>
		<hr/>
		
		<p>${NOTIFICATION}</p>
		
<!-- 		ADMIN PUEDE CREAR CINEMAS -->

		<p>
			<a class = "btn btn-primary" href="${pageContext.request.contextPath}/cinemas/new">ADD CINEMA</a>
			<a class = "btn btn-danger" href="${pageContext.request.contextPath}/cinemas/delete/all">DELETE CINEMAS</a>
			
		</p>
	
<!-- 	FILTRO CÓDIGO POSTAL -->



		<table class = "table table-striped table-bordered">
			
			<tr class = "thead-dark">
				<th>Name</th>
				<th>Direction</th>
				<th>Open/Close Hours</th>
				<th>Rooms</th>
				<th>Actions</th>
			</tr>
			
			<c:forEach items="${movies}" var="movie">
			
				<tr>
					<td>${movie.name}</td>
					<td>${movie.direction.postalCode}</td>
					<td>${movie.schedule}</td>
					<td>${movie.rooms}</td>
					
					<td> 
						<a class="btn btn-info" href = "${pageContext.request.contextPath}/cinemas/${movie.id}/view">Ver</a> 
						<a class="btn btn-success" href = "${pageContext.request.contextPath}/cinemas/${movie.id}/edit">Editar</a> 
						<a class="btn btn-danger" href = "${pageContext.request.contextPath}/cinemas/${movie.id}/delete">Borrar</a>
						 
					</td>
				</tr>
				
			</c:forEach>
			
		</table>
		
	</div>

<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
</body>
</html>