<!DOCTYPE html>
<html>
<head>
    <title>Hello JSP</title>
</head>
<body>
    <h1>Hello, World!</h1>
    
    <%-- JSP code --%>
    
    <%
        // Java code goes here
        String name = "John";
        out.println("Hello, " + name + "!");
    %>
<br>

<%@ page language="java" %>       <%--// Directive Tag --%>
<%! int count = 8; %>             <%-- Declaration Tag --%>
<% count++; %>                    <%-- Scriptlet Tag --%>
Welcome! You are visitor number
<%= count %>                      <%-- Expression Tag --%>

 
</body>
</html>
