<%-- 
    Document   : listado
    Created on : 16-05-2015, 21:32:53
    Author     : Ricardo
--%>

<%@page import="negocio.Departamento"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Listado</title>
    </head>
    <body>
        <h2>Listado</h2>
        <table border="1">
            <tbody>
                <tr>
                    <td>
                        Departamento
                    </td>
                    <td>
                        Procesador
                    </td>
                    <td>
                        Memoria Ram
                    </td>
                    <td>
                       Espacio Disco Duro
                    </td>
                    <td>
                       Tarjeta de video 
                    </td>
                    <td>
                        Numero Ip 
                    </td>
                </tr>
                <%              
                HttpSession sesion = request.getSession();              
                ArrayList<negocio.Departamento> listado = (ArrayList<negocio.Departamento>)sesion.getAttribute("lista_equipo");
                for(Departamento d : listado)
                {
                    out.println("<tr>");
                    out.println("<td>"+d.getNombre()+"</td>");
                    out.println("<td>"+d.getEquipo().getProcesar()+"</td>");
                    out.println("<td>"+d.getEquipo().getMemoriaRam()+"</td>");
                    out.println("<td>"+d.getEquipo().getEspacioDiscoDuro()+"</td>");
                    out.println("<td>"+d.getEquipo().getTarjetaDeVideo()+"</td>");
                    out.println("<td>"+d.getEquipo().getNumeroIp()+"</td>");
                    out.println("</tr>");
                } 
                %>
            </tbody>
        </table>
            <br>
            <a href="menu.jsp">Menu</a>
    </body>
</html>
