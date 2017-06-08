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
public class blockpost {
    public static boolean block(String message,String sender,String receiver,String option) throws SQLException, ClassNotFoundException
    {    
       boolean flag=false;
       int a=0,i=0;
       ResultSet rs=null;
       System.out.println(flag);
       Connection con=dbconnection.getconnected();
       Statement st=con.createStatement();
                       String post=message.replaceAll("\\n+", " "); 
        post=post.replaceAll("[^a-zA-Z]"," ");
                 post=post.replaceAll("\\s+", " "); 
                 post=post.replaceAll("(?i) it| it |it | hey| hey |hey | hi| hi |hi | are| are |are | but| but |but | you| you |you | we| we |we | us| us |us | will| will |will | me| me |me | I| I |I ", "");

        System.out.println("after punc:"+post);
        String s[]=post.split(" ");
               int size=s.length;

        for(i=0;i<size;i++)
            System.out.println(s[i]);
      
       System.out.println(size);
       for(i=0;i<size;i++)
       {    System.out.println(s[i]);
       if(option.equalsIgnoreCase("spam"))
       {
       String query="update words set markedspam=markedspam+1 where word='"+s[i]+"';";
       System.out.println(query);
      a=st.executeUpdate(query);
      String query1="update words set spampercentage=(markedspam/(used+1))*100 where word='"+s[i]+"';";
       System.out.println(query1);
      a=st.executeUpdate(query1);    
      System.out.println("Q1");
       String query2="update allposts set status='blocked' where msg='"+message+"' and src='"+sender+"' and dest='"+receiver+"';";
       System.out.println("Q2");
       System.out.println(query2);
      a=st.executeUpdate(query2);
       }
       else  if(option.equalsIgnoreCase("abuse"))
       {
       String query="update words set markedabuse=markedabuse+1 where word='"+s[i]+"';";
       System.out.println(query);
      a=st.executeUpdate(query);
      String query1="update words set abusepercentage=(markedabuse/(used+1))*100 where word='"+s[i]+"';";
       System.out.println(query1);
      a=st.executeUpdate(query1);    
      System.out.println("Q1");
       String query2="update allposts set status='blocked' where msg='"+message+"' and src='"+sender+"' and dest='"+receiver+"';";
       System.out.println("Q2");
       System.out.println(query2);
      a=st.executeUpdate(query2);
       }
       else  if(option.equalsIgnoreCase("violence"))
       {
       String query="update words set markedviolence=markedviolence+1 where word='"+s[i]+"';";
       System.out.println(query);
      a=st.executeUpdate(query);
      String query1="update words set violencepercentage=(markedviolence/(used+1))*100 where word='"+s[i]+"';";
       System.out.println(query1);
      a=st.executeUpdate(query1);    
      System.out.println("Q1");
       String query2="update allposts set status='blocked' where msg='"+message+"' and src='"+sender+"' and dest='"+receiver+"';";
       System.out.println("Q2");
       System.out.println(query2);
      a=st.executeUpdate(query2);
       }
       else  if(option.equalsIgnoreCase("politics"))
       {
       String query="update words set markedpolitics=markedpolitics+1 where word='"+s[i]+"';";
       System.out.println(query);
      a=st.executeUpdate(query);
      String query1="update words set politicspercentage=(markedpolitics/(used+1))*100 where word='"+s[i]+"';";
       System.out.println(query1);
      a=st.executeUpdate(query1);    
      System.out.println("Q1");
       String query2="update allposts set status='blocked' where msg='"+message+"' and src='"+sender+"' and dest='"+receiver+"';";
       System.out.println("Q2");
       System.out.println(query2);
      a=st.executeUpdate(query2);
       }
       }
       System.out.println("a="+a);
       if(a==1)
       {
          flag=true; 
       }
      
       return flag;
       
    }
    
}
