package com.sixdegrees.controller;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
import com.sixdegrees.model.deleteuser;
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
public class deleteusers extends HttpServlet {
public void doGet(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
   {
       try{
           
          
           PrintWriter P=res.getWriter();
           res.setContentType("Text/html");
           String name=req.getParameter("user");
        boolean flag=deleteuser.delete(name);  

RequestDispatcher rd=null;

if(flag)
{  
    req.setAttribute("name",name);
    rd=req.getRequestDispatcher("/regusers.jsp");
    rd.forward(req, res);
}
else
{
    req.setAttribute("name",name);
    rd=req.getRequestDispatcher("/Blank.jsp");
    rd.forward(req, res);
}
   
       }catch(Exception e){System.out.println("error is"+e);
       
       }

           }

}
