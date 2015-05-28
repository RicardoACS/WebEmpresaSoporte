package servlet;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Ricardo
 */
@WebServlet(urlPatterns = {"/crear_array_and_users.do"})
public class CrearArrayAndUsers extends HttpServlet {

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
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            negocio.Login login = new negocio.Login();
            login.setUsuario("rick");
            login.setClave("rick");
            HttpSession sesion = request.getSession();
            if (sesion.getAttribute("mi_usuario") == null) 
            {
                if (request.getParameter("txt_usuario").equals(login.getUsuario())
                 && request.getParameter("txt_clave").equals(login.getClave())) 
                {
                    sesion.setAttribute("mi_usuario", login);
                    sesion.setAttribute("lista_equipo", new ArrayList());
                    response.sendRedirect("menu.jsp");
                }
                else
                {
                    response.sendRedirect("index.jsp");
                }
            }
            else
            {
                if (request.getParameter("txt_usuario").equals(login.getUsuario())
                 && request.getParameter("txt_clave").equals(login.getClave())) 
                {
                    response.sendRedirect("menu.jsp");
                }
                else
                {
                    response.sendRedirect("index.jsp");
                }
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
