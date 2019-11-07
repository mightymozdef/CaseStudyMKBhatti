<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Welcome to CAReddit!</title>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/landing.css">
</head>
<body>

<div class="background">
    <img src="<c:url value='/resources/images/cars.jpg'/>" alt="https://unsplash.com/photos/A53o1drQS2k"/>
    <form action="${pageContext.request.contextPath}/login" method="get">
        <input type="button" class="login" placeholder="Login" value="Login"/>
    </form>
    <form action="${pageContext.request.contextPath}/signup" method="get">
        <input type="button" class="signup" placeholder="SignUp" value="Sign Up"/>
    </form>
</div>

</body>
</html>

