<%-- 
    Document   : adminhome
    Created on : Feb 26, 2014, 12:56:23 PM
    Author     : sony
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
         <center>
                                                <a href="regusers.jsp"><font size="+2.0">SHOW REGISTERED USERS</font></a>
                                                <br/>
                                                <br/>
                                                <br/>
                                                  <a href="admindetails.jsp"><font size="+2.0">SHOW ADMIN DETAILS</font></a>
 <%  
   String name=(String)request.getAttribute("name");
      
   %>
                                                   <br/>
                                                <br/>
                                                <br/>
                                                  <a href="changepassword.jsp"> <font size="+2.0">CHANGE PASSWORD</font></a>

                                            </center>
    </body>
</html>
