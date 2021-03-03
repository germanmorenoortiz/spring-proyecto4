<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>User  Edition | User App</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-BmbxuPwQa2lc/FVzBcNJ7UAyJxM6wuqIj61tLrc4wSX0szH/Ev+nYRRuWlolflfl" crossorigin="anonymous">
	<link rel="stylesheet" href="css/user.css">
	<link href="https://fonts.googleapis.com/css?family=Noto+Sans+JP&display=swap" rel="stylesheet">
</head>
<body>
<jsp:include page="navbar.jsp"></jsp:include>
	
	<div class = "pt-5 container">
			<h2>User ${user.id}</h2>
			<hr>
		<div class = " row justify-content-center">

			<div class = "col-md-8">
			
			
			
				<form:form action = "${pageContext.request.contextPath}/users" method="POST" modelAttribute="user">
				
					<div class="form-group">
						<label for="email">Email</label>
						<form:input path="email" class="form-control" />
					</div>
					
					
					<div class="form-group">
						<label for="passwprd">password</label>
						<form:input path="password" class="form-control" />
					</div>
					
					<div class="form-group">
						<label for="rol">rol</label>
						<form:input path="rol" class="form-control" />
					</div>
					
					
					<td> 
						<a class="btn btn-info" href = "${pageContext.request.contextPath}/users/${user.id}/view">Ver</a> 
						<a class="btn btn-success" href = "${pageContext.request.contextPath}/users/${user.id}/edit">Editar</a> 
						<a class="btn btn-danger" href = "${pageContext.request.contextPath}/users/${user.id}/delete">Borrar</a>
						 
					</td>
					<form:hidden path="id"/>
					<div class="d-grid gap-2 mt-5">
					<button class = "btn btn-success btn-lg" type = "submit" >Guardar</button>

					</div>
				</form:form>
			
			
			
			
		
			</div>
		</div>
	</div>
	<jsp:include page="footer.jsp"></jsp:include>
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/js/bootstrap.bundle.min.js" integrity="sha384-b5kHyXgcpbZJO/tY9Ul7kGkf1S0CWuKcCD38l8YkeH8z8QjE0GmW1gYU5S9FOnJ0" crossorigin="anonymous"></script>

</body>
</html>