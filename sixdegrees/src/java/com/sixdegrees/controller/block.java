package com.sixdegrees.controller;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
import com.sixdegrees.dbcon.dbconnection;
import com.sixdegrees.model.blockpost;
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
public class block extends HttpServlet {
public void doGet(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
   {
       try{
            String s2=null,s3=null,s3a=null,s4=null;
           res.setContentType("Text/html");
           HttpSession hs=req.getSession();
           String name=(String)hs.getAttribute("username");
           String s1=req.getParameter("message");
             s2=req.getParameter("sender");
             s3=req.getParameter("receiver");
              s4=req.getParameter("R");

             System.out.println(s2+"-"+s3);
     
         
RequestDispatcher rd=null;
                boolean flag=blockpost.block(s1,s2,s3,s4);  

if(flag)
{
     req.setAttribute("friend",s1);
    rd=req.getRequestDispatcher("/myprofile.jsp");
    rd.forward(req, res); 
}
else
{

     req.setAttribute("friend",s1);
    rd=req.getRequestDispatcher("/userhome.jsp");
    rd.forward(req, res);
}
          
           
       }catch(Exception e){System.out.println("error is"+e);
       }
       }}