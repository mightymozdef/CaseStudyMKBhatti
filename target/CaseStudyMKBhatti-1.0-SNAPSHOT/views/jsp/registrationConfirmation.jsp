<%@include file="header.jsp" %>


<div class="jumbotron jumbotron-fluid"
     style="display: flex; min-height: 100%; min-width: 100%; justify-content: center; align-items: center; align-content: center; ">
    <h5 class="display-4">${message}</h5>
    <div>
        <a href="${pageContext.request.contextPath}/login">
            <button class="btn-danger" value="login" name="Login">Login</button>
        </a>
    </div>
</div>


<%@include file="footer.jsp" %>