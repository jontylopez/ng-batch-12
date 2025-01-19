<%-- 
    Document   : home
    Created on : Jan 19, 2025, 8:33:13 AM
    Author     : hd
--%>

<%@page import="java.util.UUID"%>
<%@page import="com.mycompany.mavenproject2.Util"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
        
        String username = null;
        String password = null;
            
        if (request.getParameter("username") != null) {
            username = request.getParameter("username");
        }
        
        if (request.getParameter("password") != null) {
            password = request.getParameter("password");
        }
        
        if (Util.authenticate(username, password)) {
            String sessionID = UUID.randomUUID().toString()
                                    .toUpperCase().replace("-", "");
            
            session.setAttribute(sessionID, username);
            Cookie cookie = new Cookie("sesid", sessionID);
            response.addCookie(cookie);
        
        } else {
            
            for(Cookie cookie :request.getCookies()) {
                if (cookie.getName().equals("sesid")) {
                    username = (String) session.getAttribute(cookie.getValue());
                }
            }
            if (username == null) {
                response.sendRedirect("login.jsp");
            }
        }

        %>
        
        
        
        <h1>Hello <% out.print(username); %>!</h1>
    </body>
</html>
