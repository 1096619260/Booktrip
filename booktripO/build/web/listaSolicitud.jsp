<%@page import="modelo.inmuebles"%>
<%@page import="java.util.ArrayList"%>
<%@page import="controlador.inmueblesDAO"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
    <center>
        <div>
            <form action="controllerSolicitud" method="POST">
                <input type="submit" name="accion" value="Listar">
                <input type="submit" name="accion" value="Nuevo">
            </form>
        </div>
        <hr>
        <div>
            <table border="1" style="width: 500px;">
                <thead>
                    <tr>
                        <th>ID</th>
                        <th>id inmueble</th>
                        <th>idUsuario</th>
                         <th>idEstado</th>
                          <th>fecha</th>
                        <th>ACCIONES</th>
                    </tr>
                </thead>
                <tbody style="height: 40px;">  
                    <c:forEach var="dato" items="${lista}">
                        <tr>
                            <td style="padding-left:25px;">${dato.getIdSolicitud()}</td>
                            <td style="padding-left:25px;">${dato.getIdInmueble()}</td>
                            <td style="padding-left:25px;">${dato.getIdUsuario()}</td>
                            <td style="padding-left:25px;">${dato.getIdEstado()}</td>
                            <td style="padding-left:25px;">${dato.getFecha()}</td>
                            <td style="padding-left:25px;">
                                <form action="controllerSolicitud" method="POST">
                                    <input type="hidden" name="id" value="${dato.getIdSolicitud()}">
                                    <input type="submit" name="accion" value="Editar">
                                    <input type="submit" name="accion" value="Delete">
                                </form>
                            </td>
                        </tr>
                    </c:forEach>
                </tbody>
            </table>

        </div>
    </center>
</body>
</html>
