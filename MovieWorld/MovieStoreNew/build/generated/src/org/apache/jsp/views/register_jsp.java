package org.apache.jsp.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class register_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<title>Movie Store</title>\n");
      out.write("<style type=\"text/css\">\n");
      out.write("    #mybtn{\n");
      out.write("     font-weight: bold; \n");
      out.write("   \n");
      out.write("    padding:7px;border-radius:7px; background-color: #3333ff;border:none;color:white;\n");
      out.write("}\n");
      out.write(" .PrimaryNav {\n");
      out.write("  list-style: none;\n");
      out.write("  background: black;\n");
      out.write("  display: block;\n");
      out.write("  float: left;\n");
      out.write("  margin: 0;\n");
      out.write("  padding: 0px;\n");
      out.write("  width: 100%;\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write(".Nav-item-right {\n");
      out.write("  background: black;\n");
      out.write("  display: block;\n");
      out.write("  float: right;\n");
      out.write("  margin: 0;\n");
      out.write("  padding: 0;\n");
      out.write("  width: 20%;\n");
      out.write("  text-align: center;\n");
      out.write("  \n");
      out.write("}\n");
      out.write(".Nav-item-right a {\n");
      out.write("  color: white;\n");
      out.write("  display: block;\n");
      out.write("  padding-top: 20px;\n");
      out.write("  padding-bottom: 20px;\n");
      out.write("  text-decoration: none;\n");
      out.write("  \n");
      out.write("}\n");
      out.write(".Nav-item-right a:hover {\n");
      out.write("  color: grey;\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("body{\n");
      out.write("margin:0px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".Nav-item a {\n");
      out.write("  color: white;\n");
      out.write("  display: block;\n");
      out.write("  padding-top: 20px;\n");
      out.write("  padding-bottom: 20px;\n");
      out.write("  text-decoration: none;\n");
      out.write("   padding-left: 20px;\n");
      out.write("}\n");
      out.write(".Nav-item a:hover {\n");
      out.write("  color: grey;\n");
      out.write("}\n");
      out.write("\n");
      out.write("h2,h3{font-family: Calibri; font-size: 22pt; font-style: normal; font-weight: bold; \n");
      out.write("text-align: center; }\n");
      out.write("table{font-family: Calibri; font-size: 11pt; font-style: normal;width: 50%;\n");
      out.write("background-color: #f0f4f4; border-collapse: collapse; font-weight: bold;border-radius:10px;}\n");
      out.write("table.inner{border: 0px}\n");
      out.write("h2{\n");
      out.write("    text-decoration:none;\n");
      out.write("}\n");
      out.write("input{\n");
      out.write("    \n");
      out.write("    padding:5px;\n");
      out.write("    border-radius:7px;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("<script>\n");
      out.write("  \n");
      out.write("                \n");
      out.write("                function matchPassword()\n");
      out.write("                {\n");
      out.write("                    var password=document.getElementById(\"password\").value;\n");
      out.write("                    var confirmPassword=document.getElementById(\"confirmPassword\").value;\n");
      out.write("                    if(password!=confirmPassword)\n");
      out.write("                        {\n");
      out.write("                            alert(\"Password Does'nt Match\");\n");
      out.write("                            document.getElementById(\"confirmPassword\").value=\"\";\n");
      out.write("                        }\n");
      out.write("                    \n");
      out.write("                }\n");
      out.write("\t\t\t\n");
      out.write("    </script>\n");
      out.write("</head>\n");
      out.write(" \n");
      out.write("<body>\n");
      out.write("      ");
 
            String rMessage=request.getParameter("message");
            String actn,login;
            if (rMessage==null){
            rMessage="";
            login="login.jsp";
                    actn="../RegisterController";
                       }else{
                           actn="";
                           login="views/login.jsp";
                                                     }
            
      out.write("\n");
      out.write("  <ul class=\"PrimaryNav \">\n");
      out.write("   \n");
      out.write("   \n");
      out.write("    <li class=\" Nav-item-right\"><a href=\"");
      out.print(login);
      out.write("\">SignIn</a></li>\n");
      out.write("   \n");
      out.write("  </ul>\n");
      out.write("    <br>\n");
      out.write("    <br>\n");
      out.write("    <br>\n");
      out.write("    <h2>Welcome to Movie Store</h2>\n");
      out.write(" <h2>\n");
      out.write("            ");
 
         
                out.println(rMessage); 
 
            
      out.write("\n");
      out.write("          </h2>\n");
      out.write("          <form action=\"");
      out.print(actn);
      out.write("\" method=\"post\">\n");
      out.write(" \n");
      out.write("<table align=\"center\" cellpadding = \"20\">\n");
      out.write("<tr>\n");
      out.write("<td>First Name</td>\n");
      out.write("<td><input type=\"text\" name=\"firstName\"  id=\"firstName\" required   pattern=\"[a-zA-Z]{1,}\"  title=\"Digits are not allowed\"/>\n");
      out.write("\n");
      out.write("</td>\n");
      out.write("</tr>\n");
      out.write("\n");
      out.write(" \n");
      out.write("<tr>\n");
      out.write("<td>Last Name</td>\n");
      out.write("<td><input type=\"text\" name=\"lastName\" maxlength=\"30\" id=\"lastName\" required pattern=\"[a-zA-Z]{1,}\" title=\"Digits are not allowed\"/>\n");
      out.write("\n");
      out.write("</td>\n");
      out.write("</tr>\n");
      out.write(" \n");
      out.write("<tr>\n");
      out.write("<td>Email</td>\n");
      out.write("<td><input type=\"email\" name=\"email\"  required/></td>\n");
      out.write("</tr>\n");
      out.write("\n");
      out.write("<tr>\n");
      out.write("<td>User Name</td>\n");
      out.write("<td><input type=\"text\" name=\"userName\" maxlength=\"30\" id=\"userName\" required />\n");
      out.write("\n");
      out.write("</td>\n");
      out.write("</tr>\n");
      out.write("<tr>\n");
      out.write("<td>Phone</td>\n");
      out.write("<td><input type=\"text\" name=\"phone\" min=\"0\" id=\"phone\" required pattern=\"[0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9]\" title=\"Minimum 10 digits required\"/>\n");
      out.write("\n");
      out.write("</td>\n");
      out.write("</tr>\n");
      out.write("<tr>\n");
      out.write("<td>Password</td>\n");
      out.write("<td><input type=\"password\" name=\"password\" min=\"5\" title=\"Minimum 5 charcters required\" id=\"password\" required /></td>\n");
      out.write("</tr>\n");
      out.write("<tr>\n");
      out.write("<td>Confirm Password</td>\n");
      out.write("<td><input type=\"password\" name=\"confirmPassword\" maxlength=\"100\" id=\"confirmPassword\"  onblur=\"matchPassword()\" required/></td>\n");
      out.write("</tr>\n");
      out.write("<tr>\n");
      out.write("<td>Street</td>\n");
      out.write("<td><input type=\"text\" name=\"streetName\" maxlength=\"30\" id=\"streetName\" required />\n");
      out.write("\n");
      out.write("</td>\n");
      out.write("</tr>\n");
      out.write("<tr>\n");
      out.write("<td>Post Code</td>\n");
      out.write("<td><input type=\"text\" name=\"postCode\" pattern=\"[0-9][0-9][0-9][0-9][0-9]\" id=\"postCode\" required title=\"Minimum 5 digits required\"/>\n");
      out.write("\n");
      out.write("</td>\n");
      out.write("</tr>\n");
      out.write("<tr>\n");
      out.write("<td>City</td>\n");
      out.write("<td><input type=\"text\" name=\"city\" maxlength=\"30\" id=\"city\" required />\n");
      out.write("\n");
      out.write("</td>\n");
      out.write("</tr>\n");
      out.write("<tr>\n");
      out.write("<td>Country</td>\n");
      out.write("<td><input type=\"text\" name=\"country\" maxlength=\"30\" id=\"country\" required />\n");
      out.write("\n");
      out.write("</td>\n");
      out.write("</tr>\n");
      out.write("<tr>\n");
      out.write("<td colspan=\"2\" align=\"center\">\n");
      out.write("    <input type=\"submit\" id=\"mybtn\" value=\"Submit\">&nbsp;&nbsp;\n");
      out.write("<input type=\"reset\" id=\"mybtn\" value=\" Reset  \">\n");
      out.write("</td>\n");
      out.write("</tr>\n");
      out.write("</table>\n");
      out.write(" \n");
      out.write("</form>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>");
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
