/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.83
 * Generated at: 2023-12-13 23:01:08 UTC
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

public final class dashboard_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!doctype html>\r\n");
      out.write("<html lang=\"es\">\r\n");
      out.write("\r\n");
      out.write("	<head>\r\n");
      out.write("	  <meta charset=\"utf-8\">\r\n");
      out.write("	  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("	\r\n");
      out.write("	    <link rel=\"stylesheet\" href=\"./css/bootstrap.min.css\">\r\n");
      out.write("       <link rel=\"stylesheet\" href=\"./css/styles.css\">\r\n");
      out.write("	  <link rel=\"shortcut icon\" href=\"./img/codoacodo-min.png\" type=\"image/x-icon\">\r\n");
      out.write("	\r\n");
      out.write("	  <title>Trabajo Integrador</title>\r\n");
      out.write("		<style>\r\n");
      out.write("		    body{\r\n");
      out.write("		        height:100vh;\r\n");
      out.write("		        display: grid;\r\n");
      out.write("		        grid-template-rows: 10% 75% 15%;\r\n");
      out.write("		        grid-template-areas: \"header\"\r\n");
      out.write("		                             \"main\"\r\n");
      out.write("		                             \"footer\";  \r\n");
      out.write("		\r\n");
      out.write("		    }\r\n");
      out.write("		    header{\r\n");
      out.write("		        grid-area: header;\r\n");
      out.write("		    }\r\n");
      out.write("		    main{\r\n");
      out.write("		        grid-area: main;\r\n");
      out.write("		        overflow: auto;\r\n");
      out.write("		    }\r\n");
      out.write("		    footer{\r\n");
      out.write("		        grid-area: footer;\r\n");
      out.write("		      \r\n");
      out.write("		    }\r\n");
      out.write("		  </style>\r\n");
      out.write("	</head>\r\n");
      out.write("	<body>\r\n");
      out.write("	\r\n");
      out.write("		<header>\r\n");
      out.write("		    <nav class=\"navbar navbar-dark bg-dark fixed-top navbar-expand-lg\">\r\n");
      out.write("		        <div class=\"container\">\r\n");
      out.write("		            <a class=\"navbar-brand\" href=\"index.html\">\r\n");
      out.write("		                <img src=\"img/codoacodo-min.png\" alt=\"Codo a Codo logo\">\r\n");
      out.write("		                Conf Bs As\r\n");
      out.write("		            </a>\r\n");
      out.write("		            <button class=\"navbar-toggler\" type=\"button\" data-bs-toggle=\"collapse\"\r\n");
      out.write("		                data-bs-target=\"#navbarSupportedContent\" aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\"\r\n");
      out.write("		                aria-label=\"Toggle navigation\">\r\n");
      out.write("		                <span class=\"navbar-toggler-icon\"></span>\r\n");
      out.write("		            </button>\r\n");
      out.write("		            <div class=\"collapse navbar-collapse justify-content-end\" id=\"navbarSupportedContent\">\r\n");
      out.write("		                <ul class=\"navbar-nav mb-2 mb-lg-0\">\r\n");
      out.write("		                    <li class=\"nav-item\">\r\n");
      out.write("		                        <a class=\"nav-link active\" aria-current=\"page\" href=\"./index.jsp\">La conferencia</a>\r\n");
      out.write("		                    </li>\r\n");
      out.write("		                    <li class=\"nav-item\">\r\n");
      out.write("		                        <a class=\"nav-link\" href=\"./index.jsp#oradores\">Los oradores</a>\r\n");
      out.write("		                    </li>\r\n");
      out.write("		                    <li class=\"nav-item\">\r\n");
      out.write("		                        <a class=\"nav-link\" href=\"./index.jsp#lugar\">El lugar y la fecha</a>\r\n");
      out.write("		                    </li>\r\n");
      out.write("		                    <li class=\"nav-item\">\r\n");
      out.write("		                        <a class=\"nav-link\" href=\"./index.jsp#form-orador\">Conviértete en orador</a>\r\n");
      out.write("		                    </li>\r\n");
      out.write("		                    <li class=\"nav-item\">\r\n");
      out.write("		                        <a class=\"nav-link btn-compra-tickets\" href=\"tickets.jsp\">Comprar tickets</a>\r\n");
      out.write("		                    </li>\r\n");
      out.write("		                     <li class=\"nav-item\">\r\n");
      out.write("                                <a class=\"nav-link\" href=\"login.jsp\">LogIn</a>\r\n");
      out.write("                             </li>\r\n");
      out.write("		                </ul>\r\n");
      out.write("		            </div>\r\n");
      out.write("		        </div>\r\n");
      out.write("		    </nav>\r\n");
      out.write("		</header>\r\n");
      out.write("		\r\n");
      out.write("		<main>\r\n");
      out.write("			<section class=\"mt-5\">\r\n");
      out.write("		        <h3 class=\"text-center\">Encontra tus oradores favoritos por sus temas</h3>\r\n");
      out.write("		        <form class=\"d-flex\" action=\"");
      out.print(request.getContextPath());
      out.write("/BuscarOradorTemaController\" method=\"post\">\r\n");
      out.write("		            <input class=\"form-control me-2\" name=\"temabuscar\" id=\"temabuscar\" type=\"search\" placeholder=\"Escribi un tema\" aria-label=\"Buscar\">\r\n");
      out.write("		            <input class=\"btn btn-outline-success\" type=\"submit\" value=\"Buscar\">\r\n");
      out.write("		        </form>\r\n");
      out.write("	        </section>\r\n");
      out.write("			<section class=\"container mt-5 mb-4\" id=\"restoOradores\">\r\n");
      out.write("		        <h3 class=\"text-center\">Conoce todos los oradores que se presentan</h2>\r\n");
      out.write("		      \r\n");
      out.write("		        <div class=\"row\">\r\n");
      out.write("		            <table class=\"table\">\r\n");
      out.write("		                <thead>\r\n");
      out.write("		                  <tr>\r\n");
      out.write("		                    <th scope=\"col\">#</th>\r\n");
      out.write("		                    <th scope=\"col\">Nombre</th>\r\n");
      out.write("		                    <th scope=\"col\">Apellido</th>\r\n");
      out.write("		                    <th scope=\"col\">Tema</th>\r\n");
      out.write("		                    <th scope=\"col\">Acciones</th>\r\n");
      out.write("		                  </tr>\r\n");
      out.write("		                </thead>\r\n");
      out.write("		                 ");
 
						  	//codigo java
						  	//obtener el listado desde el request
						  	//se guardo bajo el nombre de "listado"
						  	List<Orador> listado = (List<Orador>)request.getAttribute("listado");
					 	 
      out.write("\r\n");
      out.write("		                <tbody>\r\n");
      out.write("			                 <!-- ESTO SE REPITE TANTA CANDTIDAD DE VECES COMO ARTICULOS TENGA -->\r\n");
      out.write("						   ");

						   	for( Orador  unOrador : listado) {
						   
      out.write("\r\n");
      out.write("		                  <tr>\r\n");
      out.write("		                    <th scope=\"row\">");
      out.print(unOrador.getId());
      out.write("</th>\r\n");
      out.write("		                    <td>");
      out.print(unOrador.getNombre() );
      out.write("</td>\r\n");
      out.write("		                    <td>");
      out.print(unOrador.getApellido() );
      out.write("</td>\r\n");
      out.write("		                    <td>");
      out.print(unOrador.getTema() );
      out.write("</td>\r\n");
      out.write("		                    <td><a class=\"btn btn-info\" role=\"button\" href=\"");
      out.print(request.getContextPath());
      out.write("/UpdateOradorController?id=");
      out.print(unOrador.getId());
      out.write("\">\r\n");
      out.write("							       Editar\r\n");
      out.write("							    </a> | \r\n");
      out.write("					      		<!-- Button trigger modal -->\r\n");
      out.write("								<button type=\"button\" class=\"btn btn-danger\" data-bs-toggle=\"modal\" data-bs-target=\"#exampleModal\" onclick=\"setOradorId(");
      out.print(unOrador.getId());
      out.write(")\">\r\n");
      out.write("								  Eliminar\r\n");
      out.write("								</button>\r\n");
      out.write("							  </td>\r\n");
      out.write("		                  </tr>\r\n");
      out.write("		                   ");

					   		}
					  	   
      out.write("\r\n");
      out.write("		                </tbody>\r\n");
      out.write("		              </table>\r\n");
      out.write("		        </div>\r\n");
      out.write("\r\n");
      out.write("    	  </section>\r\n");
      out.write("	\r\n");
      out.write("		\r\n");
      out.write("		</main>\r\n");
      out.write("		<!-- Modal -->\r\n");
      out.write("		<div class=\"modal fade\" id=\"exampleModal\" tabindex=\"-1\" aria-labelledby=\"exampleModalLabel\" aria-hidden=\"true\">\r\n");
      out.write("		  <div class=\"modal-dialog\">\r\n");
      out.write("		    <div class=\"modal-content\">\r\n");
      out.write("		    	<form action=\"");
      out.print(request.getContextPath());
      out.write("/DeleteOradorController\">\r\n");
      out.write("		    	  <input type=\"hidden\" name=\"idOrador\" id=\"idOrador\">\r\n");
      out.write("			      <div class=\"modal-header\">\r\n");
      out.write("			        <h5 class=\"modal-title\" id=\"exampleModalLabel\">Dar de baja Orador</h5>\r\n");
      out.write("			        <button type=\"button\" class=\"btn-close\" data-bs-dismiss=\"modal\" aria-label=\"Close\"></button>\r\n");
      out.write("			      </div>\r\n");
      out.write("			      <div class=\"modal-body\">\r\n");
      out.write("			        ¿Confirma que desea eliminar? \r\n");
      out.write("			      </div>\r\n");
      out.write("			      <div class=\"modal-footer\">\r\n");
      out.write("			        <button type=\"button\" class=\"btn btn-secondary\" data-bs-dismiss=\"modal\">Cancelar</button>\r\n");
      out.write("			        <button type=\"submit\" class=\"btn btn-danger\">Eliminar</button>\r\n");
      out.write("			      </div>\r\n");
      out.write("		    	</form>\r\n");
      out.write("		    </div>\r\n");
      out.write("		  </div>\r\n");
      out.write("		</div>\r\n");
      out.write("		\r\n");
      out.write("		<footer id=\"main-footer\">\r\n");
      out.write("		    <div class=\"container\">\r\n");
      out.write("		        <ul class=\"nav justify-content-center justify-content-lg-between align-items-center\">\r\n");
      out.write("		            <li class=\"nav-item\">\r\n");
      out.write("		                <a class=\"nav-link\" href=\"#\">Preguntas <span>frecuentes</span></a>\r\n");
      out.write("		            </li>\r\n");
      out.write("		            <li class=\"nav-item\">\r\n");
      out.write("		                <a class=\"nav-link\" href=\"#\">Contáctanos</a>\r\n");
      out.write("		            </li>\r\n");
      out.write("		            <li class=\"nav-item\">\r\n");
      out.write("		                <a class=\"nav-link\" href=\"#\">Prensa</a>\r\n");
      out.write("		            </li>\r\n");
      out.write("		            <li class=\"nav-item\">\r\n");
      out.write("		                <a class=\"nav-link\" href=\"#\">Conferencias</a>\r\n");
      out.write("		            </li>\r\n");
      out.write("		            <li class=\"nav-item\">\r\n");
      out.write("		                <a class=\"nav-link\" href=\"#\">Términos y <span>condiciones</span></a>\r\n");
      out.write("		            </li>\r\n");
      out.write("		            <li class=\"nav-item\">\r\n");
      out.write("		                <a class=\"nav-link\" href=\"#\">Privacidad</a>\r\n");
      out.write("		            </li>\r\n");
      out.write("		            <li class=\"nav-item\">\r\n");
      out.write("		                <a class=\"nav-link\" href=\"#\">Estudiantes</a>\r\n");
      out.write("		            </li>\r\n");
      out.write("		        </ul>\r\n");
      out.write("		    </div>\r\n");
      out.write("		</footer>\r\n");
      out.write("		\r\n");
      out.write("		 <script src=\"js/bootstrap.bundle.min.js\"></script>\r\n");
      out.write("			function setOradorId(id) {\r\n");
      out.write("				document.getElementById('idOrador').value=id;\r\n");
      out.write("			}\r\n");
      out.write("	  </script>\r\n");
      out.write("	</body>\r\n");
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
