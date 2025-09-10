<%-- 
    Document   : register
    Created on : 10 Sep 2025, 10:53:19 AM
    Author     : DYICT
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Register Page</title>
    </head>
    <body>
        <h1>Register</h1>
        
        <form action="RegisterServlet.do" method="POST">
            <label>Name</label>
            <input type="name" id="name" name="name" required="">
            
            <label>Email</label>
            <input type="email" id="email" name="email" required="">

             <label>Phone number</label>
            <input type="text" id="phone_number" name="phone_number" required="">
            
            <select name="role">
                <option value="patient">Patient</option>
                <option value="driver">Driver</option>
                <option value="paramedic">Paramedic</option>
            </select>
            
            <label>Password</label>
            <input type="password" id="password" name="password" required="">
            
            <input type="submit" value="Register">
        </form>
    </body>
</html>
