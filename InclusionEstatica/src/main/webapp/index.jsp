
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ejemplo de inclusión Estática</title>
    </head>
    <body>
        <h1>¡Ejemplo de inclusión Estática!</h1>
        <br/>
        <ul>
            <li><%@include file="paginas/noticias1.html" %></li>
            <li><%@include file="paginas/noticias2.jsp" %></li>
        </ul>
    </body>
</html>
