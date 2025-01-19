<%-- 
    Document   : index
    Created on : Jan 19, 2025, 8:19:08 AM
    Author     : hd
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            String greeting = "Hello";
            String name = "John";
            
            if (request.getParameter("name") != null) {
                name = request.getParameter("name");
            }

            out.print("<h1>" + greeting + " " + name + "</h1>");

        %>
       
    </body>
</html>
