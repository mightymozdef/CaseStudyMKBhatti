<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>

<head>
    <title>CAReddit</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/bootstrapCSS/bootstrap.min.css"
          type="text/css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/landing.css" type="text/css">
    <script src="${pageContext.request.contextPath}/resources/js/bootstrapJS/bootstrap.bundle.min.js"></script>
</head>

<body>

<div class="container-fluid">
    <img class="img-fluid" src="<c:url value='/resources/images/cars.jpg'/>"
         alt="https://unsplash.com/photos/A53o1drQS2k"/>
    <a href="${pageContext.request.contextPath}/login">
        <button class="login" value="login" name="Login">Login</button>
    </a>
    <a href="${pageContext.request.contextPath}/signup">
        <button class="register" value="register" name="register">Register</button>
    </a>
</div>

<%@include file="footer.jsp" %>