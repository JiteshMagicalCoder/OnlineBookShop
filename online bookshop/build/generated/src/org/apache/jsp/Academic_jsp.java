package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Academic_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<!DOCTYPE html>\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("\n");
      out.write("\n");
      out.write("<title>Online Book Shop</title>\n");
      out.write("<meta charset=\"utf-8\">\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no\">\n");
      out.write("<link href=\"layout/styles/layout.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\">\n");
      out.write("</head>\n");
      out.write("<body id=\"top\">\n");
      out.write("<div class=\"wrapper row0\">\n");
      out.write("  <div id=\"topbar\" class=\"clear\"> \n");
      out.write("    <nav>Free shipping on orders above Rs 300</nav>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("<div class=\"wrapper row2\">\n");
      out.write("  <div class=\"rounded\">\n");
      out.write("    <nav id=\"mainav\" class=\"clear\"> \n");
      out.write("      <ul class=\"clear\">\n");
      out.write("      \n");
      out.write("          <img src=\"image/wall.jpg\">\n");
      out.write("          \n");
      out.write("      \n");
      out.write("    </ul>\n");
      out.write("      </nav>\n");
      out.write("  </div>\n");
      out.write("    \n");
      out.write("</div>\n");
      out.write("<div class=\"wrapper row1\">\n");
      out.write("  <header id=\"header\" class=\"clear\"> \n");
      out.write("   \n");
      out.write("      <div id=\"logo\" class=\"fl_left\">\n");
      out.write("      <h1><a href=\"check.jsp\">Online Book Shop</a></h1>\n");
      out.write("      <p>Books Gallery</p>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"fl_right\">\n");
      out.write("      <form class=\"clear\" method=\"post\" action=\"SearchBookServlet\">\n");
      out.write("        <fieldset>\n");
      out.write("          <legend>Search:</legend>\n");
      out.write("          <input type=\"text\" value=\"\" placeholder=\"Search Here\">\n");
      out.write("          <button class=\"fa fa-search\" type=\"submit\" title=\"Search\"><em>Search</em></button>\n");
      out.write("        </fieldset>\n");
      out.write("      </form>\n");
      out.write("    </div>\n");
      out.write("    \n");
      out.write("  </header>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("    <div class=\"wrapper row2\">\n");
      out.write("  <div class=\"rounded\">\n");
      out.write("    <nav id=\"mainav\" class=\"clear\"> \n");
      out.write("     \n");
      out.write("        <ul>\n");
      out.write("        <li><a href=\"home.jsp\">Home</a></li>\n");
      out.write("       \n");
      out.write("        <li><a class=\"drop\" href=\"#\">Books</a>\n");
      out.write("          <ul>\n");
      out.write("            <li><a href=\"Comic.jsp\">Comic Book</a></li>\n");
      out.write("            <li><a href=\"Religious.jsp\">Religious Book</a>\n");
      out.write("              \n");
      out.write("                <li><a href=\"Academic.jsp\">Academic Exam</a></li>\n");
      out.write("                <li><a href=\"Children.jsp\">Children Books</a></li>\n");
      out.write("                 <li><a href=\"Fiction.jsp\">Fiction</a></li>\n");
      out.write("                <li><a href=\"NonFiction.jsp\">Non-Fiction</a></li>\n");
      out.write("                <li><a href=\"LoveStorys.jsp\">love Story's</a></li>\n");
      out.write("                <li><a href=\"Competitive.jsp\">Competitive</a></li>\n");
      out.write("              \n");
      out.write("            \n");
      out.write("          </ul>\n");
      out.write("        </li>\n");
      out.write("        <li><a href=\"SearchBook.jsp\">Search Book</a></li>\n");
      out.write("        <li><a href=\"ContactUs.jsp\">Contact Us</a></li>\n");
      out.write("        <li><a href=\"UserLogin.jsp\">User Login</a></li>\n");
      out.write("        <li><a href=\"Admin.jsp\">Admin Login</a></li>\n");
      out.write("      </ul>\n");
      out.write("      \n");
      out.write("    </nav>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("        <!-- / Middle Column --> \n");
      out.write("        <!-- Right Column -->\n");
      out.write("       <div class=\"wrapper row3\">\n");
      out.write("  <div class=\"rounded\">\n");
      out.write("    <main class=\"container clear\"> \n");
      out.write("      <!-- main body --> \n");
      out.write("      \n");
      out.write("      <div class=\"group btmspace-30\"> \n");
      out.write("        <!-- Left Column -->\n");
      out.write("        <div class=\"one_quarter first\"> \n");
      out.write(" <!-- / Right Column --> \n");
      out.write("      </div>\n");
      out.write("      \n");
      out.write("        <div>\n");
      out.write("           \n");
      out.write("        \n");
      out.write("        \n");
      out.write("             <center>\n");
      out.write("             <form action=\"BookInfo\" method=\"post\">\n");
      out.write("             <table>\n");
      out.write("                 \n");
      out.write("          <legend>Search:</legend>\n");
      out.write("          <input type=\"text\" value=\"\" placeholder=\"Search Here\" autocomplete=\"on\">\n");
      out.write("          <button class=\"fa fa-search\" type=\"submit\" title=\"Search\"><em>Search</em></button>\n");
      out.write("        </table></form></center>\n");
      out.write("         <br><br>\n");
      out.write("         \n");
      out.write("         <table>\n");
      out.write("             <tr><td><a href=\"cart18.jsp\"><img src=\"image/academic/automobile.jpg\" width=40%><br>automobile</a><br>Rs. 250<br></td>\n");
      out.write("                 <td><a href=\"cart19.jsp\"><img src=\"image/academic/c#.jpg\" width=40%><br>c#</a><br>Rs. 165<br></td>\n");
      out.write("                 <td><a href=\"cart20.jsp\"><img src=\"image/academic/c++.jpg\" width=40%><br>c++<br>Rs. 350<br></a></td>\n");
      out.write("\n");
      out.write("             <tr><td><a href=\"cart21.jsp\"><img src=\"image/academic/clinical.jpg\" width=40%><br>clinical medicin<br>Rs. 235<br></a></td>\n");
      out.write("                 <td><a href=\"cart22.jsp\"><img src=\"image/academic/communication.jpg\" width=40%><br>communication<br>Rs. 280<br></a></td>\n");
      out.write("                 <td><a href=\"cart23.jsp\"><img src=\"image/academic/computer-science.jpg\" width=40%><br>Computer science<br>Rs. 180<br></a></td></tr>\n");
      out.write("         \n");
      out.write("             <tr><td><a href=\"cart24.jsp\"><img src=\"image/academic/gray's-anatony.jpg\" width=40%><br>data-communication<br>biology<br>Rs. 140<br></a></td>\n");
      out.write("                 <td><a href=\"cart25.jsp\"><img src=\"image/academic/java.jpg\" width=40%><br>java<br>Rs. 250<br></a></td>\n");
      out.write("                 <td><a href=\"cart26.jsp\"><img src=\"image/academic/machenism.jpg\" width=40%><br>mechanics <br><br><br>Rs. 520</a></td></tr>\n");
      out.write("             \n");
      out.write("             <tr><td><a href=\"cart27.jsp\"><img src=\"image/academic/primari-math.jpg\" width=40%><br>primary math<br>Rs.180<br></a></td>\n");
      out.write("                 <td><a href=\"cart28.jsp\"> <img src=\"image/academic/radar&sonar.jpg\" width=40%><br>radar & sonar<br>Rs. 150<br></a></td>\n");
      out.write("                 <td><a href=\"cart29.jsp\"><img src=\"image/academic/science-of-medical.jpg\" width=40%><br>science of medical<br>Rs. 160<br></a></td></tr>\n");
      out.write("             \n");
      out.write("             <tr><td><a href=\"cart30.jsp\"><img src=\"image/academic/security-engineering.jpg\" width=40%><br>security-engineering<br>Rs. 330<br></a></td>\n");
      out.write("             <td><a href=\"cart31.jsp\"> <img src=\"image/academic/software-engineering.jpg\" width=40%><br>software engineering<br>Rs. 150<br></a></td>\n");
      out.write("                 <td><a href=\"cart32.jsp\"><img src=\"image/academic/strok-medicine.jpg\" width=40%><br>stroke medicine<br>Rs. 140<br></a></td></tr>\n");
      out.write("           \n");
      out.write("         <tr><td><a href=\"cart33.jsp\"><img src=\"image/academic/thermal.jpg\" width=40%><br>thermal engineering<br>Rs.245<br></a></td>\n");
      out.write("               <td><a href=\"cart34.jsp\"> <img src=\"image/academic/ubuntu.png\" width=40%><br>ubuntu<br>Rs. 150<br></a></td>\n");
      out.write("               <td><a href=\"cart35.jsp\"><img src=\"image/academic/unix.jpg\" width=40%><br>unix<br>Rs. 140<br></a></td></tr>\n");
      out.write("         </table>\n");
      out.write("         \n");
      out.write("           \n");
      out.write("       \n");
      out.write("     \n");
      out.write("           </div>\n");
      out.write("     \n");
      out.write("        \n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("     \n");
      out.write("        <!-- / main body -->\n");
      out.write("      <div class=\"clear\"></div>\n");
      out.write("    </main>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("      <div class=\"wrapper row4\">\n");
      out.write("  <div class=\"rounded\">\n");
      out.write("    <footer id=\"footer\" class=\"clear\"> \n");
      out.write("     \n");
      out.write("        <div class=\"one_third first\">\n");
      out.write("        <figure class=\"center\"><img class=\"btmspace-15\" src=\"image/worldmap.png\" alt=\"\">\n");
      out.write("          <figcaption><a href=\"#\">Find Us With Google Maps &raquo;</a></figcaption>\n");
      out.write("        </figure>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"one_third\">\n");
      out.write("        <address>\n");
      out.write("        Online Books Shop<br>\n");
      out.write("        Uttarakhand<br>\n");
      out.write("        Deharadun<br>\n");
      out.write("        111111<br>\n");
      out.write("        <br>\n");
      out.write("        <i class=\"fa fa-phone pright-10\"></i> 8126479516<br>\n");
      out.write("        <i class=\"fa fa-envelope-o pright-10\"></i> <a href=\"https://accounts.google.com/\">pandeysanjya092@gmail.com</a>\n");
      out.write("        </address>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"one_third\">\n");
      out.write("        <p class=\"nospace btmspace-10\">Stay Up to Date With What's Happening</p>\n");
      out.write("        <ul class=\"faico clear\">\n");
      out.write("          <li><a class=\"faicon-twitter\" href=\"#\"><i class=\"fa fa-twitter\"></i></a></li>\n");
      out.write("          <li><a class=\"faicon-linkedin\" href=\"#\"><i class=\"fa fa-linkedin\"></i></a></li>\n");
      out.write("          <li><a class=\"faicon-facebook\" href=\"#\"><i class=\"fa fa-facebook\"></i></a></li>\n");
      out.write("          <li><a class=\"faicon-flickr\" href=\"#\"><i class=\"fa fa-flickr\"></i></a></li>\n");
      out.write("          <li><a class=\"faicon-rss\" href=\"#\"><i class=\"fa fa-rss\"></i></a></li>\n");
      out.write("        </ul>\n");
      out.write("        <form class=\"clear\" method=\"post\" action=\"#\">\n");
      out.write("          <fieldset>\n");
      out.write("            <legend>Subscribe for latest updates:</legend>\n");
      out.write("            <input type=\"text\" value=\"\" placeholder=\"Enter Email Here&hellip;\">\n");
      out.write("            <button class=\"fa fa-sign-in\" type=\"submit\" title=\"Sign Up\"><em>Sign Up</em></button>\n");
      out.write("          </fieldset>\n");
      out.write("        </form>\n");
      out.write("      </div>\n");
      out.write("     \n");
      out.write("    </footer>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("      <div class=\"wrapper row5\">\n");
      out.write("  <div id=\"copyright\" class=\"clear\"> \n");
      out.write("    \n");
      out.write("      <p class=\"fl_left\">Copyright &copy; 2015 - All Rights Reserved - <a href=\"#\">sanjay kumar pandey</a></p>\n");
      out.write("    \n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("      \n");
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
