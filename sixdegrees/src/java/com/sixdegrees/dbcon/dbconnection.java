/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sixdegrees.dbcon;

import java.sql.*;

/**
 *
 * @author Nitin
 */
public class dbconnection {
    public static Connection getconnected()throws SQLException, ClassNotFoundException 
    {
       
        Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sixdegrees","root","root");
        return con;
        
    }
    
}
