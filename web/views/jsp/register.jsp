<%@include file="header.jsp" %>
<h1 class="display-4">${message}</h1>
<form:form id="registrationForm" modelAttribute="registrationFormObject"
           action="register" method="POST">
    <table>
        <tr>
            <td>Name:</td>
            <td><input type="text" name="user.name" placeholder="Enter your name"/></td>
        </tr>
        <tr>
            <td>Username:</td>
            <td><input type="text" name="username" placeholder="Enter your username"/></td>
        </tr>
        <tr>
            <td>Email:</td>
            <td><input type="email" name="user.email" placeholder="Enter your email"/></td>
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
</form:form>


</body>
</html>
