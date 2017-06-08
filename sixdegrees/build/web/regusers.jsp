<%-- 
    Document   : showregusers
    Created on : Feb 26, 2014, 1:01:17 PM
    Author     : sony
--%>

    <%@page import="com.sixdegrees.model.regusers"%>
<%@page contentType="text/html" pageEncoding="UTF-8"
        import="java.io.*"
        import="java.sql.*"
        %>
<!DOCTYPE html>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        
    </head>
    <body>
         <table cellpadding="5" cellspacing="5" border="1">
           <tr>
                <th>EMAIL</th>
                <th>FIRST NAME</th>
                <th>LAST NAME</th>
                 <th>DOB</th>
                 <th>SEX</th>
                 
            </tr>
            
              <%  String s1,s2,s3,s4,s5;
    
ResultSet rs=regusers.showusers();

               while(rs.next())
                    {
                            s1=rs.getString(1);
                           s2=rs.getString(2);
                          s3=rs.getString(3);
                          s4=rs.getString(4);
                          s5=rs.getString(5);
                                                                                                              
             %>  
               
    <tr>
        <td><%=s1%></td>
        <td><%=s2%></td> 
      <td><%=s3%></td>
         <td><%=s4%></td>
                  <td><%=s5%></td>
<td><a href="regusersdetails.jsp?user=<%=s1%>">SHOW DETAILS</a></td>
      <td><a href="deleteusers?user=<%=s1%>">DELETE</a></td>
    </tr>
            
    <%
       }
                             
               %>
               
               
               
                  </table>
               
    </body>
</html>
