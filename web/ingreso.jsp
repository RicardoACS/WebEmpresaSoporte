<%-- 
    Document   : menu
    Created on : 16-05-2015, 21:13:25
    Author     : Ricardo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ingreso</title>
    </head>
    <body>
        <h2>Ingrese Datos</h2>
        <hr>
        <form action="guardar_equipo.do" method="POST">
            <table border="1">
                <tbody>
                    <tr>
                        <td>
                            Nombre Departamento
                        </td>
                        <td>
                            <select name="dll_departamento">
                                <option>Seleccione</option>
                                <option>RRHH</option>
                            </select>
                        </td>
                    </tr>
                    <tr>
                        <td>
                            Procesador
                        </td>
                        <td>
                            <input type="text" name="txt_procesador" value="" />
                        </td>
                    </tr>
                    <tr>
                        <td>
                           Memoria Ram
                        </td>
                        <td>
                            <input type="text" name="txt_ram" value="" size="5" />
                        </td>
                    </tr>
                    <tr>
                        <td>
                             Espacio Disco Duro 
                        </td>
                        <td>
                            <input type="text" name="txt_disco" value="" />
                        </td>
                    </tr>
                    <tr>
                        <td>
                            Tarjeta de video
                        </td>
                        <td>
                            <input type="radio" name="rbtn_video" value="AMD" />AMD
                            <input type="radio" name="rbtn_video" value="Nvidia" />Nvidia
                        </td>
                    </tr>
                    <tr>
                        <td>
                            Numero Ip
                        </td>
                        <td>
                            <input type="text" name="txt_ip" value="" />
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <input type="submit" value="Guardar" name="btn_guardar" />
                        </td>
                    </tr>
                </tbody>
            </table>

        </form>
        <br>
        <a href="menu.jsp">Menu</a>
    </body>
</html>
