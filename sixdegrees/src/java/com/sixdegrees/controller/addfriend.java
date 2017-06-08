package com.sixdegrees.controller;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
import com.sixdegrees.dbcon.dbconnection;
import com.sixdegrees.model.addfren;
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
public class addfriend extends HttpServlet {
public void doGet(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
   {
       try{
            String s2=null,s3=null,s3a=null,s4=null;
           res.setContentType("Text/html");
           HttpSession hs=req.getSession();
           String name=(String)hs.getAttribute("username");
           String s1=req.getParameter("user");
           System.out.println(s1);
         
RequestDispatcher rd=null;
                boolean flag=addfren.add(name,s1);  

if(flag)
{
     req.setAttribute("friend",s1);
    rd=req.getRequestDispatcher("/showrequests.jsp");
    rd.forward(req, res); 
}
else
{

     req.setAttribute("friend",s1);
    rd=req.getRequestDispatcher("/showrequests.jsp");
    rd.forward(req, res);
}
          
           
       }catch(Exception e){System.out.println("error is"+e);
       
       }

           }

}




