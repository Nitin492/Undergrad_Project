package com.sixdegrees.controller;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
import com.sixdegrees.dbcon.dbconnection;
import com.sixdegrees.model.changetolerance;
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
public class tolerance extends HttpServlet {
public void doGet(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
   {
       try{
            String s2=null,s3=null,s3a=null,s4=null;
           res.setContentType("Text/html");
           String s1=req.getParameter("name");
           System.out.println(s1);
          s2=req.getParameter("tolerance");
         
RequestDispatcher rd=null;
                boolean flag=changetolerance.change(s1,s2);  

if(flag)
{
    
    rd=req.getRequestDispatcher("/editprofile.jsp");
    rd.forward(req, res); 
}
else
{

     req.setAttribute("name",s1);
    rd=req.getRequestDispatcher("/tolerance.jsp");
    rd.forward(req, res);
}
          
           
       }catch(Exception e){System.out.println("error is"+e);
       
       }

           }

}




