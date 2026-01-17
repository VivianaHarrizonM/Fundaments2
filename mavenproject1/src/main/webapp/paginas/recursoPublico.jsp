<%-- 
    Document   : recursoPublico
    Created on : 16 ene 2026, 19:55:33
    Author     : Viviana
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <br/>
        Inclusión de Contenido dinamico desde un JSP Público
        <br/>
        
        Nombre de la aplicación: <%=request.getContextPath()%>
    </body>
</html>
