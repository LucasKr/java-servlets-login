package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Parcial II</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://bootswatch.com/cosmo/bootstrap.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"./styles.css\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div id=\"login_contents\">\n");
      out.write("            <form action=\"ValidadorLogin\" method=\"post\" class=\"form-horizontal\">\n");
      out.write("                <fieldset>\n");
      out.write("                   <legend>Login</legend>\n");
      out.write("                   <div class=\"form-group\">\n");
      out.write("                     <label for=\"inputUser\" class=\"col-lg-2 control-label\">UserName:</label>\n");
      out.write("                     <div class=\"col-lg-10\">\n");
      out.write("                       <input type=\"text\" class=\"form-control\" id=\"inputUser\" name=\"inputUser\" placeholder=\"Your user name\">\n");
      out.write("                     </div>\n");
      out.write("                   </div>\n");
      out.write("                   <div class=\"form-group\">\n");
      out.write("                     <label for=\"inputPassword\" class=\"col-lg-2 control-label\">Password:</label>\n");
      out.write("                     <div class=\"col-lg-10\">\n");
      out.write("                       <input type=\"password\" class=\"form-control\" id=\"inputPassword\" name=\"inputPassword\" placeholder=\"Password\"> \n");
      out.write("                     </div>\n");
      out.write("                   </div> \n");
      out.write("                   <div class=\"form-group\">\n");
      out.write("                     <div class=\"col-lg-10 col-lg-offset-2\"> \n");
      out.write("                       <button type=\"submit\" class=\"btn btn-primary\">Submit</button>\n");
      out.write("                     </div>\n");
      out.write("                   </div>\n");
      out.write("                </fieldset>\n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
