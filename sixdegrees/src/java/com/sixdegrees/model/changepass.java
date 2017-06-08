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
public class changepass {
    public static boolean change(String name,String oldpass,String newpass) throws SQLException, ClassNotFoundException
    {    
       boolean flag=false;
       int a=0;
       System.out.println(flag);
       Connection con=dbconnection.getconnected();
       Statement st=con.createStatement();
  ResultSet rs=null;
String q="select * from admin where email='"+name+"' and pass='"+oldpass+"';";
System.out.println("query......"+q);
rs=st.executeQuery(q);
if(rs.next())
{
    String q1="update admin set pass='"+newpass+"' where email='"+name+"';";
System.out.println("query......"+q1);
 a=st.executeUpdate(q1);
       System.out.println(q1);
}
if(a==1)
{
    flag=true;
}
      
       return flag;
       
    }
    
}
