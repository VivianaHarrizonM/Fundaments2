<%-- 
    Document   : index
    Created on : 9 dic 2025, 13:15:39
    Author     : Viviana
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ejemplo de inclusion dinamica</title>
    </head>
    <body>
        <h1>Ejemplo de inclusión dinamica</h1>
        <br/>
        <!-- Inclusión de un recurso público-->
        <jsp:include page="paginas/recursoPublico.jsp"/>
        <br/>
        <!-- Inclusión de un recurso privado con parametros-->
        <jsp:include page="WEB_INF/recursoPrivado.jsp">
            <jsp:param name="colorFondo" value="yellow">
        </jsp:include>
    </body>
</html>
