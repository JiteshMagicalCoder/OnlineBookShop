import java.sql.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class TransictionServlet extends HttpServlet {
  @Override
  protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
response.setContentType("text/jsp");
PrintWriter out=response.getWriter();
String bname=request.getParameter("bookname");
String auname=request.getParameter("authorname");
String price=request.getParameter("price");

try{
Class.forName("oracle.jdbc.driver.OracleDriver");
Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","12345");
Statement st=con.createStatement();
String sql="select * from BOOK";
ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                 String dbbname=rs.getString("bookname");  
                 String dbauname=rs.getString("authorname");
                 String dbprice=rs.getString("price");
            if((bname.equals(dbbname)))
            {
                out.println("<tr><td>"+dbbname+"</td><td>"+dbauname+"</td><td>"+dbprice+"</tr></table>");
            }
            else
            {

            request.getRequestDispatcher("SearchBook.jsp").forward(request, response);
            }
            }} catch (ClassNotFoundException ex) {
          Logger.getLogger(LoginServlet.class.getName()).log(Level.SEVERE, null, ex);
      } catch (SQLException ex) {
          Logger.getLogger(LoginServlet.class.getName()).log(Level.SEVERE, null, ex);
      }}}
  


