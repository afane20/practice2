<%-- 
    Document   : ViewPosts
    Created on : Mar 3, 2015, 7:19:55 PM
    Author     : Bryce
--%>
<%
if(null == session.getAttribute("username")){  
  response.sendRedirect("SignIn.jsp");
}
%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>All Posts</title>
        <link rel="stylesheet" type="text/css" href="style.css">
    </head>
    <body>
        <header>
            <div class="container">
                <span class="floatRight"><button onclick="window.location.href='logout'" id="logoutButton">Logout</button></span>
                <h1>All Posts</h1>
            </div>
        </header>
        <main>
            <c:forEach items="${reviews}" var="review">
                <div class="paddingBottom"><strong>${review.username}</strong> <span class="floatRight">${review.currentDateTime}</span></div>
                ${review.reviewText}<br /><br />
                <hr>
            </c:forEach>
            <button onclick="window.location.href='EnterNewPost.jsp'" id="submitNewPostButton">Enter a New Post</button>
        </main>
    </body>
</html>
