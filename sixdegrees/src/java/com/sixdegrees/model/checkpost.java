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
public class checkpost {
    public static String check(String name,String message) throws SQLException, ClassNotFoundException
    {    
       boolean flag=true;
       int a=0,i=0,p1=0,p2=0,p3=0,p4=0,t=0,l=0,m=0;
       String s1=null,s2=null,s3=null,s4=null,s11=null;
       ResultSet rs=null;
       String spam="spam",abuse="abuse",politics="politics",violence="violence",n=null;
       System.out.println(flag);
       Connection con=dbconnection.getconnected();
       Statement st=con.createStatement();
                               String post=message.replaceAll("\\n+", " "); 
post=post.replaceAll("[^a-zA-Z]"," ");
                 post=post.replaceAll("\\s+", " "); 
                 post=post.replaceAll("(?i) it| it |it | hey| hey |hey | hi| hi |hi | are| are |are | but| but |but | you| you |you | we| we |we | us| us |us | will| will |will | me| me |me | I| I |I ", "");

        System.out.println("after punc:"+post);
        String s[]=message.split(" ");
               int size=s.length;

        for(i=0;i<size;i++)
            System.out.println(s[i]);
      
       for(i=0;i<size;i++)
       {    System.out.println(s[i]);
       
       String query="select spampercentage,politicspercentage,abusepercentage,violencepercentage from words where word='"+s[i]+"';";
       System.out.println(query);
      rs=st.executeQuery(query);
      while(rs.next())
      {
          s1=rs.getString(1);
          s2=rs.getString(2);
          s3=rs.getString(3);
          s4=rs.getString(4);

          p1=Integer.parseInt(s1);
          p2=Integer.parseInt(s2);
          p3=Integer.parseInt(s3);
          p4=Integer.parseInt(s4);

      }
      String q="select tolerance from user where email='"+name+"';";
        System.out.println(q);
      rs=st.executeQuery(q);
       while(rs.next())
      {
          s11=rs.getString(1);
         
          t=Integer.parseInt(s11);
      }
                 System.out.println(p1+">"+t);
      if(p1>t)
      {
       flag=false;
       return spam;
      }                    System.out.println(p2+">"+t);

       if(p2>t)
      {

       flag=false;
       return politics;
      }                    System.out.println(p3+">"+t);

        if(p3>t)
      {

       flag=false;
       return abuse;
      }                    System.out.println(p4+">"+t);

         if(p4>t)
      {

       flag=false;
       return violence;
      }
       }
    //}}
           
return n;       
    }
    
}

      