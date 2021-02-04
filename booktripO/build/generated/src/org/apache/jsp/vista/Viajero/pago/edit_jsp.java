package org.apache.jsp.vista.Viajero.pago;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import modelo.usuario;
import controlador.usuarioDao;
import modelo.estados;
import controlador.estadosDAO;
import modelo.inmuebles;
import java.util.ArrayList;
import controlador.inmueblesDAO;

public final class edit_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>JSP Page</title>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("    <center>\r\n");
      out.write("        <h3>Actualizar Usuario</h3>\r\n");
      out.write("        <hr>\r\n");
      out.write("        <br>\r\n");
      out.write("        <form action=\"controllerPago\" method=\"POST\">\r\n");
      out.write("\r\n");
      out.write("            <label>id usuario</label>\r\n");
      out.write("            <div class=\"col-sm-6\">\r\n");
      out.write("\r\n");
      out.write("                ");

                    usuarioDao miusuarioDAO = new usuarioDao();
                    ArrayList<usuario> listausuario = miusuarioDAO.ListadoUsuarios("");
                
      out.write(" \r\n");
      out.write("                <select name=\"txtUsuario\">\r\n");
      out.write("                    ");

                                for (usuario i : listausuario) {
      out.write("\r\n");
      out.write("                    <option value=\"");
      out.print(i.getIdUsuario());
      out.write('"');
      out.write('>');
      out.print(i.getNombre());
      out.write(" </option>\r\n");
      out.write("                    ");

                        }
                    
      out.write("\r\n");
      out.write("                </select>\r\n");
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("            <label>id inmueble</label>\r\n");
      out.write("            <div class=\"col-sm-6\">\r\n");
      out.write("\r\n");
      out.write("                ");

                    inmueblesDAO miinmuebleDAO = new inmueblesDAO();
                    ArrayList<inmuebles> listainmueble = miinmuebleDAO.ConsultarListadoInmuebles("");
                
      out.write(" \r\n");
      out.write("                <select name=\"txtInmueble\">\r\n");
      out.write("                    ");

                                for (inmuebles i : listainmueble) {
      out.write("\r\n");
      out.write("                    <option value=\"");
      out.print(i.getIdInmueble());
      out.write('"');
      out.write('>');
      out.print(i.getNombre());
      out.write(" </option>\r\n");
      out.write("                    ");

                        }
                    
      out.write("\r\n");
      out.write("                </select>\r\n");
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("            <div col-md-6>\r\n");
      out.write("                <div col-md-3><label>Adjunto</label></div>\r\n");
      out.write("                <div col-md-3><input type=\"text\" name=\"txtAdjunto\"value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dato.getAdjunto()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" id=\"txtAdjunto\">\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>  \r\n");
      out.write("            <div col-md-6>\r\n");
      out.write("                <div col-md-3><label>Monto</label></div>\r\n");
      out.write("                <div col-md-3><input type=\"text\" name=\"txtMonto\"value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dato.getMonto()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" id=\"txtMonto\">\r\n");
      out.write("                </div>\r\n");
      out.write("            </div> \r\n");
      out.write("\r\n");
      out.write("            <div col-md-6>\r\n");
      out.write("                <div col-md-3><label>fecha</label></div>\r\n");
      out.write("                <div col-md-3><input type=\"text\" name=\"txtPago\"value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dato.getFechaPago()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" id=\"txtPago\">\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>  \r\n");
      out.write("                 <div col-md-6>\r\n");
      out.write("                <div col-md-3><label>fecha2</label></div>\r\n");
      out.write("                <div col-md-3><input type=\"text\" name=\"txtPago2\"value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dato.getFechaPago2()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" id=\"txtPago2\">\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>  \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("            <input type=\"hidden\" name=\"id\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dato.getIdSolicitud()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\r\n");
      out.write("            <div col-md-6>\r\n");
      out.write("                <div col-md-3><input type=\"submit\" name=\"accion\" value=\"Actualizar\" class=\"btn btn-success btn-block mt-1\"></div>\r\n");
      out.write("                <div col-md-3> <input type=\"submit\" name=\"accion\" value=\"Regresar\" class=\"btn btn-danger btn-block mt-1 my-4\"></div>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("        </form>\r\n");
      out.write("    </center>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
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
