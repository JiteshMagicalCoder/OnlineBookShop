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
public class RegistrationServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/jsp");
        PrintWriter out = response.getWriter();
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String re_password = request.getParameter("re_password");
        String F_name = request.getParameter("f_name");
        String L_name = request.getParameter("l_name");
        String dob = request.getParameter("dob");
        String gender = request.getParameter("gender");
        String address = request.getParameter("address");
        String c_address = request.getParameter("c_address");
        String contact_no = request.getParameter("contact_no");
        
        int i = 0;
        if (!password.equals(re_password)) {

            out.write("enter your password correct");

        } else {
            try {
                Class.forName("oracle.jdbc.driver.OracleDriver");
            } catch (ClassNotFoundException ex) {
            }
            try {
                Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "12345");
                PreparedStatement ps = con.prepareStatement("insert into USERREGISTRATION(username,password,re_password,f_name,l_name,dob,gender,address,c_address,contact_no) values(?,?,?,?,?,?,?,?,?,?)");
                ps.setString(1, username);
                ps.setString(2, password);
                 ps.setString(3, re_password);
                ps.setString(4, F_name);
                ps.setString(5, L_name);
                ps.setString(6, dob);
                ps.setString(7, gender);
                ps.setString(8, address);
                ps.setString(9, c_address);
                ps.setString(10, contact_no);
               

                i = ps.executeUpdate();

                if (i!= 0) {
                   
                    out.write(" You Are Registered Successfully Mr "+username);
                } else {
                    out.write("You Are  Not Registered Successfully");

                }

            } catch (Exception ex) {
                out.println(ex);
            }
        }
    }
}
