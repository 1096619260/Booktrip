/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.usuario;
import controlador.usuarioDao;

/**
 *
 * @author vanessa
 */
@WebServlet(name = "login", urlPatterns = {"/login"})
public class login extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */

            String email = request.getParameter("email");
            String password = request.getParameter("password");

            try {
                usuarioDao userC = new usuarioDao();
                usuario user = new usuario();
                user = userC.consultarUsuario(email, password);

                if (user == null) {
                    System.out.println(email);
                    out.println("<script type=\"text/javascript\">");
                    out.println("alert('" + "Este email : " + email + "   no es correcto" + "');");
                    out.println("window.location.href='/booktripO/vista/login.jsp';");
                    out.println("</script>");
                } else {
                    System.out.println(user.getPassword());
                    System.out.println(password);

                    out.println("<script type=\"text/javascript\">");
                    out.println("alert('" + "Bienvenido: " + user.getNombre() + "  " + user.getApellido() + "');");
                    out.println("window.location.href='/booktripO/vista/Dashboard/usuario/add.jsp';");
                    out.println("</script>");

                }

            } catch (Exception ex) {
                System.err.println(ex.getMessage());
                System.out.println("este es el catch");
            }

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
