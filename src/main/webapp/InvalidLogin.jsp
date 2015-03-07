<%-- 
    Document   : InvalidLogin
    Created on : Mar 3, 2015, 7:19:32 PM
    Author     : Bryce
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Invalid Login</title>
        <link rel="stylesheet" type="text/css" href="style.css">
    </head>
    <body>
        <header>
            <div class="container">
            <h1>The login/Register credentials provided were invalid</h1>
            </div>
        </header>
        <main>
            <span class="floatRight"><button onclick="window.location.href='SignIn.jsp'" id="logoutButton">Go Back To Login Page</button></span>
            <h2>Please check your username and password</h2>
        </main>
    </body>
</html>
