package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->\n");
      out.write("    <title>Activity Tracker</title>\n");
      out.write("\n");
      out.write("    <!-- Bootstrap -->\n");
      out.write("    <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("    <!-- Font Awesome -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/font-awesome.min.css\">\n");
      out.write("\n");
      out.write("    <!-- Custom Style -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/style.css\">\n");
      out.write("\n");
      out.write("    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->\n");
      out.write("    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->\n");
      out.write("    <!--[if lt IE 9]>\n");
      out.write("      <script src=\"https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js\"></script>\n");
      out.write("      <script src=\"https://oss.maxcdn.com/respond/1.4.2/respond.min.js\"></script>\n");
      out.write("    <![endif]-->\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!-- Jumbotron -->\n");
      out.write("<div class=\"jumbotron\">\n");
      out.write("    <div class=\"container\">\n");
      out.write("        <h1>Activity Tracker</h1>\n");
      out.write("        <p>Wir haben doch keine Zeit !</p> \n");
      out.write("    </div>\n");
      out.write("</div><!-- /End Jumbotron -->\n");
      out.write("\n");
      out.write("<!-- Header Navigation -->\n");
      out.write("\n");
      out.write("   <!-- Single button -->\n");
      out.write("   <div class=\"container\">\n");
      out.write("        <div class=\"col-md-4\">\n");
      out.write("            <button type=\"button\" class=\"btn btn-default dropdown-toggle\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\n");
      out.write("                Kategorie<span class=\"caret\"></span>\n");
      out.write("            </button>\n");
      out.write("            <ul class=\"dropdown-menu\">\n");
      out.write("                <li><a href=\"Category/category_create.jsp\">anlegen</a></li>\n");
      out.write("                <li><a href=\"Category/category_delete.jsp\">löschen</a></li>\n");
      out.write("                <li><a href=\"Category/category_update.jsp\">bearbeiten</a></li>\n");
      out.write("                <li role=\"separator\" class=\"divider\"></li>\n");
      out.write("                <li><a href=\"#\">Übersicht</a></li>\n");
      out.write("            </ul>\n");
      out.write("        </div>\n");
      out.write("   <!-- Single button -->\n");
      out.write("        <div class=\"col-md-4\" >\n");
      out.write("            <button type=\"button\" class=\"btn btn-default dropdown-toggle\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\n");
      out.write("                Aktivität <span class=\"caret\"></span>\n");
      out.write("            </button>\n");
      out.write("            <ul class=\"dropdown-menu\">\n");
      out.write("                <li><a href=\"Activity/activity_create.jsp\">anlegen</a></li>\n");
      out.write("                <li><a href=\"Activity/activity_delete.jsp\">löschen</a></li>\n");
      out.write("                <li><a href=\"Activity/activity_update.jsp\">bearbeiten</a></li>\n");
      out.write("                <li role=\"separator\" class=\"divider\"></li>\n");
      out.write("                <li><a href=\"#\">Übersicht</a></li>\n");
      out.write("            </ul>\n");
      out.write("        </div>\n");
      out.write("         <!-- Single button -->\n");
      out.write("        <div class=\"col-md-4\">\n");
      out.write("            <button type=\"button\" class=\"btn btn-default dropdown-toggle\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\n");
      out.write("                Auswertung <span class=\"caret\"></span>\n");
      out.write("            </button>\n");
      out.write("            <ul class=\"dropdown-menu\">\n");
      out.write("                <li><a href=\"Statistics/analysis.jsp\">los !</a></li>\n");
      out.write("                <li role=\"separator\" class=\"divider\"></li>\n");
      out.write("                <li><a href=\"#\">Übersicht</a></li>\n");
      out.write("            </ul>\n");
      out.write("        </div>\n");
      out.write("</div>\n");
      out.write("<!-- End Header Navigation -->\n");
      out.write("        \n");
      out.write(" <div class=\"container\">\n");
      out.write("      <!-- Example row of columns -->\n");
      out.write("      <div class=\"row\">\n");
      out.write("        <div class=\"col-md-4\">\n");
      out.write("          <h2>Kategorien verwalten</h2>\n");
      out.write("          <p>Erstellen Sie Kategorien für die Einordnung ihrer Aktivitäten. </p>\n");
      out.write("         \n");
      out.write("        </div>\n");
      out.write("        <div class=\"col-md-4\">\n");
      out.write("          <h2>Aktivitäten verwalten</h2>\n");
      out.write("          <p>Dokumentieren Sie ihre Aktivitäten.</p>\n");
      out.write("         \n");
      out.write("       </div>\n");
      out.write("        <div class=\"col-md-4\">\n");
      out.write("          <h2>Auswertung</h2>\n");
      out.write("          <p>Verschaffen Sie sich einen Überblick.</p>\n");
      out.write("         \n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("\n");
      out.write("      <hr>\n");
      out.write("\n");
      out.write("      <footer>\n");
      out.write("        <p>&copy; 2016 MoveoMed, GmbH</p>\n");
      out.write("      </footer>\n");
      out.write("    </div> <!-- /container -->  \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->\n");
      out.write("<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js\"></script>\n");
      out.write("<!-- Include all compiled plugins (below), or include individual files as needed -->\n");
      out.write("<script src=\"js/bootstrap.min.js\"></script>\n");
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
