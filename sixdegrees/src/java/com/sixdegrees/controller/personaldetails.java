package com.sixdegrees.controller;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
import com.sixdegrees.dbcon.dbconnection;
import com.sixdegrees.model.personaledit;
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
public class personaldetails extends HttpServlet {
public void doGet(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
   {
       try{
            String s2=null,s3=null,s3a=null,s4=null,s5=null,s6=null,s7=null,s8=null;
          boolean flag=false;
           PrintWriter P=res.getWriter();
           res.setContentType("Text/html");
           String s1=req.getParameter("email");
          s2=req.getParameter("status");
          s3=req.getParameter("religion");
          s4=req.getParameter("city");
             s5=req.getParameter("hometown");
          s6=req.getParameter("political");
          s7=req.getParameter("nationality");
            boolean b=false;
RequestDispatcher rd=null;
               Statement stmt=null;
           flag=personaledit.editdetails(s1,s2,s3,s4,s5,s6,s7);
 System.out.println(flag);
if(flag)
{  
    rd=req.getRequestDispatcher("/editprofile.jsp");
    rd.forward(req, res);
}
else
{
    
    rd=req.getRequestDispatcher("/personaldetails.jsp");
    rd.forward(req, res);
}



           
           
       }catch(Exception e){System.out.println("error is"+e);
       
       }

           }

}




