/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddToCart extends HttpServlet {

    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String bname=request.getParameter("bookname");
        try (PrintWriter out = response.getWriter()) {
           try{
              Class.forName("oracle.jdbc.driver.OracleDriver");
              Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","1234");
              Statement st=con.createStatement(); 
              String sql="select * from BOOK where bookname='"+bname+"'";
              ResultSet rs = st.executeQuery(sql);
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            
            out.println("<title>Servlet bookinfo</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<fieldset>");
            out.println("<center>");
            out.println("<h1>Book Information</h1>");
            out.println("<table border='1'>");
            out.println("<tr><th>BookName</th>");
            out.println("<th>AuthorName</th>");
            out.println("<th>Price</th></tr>");
            
            while(rs.next()){
                String dbbname=rs.getString("bookname"); 
                String dbaunm=rs.getString("authorname");
                 String dbprice=rs.getString("price");
                out.println("<tr>");
                if(bname.equals(dbbname)){
                    out.println("<td>"+dbbname+"</td>");
                    out.println("<td>"+dbaunm+"</td>");
                    out.println("<td>"+dbprice+"</td>");
                }
                else{
                    out.println("Sorry");
                }
                out.println("</tr>");
            }
            out.println("</table>");
            out.println("</center>");
            out.println("</fieldset>");
            out.println("</body>");
            out.println("</html>");
        }
           catch(Exception ee){
               
           }
    }
    }
}