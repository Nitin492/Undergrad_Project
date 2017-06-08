/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sixdegrees.model;

import com.mysql.jdbc.StringUtils;
import com.sixdegrees.dbcon.dbconnection;
import java.io.PrintWriter;
import java.sql.*;

/**
 *
 * @author Nitin
 */
public class deleteblock {
    public static boolean delete(String message,String sender,String receiver) throws SQLException, ClassNotFoundException
    {    
       boolean flag=false;
       int a=0;
       ResultSet rs=null;
       String s1=null;
       System.out.println(flag);
       Connection con=dbconnection.getconnected();
       Statement st=con.createStatement();
     
       String query="delete from allposts where src='"+sender+"'and dest='"+receiver+"' and msg='"+message+"' and status='blocked';";
       System.out.println(query);
      a=st.executeUpdate(query);
     
       if(a==1)
       {
          flag=true; 
       }
      
       return flag;
       
    }
    
}
