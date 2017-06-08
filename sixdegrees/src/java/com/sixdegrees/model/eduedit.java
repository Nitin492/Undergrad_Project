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
public class eduedit {
    public static boolean editdetails(String name,String iname,String iyear) throws SQLException, ClassNotFoundException
    {    
      boolean flag=false;
       Connection con=dbconnection.getconnected();
       Statement st=con.createStatement();
    String q="update user set iname='"+iname+"',iyear='"+iyear+"'where email='"+name+"';";
System.out.println(q);
      int a=st.executeUpdate(q);
      if(a==1)
      {
          flag=true;
      }
      return flag;
       
    }
    
}
