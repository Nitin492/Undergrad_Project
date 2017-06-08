package com.sixdegrees.controller;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
import com.sixdegrees.dbcon.dbconnection;
import com.sixdegrees.model.addthepost;
import com.sixdegrees.model.blockpost;
import com.sixdegrees.model.checkpost;
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
public class addpost extends HttpServlet {
public void doGet(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
   {
       try{
            String s2=null,s3=null,s3a=null,s4=null;
            String opt=null;
           res.setContentType("Text/html");
           HttpSession hs=req.getSession();
           boolean flag;
           String name=(String)hs.getAttribute("username");
           String s1=req.getParameter("friend");
           System.out.println(s1);
          s2=req.getParameter("post");
         
RequestDispatcher rd=null;
 flag=addthepost.add(name,s1,s2);  
opt=checkpost.check(s1,s2);
System.out.println(flag);

if(opt==null)
{
     req.setAttribute("friend",s1);
    rd=req.getRequestDispatcher("/userhome.jsp");
    rd.forward(req, res); 
}
else
{
                flag=blockpost.block(s2,name,s1,opt);  

if(flag)
{
     req.setAttribute("friend",s1);
    rd=req.getRequestDispatcher("/blocked.jsp");
    rd.forward(req, res); 
}
else
{
               
     req.setAttribute("friend",s1);
    rd=req.getRequestDispatcher("/blocked.jsp");
    rd.forward(req, res);
}
     
}
          
           
       }catch(Exception e){System.out.println("error is"+e);
       
       }

           }

}




