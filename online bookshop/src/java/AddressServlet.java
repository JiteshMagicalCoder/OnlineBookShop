import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.text.html.HTML;

/**
 *
 * @author userRegistrationServlet
 */
public class AddressServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/jsp");
        PrintWriter out = response.getWriter();
        String fname = request.getParameter("fname");
        String lname = request.getParameter("lname");
        String pin= request.getParameter("pin");
        String mobile = request.getParameter("mobile");
        String address = request.getParameter("address");
        String address2 = request.getParameter("address2");
        String city = request.getParameter("city");
        String state = request.getParameter("state");

        
        int i = 0;
        {
            try {
                Class.forName("oracle.jdbc.driver.OracleDriver");
            } catch (ClassNotFoundException ex) {
            }
            try {
                Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "123");
                PreparedStatement ps = con.prepareStatement("insert into ADDRESS(fname,lname,pin,mobile,address,address2,city,state) values(?,?,?,?,?,?,?,?)");
                ps.setString(1, fname);
                ps.setString(2, lname);
                 ps.setString(3, pin);
                ps.setString(4, mobile);
                ps.setString(5, address);
                ps.setString(6, address2);
                ps.setString(7, city);
                ps.setString(8, state);
                 
               

                i = ps.executeUpdate();

                if (i!= 0) {
                   
                    out.write("Thank you,you have successfully entered the details.you will get your order within 5-7 days");
                } 

            } catch (Exception ex) {
                out.println(ex);
            }
        }
    }
}
