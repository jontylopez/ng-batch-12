<%-- 
    Document   : index
    Created on : Jan 26, 2025, 10:14:46 AM
    Author     : hd
--%>

<%@page import="com.mycompany.web.ui.Student"%>
<%@page import="com.mycompany.web.ui.DBUtils"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
         <script src="https://code.jquery.com/jquery-3.7.1.min.js" integrity="sha256-/JqT3SQfawRcv/BIHPThkBvs0OEvtFFmqPF/lYI/Cxo=" crossorigin="anonymous"></script>
        <link rel="stylesheet" href="https://cdn.datatables.net/2.2.1/css/dataTables.dataTables.css" />
        <script src="https://cdn.datatables.net/2.2.1/js/dataTables.js"></script>
       
        <script>
            $(document).ready( function () {
                $('#tblstudents').DataTable();
            } );
        </script>
    </head>
    <body>
        <%
        
            DBUtils utils = new DBUtils();
            
            out.print("<table id='tblstudents'>");
            out.print("<thead><tr><th>ID</th><th>Name</th></tr></thead><tbody>");
            for(Student st : utils.getStudents()) {
                out.print("<tr>");
                out.print("<td>"+ st.getId()+ "</td>");
                out.print("<td>"+ st.getName()  + "</td>");
                out.print("</tr>");
            }
             out.print("</tbody></table>");

        %>
    </body>
</html>
