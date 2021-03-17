package org.apache.jsp.vista.Dashboard;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;
import java.sql.ResultSet;
import java.sql.Statement;
import controlador.Conexion;
import controlador.estadosDAO;
import modelo.estados;

public final class listadoEstado4_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");

/* Evitamos que la página se guarde en el caché del navegador y en los proxys */
response.setHeader("Cache-Control","no-store"); //HTTP 1.1
response.setHeader("Pragma","no-cache"); //HTTP 1.0
response.setDateHeader("Expires", 0); // prevents caching at the proxy server

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    <body onload=\"myFunction();\">\n");
      out.write("       \n");
      out.write("    <center> <div class=\"col-md-6\">\n");
      out.write("            <form action=\"/booktripO/controllerEstado\" method=\"POST\"  onsubmit=\"return validarEstado()\">\n");
      out.write("                \n");
      out.write("                <a href=\"#\" name=\"accion\" value=\"Listar\" class=\"d-none d-sm-inline-block btn btn-sm btn-primary shadow-sm\"onclick=\"myFunctionB1()\"> Listar</a>\n");
      out.write("                <a href=\"#\" name=\"accion\" value=\"Nuevo\" class=\"d-none d-sm-inline-block btn btn-sm btn-success shadow-sm\" onclick=\"myFunctionB2()\"> Nuevo</a>\n");
      out.write("                <input type=\"submit\" name=\"accion\" value=\"Listar\" class=\"btn-primary \" onclick=\"myFunction(1)\">\n");
      out.write("                <input type=\"submit\" name=\"accion\" value=\"Nuevo\" class=\"btn-success \" onclick=\"myFunction(2)\">\n");
      out.write("            </form>\n");
      out.write("            <form class=\"form-inline\">\n");
      out.write("               <input type=\"search\" name=\"txtBuscar\" class=\"form-control\">\n");
      out.write("                <input type=\"submit\" name=\"accion\"  value=\"Buscar\" class=\"btn-outline-success\">\n");
      out.write("              </form>\n");
      out.write("           \n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        <div class=\"principal\" id=\"Listado\">\n");
      out.write("            \n");
      out.write("        <div class=\"fondo container my-10 buscar\">\n");
      out.write("            \n");
      out.write("       \n");
      out.write("        <hr>\n");
      out.write("        <center>\n");
      out.write("        <div>\n");
      out.write("        <h1>lista de estados</h1>\n");
      out.write("        \n");
      out.write("                    ");

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
                                   out.println("  <input type='submit' name='accion'value='Editar' class='btn-primary btn-block'onClick='mFunctionB3()'>" );
                               
                                  out.println("   <input type='submit' name='accion' value='Delete' class='btn-danger btn-block'>");
                            out.println("     </form>");
                         out.println("    </td>");
                                    out.println("</tr>");
                                }
                                out.println("</table>");
                                            
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("                                            </center>\n");
      out.write("    </div>\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("            \n");
      out.write("            <div class=\"principal\" id=\"Registrar\">\n");
      out.write("        <div class=\"container principal\">\n");
      out.write("            \n");
      out.write("        <div class=\"container  col-md-6 mt-5 bg-light form-group\">\n");
      out.write("            <h3>Agregar nuevo estado</h3>\n");
      out.write("            <hr>\n");
      out.write("            <br>\n");
      out.write("           \n");
      out.write("        \n");
      out.write("            <form id=\"formularioEstado\" action=\"/booktripO/controllerEstado\"\n");
      out.write("                  method=\"POST\" onsubmit=\"return validarEstado()\">\n");
      out.write("                <div col-md-6>\n");
      out.write("                    <div col-md-3><label>Nombre:</label></div>\n");
      out.write("                    <div col-md-3><input type=\"text\" name=\"txtNom\" id=\"txtNom\">\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div col-md-6>\n");
      out.write("                    <div col-md-3><input id=\"btnRegistrar\" type=\"submit\" name=\"accion\" value=\"Guardar\"\n");
      out.write("                                         class=\"btnGuardar btn btn-success btn-block mt-1\"></div>\n");
      out.write("                    <div col-md-3> <input type=\"submit\" name=\"accion\" value=\"Regresar\" class=\"btn btn-danger btn-block mt-1 my-4\"></div>\n");
      out.write("                </div>\n");
      out.write("            </form>\n");
      out.write("           \n");
      out.write("         </div>\n");
      out.write("          </div>\n");
      out.write("             </div>\n");
      out.write("            \n");
      out.write("            \n");
      out.write("            <div class=\"container\" id=\"Actualizar\" >\n");
      out.write("            \n");
      out.write("        <div class=\"container  col-md-6 mt-5 bg-light\">\n");
      out.write("    <center>\n");
      out.write("        <h3>Actualizar estado</h3>\n");
      out.write("        <hr>\n");
      out.write("        <br>\n");
      out.write("        <form action=\"/booktripO/controllerEstado\" method=\"POST\"  onsubmit=\"return validar()\" >\n");
      out.write("            <div col-md-6>\n");
      out.write("                <div col-md-3><label>Nombre:</label></div>\n");
      out.write("                <div col-md-3>\n");
      out.write("                    <input type=\"text\" name=\"txtNom\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dato.getNombre()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("                    <input type=\"hidden\" name=\"id\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dato.getIdEstado()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("   \n");
      out.write("            <div col-md-6>\n");
      out.write("                    <div col-md-3><input type=\"submit\" name=\"accion\" value=\"Actualizar\"  class=\"btn btn-success btn-block mt-1\"></div>\n");
      out.write("                    <div col-md-3> <input type=\"submit\" name=\"accion\" value=\"Regresar\" class=\"btn btn-danger btn-block mt-1 my-4\"></div>\n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("                    </div>\n");
      out.write("                    </div>\n");
      out.write("        </center>\n");
      out.write("    \n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
