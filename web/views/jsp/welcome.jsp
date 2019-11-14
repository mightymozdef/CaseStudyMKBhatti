<%@include file="header.jsp" %>

<div class="jumbotron jumbotron-fluid"
     style="display: flex; min-height: 100%; min-width: 100%; justify-content: center; align-items: center; align-content: center; ">


    <c:set value="${user.userPosts}" var="userPosts"/>
    <c:set value="${user.userComments}" var="userComments"/>
    <c:if test="${userPosts.size() == 0}">

        <div class="d-block">
            <h3 class="display-2">Welcome ${credential.username}!</h3>
            <p>${message}</p>
            <p>You don't have any posts.</p>
            <a href="${pageContext.request.contextPath}/createPost">Click here to make a new post</a>
        </div>

    </c:if>
    <c:if test="${userPosts.size() > 0}">
        <c:forEach var="post" items="${userPosts}">
            <tr>
                <td>${post.postAuthor}</td>
                <td>${post.title}</td>
                <td>${post.content}</td>
            </tr>
            <tr>
                <c:if test="${post.commentList.size() > 0}">
                    <c:forEach var="comments" items="${post.commentList}">
                        <td>${comments.user.name}</td>
                        <td>${comments.content}</td>
                    </c:forEach>
                </c:if>
                <c:if test="${post.commentList.size() == 0}">
                    <td>There are no comments on this post.</td>
                    <td><a href="${pageContext.request.contextPath}/createComment">Click here to write a comment</a>
                    </td>
                </c:if>
            </tr>
            <br>
        </c:forEach>
    </c:if>
</div>
<%@include file="footer.jsp" %>