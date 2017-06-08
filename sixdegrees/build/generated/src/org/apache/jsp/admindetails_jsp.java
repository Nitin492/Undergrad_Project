package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.io.*;
import java.sql.*;
import com.sixdegrees.model.admindetails;

public final class admindetails_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("  <center>\n");
      out.write("                                                <font size=\"+2.5\">\n");
      out.write("                                                    ADMIN DETAILS</font>\n");
      out.write("                                            <br />\n");
      out.write("                                            <br />\n");
      out.write("                                            <br />\n");
      out.write("                                            <br />\n");
      out.write("                                            \n");
      out.write("                                             <table cellpadding=\"5\" cellspacing=\"5\" border=\"1\">\n");
      out.write("           <tr>\n");
      out.write("                <th>USER</th>\n");
      out.write("                <th>DOB</th>\n");
      out.write("                <th> GENDER</th>\n");
      out.write("                <th>ROLE</th>\n");
      out.write("                 <th>PHONE</th>\n");
      out.write("                     <th>EMAIL</th>\n");
      out.write("                 <th>CITY</th>\n");
      out.write("            </tr>\n");
      out.write("            \n");
      out.write("              ");
  String s1,s2,s3,s4,s5,s6,s7,s8;
ResultSet rs=admindetails.showadmins();
               while(rs.next())
                    {
                            s1=rs.getString(1);
                           s2=rs.getString(2);
                          s3=rs.getString(3);
                          s4=rs.getString(4);
                           s5=rs.getString(5);
                          s6=rs.getString(6);
                          s7=rs.getString(7);
                           s8=rs.getString(8);
                          
                                                                                     
             
      out.write("  \n");
      out.write("               \n");
      out.write("  <tr>\n");
      out.write("        <td>");
      out.print(s1);
      out.write("</td>\n");
      out.write("        <td>");
      out.print(s3);
      out.write("</td> \n");
      out.write("      <td>");
      out.print(s4);
      out.write("</td>\n");
      out.write("         <td>");
      out.print(s5);
      out.write("</td>\n");
      out.write("         <td>");
      out.print(s6);
      out.write("</td>\n");
      out.write("         <td>");
      out.print(s7);
      out.write("</td>\n");
      out.write("          <td>");
      out.print(s8);
      out.write("</td>\n");
      out.write("      <td><a href=\"Deleteadmins?user=");
      out.print(s1);
      out.write("\">DELETE</a></td>\n");
      out.write("    </tr>\n");
      out.write("                                            \n");
      out.write("          \n");
      out.write("             ");

       }
                             
               
      out.write("\n");
      out.write("                </table>\n");
      out.write("                       <br/>\n");
      out.write("                       <br/>\n");
      out.write("                       <br/>\n");
      out.write("                           \n");
      out.write("               \n");
      out.write("               <br/>\n");
      out.write("               <br/>\n");
      out.write("                          <br/>\n");
      out.write("               \n");
      out.write("               <a href=\"Addadmins.jsp\"><font size=\"+1.5\">ADD ADMINS</font></a>\n");
      out.write("              \n");
      out.write("               </center>\n");
      out.write("                                            \n");
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
