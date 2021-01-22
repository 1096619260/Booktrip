package org.apache.jsp.solicitud;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import modelo.estados;
import controlador.estadosDAO;
import java.sql.ResultSet;
import modelo.inmuebles;
import java.util.ArrayList;
import controlador.inmueblesDAO;
import java.util.ArrayList;

public final class add_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("    <center>\n");
      out.write("        <h3>Agregar Nueva Solicitud</h3>\n");
      out.write("        <hr>\n");
      out.write("        <br>\n");
      out.write("        <form action=\"controllerSolicitud\" method=\"POST\">\n");
      out.write("            <label>id inmueble</label>\n");
      out.write("\n");
      out.write("            \n");
      out.write("            <div class=\"col-sm-6\">\n");
      out.write("               \n");
      out.write("                        ");

                            inmueblesDAO miinmuebleDAO = new inmueblesDAO();
                            ArrayList<inmuebles>  listainmueble = miinmuebleDAO.ConsultarListadoInmueble("");
                        
      out.write(" \n");
      out.write("                        <select name=\"txtInmueble\">\n");
      out.write("                            ");

                        for (inmuebles i : listainmueble) {
      out.write("\n");
      out.write("                            <option value=\"");
      out.print(i.getIdInmueble());
      out.write('"');
      out.write('>');
      out.print(i.getNombre());
      out.write(" </option>\n");
      out.write("                            ");

                                }
                            
      out.write("\n");
      out.write("                        </select>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                    <label>id usuario</label>\n");
      out.write("                   \n");
      out.write("                      sdfghjku\n");
      out.write("                    \n");
      out.write("                      <label>id estado</label>\n");
      out.write("                     <div class=\"col-sm-6\">\n");
      out.write("               \n");
      out.write("                        ");

                            estadosDAO miestadoDAO = new estadosDAO();
                            ArrayList<estados>  listaestado = miestadoDAO.ConsultarListadoEstados("");
                        
      out.write(" \n");
      out.write("                        <select name=\"txtEstado\">\n");
      out.write("                            ");

                        for (estados i : listaestado) {
      out.write("\n");
      out.write("                            <option value=\"");
      out.print(i.getIdEstado());
      out.write('"');
      out.write('>');
      out.print(i.getNombre());
      out.write(" </option>\n");
      out.write("                            ");

                                }
                            
      out.write("\n");
      out.write("                        </select>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                    <label>fecha</label>\n");
      out.write("                    <input type=\"text\" name=\"txtFecha\">\n");
      out.write("                    <input type=\"submit\" name=\"accion\" value=\"Guardar\">\n");
      out.write("                    <input type=\"submit\" name=\"accion\" value=\"Regresar\">\n");
      out.write("                </form>\n");
      out.write("            </center>\n");
      out.write("        </body>\n");
      out.write("    </html>\n");
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
