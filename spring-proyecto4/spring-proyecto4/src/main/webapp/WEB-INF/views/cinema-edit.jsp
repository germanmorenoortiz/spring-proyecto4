<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Cinema  Edition | Aswesome App</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-BmbxuPwQa2lc/FVzBcNJ7UAyJxM6wuqIj61tLrc4wSX0szH/Ev+nYRRuWlolflfl" crossorigin="anonymous">
</head>
<body>
	
	<div class = "pt-5 container">
			<h2>Cinema ${cinema.id}</h2>
			<hr>
		<div class = " row justify-content-center">

			<div class = "col-md-8">
			
			
			
				<form:form action = "${pageContext.request.contextPath}/cinemas" method="POST" modelAttribute="cinema">
				
					<div class="form-group">
						<label for="name">Name</label>
						<form:input path="name" class="form-control" />
					</div>
					
					<div class="form-group">
						<label for="direction">Direction</label>
						<form:textarea path="direction" class="form-control"/>
					</div>
					
					<div class="form-group">
						<label for="schudule">schudule</label>
						<form:input path="schudule" class="form-control" />
					</div>
					
					<div class="form-group">
						<label for="rooms">rooms</label>
						<form:input path="rooms" class="form-control" />
					</div>
					<div class="form-group">
						<label for="postalCode">postalCode</label>
						<form:input path="postalCode" class="form-control" />
					</div>
					
					<form:hidden path="id"/>
					<div class="d-grid gap-2 mt-5">
					<button class = "btn btn-success btn-lg" type = "submit" >Guardar</button>

					</div>
				</form:form>
			
			
			
			
		
			</div>
		</div>
	</div>
	
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/js/bootstrap.bundle.min.js" integrity="sha384-b5kHyXgcpbZJO/tY9Ul7kGkf1S0CWuKcCD38l8YkeH8z8QjE0GmW1gYU5S9FOnJ0" crossorigin="anonymous"></script>

</body>
</html>