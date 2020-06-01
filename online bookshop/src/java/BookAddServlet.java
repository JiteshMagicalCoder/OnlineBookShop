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
public class BookAddServlet extends HttpServlet {

    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/jsp");
        PrintWriter out = response.getWriter();
        String bookname = request.getParameter("bookname");
        String authorname = request.getParameter("authorname");
        String price = request.getParameter("price");
       int i = 0;
        
            try {
                Class.forName("oracle.jdbc.driver.OracleDriver");
            } catch (ClassNotFoundException ex) {
            }
            try {
                Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "12345");
                PreparedStatement ps = con.prepareStatement("insert into BOOK(bookname,authorname,price) values(?,?,?)");
                ps.setString(1, bookname);
                ps.setString(2, authorname);
                ps.setString(3, price);
               

                i = ps.executeUpdate();

                if (i!= 0) {
                   
                    out.write(" book added Successfully");
                } else {
                    out.write("error!");

                }

            } catch (Exception ex) {
                out.println(ex);
            }
        }
    }
