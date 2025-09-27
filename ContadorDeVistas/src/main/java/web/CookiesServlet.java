package web;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 *
 * @author Viviana
 */
@WebServlet(name = "CookiesServlet", urlPatterns = {"/CookiesServlet"})
public class CookiesServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        //valor inicial
        int contador = 0;
        
       
        //Obtenemos el arreglo de Cookies
        Cookie[] cookies = request.getCookies();
        
        //Buscamos si ya existe una cookie creada con anterioridad
        //LLamada visitante Recurrente
        if(cookies != null){
            for(Cookie c : cookies){
                if("visitas".equals(c.getName())){
                    try{
                        contador = Integer.parseInt(c.getValue());
                    }catch(NumberFormatException e){
                        contador = 0;
                    }
                }  
            }
        }
        
        //Incrementar y guardar de nuevo
        contador++;
        Cookie cookieVisitas = new Cookie("Visitas", String.valueOf(contador));
        
        //Vida util
        cookieVisitas.setMaxAge(24 * 60 * 60);
        response.addCookie(cookieVisitas);
        
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
             out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Contador de visitas</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Manejo de Cookies</h1>");
            out.println("<p>Has visitado esta página" + contador +"</p>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
