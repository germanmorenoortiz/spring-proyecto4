<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Movie View |CinemaApp</title>
	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
	<link rel="stylesheet" href="css/movie.css">
	<link href="https://fonts.googleapis.com/css?family=Noto+Sans+JP&display=swap" rel="stylesheet">
</head>
<body>
<jsp:include page="navbar.jsp"></jsp:include>
<div class = "pt-5 container">
			<h2>Movie ${movie.id}</h2>
			<hr>
		<div class = " row justify-content-center">

			<div class = "col-md-8 mb-5">
					<p>Title: ${movie.title}</p>
					<p>Duration: ${movie.duration}</p>
					
					
					
					
			        
						<a class="btn btn-info" href = "${pageContext.request.contextPath}/movies">Volver</a> 
						<a class="btn btn-success" href = "${pageContext.request.contextPath}/movies/${movie.id}/edit">Editar</a> 
						<a class="btn btn-danger" href = "${pageContext.request.contextPath}/movies/${movie.id}/delete">Borrar</a>
						 
					
			</div>

		</div>
	</div>
	
<jsp:include page="footer.jsp"></jsp:include>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
</body>
</body>
</html>