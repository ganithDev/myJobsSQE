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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");

    if (session.getAttribute("Agency") == null) {
        response.sendRedirect("login.jsp");
    } else {
           
        

      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Search Profiles | RecruitMe</title>\n");
      out.write("        ");
      out.write(" <link rel=\"stylesheet\" type=\"text/css\" href=\"CSS_styl/Top_Foot.css\"><!--Used for form design-->\n");
      out.write("        \n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"CSS_styl/formBody.css\"><!--Used for form design-->\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"CSS_styl/gridLayouts.css\"><!--Used for grid layouts-->\n");
      out.write("\n");
      out.write("        <!-- Load jQuery and the validate plugin -->\n");
      out.write("        <script src=\"/Onln_CV_GN/jquerylbs/jquery-19.1.js\"></script>\n");
      out.write("        <script src=\"/Onln_CV_GN/jquerylbs/jquery.validate.min.js\"></script>\n");
      out.write("        <script src=\"jquerylbs/formValidation.js\"></script>\n");
      out.write("        <script src=\"jquerylbs/getAjaxObject.js\"></script>\n");
      out.write("        <script src=\"jquerylbs/loadUIs.js\"></script>\n");
      out.write("        <!-- jQuery Form Validation code -->\n");
      out.write("       ");
      out.write("\n");
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
      out.write("\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <section>\t\t\t\t\n");
      out.write("            <div id=\"container_demo\"><!--Contain design related to form-->\n");
      out.write("\n");
      out.write("                <div id=\"wrapper\"><!--Contain design related to form-->\n");
      out.write("\n");
      out.write("\n");
      out.write("                    <div id=\"register\" class=\"animate form\"> <!--Contain design related to form-->\n");
      out.write("                        <section role=\"main\" class=\"container_16 clearfix\"><!--Contain design related to two grids-->\n");
      out.write("                            <div class=\"grid_16 experiences\"><!-- Bottom Grid  -->\n");
      out.write("                                <h3>Select Filters</h3>\n");
      out.write("                                \n");
      out.write("                                <!--Job or Sector (they want to work in) preference-->\n");
      out.write("                                <div class=\"grid_6\">\n");
      out.write("                                    <p> \n");
      out.write("                                        <label for=\"SectorPreference\">Sector preference</label>\n");
      out.write("                                        <select name=\"SectorPreference\">\n");
      out.write("                                            ");

                                                List<Sector> sectors = ManagerDAO.searchAll(new Sector());
                                                for (Sector sec : sectors) {
                                            
      out.write("\n");
      out.write("                                            <option value=\"");
      out.print( sec.getIdSector());
      out.write('"');
      out.write('>');
      out.print( sec.getSectorTitle());
      out.write("</option>\n");
      out.write("                                            ");
 }
      out.write("\n");
      out.write("                                        </select>\n");
      out.write("                                    </p>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"grid_6\">\n");
      out.write("                                    <p> \n");
      out.write("                                        <label for=\"JobPreference\" > Job preference</label>\n");
      out.write("                                        <select name=\"JobPreference\">\n");
      out.write("                                            ");

                                                List<JobTitle> jobTitles = ManagerDAO.searchAll(new JobTitle());
                                                for (JobTitle jt : jobTitles) {
                                            
      out.write("\n");
      out.write("                                            <option value=\"");
      out.print( jt.getIdJobTitle());
      out.write('"');
      out.write('>');
      out.print( jt.getJobTitle());
      out.write("</option>\n");
      out.write("                                            ");
 }
      out.write("\n");
      out.write("                                        </select>\n");
      out.write("                                    </p>\n");
      out.write("                                </div><!--Job or Sector (they want to work in) preference ends-->\n");
      out.write("\n");
      out.write("                                <!--\n");
      out.write("                                ii.\tMinimum education level\n");
      out.write("iii.\tMinimum number of GCSE passes\n");
      out.write("iv.\tSpecific educational qualification\n");
      out.write("                                -->\n");
      out.write("                                <div class=\"grid_8\">\n");
      out.write("                                    <div class=\"grid_6\">\n");
      out.write("\n");
      out.write("                                        <p> \n");
      out.write("                                            <label for=\"JobPreference\" > Education level</label>\n");
      out.write("                                            <select name=\"JobPreference\">\n");
      out.write("                                                ");

                                                    List<EducationLevel> educationLevels = ManagerDAO.searchAll(new EducationLevel());
                                                    for (EducationLevel el : educationLevels) {
                                                
      out.write("\n");
      out.write("                                                <option value=\"");
      out.print( el.getIdEducationLevel());
      out.write('"');
      out.write('>');
      out.print( el.getEducationLevel());
      out.write("</option>\n");
      out.write("                                                ");
 }
      out.write("\n");
      out.write("                                            </select>\n");
      out.write("                                        </p>\n");
      out.write("                                    </div>\n");
      out.write("                                            <div class=\"grid_8\">\n");
      out.write("                                    <div class=\"grid_2_c3\">\n");
      out.write("                                        <p> \n");
      out.write("                                            <label for=\"noOfGCSEpasses\" class=\"uname\" > No: of GCSE passes</label>\n");
      out.write("                                            <input id=\"noOfGCSEpasses\" name=\"noOfGCSEpasses\" type=\"number\" placeholder=\"5\">\n");
      out.write("                                        </p>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"grid_2_c4\">\n");
      out.write("                                        <p> \n");
      out.write("                                            <label for=\"noOfGCSEpasses\" class=\"uname\" > Vocational</label>\n");
      out.write("                                            <input id=\"noOfGCSEpasses\" name=\"noOfGCSEpasses\" type=\"checkbox\" placeholder=\"5\">\n");
      out.write("                                        </p> \n");
      out.write("                                    </div>\n");
      out.write("                                            </div>\n");
      out.write("\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"grid_6\">\n");
      out.write("                                    <p> \n");
      out.write("                                        <label for=\"courseName\" > Course Name</label>\n");
      out.write("                                        <select name=\"courseName\">\n");
      out.write("                                            <option>Biology with Computing</option>\n");
      out.write("                                            <option>Business Studies</option>\n");
      out.write("                                        </select>\n");
      out.write("                                    </p>\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("                                <div class=\"grid_6\">\n");
      out.write("                                    <p> \n");
      out.write("                                        <label for=\"courseName\" >Main Subject</label>\n");
      out.write("                                        <select name=\"courseName\">\n");
      out.write("                                            <option>Computer Science</option>\n");
      out.write("                                            <option>Mechanical Engineering</option>\n");
      out.write("                                        </select>\n");
      out.write("                                    </p>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"grid_6\">\n");
      out.write("                                    <p> \n");
      out.write("                                        <label for=\"nameOfInstitution\" class=\"uname\" >  Name of Institution</label>\n");
      out.write("                                        <input id=\"nameOfInstitution\" name=\"nameOfInstitution\" type=\"text\" placeholder=\"school, college, university\">\n");
      out.write("                                    </p> \n");
      out.write("                                </div>\n");
      out.write("                                            <div class=\"grid_6\">\n");
      out.write("                                    <p> \n");
      out.write("                                        <label for=\"country\" >Country</label>\n");
      out.write("                                        <select name=\"country\">\n");
      out.write("                                            <option>United Kingdom</option>\n");
      out.write("                                            <option>United States</option>\n");
      out.write("                                        </select>\n");
      out.write("                                    </p>\n");
      out.write("                                </div>\n");
      out.write("                                            <div class=\"grid_16\">\n");
      out.write("                                                \n");
      out.write("                                                <div class=\"grid_8\">    \n");
      out.write("                                                     <p> \n");
      out.write("                                        <label for=\"yearObtained\" class=\"uname\" >  Date Obtained</label>\n");
      out.write("                                        <input id=\"yearObtained\" name=\"yearObtained\" type=\"date\" placeholder=\"\">\n");
      out.write("                                    </p> \n");
      out.write("                                                </div>\n");
      out.write("                                                <div class=\"grid_8\">\n");
      out.write("                                                     <p> \n");
      out.write("                                        <label for=\"nameOfInstitution\" class=\"uname\" > </label>\n");
      out.write("                                        <input id=\"nameOfInstitution\" name=\"nameOfInstitution\" type=\"text\" placeholder=\"e.g. A grade, PASS, 2nd Class Hons, Distinction\">\n");
      out.write("                                    </p> \n");
      out.write("                                                </div>\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"grid_16\">\n");
      out.write("                                                <p> \n");
      out.write("                                        <label for=\"thesesTitle\" class=\"uname\" >  Theses Title</label>\n");
      out.write("                                        <input id=\"thesesTitle\" name=\"thesesTitle\" type=\"text\" placeholder=\" e.g.final year BSc project title\">\n");
      out.write("                                    </p> \n");
      out.write("                                            </div>\n");
      out.write("                                            \n");
      out.write("                                \n");
      out.write("<!--\n");
      out.write("v.\tSpecific professional qualification\n");
      out.write("\n");
      out.write("-->\n");
      out.write("\n");
      out.write("<div class=\"grid_16\">\n");
      out.write("    <h3>Professional Qualifications</h3>\n");
      out.write("    <div class=\"grid_8\">\n");
      out.write("      <p> \n");
      out.write("                                        <label for=\"qualificationName\" class=\"uname\"> Qualification Name</label>\n");
      out.write("                                        <input id=\"qualificationName\" name=\"qualificationName\" type=\"text\" placeholder=\"\">\n");
      out.write("                                    </p> \n");
      out.write("    </div>\n");
      out.write("     <div class=\"grid_8\">\n");
      out.write("         <div class=\"grid_6\">\n");
      out.write("              <p> \n");
      out.write("                                        <label for=\"awardingBody\" class=\"uname\"> Awarding Body</label>\n");
      out.write("                                        <input id=\"awardingBody\" name=\"awardingBody\" type=\"text\" placeholder=\"e.g. institute of chartered surveyors\">\n");
      out.write("                                    </p> \n");
      out.write("                                    <p> \n");
      out.write("                                        <label for=\"classification\" class=\"uname\">Classification</label>\n");
      out.write("                                        <input id=\"classification\" name=\"classification\" type=\"text\" placeholder=\"e.g. the legal practice certificate: distinctinction, commendation, pass\">\n");
      out.write("                                    </p> \n");
      out.write("         </div>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("<!--\n");
      out.write("\n");
      out.write("vi.\tSpecific skill\n");
      out.write("vii.\tSpecific experience \n");
      out.write("     \n");
      out.write("-->\n");
      out.write("\n");
      out.write("\n");
      out.write("                                <div class=\"grid_16\">\n");
      out.write("                                    <div class=\"grid_8 competences\">\n");
      out.write("\n");
      out.write("                                        <p class=\"change_link\">  \n");
      out.write("                                            Clear Search\n");
      out.write("                                            <a href=\"searchCV.jsp\" class=\"to_register\"> Reset </a>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"grid_8 apropos\"><p class=\"signin button\"> \n");
      out.write("                                            <input name=\"AddUser\" type=\"submit\" value=\"Search\"/> \n");
      out.write("                                    </div>\n");
      out.write("\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                            </div><!--grid 16 Bottom Grid ends -->\n");
      out.write("                        </section><!--Contain design related to two grids-->\n");
      out.write("                    </div></div></div>\n");
      out.write("        </section>\n");
      out.write("    </body>\n");
      out.write("    ");
      out.write("<div id=\"footer\">\n");
      out.write("    Copyright &copy; RecruitMe | <a href=\"home.jsp\">Home</a> | <a href=\"login.jsp\">Signin</a> | <a href=\"registerUser.jsp\">Signup</a>\n");
      out.write("    </div>");
      out.write("\n");
      out.write("</html>\n");
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
