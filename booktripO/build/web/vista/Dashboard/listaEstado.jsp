
<%@page import="java.util.List"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="controlador.Conexion"%>
<%
/* Evitamos que la página se guarde en el caché del navegador y en los proxys */
response.setHeader("Cache-Control","no-store"); //HTTP 1.1
response.setHeader("Pragma","no-cache"); //HTTP 1.0
response.setDateHeader("Expires", 0); // prevents caching at the proxy server
%>

<%@page import="controlador.estadosDAO"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="modelo.estados"%>


    <body onload="myFunction();">
       
    <center> <div class="col-md-6">
            <form action="/booktripO/controllerEstado" method="POST"  onsubmit="return validarEstado()">
                
                <a href="#" name="accion" value="Listar" class="d-none d-sm-inline-block btn btn-sm btn-primary shadow-sm"onclick="myFunctionB1()"> Listar</a>
                <a href="#" name="accion" value="Nuevo" class="d-none d-sm-inline-block btn btn-sm btn-success shadow-sm" onclick="myFunctionB2()"> Nuevo</a>
            </form>
            <form action="controllerEstado?accion=Buscar" class="form-inline" >
               <input type="search" name="txtBuscar" class="form-control">
                <input type="submit" name="accion"  value="Buscar" class="btn-outline-success">
              </form>
           
        </div>
        
        <div class="principal" id="Listado">
            
        <div class="fondo container my-10 buscar">
            
       
        <hr>
        <center>
        <div>
        <h1>lista de estados</h1>
        
                    <%
  out.println("<table class='table table-bordered table-responsive'><tr><td>Id</td><td>Nombre</td>"
                                        + "<td>Acciones</td ></tr>");
  
                                    estadosDAO dao = new estadosDAO();
                                    List<estados> lista = null;
                                         lista = dao.listar();
                                         
                                        for (estados r : lista) {
                                           out.println("<tr>");
                                    out.println("<td style='padding-left:150px;'>" + r.getIdEstado()+ "</td>");
                                    out.println("<td style='padding-left:150px;'>" + r.getNombre() + "</td>");
                                    out.println(" <td style='padding-left:150px;'>");
                                   out.println("  <form action='/booktripO/vista/Dashboard/editEstado.jsp' method='POST'>");
                                   out.println("  <input type='hidden' name='id' value='"+r.getIdEstado()+"'>");
                                   out.println("  <input type='submit' name='accion'value='Editar' class='btn-primary btn-block'>" );
                               out.println("     </form>");
                                  out.println("   <input type='submit' name='accion' value='Delete' class='btn-danger btn-block'>");
                            
                         out.println("    </td>");
                                    out.println("</tr>");
                                }
                                out.println("</table>");
                                            %>


        </div>
                                            </center>
    </div>
            </div>
            
            
            <div class="principal" id="Registrar">
        <div class="container principal">
            
        <div class="container  col-md-6 mt-5 bg-light form-group">
            <h3>Agregar nuevo estado</h3>
            <hr>
            <br>
           
        
            <form id="formularioEstado" action="/booktripO/controllerEstado"
                  method="POST" onsubmit="return validarEstado()">
                <div col-md-6>
                    <div col-md-3><label>Nombre:</label></div>
                    <div col-md-3><input type="text" name="txtNom" id="txtNom">
                    </div>
                </div>
                <div col-md-6>
                    <div col-md-3><input id="btnRegistrar" type="submit" name="accion" value="Guardar"
                                         class="btnGuardar btn btn-success btn-block mt-1"></div>
                    <div col-md-3> <input type="submit" name="accion" value="Regresar" class="btn btn-danger btn-block mt-1 my-4"></div>
                </div>
            </form>
           
         </div>
          </div>
             </div>
            
            
          
