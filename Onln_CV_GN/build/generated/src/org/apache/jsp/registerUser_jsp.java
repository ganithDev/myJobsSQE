package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.cv_gn.model.JobTitle;
import com.cv_gn.model.EmploymentLevel;
import com.cv_gn.model.PersonContactMode;
import com.cv_gn.model.PersonTitle;
import com.cv_gn.dao.ManagerDAO;
import java.util.List;
import org.hibernate.Criteria;
import com.cv_gn.model.PersonStatus;
import org.hibernate.Session;
import com.cv_gn.model.OnlnCVHiberUtil;

public final class registerUser_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <title>Registration Form | RecruitMe</title>\r\n");
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
      out.write("        \r\n");
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
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("\r\n");
      out.write("        <!-- Corps -->\r\n");
      out.write("        <form method=\"get\" action=\"UserRegistrationController?actionType=AddUser\" novalidate id=\"register-form\" autocomplete=\"on\">\r\n");
      out.write("            <section>\t\t\t\t\r\n");
      out.write("                <div id=\"container_demo\"><!--Contain design related to form-->\r\n");
      out.write("\r\n");
      out.write("                    <div id=\"wrapper\"><!--Contain design related to form-->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                        <div id=\"register\" class=\"animate form\"> <!--Contain design related to form-->\r\n");
      out.write("                            <section role=\"main\" class=\"container_16 clearfix\"><!--Contain design related to two grids-->\r\n");
      out.write("                                <h1> User Registration</h1> \r\n");
      out.write("                                <div class=\"grid_16\">\r\n");
      out.write("                                    <h3>Personal Information</h3>\r\n");
      out.write("                                    <!-- Left grid -->\r\n");
      out.write("                                    <div class=\"grid_8 apropos\">\r\n");
      out.write("\r\n");
      out.write("                                        <p> \r\n");
      out.write("\r\n");
      out.write("                                            <label for=\"firstName\" class=\"uname\" data-icon=\"u\"> First Name</label>\r\n");
      out.write("                                           <select name=\"title\" required type=\"text\" placeholder=\"\">\r\n");
      out.write("                                                ");

                                                    List<PersonTitle> ptsList = ManagerDAO.searchAll(new PersonTitle());
                                                    for (PersonTitle pt : ptsList) {
                                                
      out.write("\r\n");
      out.write("                                                <option value=\"");
      out.print( pt.getIdpersonTitle());
      out.write('"');
      out.write('>');
      out.print( pt.getTitle());
      out.write("</option>\r\n");
      out.write("                                                ");
}
      out.write("\r\n");
      out.write("\r\n");
      out.write("                                            </select> <input id=\"firstname\" name=\"firstName\" required type=\"text\" placeholder=\"John\">\r\n");
      out.write("                                        </p>\r\n");
      out.write("                                        <p> \r\n");
      out.write("                                            <label for=\"surName\" class=\"uname\" data-icon=\"s\"> Sur Name</label>\r\n");
      out.write("                                            <input id=\"surname\" name=\"surName\" required type=\"text\" placeholder=\"Smith\">\r\n");
      out.write("                                        </p>\r\n");
      out.write("                                        <p> \r\n");
      out.write("                                            <label for=\"addressLine1\" class=\"uname\" data-icon=\"a2\"> Address Line 1</label>\r\n");
      out.write("                                            <input id=\"address1\" name=\"addressLine1\" required type=\"text\" placeholder=\"103, Royal Residence\">\r\n");
      out.write("                                        </p>\r\n");
      out.write("                                        <p> \r\n");
      out.write("                                            <label for=\"town\" class=\"uname\" data-icon=\"t\">   Town</label>\r\n");
      out.write("                                            <input id=\"town\" name=\"town\" required type=\"text\" placeholder=\"Smith\">\r\n");
      out.write("                                        </p>\r\n");
      out.write("                                        <p> \r\n");
      out.write("                                            <label for=\"secondEmail\" class=\"uname\" data-icon=\"e\">  Secondary Email</label>\r\n");
      out.write("                                            <input id=\"secondemail\" name=\"secondEmail\" required type=\"email\" >\r\n");
      out.write("                                        </p>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                                        <p> \r\n");
      out.write("                                            <label for=\"mobile\" class=\"uname\" data-icon=\"t\">   Mobile</label>\r\n");
      out.write("                                            <input id=\"mobile\" name=\"mobile\" required type=\"tel\" placeholder=\"0718789987\">\r\n");
      out.write("                                        </p>\r\n");
      out.write("                                        <p> \r\n");
      out.write("                                            <label for=\"landLine\" class=\"uname\" data-icon=\"t\">   Land Line</label>\r\n");
      out.write("                                            <input id=\"mobile\" name=\"landLine\" type=\"tel\" placeholder=\"0114785412\">\r\n");
      out.write("                                        </p>\r\n");
      out.write("\r\n");
      out.write("                                        <p> \r\n");
      out.write("                                            <label for=\"preferredContactMode\" class=\"uname\" >  Select Preferred Contact Mode</label>\r\n");
      out.write("\r\n");
      out.write("                                            <select name=\"preferredContactMode\">\r\n");
      out.write("                                                ");

                                                    List<PersonContactMode> listPcm = ManagerDAO.searchAll(new PersonContactMode());
                                                    for (PersonContactMode pcm : listPcm) {
                                                
      out.write("\r\n");
      out.write("                                                <option value=\"");
      out.print(pcm.getIdcontactPreference());
      out.write('"');
      out.write('>');
      out.print(pcm.getContactMode());
      out.write("</option>\r\n");
      out.write("                                                ");
}
      out.write("\r\n");
      out.write("\r\n");
      out.write("                                            </select>\r\n");
      out.write("\r\n");
      out.write("                                        </p>\r\n");
      out.write("                                        <p> \r\n");
      out.write("                                            <label for=\"employmentLevel\" class=\"uname\" > Select your current Employment Level</label>\r\n");
      out.write("                                            <select name=\"employmentLevel\">\r\n");
      out.write("                                                ");

                                                    List<EmploymentLevel> listEmp = ManagerDAO.searchAll(new EmploymentLevel());
                                                    for (EmploymentLevel el : listEmp) {
                                                
      out.write("\r\n");
      out.write("                                                <option value=\"");
      out.print(el.getIdLevelOfEmployment());
      out.write('"');
      out.write('>');
      out.print(el.getEmploymentLevel());
      out.write("</option>\r\n");
      out.write("                                                ");
}
      out.write("\r\n");
      out.write("\r\n");
      out.write("                                            </select>\r\n");
      out.write("                                        </p>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                                    </div><!-- Left grid -->\r\n");
      out.write("\r\n");
      out.write("                                    <!-- Right Grid -->\r\n");
      out.write("                                    <div class=\"grid_8 competences\">\r\n");
      out.write("                                        <p> \r\n");
      out.write("                                            <label for=\"secondName\" class=\"uname\" data-icon=\"s\">  Second Name</label>\r\n");
      out.write("                                            <input id=\"secondname\" name=\"secondName\" type=\"text\" placeholder=\"Steven\">\r\n");
      out.write("                                        </p>\r\n");
      out.write("                                        <p> \r\n");
      out.write("                                            <label for=\"dob\" class=\"uname\" data-icon=\"b\">  Date of Birth</label>\r\n");
      out.write("                                            <input id=\"dob\" name=\"dob\" required type=\"date\" placeholder=\"\">\r\n");
      out.write("                                        </p>\r\n");
      out.write("                                        <p> \r\n");
      out.write("                                            <label for=\"addressLine2\" class=\"uname\" data-icon=\"a2\">     Address Line 2</label>\r\n");
      out.write("                                            <input id=\"address2\" name=\"addressLine2\" type=\"text\" placeholder=\"\">\r\n");
      out.write("                                        </p>\r\n");
      out.write("                                        <p> \r\n");
      out.write("                                            <label for=\"usernamesignup\" class=\"uname\" data-icon=\"p\">   Post Code</label>\r\n");
      out.write("                                            <input id=\"postcode\" name=\"postcode\" required type=\"text\" placeholder=\"\">\r\n");
      out.write("                                        </p>\r\n");
      out.write("                                        <p> \r\n");
      out.write("                                                <label for=\"postcodeStart\">Postcode Start</label>\r\n");
      out.write("                                                <input id=\"postcodeStart\" name=\"postcodeStart\" required type=\"text\">\r\n");
      out.write("                                            </p>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                                        <p> \r\n");
      out.write("                                            <label for=\"personalUrl\" class=\"uname\" data-icon=\"u\">  Personal URL</label>\r\n");
      out.write("                                            <input id=\"personalUrl\" name=\"personalurl\" type=\"url\" placeholder=\"\">\r\n");
      out.write("                                        </p>\r\n");
      out.write("                                         \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                                        <p> \r\n");
      out.write("                                            <label for=\"photo\" class=\"uname\" data-icon=\"p\">  Photo</label>\r\n");
      out.write("                                            <input id=\"photo\" name=\"photo\" type=\"file\" placeholder=\"\">\r\n");
      out.write("                                        </p>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                                        <p> \r\n");
      out.write("                                            <label for=\"studentStatus\" class=\"uname\" >   Select your Status</label>\r\n");
      out.write("                                            <select name=\"studentStatus\">\r\n");
      out.write("                                                ");

                                                    List<PersonStatus> listPs = ManagerDAO.searchAll(new PersonStatus());
                                                    for (PersonStatus personStatus : listPs) {
                                                
      out.write("\r\n");
      out.write("                                                <option value=\"");
      out.print( personStatus.getIdpersonStatus());
      out.write('"');
      out.write('>');
      out.print( personStatus.getPersonStatus());
      out.write("</option>\r\n");
      out.write("                                                ");
}
      out.write("\r\n");
      out.write("\r\n");
      out.write("                                            </select>\r\n");
      out.write("                                        </p>\r\n");
      out.write("                                        <p> \r\n");
      out.write("                                            <label for=\"jobPrefered\" class=\"uname\" >  Preferred Job Title</label>\r\n");
      out.write("                                            <select name=\"jobPrefered\">\r\n");
      out.write("                                                ");

                                                    List<JobTitle> jobTitles = ManagerDAO.searchAll(new JobTitle());
                                                    for (JobTitle jobTitle : jobTitles) {
                                                
      out.write("\r\n");
      out.write("                                                <option value=\"");
      out.print( jobTitle.getIdJobTitle());
      out.write('"');
      out.write('>');
      out.print( jobTitle.getJobTitle());
      out.write("</option>\r\n");
      out.write("                                                ");
}
      out.write("\r\n");
      out.write("\r\n");
      out.write("                                            </select>\r\n");
      out.write("                                        </p>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                                        \r\n");
      out.write("\r\n");
      out.write("                                    </div>  <!-- Right Grid ends -->\r\n");
      out.write("                                    <div class=\"grid_16 experiences\">\r\n");
      out.write("                                     <h3>Basic Educational Information</h3>\r\n");
      out.write("<!--align four divs inline-->\r\n");
      out.write("                                <div class=\"container_tbl\">\r\n");
      out.write("\r\n");
      out.write("                                    <div class=\"grid_2_c1\">\r\n");
      out.write("                                        <p> \r\n");
      out.write("                                            <label for=\"NoofGCSESpasses\" > No of GCSEs Passes</label>\r\n");
      out.write("                                            <input id=\"NoofGCSESpasses\" name=\"NoofGCSESpasses\" required type=\"number\" placeholder=\"5\">\r\n");
      out.write("                                        </p>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"grid_2_c2\">\r\n");
      out.write("                                        <p> \r\n");
      out.write("                                            <label for=\"GCSEEnglishGrade\">GCSE English Grade </label>\r\n");
      out.write("                                            <input id=\"GCSEEnglishGrade\" name=\"GCSEEnglishGrade\" type=\"text\" placeholder=\"A*\">\r\n");
      out.write("                                        </p>\r\n");
      out.write("                                    </div>\r\n");
      out.write("\r\n");
      out.write("                                    <div class=\"grid_2_c3\">\r\n");
      out.write("                                        <p> \r\n");
      out.write("                                            <label for=\"GCSEMathsGrade\" >GCSE Maths Grade </label>\r\n");
      out.write("                                            <input id=\"GCSEMathsGrade\" name=\"GCSEMathsGrade\" type=\"text\" placeholder=\"A\">\r\n");
      out.write("                                        </p>\r\n");
      out.write("                                    </div>\r\n");
      out.write("\r\n");
      out.write("                                    <div class=\"grid_2_c4\">\r\n");
      out.write("                                        <p> \r\n");
      out.write("                                            <label for=\"fiveOrMoreGCSES\" >  Five or More GCSEs passes</label>\r\n");
      out.write("                                            <input id=\"fiveOrMoreGCSES\" name=\"fiveOrMoreGCSES\" required type=\"checkbox\" placeholder=\"\">\r\n");
      out.write("                                        </p>\r\n");
      out.write("                                    </div>\r\n");
      out.write("\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"container_tbl\">\r\n");
      out.write("                                    <div class=\"grid_2_c1\">\r\n");
      out.write("                                        <p>    \r\n");
      out.write("\r\n");
      out.write("                                            <label for=\"noOfAlevels\" > No Of A-levels</label>\r\n");
      out.write("                                            <input id=\"noOfAlevels\" name=\"noOfAlevels\" type=\"number\" placeholder=\"1\">\r\n");
      out.write("                                        </p>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"grid_2_c2\">\r\n");
      out.write("                                        <p> \r\n");
      out.write("                                            <label for=\"ucasPoints\">UCAS Points </label>\r\n");
      out.write("                                            <input id=\"ucasPoints\" name=\"ucasPoints\" type=\"number\" placeholder=\"145\">\r\n");
      out.write("                                        </p>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                    </div><!--basic edu ends-->\r\n");
      out.write("                                         <div class=\"grid_16\">\r\n");
      out.write("                                    <h3>Other Information</h3>\r\n");
      out.write("                                    <p> \r\n");
      out.write("                                        <label for=\"authorityToWorkStatement\">Work Statement </label>\r\n");
      out.write("                                        <input id=\"authorityToWorkStatement\" name=\"authorityToWorkStatement\" type=\"text\" placeholder=\"List restrictions on work, e.g. max 20 hours per week\">\r\n");
      out.write("                                    </p>\r\n");
      out.write("                                    <div class=\"container_tbl\">\r\n");
      out.write("                                        <div class=\"grid_2_c1\">\r\n");
      out.write("                                            <p> \r\n");
      out.write("                                                <label for=\"legallyBond\">Legally Bond</label>\r\n");
      out.write("                                                <input id=\"legallyBond\" name=\"legallyBond\" type=\"checkbox\">\r\n");
      out.write("                                            </p>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        <div class=\"grid_2_c2\">\r\n");
      out.write("                                           \r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        <div class=\"grid_2_c4\">\r\n");
      out.write("                                            <p> \r\n");
      out.write("                                                <label for=\"penaltyPoints\">Penalty Points</label>\r\n");
      out.write("                                                <input id=\"penaltyPoints\" name=\"penaltyPoints\" type=\"number\">\r\n");
      out.write("                                            </p>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("\r\n");
      out.write("                                    \r\n");
      out.write("\r\n");
      out.write("                                </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("\r\n");
      out.write("                                <!-- Login Details -->\r\n");
      out.write("                                <div class=\"grid_16 experiences\"><!-- Bottom Grid  -->\r\n");
      out.write("                                    <h3>Signin Details</h3>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                                    <p> \r\n");
      out.write("                                        <label for=\"userEmail\" class=\"youmail\" data-icon=\"e\">Username(Primary Email)</label>\r\n");
      out.write("                                        <input id=\"userEmail\" name=\"userEmail\" required type=\"email\" placeholder=\"mysupermail@mail.com\"> \r\n");
      out.write("                                    </p>\r\n");
      out.write("                                    <p> \r\n");
      out.write("                                        <label for=\"password\" class=\"youpasswd\" data-icon=\"p\">Your password </label>\r\n");
      out.write("                                        <input id=\"password\" name=\"password\" required type=\"password\" placeholder=\"eg. X8df!90EO\">\r\n");
      out.write("                                    </p>\r\n");
      out.write("                                    <p> \r\n");
      out.write("                                        <label for=\"password\" class=\"youpasswd\" data-icon=\"p\">Please confirm your password </label>\r\n");
      out.write("                                        <input id=\"confirmpassword\" name=\"confirmpassword\" type=\"password\" placeholder=\"eg. X8df!90EO\">\r\n");
      out.write("                                    </p>\r\n");
      out.write("                                    <div class=\"grid_16\">\r\n");
      out.write("                                    <div class=\"grid_8 apropos\"><p class=\"signin button\"> \r\n");
      out.write("                                        <input name=\"AddUser\" type=\"submit\" value=\"Sign up\"/> </div>\r\n");
      out.write("                                        \r\n");
      out.write("                                        <div class=\"grid_8 competences\">\r\n");
      out.write("                                             <p class=\"change_link\">  \r\n");
      out.write("                                        Already a member ?\r\n");
      out.write("                                        <a href=\"login.jsp\" class=\"to_register\"> Go and log in </a>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                       \r\n");
      out.write("                                    </div>\r\n");
      out.write("                                   \r\n");
      out.write("                                    \r\n");
      out.write("                                    \r\n");
      out.write("                                </div><!--grid 16 Bottom Grid ends -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                            </section><!--Container 16-->\r\n");
      out.write("\r\n");
      out.write("                        </div><!--register-->\r\n");
      out.write("\r\n");
      out.write("                    </div><!--wrapper-->\r\n");
      out.write("                </div>  <!--container_demo-->\r\n");
      out.write("            </section>\r\n");
      out.write("\r\n");
      out.write("        </form>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        ");

            String msg = "";
            if (msg.equals("")) {

            } else {
        
      out.write("\r\n");
      out.write("        <div>");
      out.print(msg);
      out.write("</div>\r\n");
      out.write("        ");

            }
        
      out.write("\r\n");
      out.write("\r\n");
      out.write("   \r\n");
      out.write("        ");
      out.write("<div id=\"footer\">\n");
      out.write("    Copyright &copy; RecruitMe | <a href=\"home.jsp\">Home</a> | <a href=\"login.jsp\">Signin</a> | <a href=\"registerUser.jsp\">Signup</a>\n");
      out.write("    </div>");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
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
