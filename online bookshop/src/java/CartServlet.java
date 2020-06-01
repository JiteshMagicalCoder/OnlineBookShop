/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
*/

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.HashMap;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author HP PC
 */
public class CartServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        HttpSession session = request.getSession();
        Cart shoppingCart;
        shoppingCart = (Cart) session.getAttribute("Cart");
        if (shoppingCart == null) {
            shoppingCart = new Cart();
            session.setAttribute("Cart", shoppingCart);
        }

        String name = request.getParameter("name");
        Integer price = Integer.parseInt(request.getParameter("price"));
        shoppingCart.addToCart(name, price);
        session.setAttribute("Cart", shoppingCart);

        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>result</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Pizza successfully added to cart </h1>");
            out.println("<form action='a.html'>Add more pizza item<input type='submit' value='go'></form>");
            out.println("<hr>");
            out.println("<h2>Cart</h2>");
            HashMap<String, Integer> items = shoppingCart.getCartItems();
            out.println("<table border='1px'>");
            int total = 0;
            for (String key : items.keySet()) {
                out.println("<tr><td>" + key + " - </td><td>" + "$" + items.get(key) + "</td></tr>");
                total = total + items.get(key);

            }
            out.println("<tr><td>Total price is :</td><td>" + "$" + total + "</td></tr>");

            out.println("</table>");
            out.println("</body>");
            out.println("</html>");

            try {
                Class.forName("oracle.jdbc.driver.OracleDriver");

                Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "shobhit");

                Statement st = con.createStatement();

                int a = st.executeUpdate("insert into mobile values('" + name + "','" + price + "','" + total + "')");

                if (a == 1) {

                    out.println("<h4>order insert</h4>");
                } else {
                    out.println("<h4>order not inserted</h4>");

                }
            } catch (Exception ex) {

                out.println(ex);
            }

            for (String key : items.keySet()) {

                out.println("<form action='deleteItem' method='post'><input type='hidden' name='name' value='" + key + "'>");
                out.println("<tr><td>" + key + " - </td><td>" + "$" + items.get(key) + "</td>");
                out.println("<input type='submit' value='delete'></td></tr></form>");

            }

        }

    }

}
