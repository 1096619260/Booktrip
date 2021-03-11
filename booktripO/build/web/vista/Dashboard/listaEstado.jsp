
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

<!DOCTYPE html> 
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/xhtml; charset=UTF-8">
        <title>JSP Page</title>
        <!-- CSS only -->
     <link rel="stylesheet" type="text/css" href="css/estilosBooktrip.css">
  
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-giJF6kkoqNQ00vy+HMDP7azOuL0xtbfIcaT9wjKHr8RbDVddVHyTfAAsrekwKmP1" crossorigin="anonymous">
    </head>
    <body>
       
    <center>
        <div class="principal">
            
        <div class="fondo container my-10 buscar" style="background: #4d80e4">
            
        <div class="col-md-6">
            <form action="/booktripO/controllerEstado" method="POST"  onsubmit="return validarEstado()">
                <input type="submit" name="accion" value="Listar" class="btn-primary">
                <input type="submit" name="accion" value="Nuevo" class="btn-success">
            </form>
            <form class="form-inline">
               <input type="search" name="txtBuscar" class="form-control">
                <input type="submit" name="accion"  value="Buscar" class="btn-outline-success">
              </form>
           
        </div>
        <hr>
        
        <div>
        <h1>lista de estados</h1>
         <%
Conexion c = new Conexion();
estadosDAO e =new estadosDAO();
e.listar();

%>
            <table border="1" class=" bg-light table table-bordered "  style="width: 500px;" >
                <thead>
                    <tr>
                        <th>ID</th>
                        <th>NOMBRE</th>
                        <th>ACCIONES</th>
                    </tr>
                </thead>
                <tbody style="height:30px;">
                    <c:forEach var="dato" items="${lista}">
                        <tr>
               
       
       
                            <td style="padding-left:25px;">${dato.getIdEstado()}</td>
                            <td style="padding-left:25px;">${dato.getNombre()}</td>
                            
                            <td style="padding-left:25px;">
                                <form action="/booktripO/controllerEstado" method="POST">
                                    <input type="hidden" name="id" value="${dato.getIdEstado()}">
                                    <input type="submit" name="accion" value="Editar" class="btn-primary btn-block">
                                    <input type="submit" name="accion" value="Delete" class="btn-danger btn-block">
                                </form>
                            </td>
                        </tr>
                    </c:forEach>
                </tbody>
            </table>

        </div>
    </div>
            </div>
        </center>
    <script src="../js/jquery-1.11.0.min.js"></script>
    <script src="../js/validaciones.js"</script>
    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js" integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js" integrity="sha384-B4gt1jrGC7Jh4AgTPSdUtOBvfO8shuf57BaghqFfPlYxofvL8/KUEfYiJOMMV+rV" crossorigin="anonymous"></script>
   
</body>
</html>
