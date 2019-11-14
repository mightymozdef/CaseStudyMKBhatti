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
<div class="jumbotron jumbotron-fluid"
     style="display: flex; min-height: 100%; min-width: 100%; justify-content: center; align-items: center; align-content: center; ">
    <form action=" <spring:url value='/loginAction'/>" method="post">
        <div class="form-group row">
            <div class="col-sm-10">
                <label for="username" class="col-form-label">Username</label>
                <input type="text" name="username" id="username" placeholder="Enter username" autofocus/>
                <form:errors path="username" cssClass="error"/>
            </div>
        </div>
        <div class="form-group row">
            <div class="col-sm-10">
                <label for="password" class="col-form-label">Password</label>
                <input type="password" name="password" id="password" placeholder="Enter password"/>
                <form:errors path="password" cssClass="error"/>
            </div>
        </div>
        <button type="submit" class="btn btn-primary">Login</button>
    </form>
</div>


<%@ include file="footer.jsp" %>