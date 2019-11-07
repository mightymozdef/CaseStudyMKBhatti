<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Create your user profile</title>
</head>
<body>

<form action="<spring:url value='/signupAction'/>" method="post">
    <table>
        <tr>
            <td>Name:</td>
            <td><input type="text" name="name" placeholder="Enter your name"/></td>
        </tr>
        <tr>
            <td>Email:</td>
            <td><input type="email" name="email" placeholder="Enter your email"/></td>
        </tr>
        <tr>
            <td>Password:</td>
            <td><input type="password" name="password" placeholder="Enter your password"/></td>
        </tr>
        <tr>
            <td>Confirm Password:</td>
            <td><input type="password" name="confirmPassword" id="confirmPassword" placeholder="Confirm password"/></td>
        </tr>
        <tr>
            <td>
                <button type="submit">Login</button>
            </td>
        </tr>
    </table>
</form>


</body>
</html>
