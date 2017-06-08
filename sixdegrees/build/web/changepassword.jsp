<%-- 
    Document   : changepassword
    Created on : Mar 3, 2014, 11:27:01 AM
    Author     : sony
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        

<script language="javascript">

 	function checkFormValidator()
 	{
 		
                //var P1=document.changepassword.newpass1.value;//getElementById("newpass1").value;
                //var P2=document.getElementById("newpass2").value;
                  //  var i=1;
                  if(document.cform.newpass1.value==document.cform.newpass2.value)
 		{
                    alert(" Password match ");
 			document.adminloginform.password.focus();
 			return false;
 			
 		}

 		else 
 		{
 			alert(" Password Mismatch ");
 			document.adminloginform.password.focus();
 			return false;
 		}
 	}

</script>

    </head>
    <body>
            <form action="changepassword" onsubmit="return checkFormValidator()">

         <center>
                          <font face="Arial" size="+3">CHANGE PASSWORD</font>
                        <br/>
                             <br/>                
                                        <br/>
                                        <br/>
                                        
                                    

    <table>
        <tr>    
            <td> <font face="Arial" size="+1.5">OLD PASSWORD</font><br/><br/></td>
            <td><input type="password" name="oldpass"/><br/><br/></td>
        </tr>
        
        <tr>
            <td> <font face="Arial" size="+1.5">NEW PASSWORD</font><br/><br/></td>
            <td><input type="password" name="newpass1"/><br/><br/></td>
        </tr>
        <tr>
            <td> <font face="Arial" size="+1.5">CONFIRM NEW PASSWORD</font><br/><br/></td>
            <td><input type="password" name="newpass2" /><br/><br/></td>
            </tr>
       
        
    </table>
                                        
                                        
                                          <%  
        String name=(String)session.getAttribute("username");
        
   %>
                                    
                        <input type="text" name="name" value="<%=name%>" style="visibility:hidden"/>                  
<br/>
                                        <input type="submit" value="SUBMIT"/>
<br/>
<input type="reset" value="RESET"/>
    </center>
<br/>
    </form>
    </body>
</html>
