/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.70
 * Generated at: 2021-11-02 05:27:57 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.error;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class _404_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    _jspx_imports_classes = null;
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

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
      return;
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
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("html {\r\n");
      out.write("  height: 100%;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("body {\r\n");
      out.write("  height: 100%;\r\n");
      out.write("  background: url(\"https://wallpapercave.com/wp/6SLzBEY.jpg\") no-repeat left top;\r\n");
      out.write("  background-size: cover;\r\n");
      out.write("  overflow: hidden;\r\n");
      out.write("  display: flex;\r\n");
      out.write("  flex-flow: column wrap;\r\n");
      out.write("  justify-content: center;\r\n");
      out.write("  align-items: center;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".text h1 {\r\n");
      out.write("  color: #011718;\r\n");
      out.write("  margin-top: -200px;\r\n");
      out.write("  font-size: 15em;\r\n");
      out.write("  text-align: center;\r\n");
      out.write("  text-shadow: -5px 5px 0px rgba(0, 0, 0, 0.7), -10px 10px 0px rgba(0, 0, 0, 0.4), -15px 15px 0px rgba(0, 0, 0, 0.2);\r\n");
      out.write("  font-family: monospace;\r\n");
      out.write("  font-weight: bold;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".text h2 {\r\n");
      out.write("  color: black;\r\n");
      out.write("  font-size: 5em;\r\n");
      out.write("  text-shadow: -5px 5px 0px rgba(0, 0, 0, 0.7);\r\n");
      out.write("  text-align: center;\r\n");
      out.write("  margin-top: -150px;\r\n");
      out.write("  font-family: monospace;\r\n");
      out.write("  font-weight: bold;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".text h3 {\r\n");
      out.write("  color: white;\r\n");
      out.write("  margin-left: 30px;\r\n");
      out.write("  font-size: 2em;\r\n");
      out.write("  text-shadow: -5px 5px 0px rgba(0, 0, 0, 0.7);\r\n");
      out.write("  margin-top: -40px;\r\n");
      out.write("  font-family: monospace;\r\n");
      out.write("  font-weight: bold;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".torch {\r\n");
      out.write("  margin: -150px 0 0 -150px;\r\n");
      out.write("  width: 200px;\r\n");
      out.write("  height: 200px;\r\n");
      out.write("  box-shadow: 0 0 0 9999em #000000f7;\r\n");
      out.write("  opacity: 1;\r\n");
      out.write("  border-radius: 50%;\r\n");
      out.write("  position: fixed;\r\n");
      out.write("  background: rgba(0, 0, 0, 0.3);\r\n");
      out.write("}\r\n");
      out.write(".torch:after {\r\n");
      out.write("  content: \"\";\r\n");
      out.write("  display: block;\r\n");
      out.write("  border-radius: 50%;\r\n");
      out.write("  width: 100%;\r\n");
      out.write("  height: 100%;\r\n");
      out.write("  top: 0px;\r\n");
      out.write("  left: 0px;\r\n");
      out.write("  box-shadow: inset 0 0 40px 2px #000, 0 0 20px 4px rgba(13, 13, 10, 0.2);\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div class=\"text\">\r\n");
      out.write("  <h1>404</h1>\r\n");
      out.write("  <h2>Uh, Ohh</h2>\r\n");
      out.write("  <h3>Sorry we cant find what you are looking for 'cuz its so dark in here</h3>\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"torch\"></div>\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\" src=\"https://cdnjs.cloudflare.com/ajax/libs/jquery/3.4.1/jquery.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("$(document).mousemove(function (event) {\r\n");
      out.write("	  $('.torch').css({\r\n");
      out.write("	    'top': event.pageY,\r\n");
      out.write("	    'left': event.pageX\r\n");
      out.write("	  });\r\n");
      out.write("	});\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
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