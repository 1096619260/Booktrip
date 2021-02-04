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
            <form action="/booktripO/controllerInmueble" method="POST">
                <input type="submit" name="accion" value="Listar">
                <input type="submit" name="accion" value="Nuevo">
            </form>
        </div>
        <hr>
        <div>
            <table border="1" style="width: 500px;">
                <thead>
                    <tr>
                        <th># inmueble</th>
                        <th>Tipo de inmueble</th>
                        <th>Departamento</th>
                        <th>Usuario</th>
                        <th>Estado</th>
                        <th>Nombre</th>
                        <th>Dirección</th> 
                        <th>Capacidad</th> 
                        <th>Descripcion</th>
                        <th>Precio</th>
                        <th>Adjunto</th>


                        <th>ACCIONES</th>
                    </tr>
                </thead>
                <tbody style="height: 40px;">  
                    <c:forEach var="dato" items="${lista}">
                        <tr>
                            <td style="padding-left:25px;">${dato.getIdInmueble()}</td>
                            <td style="padding-left:25px;">${dato.getIdTipo()}</td>
                            <td style="padding-left:25px;">${dato.getIdDepartamento()}</td>
                            <td style="padding-left:25px;">${dato.getIdUsuario()}</td>
                            <td style="padding-left:25px;">${dato.getIdEstado()}</td>
                            <td style="padding-left:25px;">${dato.getNombre()}</td>
                             <td style="padding-left:25px;">${dato.getDireccion()}</td>
                              <td style="padding-left:25px;">${dato.getCapacidad()}</td>
                               <td style="padding-left:25px;">${dato.getDescripcion()}</td>
                                <td style="padding-left:25px;">${dato.getPrecio()}</td>
                                 <td style="padding-left:25px;">${dato.getAdjunto()}</td>
                            <td style="padding-left:25px;">
                                <form action="/booktripO/controllerInmueble" method="POST">
                                    <input type="hidden" name="id" value="${dato.getIdInmueble()}">
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
