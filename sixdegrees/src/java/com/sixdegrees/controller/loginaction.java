package com.sixdegrees.controller;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import com.sixdegrees.model.blogic;
import com.sixdegrees.model.blogic1;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


/**
 *
 * @author Nitin
 */
public class loginaction extends HttpServlet {
 
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String email=request.getParameter("id");
        String pass=request.getParameter("pass");
        boolean flag=false;
        HttpSession hs =request.getSession(true);
          PrintWriter P=response.getWriter();
        P.println("values="+email+","+pass);
        try {
           
            RequestDispatcher rd;
                 P.println(flag);
            flag=blogic.checklogin(email,pass);
            P.println(flag);
            if(flag)
            {
                hs.setAttribute("username",email);
                System.out.println("valid user");
                rd=request.getRequestDispatcher("adminhome.jsp");
                rd.forward(request, response);
            }
            else
            {
                 flag=blogic1.checklogin(email,pass);
                 P.println(flag);
                     if(flag)
            {
                hs.setAttribute("username",email);
                System.out.println("valid user");
                rd=request.getRequestDispatcher("userhome.jsp");
                rd.forward(request, response);
            }
                     else{
                                             
                request.setAttribute("loginstat", "failed");
                System.out.println("Invalid user");
                rd=request.getRequestDispatcher("login.jsp");
                rd.forward(request, response);
            }
            }
        
        } catch (SQLException ex) {
            Logger.getLogger(loginaction.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(loginaction.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
