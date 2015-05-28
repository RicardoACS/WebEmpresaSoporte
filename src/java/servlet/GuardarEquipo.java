/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package servlet;

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
@WebServlet(name = "GuardarEquipo", urlPatterns = {"/guardar_equipo.do"})
public class GuardarEquipo extends HttpServlet {

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
       PrintWriter out = response.getWriter();
        try 
        {
            negocio.Departamento d = new negocio.Departamento();
            d.setNombre(request.getParameter("dll_departamento"));
            d.getEquipo().setProcesar(request.getParameter("txt_procesador"));
            d.getEquipo().setMemoriaRam(Integer.parseInt(request.getParameter("txt_ram")));
            d.getEquipo().setEspacioDiscoDuro(Integer.parseInt(request.getParameter("txt_disco")));
            d.getEquipo().setTarjetaDeVideo(request.getParameter("rbtn_video"));
            d.getEquipo().setNumeroIp(request.getParameter("txt_ip"));
            HttpSession sesion = request.getSession();
            ArrayList<negocio.Departamento> listado = (ArrayList<negocio.Departamento>) sesion.getAttribute("lista_equipo");
            listado.add(d);
            response.sendRedirect("ingreso.jsp");
        }
        catch(Exception e)
        {
            out.println("Error: "+e.getMessage());
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
