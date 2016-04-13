package org.apache.jsp.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class addMovie_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<title>Registration Form</title>\n");
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
      out.write(".Nav-item {\n");
      out.write("  background: black;\n");
      out.write("  display: block;\n");
      out.write("  float: left;\n");
      out.write("  margin: 0;\n");
      out.write("  padding: 0;\n");
      out.write("  width: 20%;\n");
      out.write("  text-align: center;\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write(".Nav-item a {\n");
      out.write("  color: white;\n");
      out.write("  display: block;\n");
      out.write("  padding-top: 20px;\n");
      out.write("  padding-bottom: 20px;\n");
      out.write("  text-decoration: none;\n");
      out.write("}\n");
      out.write(".Nav-item a:hover {\n");
      out.write("  color: grey;\n");
      out.write("}\n");
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
      out.write("textarea{\n");
      out.write("    \n");
      out.write("    padding:5px;\n");
      out.write("    border-radius:7px;\n");
      out.write("}\n");
      out.write("#realaseDate{\n");
      out.write("    width:180px;\n");
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
      out.write("     ");
 if( session.getAttribute("user")==null){
       response.sendRedirect("../index.jsp");
}else{
  // User IS logged in.

      out.write("\n");
      out.write("     ");
 
            String rMessage=request.getParameter("message");
            String actn,logout,home;
            if (rMessage==null){
            rMessage="";
                    actn="../AddMovieController";
                    logout="../logout.jsp";
                    home="home.jsp";
                       }else{
                           actn="";
                           logout="logout.jsp";
                           home="admin/home.jsp";
                                                     }
       
      out.write("\n");
      out.write("  <ul class=\"PrimaryNav \">\n");
      out.write("   \n");
      out.write("   <li class=\"Nav-item\"><a href=\"");
      out.print(home);
      out.write("\">Home</a></li>\n");
      out.write("    <li class=\"Nav-item-right\"><a href=\"");
      out.print(logout);
      out.write("\">Logout</a></li>\n");
      out.write("   \n");
      out.write("  </ul>\n");
      out.write("    <br>\n");
      out.write("    <br>\n");
      out.write("    <br>\n");
      out.write("    <h2>Welcome to Movie Store</h2>\n");
      out.write(" <h2>\n");
      out.write("           \n");
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
      out.write("    <td><b>Title</b></td>\n");
      out.write("<td><input type=\"text\" name=\"title\"  id=\"title\" required   />\n");
      out.write("\n");
      out.write("</td>\n");
      out.write("</tr>\n");
      out.write("\n");
      out.write(" \n");
      out.write("<tr>\n");
      out.write("    <td><b>Duration</b></td>\n");
      out.write("<td><input type=\"text\" name=\"duration\" maxlength=\"30\" id=\"duration\" required />\n");
      out.write("\n");
      out.write("</td>\n");
      out.write("</tr>\n");
      out.write(" \n");
      out.write("<tr>\n");
      out.write("    <td><b>Release Date</b></td>\n");
      out.write("<td><input type=\"date\" name=\"realaseDate\" id=\"realaseDate\" required/></td>\n");
      out.write("</tr>\n");
      out.write("\n");
      out.write("\n");
      out.write("<tr>\n");
      out.write("    <td><b>Price</b></td>\n");
      out.write("<td><input type=\"number\" name=\"price\" maxlength=\"30\" id=\"price\" required />\n");
      out.write("\n");
      out.write("</td>\n");
      out.write("</tr>\n");
      out.write("<tr>\n");
      out.write("<td>Number Of Movies</td>\n");
      out.write("<td><input type=\"number\" name=\"numberOfMovies\" min=\"0\"  required />\n");
      out.write("\n");
      out.write("</td>\n");
      out.write("</tr>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<tr>\n");
      out.write("    <td><b>Description</b></td>\n");
      out.write("<td><textarea  name=\"description\" rows=\"5\" cols=\"23\" required ></textarea>\n");
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
      out.write(" ");
}
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
