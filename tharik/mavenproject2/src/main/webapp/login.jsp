<%-- 
    Document   : login
    Created on : Jan 19, 2025, 8:33:25 AM
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
        <form action="home.jsp" method="POST">
            <label for="fname">Username:</label><br>
            <input type="text" id="username" name="username"><br>
            <label for="lname">Password:</label><br>
            <input type="password" id="password" name="password"><br>
            <input type="submit" value="Login">
        </form>
    </body>
</html>
