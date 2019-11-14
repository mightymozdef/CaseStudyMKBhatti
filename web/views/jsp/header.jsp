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
</head>

<body>

<nav class="navbar navbar-expand-lg navbar-dark bg-dark sticky-top">
    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent"
            aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
    </button>

    <div class="collapse navbar-collapse justify-content-start" id="navbarSupportedContent">
        <ul class="navbar-nav ml-auto">
            <li class="nav-item">
                <a href="${pageContext.request.contextPath}/welcome" class="nav-link">Home</a>
            </li>
            <li class="nav-item">
                <a href="${pageContext.request.contextPath}/createPost" class="nav-link">Create Post</a>
            </li>
            <li class="nav-item">

                <a href="#<%--${pageContext.request.contextPath}/profile--%>" class="nav-link">Profile</a>
            </li>
            <li class="nav-item">
                <a href="#<%--${pageContext.request.contextPath}/inbox--%>" class="nav-link">Inbox</a>
            </li>
            <li class="nav-item">
                <a href="${pageContext.request.contextPath}/contact" class="nav-link">Contact Us</a>
            </li>
        </ul>
        <div class="collapse navbar-collapse justify-content-end">
            <ul class="navbar-nav ml-auto">
                <li class="nav-item">
                    <a href="${pageContext.request.contextPath}/logout" class="nav-link">Logout</a>
                </li>
            </ul>
        </div>
    </div>

</nav>