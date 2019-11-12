<%@include file="header.jsp" %>


<h3 class="display-2">Welcome ${credential.username}!</h3>
<c:set value="${user.userPosts}" var="userPosts"/>
<c:set value="${user.userComments}" var="userComments"/>
<c:if test="${userPosts.size() == 0}">
    <p>You don't have any posts.</p>
    <a href="/"
</c:if>

<%@include file="footer.jsp" %>