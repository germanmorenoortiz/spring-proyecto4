<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<title>Cinemas List | Awesome App</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
<link rel="stylesheet" href="css/cinema.css">
	<link href="https://fonts.googleapis.com/css?family=Noto+Sans+JP&display=swap" rel="stylesheet">
</head>
<body>
<jsp:include page="navbar.jsp"></jsp:include>
	
	<div class = "pt-5 container">
		
		<h1>Cinemas</h1>
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
            <c:if test="${user.rol == 'admin' }">

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
			
			<c:forEach items="${cinemas}" var="cinema">
			
				<tr>
					<td>${cinema.name}</td>
					<td>${cinema.postalCode}</td>
					<td>${cinema.schedule}</td>
					<td>${cinema.rooms}</td>
							
					<td> 
						<a class="btn btn-info" href = "${pageContext.request.contextPath}/cinemas/${cinema.id}/view">Ver</a> 
						<a class="btn btn-success" href = "${pageContext.request.contextPath}/cinemas/${cinema.id}/edit">Editar</a> 
						<a class="btn btn-danger" href = "${pageContext.request.contextPath}/cinemas/${cinema.id}/delete">Borrar</a>
						 
					</td>
				</tr>
				
			</c:forEach>
			
		</table>
		</c:if>
		 <c:if test="${user.rol == 'normal' }">

		<p>
			
			
		</p>
	
<!-- 	FILTRO CÓDIGO POSTAL -->
         
   <div>
    <form:form action="${pageContext.request.contextPath}/cinemas/search" method="POST" modelAttribute="postalCode"> 
              <form:input path="postalCode" name="postalCode" id="postalCode" placeholder="Search" aria-label="Search"/>
              <button class="btn btn-outline-success" type="submit">Buscar</button>
             
     </form:form>
   </div>


		<table class = "table table-striped table-bordered">
			
			<tr class = "thead-dark">
				<th>Name</th>
				<th>Direction</th>
				<th>Open/Close Hours</th>
				<th>Rooms</th>
				<th>Actions</th>
			</tr>
			
			<c:forEach items="${cinemas}" var="cinema">
			
				<tr>
					<td>${cinema.name}</td>
					<td>${cinema.postalCode}</td>
					<td>${cinema.schedule}</td>
					<td>${cinema.rooms}</td>
							
					<td> 
						<a class="btn btn-info" href = "${pageContext.request.contextPath}/cinemas/${cinema.id}/view">Ver Peliculas</a> 
				
						 
					</td>
				</tr>
				
			</c:forEach>
			
		</table>
		</c:if>
	</div>
<jsp:include page="footer.jsp"></jsp:include>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
</body>
</html>