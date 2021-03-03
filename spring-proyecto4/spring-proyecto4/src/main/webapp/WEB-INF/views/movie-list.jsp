<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<title>Movies List | CinemaApp</title>
	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
	<link rel="stylesheet" href="css/movie.css">
	<link href="https://fonts.googleapis.com/css?family=Noto+Sans+JP&display=swap" rel="stylesheet">

</head>
<body>
<jsp:include page="navbar.jsp"></jsp:include>
	
	<div class = "pt-5 container">
		
		<h1>Movies</h1>
		<hr/>
		
		<c:choose>
			<c:when test="${user.rol =='admin'}">
				Bienvenido <c:out value="${user.email}"></c:out> eres admin
			</c:when>
			<c:when test="${user.rol == 'normal' }">
				Bienvenido <c:out value="${user.email}"></c:out> eres usuario normal sin permisos
			</c:when>
			<c:otherwise>

			</c:otherwise>
		</c:choose>
		
		<p>${NOTIFICATION}</p>
		
<!-- 		ADMIN PUEDE CREAR CINEMAS -->

		<p>
		 <c:if test="${user.rol == 'admin' }">
			<a class = "btn btn-primary" href="${pageContext.request.contextPath}/movies/new">ADD MOVIES</a>
			 </c:if>
			
		
			
		</p>
	
<!-- 	FILTRO CÓDIGO POSTAL -->



		<table class = "table table-striped table-bordered">
			
			<tr class = "thead-dark">
				<th>Title</th>
				<th>Duraction</th>
				<th>Actions</th>
			</tr>
			
			<c:forEach items="${movies}" var="movie">
			
				<tr>
					<td>${movie.title}</td>
					<td>${movie.duration}</td>
					
							
					<td> 
						<a class="btn btn-info" href = "${pageContext.request.contextPath}/movies/${movie.id}/view">Ver</a> 
						<a class="btn btn-success" href = "${pageContext.request.contextPath}/movies/${movie.id}/edit">Editar</a> 
						<a class="btn btn-danger" href = "${pageContext.request.contextPath}/movies/${movie.id}/delete">Borrar</a>
						 
					</td>
				</tr>
				
			</c:forEach>
			
		</table>
		
	</div>
<jsp:include page="footer.jsp"></jsp:include>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
</body>
</html>