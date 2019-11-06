<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login Page</title>
</head>
<body>

<form action=" <spring:url value='/loginAction' />" method="post">

    <table>
        <tr>
            <td>Username:</td>
            <td>
                <label><input type="text" name="username"></label>
            </td>
        </tr>
        <tr>
            <td>Password:</td>
            <td>
                <label><input type="password" name="password"></label>
            </td>
        </tr>
        <tr>
            <button type="submit">Login</button>
        </tr>
    </table>

</form>

</body>
</html>
