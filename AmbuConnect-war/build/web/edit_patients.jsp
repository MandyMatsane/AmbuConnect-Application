<%-- 
    Document   : edit_patients
    Created on : 08 Sep 2025, 2:30:18 PM
    Author     : DYICT
--%>

<%@page import="dyict.ac.za.entities.Patient"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    
    <%
        Patient patient =  (Patient) request.getAttribute("patient");
    %>
    
    <body>
        <h1>EdiT Patient!</h1>
        
        <form action="UpdatePatientServlet.do" method="POST">
            
            <input type="hidden" name="action" value="update">
            <input type="hidden" name="patient_id" value="<%= patient.getPatient_id()%>">
            
            <label for="name">Full name:</label>
            <input type="text" id="name" name="name" value="<%= patient.getName()%>" required="">
            
            <label for="contact">Contact:</label>
            <input type="text" id="contact" name="contact" value="<%= patient.getContact()%>" required="">
            
            <label for="address">Address:</label>
            <input type="text" id="address" name="address" value="<%= patient.getAddress()%>" required="">
            
            <button type="submit">Update Patient</button>
        </form>
            
            <p><a href="manage_patients.jsp">back to Patients List</a></p>
    </body>
</html>
