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
public class blogic1 {
    public static boolean checklogin(String email,String password) throws SQLException, ClassNotFoundException
    {    
       boolean flag=false;
      
       Connection con=dbconnection.getconnected();
          
       Statement st=con.createStatement();
       String query1="select * from user where email='"+email+"' and pass='"+password+"'";
       System.out.println(query1);
       ResultSet rs=st.executeQuery(query1);
       if(rs.next())
       {
          flag=true; 
       }
      
       return flag;
       
    }
    
}
