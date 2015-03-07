<%-- 
    Document   : loginPage
    Created on : Mar 3, 2015, 10:32:35 AM
    Author     : Bryce
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login Page</title>
    </head>
    <body>
        <p>${message}</p>
        <form action="login" method="POST">
            Username:<input type="text" name="username" /><br />
            Password:<input type="password" name="password" /><br /> 
            <input type="submit" value="Login"/>
        </form>
        <p style="font-size: 8pt;">Username: BryceFranzen</p>
        <p style="font-size: 8pt;">Password: qwerty</p>
    </body>
</html>
