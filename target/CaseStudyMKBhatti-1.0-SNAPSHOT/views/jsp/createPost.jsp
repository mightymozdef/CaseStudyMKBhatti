<%@include file="header.jsp" %>

<form:form id="postForm" modelAttribute="postFormObject" action="createPost" method="POST">
    <table>
        <tr>
            <td>Post Title:</td>
            <td><input type="text" name="post.title" placeholder="Enter post's title here"/></td>
        </tr>
        <tr>
            <p>Post Content: </p>
            <textarea name="post.content" id="postContent" cols="30" rows="10"></textarea>
        </tr>

    </table>

</form:form>


<%@include file="footer.jsp" %>