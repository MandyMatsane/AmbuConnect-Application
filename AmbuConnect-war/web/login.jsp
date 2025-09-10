<%-- 
    Document   : login
    Created on : 10 Sep 2025, 8:36:55 AM
    Author     : DYICT
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login Page</title>
    </head>
    <body>
        <h1>Login</h1>

        <form action="LoginServlet.do" method="POST">
            <label>Username</label>
            <input type="email" id="email" name="email" required="">

            <label>Password</label>
            <input type="password" id="password" name="password" required="">
            
            <input type="submit" value="Login">
        </form>
    </body>
</html>
