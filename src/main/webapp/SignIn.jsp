<%-- 
    Document   : SignIn
    Created on : Mar 3, 2015, 7:19:06 PM
    Author     : Bryce
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Sign In Page</title>
        <link rel="stylesheet" type="text/css" href="style.css">
    </head>
    <body>
         <header>
            <div class="container">
                <h1>Welcome to Bryce Franzen's Java Review Page</h1>
            </div>
        </header>
        <main>
            <div class="mainDiv1">
                <h1>Sign In</h1>
                <form action="LoginControl" method="POST">
                    <label for="username">Username:</label>
                    <input type="text" name="username" class="loginPage"/>
                    
                    <label for="password">Password:</label>
                    <input type="password" name="password" class="loginPage"/>
                    
                    <label for="submit"></label>
                    <input type="submit" value="Login" id="loginButton"/>
                </form><br /><br /><br /><br />
            </div>
            <div class="mainDiv2">
                <h1>Register</h1>
                <form action="NewUser" method="POST">
                    <label for="username">Username:</label>
                    <input type="text" name="username" class="loginPage"/>
                    
                    <label for="password">Password:</label>
                    <input type="password" name="password" class="loginPage"/>
                    
                    <label for="password2">Verify Password:</label>
                    <input type="password" name="password2" class="loginPage"/>
                    
                    <label for="submit"></label>
                    <input type="submit" value="Create New User" id="loginButton"/>
                </form>
            </div>
        </main>
    </body>
</html>
