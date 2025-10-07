<%-- 
    Document   : expresiones
    Created on : 6 oct 2025, 11:27:45
    Author     : Viviana
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="es">
  <head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>JSPs con Expresiones</title>

    <!-- ✅ Bootstrap CSS -->
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
          color: #000099;
      }

      .result {
        background-color: #f8f9fa;
        border-left: 4px solid #000099;
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

  <body>
    <main class="container py-5">
      <div class="card mx-auto" style="max-width: 600px;">
        <div class="card-body">
          <h1 class="card-title text-center mb-4">
            🌟 JSPs con Expresiones
          </h1>

          <p>
            <strong>Concatenación:</strong>
            <div class="result">
              <%= "Saludos" + " " + "desde un JSP" %>
            </div>
          </p>

          <p>
            <strong>Operación Matemática:</strong>
            <div class="result">
              <%= 2 * 3 / 2 %>
            </div>
          </p>

          <p>
            <strong>Id de la sesión:</strong>
            <div class="result">
              <%= session.getId() %>
            </div>
          </p>

          <div class="text-center">
            <a href="index.html" class="btn btn-info btn-home">
              ⬅ Regresar al inicio
            </a>
          </div>
        </div>
      </div>
    </main>

    <!-- ✅ Bootstrap JS -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>
  </body>
</html>
