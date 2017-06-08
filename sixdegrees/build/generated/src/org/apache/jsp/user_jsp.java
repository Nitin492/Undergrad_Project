package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.sixdegrees.model.showallposts;
import java.io.*;
import java.sql.*;

public final class user_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<!DOCTYPE HTML>\n");
      out.write("<!--\n");
      out.write("\tPrologue 1.2 by HTML5 UP\n");
      out.write("\thtml5up.net | @n33co\n");
      out.write("\tFree for personal and commercial use under the CCA 3.0 license (html5up.net/license)\n");
      out.write("-->\n");
      out.write(" \n");
      out.write("\n");
      out.write("<html>\n");
      out.write("\t<head>\n");
      out.write("\t\t<title>Prologue by HTML5 UP</title>\n");
      out.write("\t\t<meta http-equiv=\"content-type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("\t\t<meta name=\"description\" content=\"\" />\n");
      out.write("\t\t<meta name=\"keywords\" content=\"\" />\n");
      out.write("\t\t<link href=\"http://fonts.googleapis.com/css?family=Source+Sans+Pro:200,300,400,600\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("\t\t<!--[if lte IE 8]><script src=\"js/html5shiv.js\"></script><![endif]-->\n");
      out.write("\t\t<script src=\"js/jquery.min.js\"></script>\n");
      out.write("\t\t<script src=\"js/skel.min.js\"></script>\n");
      out.write("\t\t<script src=\"js/skel-panels.min.js\"></script>\n");
      out.write("\t\t<script src=\"js/init.js\"></script>\n");
      out.write("\t\t<noscript>\n");
      out.write("\t\t\t<link rel=\"stylesheet\" href=\"css/skel-noscript.css\" />\n");
      out.write("\t\t\t<link rel=\"stylesheet\" href=\"css/style.css\" />\n");
      out.write("\t\t\t<link rel=\"stylesheet\" href=\"css/style-wide.css\" />\n");
      out.write("\t\t</noscript>\n");
      out.write("\t\t<!--[if lte IE 9]><link rel=\"stylesheet\" href=\"css/ie9.css\" /><![endif]-->\n");
      out.write("\t\t<!--[if lte IE 8]><link rel=\"stylesheet\" href=\"css/ie8.css\" /><![endif]-->\n");
      out.write("\t</head>\n");
      out.write("\t<body>\n");
      out.write("\n");
      out.write("\t\t<!-- Header -->\n");
      out.write("\t\t\t<div id=\"header\" class=\"skel-panels-fixed\">\n");
      out.write("\n");
      out.write("\t\t\t\t<div class=\"top\">\n");
      out.write("\n");
      out.write("\t\t\t\t\t<!-- Logo -->\n");
      out.write("\t\t\t\t\t\t<div id=\"logo\">\n");
      out.write("\t\t\t\t\t\t\t<span class=\"image avatar48\"><img src=\"images/avatar.jpg\" alt=\"\" /></span>\n");
      out.write("\t\t\t\t\t\t\t<h1 id=\"title\">Jane Doe</h1>\n");
      out.write("\t\t\t\t\t\t\t<span class=\"byline\">Hyperspace Engineer</span>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t<!-- Nav -->\n");
      out.write("\t\t\t\t\t\t<nav id=\"nav\">\n");
      out.write("\t\t\t\t\t\t\t<!--\n");
      out.write("\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\tPrologue's nav expects links in one of two formats:\n");
      out.write("\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t1. Hash link (scrolls to a different section within the page)\n");
      out.write("\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t   <li><a href=\"#foobar\" id=\"foobar-link\" class=\"skel-panels-ignoreHref\"><span class=\"fa fa-whatever-icon-you-want\">Foobar</span></a></li>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t2. Standard link (sends the user to another page/site)\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t   <li><a href=\"http://foobar.tld\"><span class=\"fa fa-whatever-icon-you-want\">Foobar</span></a></li>\n");
      out.write("\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t-->\n");
      out.write("\t\t\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"home.jsp\">HOME</a></li>\n");
      out.write("                                                                <li><a href=\"home.jsp\">MY PROFILE</a></li>\n");
      out.write("                                                                <li><a href=\"home.jsp\">FRIEND REQUESTS</a></li>\n");
      out.write("                                                                <li><a href=\"home.jsp\">EDIT PROFILE</a></li>\n");
      out.write("                                                                 <li><a href=\"home.jsp\">FIND FRIENDS</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t</nav>\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t<div class=\"bottom\">\n");
      out.write("\n");
      out.write("\t\t\t\t\t<!-- Social Icons -->\n");
      out.write("\t\t\t\t\t\t<ul class=\"icons\">\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\" class=\"fa fa-twitter solo\"><span>Twitter</span></a></li>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\" class=\"fa fa-facebook solo\"><span>Facebook</span></a></li>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\" class=\"fa fa-github solo\"><span>Github</span></a></li>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\" class=\"fa fa-dribbble solo\"><span>Dribbble</span></a></li>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\" class=\"fa fa-envelope solo\"><span>Email</span></a></li>\n");
      out.write("\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t<!-- Main -->\n");
      out.write("\t\t\t<div id=\"main\">\n");
      out.write("                            <div class=\"container\">\n");
      out.write("                            \t<a href=\"http://ineedchemicalx.deviantart.com/art/Moonscape-381829905\" class=\"image featured\"><img src=\"images/pic01.jpg\" alt=\"\" /></a>\n");
      out.write("\t\t\t\n");
      out.write("      <font face=\"Arial\" size=\"+1.5\">POST(Max 200 characters)</font> </br>\n");
      out.write("    <textarea name=\"Q1\" rows=\"3\" cols=\"50\" onkeyup=\"if (this.value.length >500) { alert('Character limit has been reached!'); this.value = this.value.substr(0,200); }\" ></textarea>\n");
      out.write("\n");
      out.write("</br>\t\n");
      out.write("<input type=\"submit\" value=\"POST\"/>\n");
      out.write("<table>\n");
      out.write("    \n");
      out.write(" ");
  String s1=null,s2=null,s3=null;
              boolean flag=false; 
    Statement stmt=null;
    PrintWriter P=response.getWriter();
    System.out.println("A");
      ResultSet rs=showallposts.show();
             System.out.println("B");

               while(rs.next())
                    {
                   flag=true;
                            s1=rs.getString(1);
                             s2=rs.getString(2);
                              s3=rs.getString(3);
                                                                                                                                       
             
      out.write("  \n");
      out.write("\n");
      out.write("             <tr><td>");
      out.print(s1);
      out.write('>');
      out.print(s2);
      out.write("</td><td>\n");
      out.print(s3);
      out.write("</td></tr>\n");
      out.write("</table>\n");
      out.write("\n");
      out.write("\n");
}
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t</div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("\t\t<!-- Footer -->\n");
      out.write("\t\t\t<div id=\"footer\">\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t<!-- Copyright -->\n");
      out.write("\t\t\t\t\t<div class=\"copyright\">\n");
      out.write("\t\t\t\t\t\t<p>&copy; 2013 Jane Doe. All rights reserved.</p>\n");
      out.write("\t\t\t\t\t\t<ul class=\"menu\">\n");
      out.write("\t\t\t\t\t\t\t<li>Design: <a href=\"http://html5up.net\">HTML5 UP</a></li>\n");
      out.write("\t\t\t\t\t\t\t<li>Images: <a href=\"http://ineedchemicalx.deviantart.com\">Felicia Simion</a></li>\n");
      out.write("\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t</div>\n");
      out.write("\n");
      out.write("\t</body>\n");
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
