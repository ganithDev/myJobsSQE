package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.cv_gn.model.EducationLevel;
import com.cv_gn.model.Sector;
import java.util.List;
import com.cv_gn.model.JobTitle;
import com.cv_gn.dao.ManagerDAO;

public final class searchCV_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(3);
    _jspx_dependants.add("/fileSet.html");
    _jspx_dependants.add("/Header_RecruitMe.html");
    _jspx_dependants.add("/Footer_RecruitMe.html");
  }

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
      out.write("<!DOCTYPE html>\r\n");

    if (session.getAttribute("Agency") == null) {
        response.sendRedirect("login.jsp");
    } else {



      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>Search Profiles | RecruitMe</title>\r\n");
      out.write("        ");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"CSS_styl/Top_Foot.css\"><!--Used for form design-->\r\n");
      out.write("\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"CSS_styl/formBody.css\"><!--Used for form design-->\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"CSS_styl/gridLayouts.css\"><!--Used for grid layouts-->\r\n");
      out.write("\r\n");
      out.write("<!-- Load jQuery and java scripts files -->\r\n");
      out.write("<script src=\"jquerylbs/jquery-19.1.js\"></script>\r\n");
      out.write("<script src=\"jquerylbs/jquery.validate.min.js\"></script>\r\n");
      out.write("<script src=\"jquerylbs/formValidation.js\"></script>\r\n");
      out.write("<script src=\"jquerylbs/getAjaxObject.js\"></script>\r\n");
      out.write("<script src=\"jquerylbs/loadUIs.js\"></script>\r\n");
      out.write("<script src=\"jquerylbs/searchJQry.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<!-- Load jQuery and java scripts  -->\r\n");
      out.write("\r\n");
      out.write("        ");
      out.write("<div id=\"menubar\">\n");
      out.write("        <ul id=\"menu\">\n");
      out.write("          <!-- put class=\"selected\" in the li tag for the selected page - to highlight which page you're on -->\n");
      out.write("          <li class=\"selected\"><a href=\"home.jsp\">Home</a></li>\n");
      out.write("          <li><a href=\"login.jsp\">Login</a></li>\n");
      out.write("          <li><a href=\"registerUser.jsp\">Register With Us</a></li>\n");
      out.write("       \n");
      out.write("          <li><a href=\"home.jsp\">Contact Us</a></li>\n");
      out.write("        </ul>\n");
      out.write("      </div>");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <section>\t\t\t\t\r\n");
      out.write("            <div id=\"container_demo\"><!--Contain design related to form-->\r\n");
      out.write("\r\n");
      out.write("                <div id=\"wrapper\"><!--Contain design related to form-->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                    <div id=\"register\" class=\"animate form\"> <!--Contain design related to form-->\r\n");
      out.write("                        <section role=\"main\" class=\"container_16 clearfix\"><!--Contain design related to two grids-->\r\n");
      out.write("                            <div class=\"grid_16 experiences\"><!-- Bottom Grid  -->\r\n");
      out.write("                                <h3>Search CV profiles</h3>\r\n");
      out.write("                                  <label for=\"saveRef\" class=\"uname\" >Filter By</label>\r\n");
      out.write("                                <p>\r\n");
      out.write("                                    <select id=\"filterCriteria\" name=\"filterCriteria\" onchange=\"loadSearchForm()\">\r\n");
      out.write("                                        <option value=\"Job or Sector\">Job or Sector</option>\r\n");
      out.write("                                        <option value=\"Minimum education level\">Minimum education level</option>\r\n");
      out.write("                                        <option value=\"Minimum number of GCSE passes\">Minimum number of GCSE passes</option>\r\n");
      out.write("                                        <option value=\"Specific educational qualification\">Specific educational qualification</option>\r\n");
      out.write("                                        <option value=\"Specific professional qualification\">Specific professional qualification</option>\r\n");
      out.write("                                        <option value=\"Specific skill\">Specific skill</option>\r\n");
      out.write("                                        <option value=\"Specific experience\">Specific experience</option>\r\n");
      out.write("                                    </select> \r\n");
      out.write("                                </p>\r\n");
      out.write("                            </div>\r\n");
      out.write("                          \r\n");
      out.write("                            <div id=\"searchResults\" class=\"grid_16\">\r\n");
      out.write("                                \r\n");
      out.write("                            </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                        </section>\r\n");
      out.write("                    </div><!--grid 16 Bottom Grid ends -->\r\n");
      out.write("                    </section><!--Contain design related to two grids-->\r\n");
      out.write("                </div></div></div>\r\n");
      out.write("    </section>\r\n");
      out.write("</body>\r\n");
      out.write("<div id=\"footer\">\n");
      out.write("    Copyright &copy; RecruitMe | <a href=\"home.jsp\">Home</a> | <a href=\"login.jsp\">Signin</a> | <a href=\"registerUser.jsp\">Signup</a>\n");
      out.write("    </div>");
      out.write("\r\n");
      out.write("</html>\r\n");
 }

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
