/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.83
 * Generated at: 2023-12-13 21:46:30 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import ar.com.integrador.domain.Orador;
import java.util.List;

public final class tickets_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("java.util.List");
    _jspx_imports_classes.add("ar.com.integrador.domain.Orador");
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"es\">\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\" />\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\" />\n");
      out.write("    <link rel=\"shortcut icon\" href=\"./favicon.ico\" type=\"image/x-icon\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"./css/bootstrap.min.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"./css/styles.css\">\n");
      out.write("\n");
      out.write("    <title>Comprar tickets</title>\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("    <header class=\"header headerTickets\">\n");
      out.write("        <nav class=\"navbar navbar-expand-lg navbar-dark\">\n");
      out.write("            <div class=\"container-fluid justify-content-between\">\n");
      out.write("                <a href=\"../index.html\" class=\"col-8 col-md-6 col-lg-4 col-xl-3 d-flex align-items-center\">\n");
      out.write("                    <h2 class=\"colorWhite fs-1\">Conf Bs As</h2>\n");
      out.write("                </a>\n");
      out.write("                <button class=\"navbar-toggler\" type=\"button\" data-bs-toggle=\"collapse\"\n");
      out.write("                    data-bs-target=\"#navbarSupportedContent\" aria-controls=\"navbarSupportedContent\"\n");
      out.write("                    aria-expanded=\"false\" aria-label=\"Toggle navigation\" class=\"col-4\">\n");
      out.write("                    <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("                </button>\n");
      out.write("                <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\n");
      out.write("                    <ul class=\"navbar-nav me-auto mb-2 mb-lg-0 w-100 justify-content-end flex-wrap align-items-center\">\n");
      out.write("                        <li class=\"nav-item\">\n");
      out.write("                            <a class=\"nav-link active fs-2 p-3\" aria-current=\"page\" href=\"index.jsp#conference\">La\n");
      out.write("                                conferencia</a>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"nav-item\">\n");
      out.write("                            <a class=\"nav-link fs-2 p-3\" href=\"index.jspl#speakers\">Los oradores</a>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"nav-item\">\n");
      out.write("                            <a class=\"nav-link fs-2 p-3\" href=\"index.jsp#placeAndDate\">El lugar y la fecha</a>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"nav-item\">\n");
      out.write("                            <a class=\"nav-link fs-2 p-3\" href=\"index.jsp#speakerForm\">Conviértete en orador</a>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"nav-item\">\n");
      out.write("                            <a class=\"nav-link colorGreen fs-2 p-3\" href=\"#\">Comprar tickets</a>\n");
      out.write("                        </li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </nav>\n");
      out.write("    </header>\n");
      out.write("    <main class=\"p-5 mainTickets d-flex flex-column justify-content-center align-items-center col-md-10 offset-md-1 col-lg-8 offset-lg-2\">\n");
      out.write("        <section class=\"d-flex flex-wrap justify-content-center align-items-center gap-5 gap-lg-2 w-100\">\n");
      out.write("            <div class=\"card cardCategory border-blue\">\n");
      out.write("                <div class=\"card-body d-flex flex-column align-items-center justify-content-evenly\">\n");
      out.write("                    <h2 class=\"card-title fs-1\">Estudiante</h4>\n");
      out.write("                    <p class=\"card-text\">Tiene un descuento</p>\n");
      out.write("                    <h3 class=\"card-title\">80%</h3>\n");
      out.write("                    <p class=\"card-text\"><small class=\"text-muted\">*presentar documentación</small></p>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"card cardCategory border-lightblue\">\n");
      out.write("                <div class=\"card-body d-flex flex-column align-items-center justify-content-evenly\">\n");
      out.write("                    <h2 class=\"card-title fs-1\">Trainee</h4>\n");
      out.write("                    <p class=\"card-text\">Tiene un descuento</p>\n");
      out.write("                    <h3 class=\"card-title\">50%</h3>\n");
      out.write("                    <p class=\"card-text\"><small class=\"text-muted\">*presentar documentación</small></p>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"card cardCategory border-yellow\">\n");
      out.write("                <div class=\"card-body d-flex flex-column align-items-center justify-content-evenly\">\n");
      out.write("                    <h2 class=\"card-title fs-1 \">Junior</h4>\n");
      out.write("                    <p class=\"card-text\">Tiene un descuento</p>\n");
      out.write("                    <h3 class=\"card-title\">15%</h3>\n");
      out.write("                    <p class=\"card-text\"><small class=\"text-muted\">*presentar documentación</small></p>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </section>\n");
      out.write("        <h1 class=\"text-center text-uppercase my-3\"><div>venta</div>valor de ticket $200</h1>\n");
      out.write("        <form action=\"\" id=\"form-tickets\" class=\"d-flex flex-column gap-4 p-3 p-xl-5 col-12 col-xl-9\">\n");
      out.write("            <div class=\"d-flex flex-column flex-lg-row gap-3\">\n");
      out.write("                <div class=\"w-100\">\n");
      out.write("                    <input type=\"text\" placeholder=\"Nombre\" id=\"first_name\" class=\"form-control w-100\" required/>\n");
      out.write("                    <div class=\"invalid-feedback\" id=\"error-firstName\">\n");
      out.write("                        <p>Ingrese su nombre</p>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"w-100\">\n");
      out.write("                    <input type=\"text\" placeholder=\"Apellido\" id=\"last_name\" class=\"form-control w-100\" required/>\n");
      out.write("                    <div class=\"invalid-feedback\" id=\"error-lastName\">\n");
      out.write("                        <p>Ingrese su apellido</p>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"w-100\">\n");
      out.write("                <input type=\"email\" name=\"email\" placeholder=\"Correo\" id=\"email\" class=\"form-control w-100\" required/>\n");
      out.write("                <div class=\"invalid-feedback\" id=\"error-email\">\n");
      out.write("                    <p>Ingrese un correo válido</p>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"d-flex flex-column flex-lg-row gap-3 w-100\">\n");
      out.write("                <div class=\"w-100\">\n");
      out.write("                    <div class=\"d-flex flex-lg-column gap-3 w-100\">\n");
      out.write("                        <label for=\"quantity\" class=\"me-3 form-label\">Cantidad</label>\n");
      out.write("                        <input type=\"number\" name=\"quantity\" id=\"quantity\" placeholder=\"cantidad\" class=\"form-control w-100\" min=\"1\" required>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"invalid-feedback\" id=\"error-quantity\">\n");
      out.write("                        <p>Ingrese la cantidad de tickets</p>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"d-flex flex-lg-column gap-3 w-100\">\n");
      out.write("                    <label for=\"category\" class=\"me-3 form-label\">Categoría</label>\n");
      out.write("                    <select class=\"form-select\" aria-label=\"CategorÃ­a\" class=\"w-100\" id=\"category\">\n");
      out.write("                        <option value=\"\" selected>--Seleccione una opción--</option>\n");
      out.write("                        <option value=\"0\">Sin categoría</option>\n");
      out.write("                        <option value=\"1\">Estudiante</option>\n");
      out.write("                        <option value=\"2\">Trainee</option>\n");
      out.write("                        <option value=\"3\">Junior</option>\n");
      out.write("                    </select>\n");
      out.write("                    <div class=\"invalid-feedback\" id=\"error-category\">\n");
      out.write("                        <p>Elija una categoría</p>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <p class=\"totalPrice p-3\">Total a Pagar: $<span id=\"total\"></span></p>\n");
      out.write("            <div class=\"d-flex gap-3\">\n");
      out.write("                <button type=\"reset\" id=\"btnDelete\" class=\"btn btn-success w-100 p-3 fs-3\">Borrar</button>\n");
      out.write("                <button type=\"button\" id=\"btnPurchase\" class=\"btn btn-success w-100 p-3 fs-3\">Resumen</button>\n");
      out.write("            </div>\n");
      out.write("        </form>\n");
      out.write("    </main>\n");
      out.write("    <footer class=\"footer p-3 d-flex align-items-center\">\n");
      out.write("        <div class=\"container h-100\">\n");
      out.write("            <ul class=\"d-flex flex-wrap justify-content-evenly align-items-center h-100\">\n");
      out.write("                <li class=\"p-3\"><a href=\"404.jpg\">Preguntas frecuentes</a></li>\n");
      out.write("                <li class=\"p-3\"><a href=\"404.jpg\">Contáctanos</a></li>\n");
      out.write("                <li class=\"p-3\"><a href=\"404.jpg\">Prensa</a></li>\n");
      out.write("                <li class=\"p-3\"><a href=\"404.jpg\">Conferencias</a></li>\n");
      out.write("                <li class=\"p-3\"><a href=\"404.jpg\">Términos y condiciones</a></li>\n");
      out.write("                <li class=\"p-3\"><a href=\"404.jpg\">Privacidad</a></li>\n");
      out.write("                <li class=\"p-3\"><a href=\"404.jpg\">Estudiantes</a></li>\n");
      out.write("            </ul>\n");
      out.write("        </div>\n");
      out.write("    </footer>\n");
      out.write("    <script src=\"js/bootstrap.bundle.min.js\"></script>\n");
      out.write("    <script src=\"js/tickets.js\"></script>\n");
      out.write("</body>\n");
      out.write("\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
