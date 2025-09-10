<%-- 
    Document   : add_patient
    Created on : 09 Sep 2025, 11:53:02 AM
    Author     : DYICT
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Add Page</title>
    </head>
    <body>
        <h1>Add Patient</h1>

        <form action="AddPatientServlet.do" method="POST">

            <label for="name">Full name:</label>
            <input type="text" id="name" name="name"required="">

            <label for="contact">Contact:</label>
            <input type="text" id="contact" name="contact" required="">

            <label for="address">Address:</label>
            <input type="text" id="address" name="address" required="">

            <button type="submit">Add Patient</button>
        </form>

        <p><a href="manage_patients.jsp">back to Patients List</a></p>
    </body>
</html>
