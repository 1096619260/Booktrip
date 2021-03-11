package org.apache.jsp.vista.Propietario.inmueble;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import modelo.departamento;
import controlador.departamentosDAO;
import modelo.tipoinmuebles;
import controlador.tipoinmuebleDAO;
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>JSP Page</title>\r\n");
      out.write("           <link rel=\"stylesheet\" type=\"text/css\" href=\"css/estilosBooktrip.css\">\r\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-giJF6kkoqNQ00vy+HMDP7azOuL0xtbfIcaT9wjKHr8RbDVddVHyTfAAsrekwKmP1\" crossorigin=\"anonymous\">\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <div class=\"container\" style=\"background: #4d80e4\">\r\n");
      out.write("            \r\n");
      out.write("        <div class=\"container  col-md-6 mt-5 bg-light\">\r\n");
      out.write("       <center>\r\n");
      out.write("        <h3>Actualizar inmueble</h3>\r\n");
      out.write("        <hr>\r\n");
      out.write("        <br>\r\n");
      out.write("        <form action=\"/booktripO/controllerInmueble\" method=\"POST\">\r\n");
      out.write("            <div class=\"col-sm-6\">\r\n");
      out.write("\r\n");
      out.write("                ");

                    tipoinmuebleDAO mitipoDAO = new tipoinmuebleDAO();
                    ArrayList<tipoinmuebles> listatipo = mitipoDAO.ConsultarListadoTipos("");
                
      out.write(" \r\n");
      out.write("                <select name=\"txtTipo\">\r\n");
      out.write("                     <option value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dato.getNombre()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">--seleccione el tipo de inmueble </option>\r\n");
      out.write("                    ");

                                for (tipoinmuebles i : listatipo) {
      out.write("\r\n");
      out.write("                    <option value=\"");
      out.print(i.getIdTipo());
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
      out.write("\r\n");
      out.write("            <div class=\"col-sm-6\">\r\n");
      out.write("\r\n");
      out.write("                ");

                    departamentosDAO midepartamentoDAO = new departamentosDAO();
                    ArrayList<departamento> listadepartamento = midepartamentoDAO.ConsularListaDepartamento("");
                
      out.write(" \r\n");
      out.write("                <select name=\"txtDepartamento\">\r\n");
      out.write("                     <option value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dato.getIdDepartamento()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">--seleccione el departamento </option>\r\n");
      out.write("                    ");

                                for (departamento i : listadepartamento) {
      out.write("\r\n");
      out.write("                    <option value=\"");
      out.print(i.getIdDepartamento());
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
      out.write("\r\n");
      out.write("            <div class=\"col-sm-6\">\r\n");
      out.write("               \r\n");
      out.write("                        ");

                            usuarioDao miusuarioDAO = new usuarioDao();
                            ArrayList<usuario>  listausuario = miusuarioDAO.ListadoUsuarios("");
                        
      out.write(" \r\n");
      out.write("                        <select name=\"txtUsuario\">\r\n");
      out.write("                              <option value=\"\">--selecione el usuario-- </option>\r\n");
      out.write("                            ");

                        for (usuario i : listausuario) {
      out.write("\r\n");
      out.write("                            <option value=\"");
      out.print(i.getIdUsuario());
      out.write('"');
      out.write('>');
      out.print(i.getNombre());
      out.write(" </option>\r\n");
      out.write("                            ");

                                }
                            
      out.write("\r\n");
      out.write("                        </select>\r\n");
      out.write("\r\n");
      out.write("                    </div>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("              <div class=\"col-sm-6\">\r\n");
      out.write("\r\n");
      out.write("                ");

                    estadosDAO miestadoDAO = new estadosDAO();
                    ArrayList<estados> listaestado = miestadoDAO.ConsultarListadoEstados("");
                
      out.write(" \r\n");
      out.write("                <select name=\"txtEstado\">\r\n");
      out.write("                     <option value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dato.getIdEstado()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">--seleccione el estado </option>\r\n");
      out.write("                    ");

                                for (estados i : listaestado) {
      out.write("\r\n");
      out.write("                    <option value=\"");
      out.print(i.getIdEstado());
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
      out.write("          \r\n");
      out.write("            <div class=\"col-sm-6\">\r\n");
      out.write("                <label>Nombre</label>\r\n");
      out.write("                <input type=\"text\" name=\"txtNombre\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dato.getNombre()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\r\n");
      out.write("            </div>\r\n");
      out.write("                <div class=\"col-sm-6\">\r\n");
      out.write("                <label>Direccion</label>\r\n");
      out.write("                <input type=\"text\" name=\"txtDireccion\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dato.getDireccion()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\r\n");
      out.write("            </div>  \r\n");
      out.write("                <div class=\"col-sm-6\">\r\n");
      out.write("                <label>Capacidad</label>\r\n");
      out.write("                <input type=\"text\" name=\"txtCapacidad\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dato.getCapacidad()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\r\n");
      out.write("            </div>  \r\n");
      out.write("                <div class=\"col-sm-6\">\r\n");
      out.write("                <label>Descripcion</label>\r\n");
      out.write("                <input type=\"text\" name=\"txtDescripcion\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dato.getDescripcion()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\r\n");
      out.write("            </div>  \r\n");
      out.write("                <div class=\"col-sm-6\">\r\n");
      out.write("                <label>Precio</label>\r\n");
      out.write("                <input type=\"text\" name=\"txtPrecio\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dato.getPrecio()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\r\n");
      out.write("            </div>  \r\n");
      out.write("                <div class=\"col-sm-6\">\r\n");
      out.write("                <label>Adjunto</label>\r\n");
      out.write("                <input type=\"text\" name=\"txtAdjunto\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dato.getAdjunto()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\r\n");
      out.write("            </div>  \r\n");
      out.write("\r\n");
      out.write("            <input type=\"submit\" name=\"accion\" value=\"Actualizar\"class=\"btn btn-success btn-block mt-1\" >\r\n");
      out.write("            <input type=\"submit\" name=\"accion\" value=\"Regresar\"class=\"btn btn-danger btn-block mt-1\" >\r\n");
      out.write("        </form>\r\n");
      out.write("    </center>\r\n");
      out.write("              </div>  \r\n");
      out.write("              </div>  \r\n");
      out.write("            \r\n");
      out.write("    </body>\r\n");
      out.write("     <script src=\"../js/jquery-1.11.0.min.js\"></script>\r\n");
      out.write("    <script src=\"../js/validaciones.js\"</script>\r\n");
      out.write("    <script src=\"https://code.jquery.com/jquery-3.5.1.slim.min.js\" integrity=\"sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js\" integrity=\"sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("    <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js\" integrity=\"sha384-B4gt1jrGC7Jh4AgTPSdUtOBvfO8shuf57BaghqFfPlYxofvL8/KUEfYiJOMMV+rV\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("    \r\n");
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
