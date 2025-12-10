<%-- 
    Document   : index
    Created on : 9 oct 2025, 19:44:52
    Author     : Viviana
--%>

<%! 
    // Declaramos una variable y su método get asociado
    private String usuario = "Ana";
    public String getUsuario(){
        return this.usuario;
    }

    //Declaramos un contador de visitas
    private int contadorVisitas = 1;
%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="es">
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Declaraciones en un JSP</title>

    <!-- Bootstrap CSS -->
    <link 
      href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" 
      rel="stylesheet" 
      integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" 
      crossorigin="anonymous">
  </head>

  <body class="bg-light d-flex align-items-center justify-content-center vh-100">
    <div class="container">
      <div class="card shadow-lg mx-auto" style="max-width: 500px;">
        <div class="card-body text-center">
          <h1 class="card-title mb-4 text-primary">Declaraciones en un JSP!</h1>

          <p class="lead">
            <strong>Valor del usuario (atributo):</strong> 
            <span class="text-success"><%= this.usuario %></span>
          </p>

          <p class="lead">
            <strong>Valor del usuario (método):</strong> 
            <span class="text-success"><%= this.getUsuario() %></span>
          </p>
          <p class="lead">
            <strong>Contador de visitas:</strong> 
            <span class="text-success"><%= this.contadorVisitas++ %></span>
          </p>
        </div>
      </div>
    </div>

    <!-- Bootstrap JS (opcional) -->
    <script 
      src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js" 
      integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" 
      crossorigin="anonymous">
    </script>
  </body>
</html>
