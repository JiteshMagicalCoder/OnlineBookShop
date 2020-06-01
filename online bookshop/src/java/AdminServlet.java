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

public class AdminServlet extends HttpServlet {
  @Override
  protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
response.setContentType("text/jsp");
PrintWriter out=response.getWriter();
String unam=request.getParameter("username");
String pass=request.getParameter("password");

try{
Class.forName("oracle.jdbc.driver.OracleDriver");
Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","12345");
Statement st=con.createStatement();
String sql="select * from ADMIN";
ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                 String dbunam=rs.getString("username");  
                 String dbpass=rs.getString("password");
            if((unam.equals(dbunam)) && (pass.equals(dbpass)))
            {
                request.getRequestDispatcher("AfterAdminLogin.jsp").forward(request, response);
            }
            else
            {
            out.println("Sorry ,username and password error ");
            request.getRequestDispatcher("Admin.jsp").forward(request, response);
            }
            }} catch (ClassNotFoundException ex) {
          Logger.getLogger(LoginServlet.class.getName()).log(Level.SEVERE, null, ex);
      } catch (SQLException ex) {
          Logger.getLogger(LoginServlet.class.getName()).log(Level.SEVERE, null, ex);
      }}}
  


