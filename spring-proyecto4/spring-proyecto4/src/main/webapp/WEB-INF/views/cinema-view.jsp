<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<div class = "pt-5 container">
			<h2>Cinema ${cinema.id}</h2>
			<hr>
		<div class = " row justify-content-center">

			<div class = "col-md-8 mb-5">
					<p><b>Name</b>: ${cinema.name}</p>
					<p><b>Direction</b>: ${cinema.direction}</p>
					<p><b>Schudule</b>: ${cinema.schudule}</p>
					<p><b>Room</b>: ${cinema.room}</p>
					<p><b>PostalCode</b>: ${cinema.postalCode}</p>
					
					
			<td> 
						<a class="btn btn-info" href = "${pageContext.request.contextPath}/cinemas/${cinema.id}/view">Ver</a> 
						<a class="btn btn-success" href = "${pageContext.request.contextPath}/cinemas/${cinema.id}/edit">Editar</a> 
						<a class="btn btn-danger" href = "${pageContext.request.contextPath}/cinemas/${cinema.id}/delete">Borrar</a>
						 
					</td>
			</div>

		</div>
	</div>
	

<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
</body>
</body>
</html>