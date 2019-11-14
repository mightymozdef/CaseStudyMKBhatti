<%@include file="header.jsp" %>


<form:form id="postForm" modelAttribute="postFormObject" action="processPost" method="POST" class="form-horizontal">
    <c:set value="${user}" var="user"/>

    <div class="jumbotron justify-content-center">
        <p>${message}</p>
        <div class="form-group">
            <label for="title">Post Title:</label>
            <input type="text" name="title" placeholder="Enter post's title here" id="title"/>
        </div>
        <div class="form-group">
            <label for="postContent">Post Content:</label>
            <textarea name="content" id="postContent" cols="30" rows="10"
                      placeholder="Enter post's content here"></textarea>
        </div>
        <div class="form-group">
            <button type="submit">Create Post</button>
        </div>
    </div>
</form:form>

<%@include file="footer.jsp" %>