<%-- 
    Document   : fondoColor
    Created on : 6 oct 2025, 19:56:26
    Author     : Viviana
--%>

<%
    String fondo = request.getParameter("colorFondo");
    if (fondo == null || fondo.trim().equals("")) {
        fondo = "white";
    }
%>

<!DOCTYPE html>
<html lang="es">
  <head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>JSP Cambio de color</title>

    <link
      href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
      rel="stylesheet"
    />

    <style>
      body {
        background: linear-gradient(135deg, #e3f2fd, #f1f8e9);
        font-family: "Segoe UI", Tahoma, Geneva, Verdana, sans-serif;
      }

      .card {
        border-radius: 1rem;
        box-shadow: 0 4px 10px rgba(0, 0, 0, 0.15);
        background-color: #ffffffd9;
      }

      .card-title {
        color: #0d6efd;
      }

      .result {
        background-color: #f8f9fa;
        border-left: 4px solid #0d6efd;
        padding: 10px 15px;
        border-radius: 0.5rem;
        font-family: monospace;
        color: #333;
      }

      a.btn-home {
        display: inline-block;
        margin-top: 20px;
        text-decoration: none;
      }
    </style>
  </head>

  <body bgcolor="<%=fondo%>">
    <main class="container py-5">
      <div class="card mx-auto" style="max-width: 600px;">
        <div class="card-body">
          <h1 class="card-title text-center mb-4">
             JSP Cambio de Color
          </h1>

          <div class="result mb-3">
            <% out.println("Saludos desde un Scriptlet"); %>
          </div>

          <strong>Color de fondo aplicado:</strong>
          <div class="result mb-4">
            <%=fondo%>
          </div>

          <div class="text-center">
            <a href="index.html" class="btn btn-info btn-home">
               Regresar al inicio
            </a>
          </div>
        </div>
      </div>
    </main>

    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>
  </body>
</html>
