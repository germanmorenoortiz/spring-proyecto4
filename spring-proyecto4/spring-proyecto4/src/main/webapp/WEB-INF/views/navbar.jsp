<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<nav class="navbar navbar-expand-lg navbar-blue bg-blue">
  <a class="navbar-brand" href="${pageContext.request.contextPath}/login">CinemaApp</a>
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNavAltMarkup" aria-controls="navbarNavAltMarkup" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>
  <div class="collapse navbar-collapse" id="navbarNavAltMarkup">
    <div class="navbar-nav">
      <a class="nav-item nav-link active" href="${pageContext.request.contextPath}/login">Login<span class="sr-only">(current)</span></a>
      <c:if test="${user.rol == 'admin' }">
      <a class="nav-item nav-link" href="${pageContext.request.contextPath}/cinemas">Cinemas</a>
      </c:if>
      <c:if test="${user.rol == 'admin' }">
      <a class="nav-item nav-link" href="${pageContext.request.contextPath}/users">Users</a>
      </c:if>
       <c:if test="${user.rol == 'admin' }">
      <a class="nav-item nav-link" href="${pageContext.request.contextPath}/movies">Movies</a>
      </c:if>
      <c:if test="${user.rol != null}">
            <a class="nav-item nav-link" href="${pageContext.request.contextPath}/logout">Logout</a>
      </c:if>
    </div>
  </div>
</nav>