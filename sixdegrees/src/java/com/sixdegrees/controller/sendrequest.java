package com.sixdegrees.controller;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
import com.sixdegrees.dbcon.dbconnection;
import com.sixdegrees.model.sendreq;
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
public class sendrequest extends HttpServlet {
public void doGet(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
   {
       try{
            String s2=null,s3=null,s3a=null,s4=null,s5=null,s6=null,s7=null,s8=null;
          boolean flag=false;
           PrintWriter P=res.getWriter();
           res.setContentType("Text/html");
           HttpSession hs=req.getSession();
               String user=(String)hs.getAttribute("username");
               String name=req.getParameter("user");
            boolean b=false;
RequestDispatcher rd=null;
System.out.println("user="+user);
               Statement stmt=null;
           flag=sendreq.send(user,name);
 System.out.println(flag);
if(flag)
{  
    rd=req.getRequestDispatcher("/userhome.jsp");
    rd.forward(req, res);
}
else
{
    
    rd=req.getRequestDispatcher("/userhome.jsp");
    rd.forward(req, res);
}



           
           
       }catch(Exception e){System.out.println("error is"+e);
       
       }

           }

}




