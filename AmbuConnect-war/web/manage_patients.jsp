<%-- 
    Document   : manage_patients
    Created on : 08 Sep 2025, 1:36:34 PM
    Author     : DYICT
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Manage Patients</title>
    </head>
    <body>
        <h1>Manage Patients</h1>

        <table border="1">
            <tr>
                <th>ID</th>
                <th>Name</th>
                <th>Action</th>
            </tr>

            <tr>
                <td>123</td>
                <td>Mandy Matsane</td>
                <td>
                    <a href="edit_patients.jsp">Edit</a> | 
                    <a href="">Delete</a>
                </td>
            </tr>

             <tr>
                <td>675</td>
                <td>Yvonne Zembe</td>
                <td>
                    <a href="">Edit</a> | 
                    <a href="">Delete</a>
                </td>
            </tr>
        </table>
    </body>
</html>
