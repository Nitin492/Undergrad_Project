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
public class addthepost {
    public static boolean add(String name,String friend,String post) throws SQLException, ClassNotFoundException
    {    
       boolean flag=false;
       int a=0,i=0,a1=0,l=0,m=0;
       ResultSet rs=null;
       String s1=null;
       System.out.println(flag);
       Connection con=dbconnection.getconnected();
       Statement st=con.createStatement();
       String query="insert into allposts values('"+name+"','"+friend+"','"+post+"','posted');";
       System.out.println(query);
       a=st.executeUpdate(query);
                               post=post.replaceAll("\\n+", " "); 

        post=post.replaceAll("[^a-zA-Z]"," ");
        post=post.replaceAll("\\s+", " ");
                     post=post.replaceAll("(?i) it| it |it | hey| hey |hey | hi| hi |hi | are| are |are | but| but |but | you| you |you | we| we |we | us| us |us | will| will |will | me| me |me | I| I |I ", " ");

        System.out.println("after punc:"+post);
        String s[]=post.split(" ");
               int size=s.length;

        for(i=0;i<size;i++)
            System.out.println("in adding:"+s[i]);
      
       for(i=0;i<size;i++)
       {    System.out.println(s[i]);
       String q1="select word from words where word='"+s[i]+"';";
        System.out.println(q1);
      rs=st.executeQuery(q1);
      if(rs.next())
      {
       String query1="update words set used=used+1 where word='"+s[i]+"';";
       System.out.println(query1);
      a1=st.executeUpdate(query1);
      String query2="update words set spampercentage=(markedspam/(used+1))*100 where word='"+s[i]+"';";
       System.out.println(query2);
      a1=st.executeUpdate(query2);
       String query3="update words set abusepercentage=(markedabuse/(used+1))*100 where word='"+s[i]+"';";
       System.out.println(query3);
      a1=st.executeUpdate(query3);
       String query4="update words set politicspercentage=(markedpolitics/(used+1))*100 where word='"+s[i]+"';";
       System.out.println(query4);
      a1=st.executeUpdate(query4);
          String query5="update words set violencepercentage=(markedviolence/(used+1))*100 where word='"+s[i]+"';";
       System.out.println(query5);
      a1=st.executeUpdate(query5); 
      }
      else
      {
         String query1="insert into words values('"+s[i]+"',1,0,0,0,0,0,0,0,0);";
       System.out.println(query1);
      a1=st.executeUpdate(query1); 
      }
       }
          // }
      // }
       if(a==1&&a1==1)
       {
          flag=true; 
       }
      
       return flag;
       
    }
    
}
