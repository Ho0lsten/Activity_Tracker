package org.apache.jsp.Activity;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Activity.activityGetter;
import Hibernate.Activity;
import Hibernate.HibernateUtil;
import Activity.activitySetter;

public final class activity_005fcreate_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->\n");
      out.write("    <title>Activity Tracker - create activity</title>\n");
      out.write("\n");
      out.write("    <!-- Bootstrap -->\n");
      out.write("    <link href=\"../css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("    <!-- Font Awesome -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"../css/font-awesome.min.css\">\n");
      out.write("\n");
      out.write("    <!-- Custom Style -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"../css/style.css\">\n");
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
      out.write("        <h1>Activität anlegen.</h1>\n");
      out.write("        <p>aaaleng</p> \n");
      out.write("    </div>\n");
      out.write("</div><!-- /End Jumbotron -->\n");
      out.write("\n");
      out.write("<form action=\"activity_create.jsp\">\n");
      out.write("    \n");
      out.write("    <div class=\"panel panel-default\">\n");
      out.write("        <div class=\"panel-heading\">Name eingeben</div>\n");
      out.write("        <div class=\"panel-body\">\n");
      out.write("            <input type=\"text\" name=\"Name\" value=\"\" /> \n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("   <div class=\"panel panel-default\">\n");
      out.write("        <div class=\"panel-heading\">Beschreibung eingeben</div>\n");
      out.write("        <div class=\"panel-body\">\n");
      out.write("            <input type=\"text\" name=\"Beschreibung\" value=\"\" /> \n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"panel panel-default\">\n");
      out.write("        <div class=\"panel-heading\">Datum eingeben</div>\n");
      out.write("        <div class=\"panel-body\">\n");
      out.write("            <input type=\"text\" name=\"Tag\" value=\"dd\" /><input type=\"text\" name=\"Monat\" value=\"mm\" /><input type=\"text\" name=\"Jahr\" value=\"yyyy\" />\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"panel panel-default\">\n");
      out.write("        <div class=\"panel-heading\">Dauer eingeben</div>\n");
      out.write("        <div class=\"panel-body\">\n");
      out.write("            <input type=\"text\" name=\"Dauer\" value=\"\" />\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write(" \n");
      out.write("        \n");
      out.write("          \n");
      out.write("            <input type=\"submit\" value=\"speichern\" >\n");
      out.write("\n");
      out.write("            ");
  String s1 = request.getParameter("Name");
                String s2 = request.getParameter("Beschreibung");
                //String s3 = request.getParameter("Kategorie");
                String s4 = request.getParameter("Tag");
                String s5 = request.getParameter("Monat");
                String s6 = request.getParameter("Jahr");
              //  Duration s7 = request.getParameter("Dauer");

                if (s1 != null && s2 != null && s4 != null && s5 != null && s6 != null) {

                   
                    activitySetter.createActivity(s1, s2, s4, s5, s6);
                    //out.println("Kategorie" + s2 + "angelegt");
                }
            
      out.write(" \n");
      out.write("        </form>\n");
      out.write("\n");
      out.write(" <script type=\"text/javascript\">\n");
      out.write("<!--\n");
      out.write("    function toggle_visibility(id) {\n");
      out.write("       var e = document.getElementById(id);\n");
      out.write("       if(e.style.display == 'none')\n");
      out.write("          e.style.display = 'block';\n");
      out.write("       else\n");
      out.write("          e.style.display = 'none';\n");
      out.write("    }\n");
      out.write("//-->\n");
      out.write("</script>     \n");
      out.write("<br></br>\n");
      out.write("\n");
      out.write("<a href=\"#\" onclick=\"toggle_visibility('foo');\">Aktivitäten anzeigen</a>\n");
      out.write("<br></br>\n");
      out.write("\n");
      out.write("<div id=\"foo\" class=\"panel panel-default\">\n");
      out.write("  <!-- Default panel contents -->\n");
      out.write("  <div class=\"panel-heading\">Kategorien</div>\n");
      out.write("  <!-- Table -->\n");
      out.write("        <table class=\"table\" width=”600px” border=”1″ bgcolor=”#FFF380″> \n");
      out.write("            <tr>\n");
      out.write("                <th width=”100px”>ID</th>\n");
      out.write("                <th width=”100px”>Name</th>\n");
      out.write("                <th width=”100px”>Typ</th>\n");
      out.write("                <th width=”100px”>Datum</th>\n");
      out.write("                <th width=”100px”>Dauer</th>\n");
      out.write("            </tr>\n");
      out.write("            <tr>                \n");
      out.write("                ");

                    Activity[] ActivityArr = activityGetter.getActivities();
                    for (int i = 0; i < ActivityArr.length; i++) {
                
      out.write(" \n");
      out.write("            <tr>\n");
      out.write("                <td><b>");
      out.print(ActivityArr[i].getActivityId());
      out.write("</b></td>\n");
      out.write("                <td><b>");
      out.print(ActivityArr[i].getActivityName());
      out.write("</b></td>\n");
      out.write("                <td><b>");
      out.print(ActivityArr[i].getActivityDescription());
      out.write("</b></td>  \n");
      out.write("                <td><b>");
      out.print(ActivityArr[i].getActivityDay());
      out.write('.');
      out.print(ActivityArr[i].getActivityMonth());
      out.write('.');
      out.print(ActivityArr[i].getActivityYear());
      out.write("</b></td>\n");
      out.write("                <td><b>");
      out.print(ActivityArr[i].getActivityDuration());
      out.write("</b></td>                  \n");
      out.write("\n");
      out.write("\n");
      out.write("                ");

                    }
                    HibernateUtil.getSessionFactory().getCurrentSession().disconnect();

                
      out.write("               \n");
      out.write("            </tr>\n");
      out.write("        </table>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("<hr>\n");
      out.write("\n");
      out.write("<footer>\n");
      out.write("    <p>&copy; 2016 MoveoMed, GmbH</p>\n");
      out.write("</footer>\n");
      out.write("</div> <!-- /container -->  \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->\n");
      out.write("<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js\"></script>\n");
      out.write("<!-- Include all compiled plugins (below), or include individual files as needed -->\n");
      out.write("<script src=\"js/bootstrap.min.js\"></script>\n");
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
