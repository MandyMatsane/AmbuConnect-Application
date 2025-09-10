<%-- 
    Document   : manage_patients
    Created on : 08 Sep 2025, 1:36:34 PM
    Author     : DYICT
--%>

<%@page import="java.util.List"%>
<%@page import="dyict.ac.za.entities.Patient"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Manage Patients</title>
    </head>
    <body>
        <h1>Manage Patients</h1>

        <p>Click <a href="add_patient.jsp">here</a> to add a patient</p>


        <%
            List<Patient> pList = (List<Patient>) request.getAttribute("patients");

            if (pList != null && !pList.isEmpty()) {
                for (Patient p : pList) {
        %>

        <table border="1">
            <tr>
                <th>ID</th>
                <th>Name</th>
                <th>Action</th>
            </tr>

            <tr>
                <td><%=p.getPatient_id()%></td>
                <td><%=p.getName()%></td>
                <td>
                    <form action="EditPatientServlet.do" method="GET">
                        <input type="hidden" name="id" value="<%=p.getPatient_id()%>">
                        <button type="submit">Edit</button>
                    </form>
                    </br>
                    <form action="DeletePatientServlet.do" method="GET">
                        <input type="hidden" name="id" value="<%=p.getPatient_id()%>">
                        <button type="submit">Delete</button>
                    </form>
                </td>
            </tr>
            <%
                }
            } else {


            %>

            <tr><td>No patients found</td></tr>

            <%                }
            %>
        </table>
    </body>
</html>
