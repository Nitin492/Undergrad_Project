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
public class showblockedposts {
    public static ResultSet show(String name) throws SQLException, ClassNotFoundException
    {    
       Connection con=dbconnection.getconnected();
       Statement st=con.createStatement();
String q="select * from allposts where dest='"+name+"' and status='blocked';";
System.out.println(q);
       ResultSet rs=st.executeQuery(q);
      return rs;
       
    }
    
}
