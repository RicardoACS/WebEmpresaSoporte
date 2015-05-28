<%-- 
    Document   : index
    Created on : 16-05-2015, 16:20:04
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
        <h2>Ingrese</h2>
        <hr>
        <form action="crear_array_and_users.do" method="POST">
            <table border="1">
                <tbody>
                    <tr>
                        <td>
                            Usuario
                        </td>
                        <td>
                            <input type="text" name="txt_usuario" value="" />   
                        </td>
                    </tr>
                    <tr>
                        <td>
                            Clave
                        </td>
                        <td>
                            <input type="text" name="txt_clave" value="" />
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <input type="submit" value="Ingresar" name="btn_ingresar" />
                        </td>
                    </tr>
                </tbody>
            </table>      
        </form>
    </body>
</html>
