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

public class BuyServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        String bn=request.getParameter("cl");
        try{
              Class.forName("oracle.jdbc.driver.OracleDriver");
              Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","123");
              Statement st=con.createStatement(); 
              String sql="select * from ADDBOOK where bookname='"+bn+"'";
              ResultSet rs = st.executeQuery(sql);
              while(rs.next()){
                  
                  request.setAttribute("bname", rs.getString(1));
                  request.setAttribute("authname", rs.getString(2));
                  request.setAttribute("price", rs.getString(3));
                  request.getRequestDispatcher("Address.jsp").forward(request, response);
    }}
        catch(Exception e){
            out.println(e.getMessage());
        }
}
}
