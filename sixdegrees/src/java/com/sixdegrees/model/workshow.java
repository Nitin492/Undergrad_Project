/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sixdegrees.model;

import com.sixdegrees.dbcon.dbconnection;
import java.io.PrintWriter;
import java.sql.*;

/**
 *
 * @author Nitin
 */
public class workshow {
    public static ResultSet showdetails(String name) throws SQLException, ClassNotFoundException
    {    
      
       Connection con=dbconnection.getconnected();
       Statement st=con.createStatement();
               String q="select cname,cyear from user where email='"+name+"'";
System.out.println(q);
       ResultSet rs=st.executeQuery(q);
      return rs;
       
    }
    
}
