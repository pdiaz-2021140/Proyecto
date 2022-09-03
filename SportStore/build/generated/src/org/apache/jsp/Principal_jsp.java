package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Principal_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("                <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css\" integrity=\"sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2\" crossorigin=\"anonymous\">\r\n");
      out.write("        <title>Principal page</title>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <nav class=\"navbar navbar-expand-lg\" style=\"background-color: #ffcc33\">\r\n");
      out.write("            \r\n");
      out.write("              <div class=\"collapse navbar-collapse\" id=\"navbarNav\">\r\n");
      out.write("                <ul class=\"navbar-nav\">\r\n");
      out.write("                  <li class=\"nav-item active\">\r\n");
      out.write("                    <a style='margin-left: 10px; border: none' class=\"btn btn-outline-light\" href=\"Controlador?menu=Home\" target=\"homeFrame\">Home</a>\r\n");
      out.write("                  </li>\r\n");
      out.write("                  <li class=\"nav-item\">\r\n");
      out.write("                      <a style='margin-left: 10px; border: none' class=\"btn btn-outline-light\" href=\"Controlador?menu=Usuario&accion=Listar\" target=\"homeFrame\">Usuario</a>\r\n");
      out.write("                  </li>\r\n");
      out.write("                  <li class=\"nav-item active\">\r\n");
      out.write("                      <a style=\"margin-left: 10px; border: none\"class=\"btn btn-outline-light\" href=\"Controlador?menu=TipoProducto&accion=Listar\" target=\"myFrame\">TipoProducto</a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                   \r\n");
      out.write("                </ul>\r\n");
      out.write("              </div>\r\n");
      out.write("            <div class=\"dropdown\">\r\n");
      out.write("                <button style='border: none' class=\"btn btn-outline-light dropdown-toggle\" type=\"button\" id='dropdownMenuButton' data-toggle=\"dropdown\" aria-haspopup='true' aria-expanded=\"false\">\r\n");
      out.write("                  ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${usuario.getNombreUsuario()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(' ');
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${usuario.getApellidoUsuario()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\r\n");
      out.write("                </button>\r\n");
      out.write("                <div class='dropdown-menu text-center' aria-labelledbdy='dropdownMenuButton'>\r\n");
      out.write("                    <a class=\"dropdown-item\" href=\"#\">\r\n");
      out.write("                        <img src='img/usuario.png' alt='' width=\"50\">\r\n");
      out.write("                    </a>\r\n");
      out.write("                    <a class=\"dropdown-item\" href=\"#\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${usuario.getUsuario()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</a>\r\n");
      out.write("                    <a class=\"dropdown-item\" href=\"#\">usuario@gmail.com</a>\r\n");
      out.write("                    <div class='dropdown-divider'></div>\r\n");
      out.write("                        <form action='Validar' method=\"POST\">\r\n");
      out.write("                            <button name='accion' name='Salir' class='dropdown-item' href='#'>Salir</button>\r\n");
      out.write("                        </form>\r\n");
      out.write("                    \r\n");
      out.write("                </div>\r\n");
      out.write("                \r\n");
      out.write("              </div>\r\n");
      out.write("          </nav>\r\n");
      out.write("                    \r\n");
      out.write("                    <div class=\"m-4\" style=\"height: 800px\">\r\n");
      out.write("                        <iframe name=\"homeFrame\" style=\"height: 100%; width: 100%; border: none\"></iframe>\r\n");
      out.write("                    </div>\r\n");
      out.write("                        \r\n");
      out.write("          <script src=\"https://code.jquery.com/jquery-3.5.1.slim.min.js\" integrity=\"sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("          <script src=\"https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js\" integrity=\"sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("          <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js\" integrity=\"sha384-B4gt1jrGC7Jh4AgTPSdUtOBvfO8shuf57BaghqFfPlYxofvL8/KUEfYiJOMMV+rV\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("    </body>\r\n");
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
