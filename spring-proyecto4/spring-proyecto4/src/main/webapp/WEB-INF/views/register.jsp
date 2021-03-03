<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Cartelera-CineApp</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-BmbxuPwQa2lc/FVzBcNJ7UAyJxM6wuqIj61tLrc4wSX0szH/Ev+nYRRuWlolflfl" crossorigin="anonymous">
	<link rel="stylesheet" href="css/register.css">
	<link href="https://fonts.googleapis.com/css?family=Noto+Sans+JP&display=swap" rel="stylesheet">
</head>
<body>
<jsp:include page="navbar.jsp"></jsp:include>
	
	<div class = "pt-5 container">
			<h2>Register User</h2>
			<hr>
		<div class = " row justify-content-center">

			<div class = "col-md-8">
			
			
			
				<form:form action = "${pageContext.request.contextPath}/register" method="POST" modelAttribute="user">
				
					<div class="form-group">
						<label for="email">email</label>
						<form:input path="email" class="form-control" />
					</div>
					
					<div class="form-group">
						<label for="password">Password</label>
						<form:password path="password" class="form-control"/>
					</div>
					
<!-- 					<div class="form-group"> -->
<!-- 						<label for="rol">rol</label> -->
<!-- 						<form:input path="rol" class="form-control"/> --%>
<!-- 					</div> -->
					
					
					<button class = "btn btn-success btn-lg" type = "submit" >save</button>

				
				</form:form>
			
			
			
			
		
			</div>
		</div>
	</div>
	
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/js/bootstrap.bundle.min.js" integrity="sha384-b5kHyXgcpbZJO/tY9Ul7kGkf1S0CWuKcCD38l8YkeH8z8QjE0GmW1gYU5S9FOnJ0" crossorigin="anonymous"></script>

</body>
</html>