package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE HTML>\n");
      out.write("<!--\n");
      out.write("\n");
      out.write("\tParallelism 1.1 by HTML5 UP\n");
      out.write("\thtml5up.net | @n33co\n");
      out.write("\tFree for personal and commercial use under the CCA 3.0 license (html5up.net/license)\n");
      out.write("\n");
      out.write("-->\n");
      out.write("<html>\n");
      out.write("\t<head>\n");
      out.write("\t\t<title>Parallelism by HTML5 UP</title>\n");
      out.write("\t\t<meta name=\"viewport\" content=\"width=1120,user-scalable=no\" />\n");
      out.write("\t\t<meta http-equiv=\"content-type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("\t\t<meta name=\"description\" content=\"\" />\n");
      out.write("\t\t<meta name=\"keywords\" content=\"\" />\n");
      out.write("\t\t<link href=\"http://fonts.googleapis.com/css?family=Source+Sans+Pro:300,400\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("\t\t<!--[if lte IE 8]><script src=\"js/html5shiv.js\"></script>-->\n");
      out.write("\t\t<script src=\"js/jquery.min.js\"></script>\n");
      out.write("\t\t<script src=\"js/jquery.poptrox.min.js\"></script>\n");
      out.write("\t\t<script src=\"js/config.js\"></script>\n");
      out.write("\t\t<script src=\"js/skel.min.js\"></script>\n");
      out.write("\t\t<noscript>\n");
      out.write("\t\t\t<link rel=\"stylesheet\" href=\"css/skel-noscript.css\" />\n");
      out.write("\t\t\t<link rel=\"stylesheet\" href=\"css/style.css\" />\n");
      out.write("\t\t\t<link rel=\"stylesheet\" href=\"css/style-desktop.css\" />\n");
      out.write("\t\t\t<link rel=\"stylesheet\" href=\"css/style-noscript.css\" />\n");
      out.write("\t\t</noscript>\n");
      out.write("\t\t<!--[if lte IE 8]><link rel=\"stylesheet\" href=\"css/ie8.css\" /><![endif]-->\n");
      out.write("\t</head>\n");
      out.write("\t<body>\n");
      out.write("     \n");
      out.write("\t\t<div id=\"wrapper\">\n");
      out.write("                    <div align=\"right\">\n");
      out.write("                    <form name=\"loginform\" method=\"post\" action=\"loginaction\"><table class=\"table\">\n");
      out.write("                    <tr>\n");
      out.write("                    <td> <input type=\"text\" name=\"id\" class=\"button style3 scrolly scrolly-centered\"></td>\n");
      out.write("                    <td><input type=\"password\" name=\"pass\"  class=\"button style3 scrolly scrolly-centered\"></td>\n");
      out.write("                    <td><input type=\"submit\" value=\"login\" class=\"button style2 scrolly scrolly-centered\"></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td><a href=\"#\" style=\"font-size: 12px\">Forgot Password?</a></td>\n");
      out.write("                        <td><a href=\"registration.jsp\" style=\"font-size: 12px\"><pre> Register</pre></a></td>\n");
      out.write("                    </tr>\n");
      out.write("                    </table>\n");
      out.write("                     \n");
      out.write("            </form>\n");
      out.write("                    </div>\n");
      out.write("                    \n");
      out.write("\n");
      out.write("\t\t\t<div id=\"main\">\n");
      out.write("\t\t\t\t<div id=\"reel\">\n");
      out.write("                                    \n");
      out.write("\t\t\t\t<!-- ******************************************************************************************** -->\n");
      out.write("\t\t\t\t<!-- ******************************************************************************************** -->\n");
      out.write("\t\t\t\t\n");
      out.write("\n");
      out.write("\t\t\t\t\t<!-- Header Item -->\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t<div id=\"header\" class=\"item\" data-width=\"400\">\n");
      out.write("\t\t\t\t\t\t\t<h1>6 Degrees</h1>\n");
      out.write("\t\t\t\t\t\t\t<p>A site to keep you<br />\n");
      out.write("\t\t\t\t\t\t\tconnected</p>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t\t<!-- Thumb Items -->\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t<article class=\"item thumb\" data-width=\"282\">\n");
      out.write("\t\t\t\t\t\t\t<h2>You really got me</h2>\n");
      out.write("\t\t\t\t\t\t\t<a href=\"images/fulls/01.jpg\"><img src=\"images/thumbs/01.jpg\" alt=\"\"></a>\n");
      out.write("\t\t\t\t\t\t</article>\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t<article class=\"item thumb\" data-width=\"384\">\n");
      out.write("\t\t\t\t\t\t\t<h2>Ad Infinitum</h2>\n");
      out.write("\t\t\t\t\t\t\t<a href=\"images/fulls/02.jpg\"><img src=\"images/thumbs/02.jpg\" alt=\"\"></a>\n");
      out.write("\t\t\t\t\t\t</article>\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t<article class=\"item thumb\" data-width=\"274\">\n");
      out.write("\t\t\t\t\t\t\t<h2>Different.</h2>\n");
      out.write("\t\t\t\t\t\t\t<a href=\"images/fulls/03.jpg\"><img src=\"images/thumbs/03.jpg\" alt=\"\"></a>\n");
      out.write("\t\t\t\t\t\t</article>\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t<article class=\"item thumb\" data-width=\"282\">\n");
      out.write("\t\t\t\t\t\t\t<h2>Elysium</h2>\n");
      out.write("\t\t\t\t\t\t\t<a href=\"images/fulls/04.jpg\"><img src=\"images/thumbs/04.jpg\" alt=\"\"></a>\n");
      out.write("\t\t\t\t\t\t</article>\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t<article class=\"item thumb\" data-width=\"476\">\n");
      out.write("\t\t\t\t\t\t\t<h2>Kingdom of the Wind</h2>\n");
      out.write("\t\t\t\t\t\t\t<a href=\"images/fulls/05.jpg\"><img src=\"images/thumbs/05.jpg\" alt=\"\"></a>\n");
      out.write("\t\t\t\t\t\t</article>\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t<article class=\"item thumb\" data-width=\"232\">\n");
      out.write("\t\t\t\t\t\t\t<h2>The Pursuit</h2>\n");
      out.write("\t\t\t\t\t\t\t<a href=\"images/fulls/06.jpg\"><img src=\"images/thumbs/06.jpg\" alt=\"\"></a>\n");
      out.write("\t\t\t\t\t\t</article>\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t<article class=\"item thumb\" data-width=\"352\">\n");
      out.write("\t\t\t\t\t\t\t<h2>Boundless</h2>\n");
      out.write("\t\t\t\t\t\t\t<a href=\"images/fulls/07.jpg\"><img src=\"images/thumbs/07.jpg\" alt=\"\"></a>\n");
      out.write("\t\t\t\t\t\t</article>\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t<article class=\"item thumb\" data-width=\"348\">\n");
      out.write("\t\t\t\t\t\t\t<h2>The Spectators</h2>\n");
      out.write("\t\t\t\t\t\t\t<a href=\"images/fulls/08.jpg\"><img src=\"images/thumbs/08.jpg\" alt=\"\"></a>\n");
      out.write("\t\t\t\t\t\t</article>\n");
      out.write("\n");
      out.write("\t\t\t\t\t<!-- Filler Thumb Items (just for demonstration purposes) -->\n");
      out.write("\t\t\t\t\t\t<article class=\"item thumb\" data-width=\"476\"><h2>Kingdom of the Wind</h2><a href=\"images/fulls/05.jpg\"><img src=\"images/thumbs/05.jpg\" alt=\"\"></a></article>\n");
      out.write("\t\t\t\t\t\t<article class=\"item thumb\" data-width=\"232\"><h2>The Pursuit</h2><a href=\"images/fulls/06.jpg\"><img src=\"images/thumbs/06.jpg\" alt=\"\"></a></article>\n");
      out.write("\t\t\t\t\t\t<article class=\"item thumb\" data-width=\"352\"><h2>Boundless</h2><a href=\"images/fulls/07.jpg\"><img src=\"images/thumbs/07.jpg\" alt=\"\"></a></article>\n");
      out.write("\t\t\t\t\t\t<article class=\"item thumb\" data-width=\"348\"><h2>The Spectators</h2><a href=\"images/fulls/08.jpg\"><img src=\"images/thumbs/08.jpg\" alt=\"\"></a></article>\n");
      out.write("\t\t\t\t\t\t<article class=\"item thumb\" data-width=\"282\"><h2>You really got me</h2><a href=\"images/fulls/01.jpg\"><img src=\"images/thumbs/01.jpg\" alt=\"\"></a></article>\n");
      out.write("\t\t\t\t\t\t<article class=\"item thumb\" data-width=\"384\"><h2>Ad Infinitum</h2><a href=\"images/fulls/02.jpg\"><img src=\"images/thumbs/02.jpg\" alt=\"\"></a></article>\n");
      out.write("\t\t\t\t\t\t<article class=\"item thumb\" data-width=\"274\"><h2>Different.</h2><a href=\"images/fulls/03.jpg\"><img src=\"images/thumbs/03.jpg\" alt=\"\"></a></article>\n");
      out.write("\t\t\t\t\t\t<article class=\"item thumb\" data-width=\"282\"><h2>Elysium</h2><a href=\"images/fulls/04.jpg\"><img src=\"images/thumbs/04.jpg\" alt=\"\"></a></article>\n");
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t\t<!-- ******************************************************************************************** -->\n");
      out.write("\t\t\t\t<!-- ******************************************************************************************** -->\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\n");
      out.write("\t\t\t<div id=\"footer\">\n");
      out.write("\t\t\t\t<div class=\"left\">\n");
      out.write("\t\t\t\t\t<p>This is <strong>Parallelism</strong>, a responsive portfolio site template by <a href=\"http://html5up.net/\">HTML5 UP</a>. free for personal<br />\n");
      out.write("\t\t\t\t\tand commercial use under the <a href=\"http://html5up.net/license/\">CCA 3.0</a>. The awesome demo images used in this design<br />\n");
      out.write("\t\t\t\t\tare by the amazingly talented <a href=\"http://ineedchemicalx.deviantart.com/\">Felicia Simion</a>. Check out her work at <a href=\"http://ineedchemicalx.deviantart.com/\">deviantART</a>.</p>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"right\">\n");
      out.write("\t\t\t\t\t<ul class=\"contact\">\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\" class=\"fa fa-twitter solo\"><span>Twitter</span></a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\" class=\"fa fa-facebook solo\"><span>Facebook</span></a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\" class=\"fa fa-google-plus solo\"><span>Google+</span></a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\" class=\"fa fa-dribbble solo\"><span>Dribbble</span></a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\" class=\"fa fa-pinterest solo\"><span>Pinterest</span></a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\" class=\"fa fa-envelope solo\"><span>Email</span></a></li>\n");
      out.write("\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t<div id=\"copyright\">\n");
      out.write("\t\t\t\t\t\t&copy; Untitled. Design: <a href=\"http://html5up.net/\">HTML5 UP</a>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t</div>\n");
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
