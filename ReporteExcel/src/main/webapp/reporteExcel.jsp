
<%@page errorPage="/WEB-INF/manejoErrores.jsp" %>
<%@page import="utilerias.Conversiones, java.util.Date"%>
<%@page  contentType="application/vnd.ms-excel;charset=UTF-8"%>
<%
    String nombreArchivo = "reporte.xls";
    response.setHeader("Content-Disposition","inline;filename=" + nombreArchivo);
%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Reporte de Excel</title>
    </head>
    <body>
        <h1>Reporte de Excel</h1>
        <table border="1">
            <tr>
                <th>Curso</th>
                <th>Descripción</th>
                <th>Fecha</th> 
            </tr>
            <tr>
                <th>1. Fundamentos de java</th>
                <th>Aprendemos la sintaxis básica de Java</th>
                <th><%= Conversiones.format(new Date())%></th> 
            </tr>
            <tr>
                <th>1. Programación con Java</th>
                <th>Pondremos en práctica los conceptos de la POO</th>
                <th><%= Conversiones.format(new Date())%></th> 
            </tr>
        </table>
    </body>
</html>
