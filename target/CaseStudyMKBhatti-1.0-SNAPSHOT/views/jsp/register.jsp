<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<html>
<head>
    <title>CAReddit</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/bootstrapCSS/bootstrap.min.css"
          type="text/css">
    <script src="${pageContext.request.contextPath}/resources/js/bootstrapJS/bootstrap.bundle.min.js"></script>
    <style>
        .error {
            color: red;
        }
    </style>
</head>
<body>
<h1 class="display-4">${message}</h1>

<div class="jumbotron jumbotron-fluid"
     style="display: flex; min-height: 100%; min-width: 100%; justify-content: center; align-items: center; align-content: center; ">
    <form:form id="registrationForm" modelAttribute="registrationFormObject" action="register" method="POST">

        <div class="form-group row ">
            <div class="col-sm-10">
                <label for="name" class="col-form-label">Name</label>
                <form:input type="text" name="user.name" placeholder="Enter your name" id="name" path="user.name"/>
                <form:errors path="user.name" cssClass="error"/>
            </div>
            <div class="col-sm-10">
                <label for="username" class="col-form-label">Username</label>
                <form:input type="text" name="username" placeholder="Enter your username" id="username"
                            path="username"/>
                <form:errors path="username" cssClass="error"/>
            </div>
            <div class="col-sm-10">
                <label for="email" class="col-form-label">Email</label>
                <form:input type="email" name="user.email" placeholder="Enter your email" id="email" path="user.email"/>
                <form:errors path="user.name" cssClass="error"/>
            </div>
            <div class="col-sm-10">
                <label for="password" class="col-form-label">Password</label>
                <form:input type="password" name="password" placeholder="Enter your password" id="password"
                            path="password"/>
                <form:errors path="password" cssClass="error"/>
            </div>
            <div class="col-sm-10">
                <label for="confirmPassword" class="col-form-label">Confirm Password</label>
                <input type="password" name="confirmPassword" id="confirmPassword" placeholder="Confirm password"/>
            </div>
        </div>

        <button type="submit" class="btn btn-primary">Login</button>

    </form:form>
</div>


<%@include file="footer.jsp" %>