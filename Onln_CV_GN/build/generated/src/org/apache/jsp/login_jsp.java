package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>Sigin | RecruitMe</title>\r\n");
      out.write("        ");
      out.write(" <link rel=\"stylesheet\" type=\"text/css\" href=\"CSS_styl/Top_Foot.css\"><!--Used for form design-->\n");
      out.write("        \n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"CSS_styl/formBody.css\"><!--Used for form design-->\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"CSS_styl/gridLayouts.css\"><!--Used for grid layouts-->\n");
      out.write("\n");
      out.write("        <!-- Load jQuery and the validate plugin -->\n");
      out.write("        <script src=\"/Onln_CV_GN/jquerylbs/jquery-19.1.js\"></script>\n");
      out.write("        <script src=\"/Onln_CV_GN/jquerylbs/jquery.validate.min.js\"></script>\n");
      out.write("        <!-- jQuery Form Validation code -->\n");
      out.write("       ");
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
      out.write("         <!-- jQuery Form Validation code -->\r\n");
      out.write("        <script>\r\n");
      out.write("\r\n");
      out.write("            // When the browser is ready...\r\n");
      out.write("            $(function () {\r\n");
      out.write("\r\n");
      out.write("                // Setup form validation on the #register-form element\r\n");
      out.write("                $(\"#login-form\").validate({\r\n");
      out.write("                    // Specify the validation rules\r\n");
      out.write("                    rules: {\r\n");
      out.write("                        \r\n");
      out.write("                        userEmail: {required: true, email: true},\r\n");
      out.write("                        password: {required: true, minlength: 6},\r\n");
      out.write("                        agree: \"required\"\r\n");
      out.write("                    },\r\n");
      out.write("                    // Specify the validation error messages\r\n");
      out.write("                    messages: {\r\n");
      out.write("                        \r\n");
      out.write("                        userEmail: {required: \"Enter valid email for your username\"},\r\n");
      out.write("                        password: {required: \"Field is required \"},\r\n");
      out.write("                        agree: \"Please accept our policy\"\r\n");
      out.write("\r\n");
      out.write("                    },\r\n");
      out.write("                    submitHandler: function (form) {\r\n");
      out.write("                        form.submit();\r\n");
      out.write("                    }\r\n");
      out.write("                });\r\n");
      out.write("\r\n");
      out.write("            });\r\n");
      out.write("\r\n");
      out.write("        </script>\r\n");
      out.write("        <!-- End jQuery Form Validation code -->\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        \r\n");
      out.write("         <section>\t\t\t\t\r\n");
      out.write("                <div id=\"container_demo\">\r\n");
      out.write("               \r\n");
      out.write("                    <div id=\"wrapper\">\r\n");
      out.write("                       \r\n");
      out.write("\r\n");
      out.write("                        <div id=\"register\" class=\"animate form\">\r\n");
      out.write("                            <form method=\"POST\" action=\"UserLogin?actionType=LoginUser\" novalidate id=\"login-form\">\r\n");
      out.write("                                <h1> Signin </h1>\r\n");
      out.write("                               \r\n");
      out.write("                                <p> \r\n");
      out.write("                                    <label for=\"userEmail\" class=\"youmail\"> Username/ Primary Email</label>\r\n");
      out.write("                                    <input id=\"userEmail\" name=\"userEmail\" required type=\"email\" placeholder=\"mysupermail@mail.com\"> \r\n");
      out.write("                                </p>\r\n");
      out.write("                                <p> \r\n");
      out.write("                                    <label for=\"passwordsignup\" class=\"youpasswd\" >Your password </label>\r\n");
      out.write("                                    <input id=\"password\" name=\"passwordsignup\" required type=\"password\" placeholder=\"eg. X8df!90EO\">\r\n");
      out.write("                                </p>\r\n");
      out.write("                                <section role=\"main\" class=\"container_16 clearfix\"><!--Contain design related to two grids-->\r\n");
      out.write("                                <div class=\"grid_16\">\r\n");
      out.write("                                    <div class=\"grid_8\"><p class=\"signin button\"> \r\n");
      out.write("                                        <input name=\"LoginUser\" type=\"submit\" value=\"Sign in\"/> </div>\r\n");
      out.write("                                        \r\n");
      out.write("                                        <div class=\"grid_8\">\r\n");
      out.write("                                             <p class=\"change_link\">  \r\n");
      out.write("                                       New to RecruitMe ?\r\n");
      out.write("                                       <a href=\"login.jsp\" class=\"to_register\"> Create an Account </a></p>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                       \r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </section>\r\n");
      out.write("                                   \r\n");
      out.write("                                        \r\n");
      out.write("                               \r\n");
      out.write("                              \r\n");
      out.write("                            </form>\r\n");
      out.write("                        </div>\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("                    </div>\r\n");
      out.write("                    \r\n");
      out.write("                </div>  \r\n");
      out.write("    </section>\r\n");
      out.write("                \t\t\t\t\r\n");
      out.write("                \r\n");
      out.write("    </body>\r\n");
      out.write("    ");
      out.write("<div id=\"footer\">\n");
      out.write("    Copyright &copy; RecruitMe | <a href=\"home.jsp\">Home</a> | <a href=\"login.jsp\">Signin</a> | <a href=\"registerUser.jsp\">Signup</a>\n");
      out.write("    </div>");
      out.write("\r\n");
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
