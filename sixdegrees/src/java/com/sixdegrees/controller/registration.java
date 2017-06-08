package com.sixdegrees.controller;
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
import com.sixdegrees.dbcon.dbconnection;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;
import javax.servlet.http.HttpSession;

/**
 *
 * @author CHANDANA
 */
public class registration extends HttpServlet {
public void doGet(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
   {
       try{
            String s2=null,s3=null,s3a=null,s4=null,s5=null,s6=null,s7=null,s8=null;
          String s11=null;
           PrintWriter P=res.getWriter();
           res.setContentType("Text/html");
           String s1=req.getParameter("Firstname");
        s2=req.getParameter("Lastname");
         s3=req.getParameter("DOB");
         s4=req.getParameter("Sex");
        s5=req.getParameter("email");
          s6=req.getParameter("Password1");
          s7=req.getParameter("Password2");
            
               Statement stmt1=null;
              Connection con=dbconnection.getconnected();
stmt1=con.createStatement();
P.println("connected and statement created");
ResultSet rs=null;
String q="insert into user values('"+s5+"','"+s6+"','"+s1+"','"+s2+"','"+s3+"','"+s4+"','"+s11+"','"+s11+"','"+s11+"','"+s11+"','"+s11+"','"+s11+"','"+s11+"','"+s11+"','"+s11+"','"+s11+"','0')";
P.println("query......"+q);
int a=stmt1.executeUpdate(q);

boolean b=false;
RequestDispatcher rd=null;
if(a==1)
{
    b=true;
}
if(b)
{  
    req.setAttribute("name",s1);
    rd=req.getRequestDispatcher("/login.jsp");
    rd.forward(req, res);
}
else
{
    req.setAttribute("name",s1);
    rd=req.getRequestDispatcher("/registration.jsp");
    rd.forward(req, res);
}



           
           
       }catch(Exception e){System.out.println("error is"+e);
       
       }

           }

}




