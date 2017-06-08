package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class registration_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public Object getDependants() {
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
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        \n");
      out.write("<script>\n");
      out.write("\n");
      out.write(" \tfunction checkFormValidator()\n");
      out.write("        {\n");
      out.write("            var P1=document.getElementById(\"Password1\").value;\n");
      out.write("                var P2=document.getElementById(\"Password2\").value;\n");
      out.write("                document.write(P1);\n");
      out.write("                document.write(P2);\n");
      out.write("                \n");
      out.write("                    if(P1==P2)\n");
      out.write(" \t\t{\n");
      out.write("                    alert(\" Password Mismatch \");\n");
      out.write(" \t\t\tdocument.adminloginform.password.focus();\n");
      out.write(" \t\t\treturn false;\n");
      out.write(" \t\t\t\n");
      out.write(" \t\t}\n");
      out.write("\n");
      out.write(" \t\telse \n");
      out.write(" \t\t{\n");
      out.write(" \t\t\talert(\" Password match \");\n");
      out.write(" \t\t\tdocument.adminloginform.password.focus();\n");
      out.write(" \t\t\treturn false;\n");
      out.write(" \t\t}\n");
      out.write("        }\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("                    <form action=\"registration\">\n");
      out.write("\n");
      out.write(" <center>\n");
      out.write("                          <font face=\"Arial\" size=\"+3\">REGISTRATION</font>\n");
      out.write("                          </center>\n");
      out.write("                                             \n");
      out.write("                                        </br>\n");
      out.write("                                        </br>\n");
      out.write("                                        \n");
      out.write("                                    \n");
      out.write("\n");
      out.write("    <table>\n");
      out.write("        <tr>    \n");
      out.write("            <td> <font face=\"Arial\" size=\"+1.5\">FIRST NAME</font><br/><br/></td>\n");
      out.write("            <td><input type=\"text\" name=\"Firstname\"/><br/><br/></td>\n");
      out.write("        </tr>\n");
      out.write("        \n");
      out.write("        <tr>\n");
      out.write("            <td> <font face=\"Arial\" size=\"+1.5\">LAST NAME</font><br/><br/></td>\n");
      out.write("            <td><input type=\"text\" name=\"Lastname\"><br/><br/></td>\n");
      out.write("        </tr>\n");
      out.write("        <tr>\n");
      out.write("            <td> <font face=\"Arial\" size=\"+1.5\">DATE OF BIRTH</font><br/><br/></td>\n");
      out.write("            <td><input type=\"number\" name=\"DOB\" /><br/><br/></td>\n");
      out.write("            </tr>\n");
      out.write("         <tr>\n");
      out.write("            <td> <font face=\"Arial\" size=\"+1.5\">SEX</font></td>\n");
      out.write("            <td><input type=\"radio\" name=\"Sex\" value=\"Male\"> <font face=\"Arial\" size=\"+0.5\"> Male</font><br/><br/></td>\n");
      out.write("<td><input type=\"radio\" name=\"Sex\" value=\"Female\"> <font face=\"Arial\" size=\"+0.5\"> Female</font><br/><br/></td>\n");
      out.write("         </tr>\n");
      out.write("          <tr>\n");
      out.write("            <td> <font face=\"Arial\" size=\"+1.5\">EMAIL</font><br/><br/></td>\n");
      out.write("            <td><input type=\"text\" name=\"email\"/><br/><br/></td>\n");
      out.write("            </tr>\n");
      out.write("          <tr>\n");
      out.write("            <td> <font face=\"Arial\" size=\"+1.5\">PASSWORD</font><br/><br/></td>\n");
      out.write("            <td><input type=\"password\" name=\"Password1\" /><br/><br/></td>\n");
      out.write("            </tr>\n");
      out.write("          <tr>\n");
      out.write("            <td> <font face=\"Arial\" size=\"+1.5\">CONFIRM PASSWORD</font><br/><br/></td>\n");
      out.write("            <td><input type=\"password\" name=\"Password2\" /><br/><br/></td>\n");
      out.write("            </tr>\n");
      out.write("        \n");
      out.write("    </table>\n");
      out.write("                                        <center>\n");
      out.write("</br>\n");
      out.write("                                        <input type=\"submit\" value=\"SUBMIT\">\n");
      out.write("</br>\n");
      out.write("<input type=\"reset\" value=\"RESET\">\n");
      out.write("    </center>\n");
      out.write("</br>\n");
      out.write("                    </form>\n");
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
