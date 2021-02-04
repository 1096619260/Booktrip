
<%@page import="modelo.departamento"%>
<%@page import="controlador.departamentosDAO"%>
<%@page import="modelo.tipoinmuebles"%>
<%@page import="controlador.tipoinmuebleDAO"%>
<%@page import="modelo.usuario"%>
<%@page import="controlador.usuarioDao"%>
<%@page import="modelo.estados"%>
<%@page import="controlador.estadosDAO"%>
<%@page import="modelo.inmuebles"%>
<%@page import="java.util.ArrayList"%>
<%@page import="controlador.inmueblesDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
       <center>
        <h3>Actualizar inmueble</h3>
        <hr>
        <br>
        <form action="/booktripO/controllerInmueble" method="POST">
            <div class="col-sm-6">

                <%
                    tipoinmuebleDAO mitipoDAO = new tipoinmuebleDAO();
                    ArrayList<tipoinmuebles> listatipo = mitipoDAO.ConsultarListadoTipos("");
                %> 
                <select name="txtTipo">
                    <%
                                for (tipoinmuebles i : listatipo) {%>
                    <option value="<%=i.getIdTipo()%>"><%=i.getNombre()%> </option>
                    <%
                        }
                    %>
                </select>

            </div>

            <div class="col-sm-6">

                <%
                    departamentosDAO midepartamentoDAO = new departamentosDAO();
                    ArrayList<departamento> listadepartamento = midepartamentoDAO.ConsularListaDepartamento("");
                %> 
                <select name="txtDepartamento">
                    <%
                                for (departamento i : listadepartamento) {%>
                    <option value="<%=i.getIdDepartamento()%>"><%=i.getNombre()%> </option>
                    <%
                        }
                    %>
                </select>

            </div>
            <label>id usuario</label>

            <div class="col-sm-6">

                <%
                    usuarioDao miusuarioDAO = new usuarioDao();
                    ArrayList<usuario> listausuario = miusuarioDAO.ListadoUsuarios("");
                %> 
                <select name="txtUsuario">
                    <%
                                for (usuario i : listausuario) {%>
                    <option value="<%=i.getIdUsuario()%>"><%=i.getNombre()%> </option>
                    <%
                        }
                    %>
                </select>

            </div>

              <div class="col-sm-6">

                <%
                    estadosDAO miestadoDAO = new estadosDAO();
                    ArrayList<estados> listaestado = miestadoDAO.ConsultarListadoEstados("");
                %> 
                <select name="txtEstado">
                    <%
                                for (estados i : listaestado) {%>
                    <option value="<%=i.getIdEstado()%>"><%=i.getNombre()%> </option>
                    <%
                        }
                    %>
                </select>

            </div>
           

            </div>
            <div class="col-sm-6">
                <label>Nombre</label>
                <input type="text" name="txtNombre" value="${dato.getNombre()}">
            </div>
                <div class="col-sm-6">
                <label>Direccion</label>
                <input type="text" name="txtDireccion" value="${dato.getDireccion()}">
            </div>  
                <div class="col-sm-6">
                <label>Capacidad</label>
                <input type="text" name="txtCapacidad" value="${dato.getCapacidad()}">
            </div>  
                <div class="col-sm-6">
                <label>Descripcion</label>
                <input type="text" name="txtDescripcion" value="${dato.getDescripcion()}">
            </div>  
                <div class="col-sm-6">
                <label>Precio</label>
                <input type="text" name="txtPrecio" value="${dato.getPrecio()}">
            </div>  
                <div class="col-sm-6">
                <label>Adjunto</label>
                <input type="text" name="txtAdjunto" value="${dato.getAdjunto()}">
            </div>  

            <input type="submit" name="accion" value="Actualizar">
            <input type="submit" name="accion" value="Regresar">
        </form>
    </center>
    </body>
</html>
