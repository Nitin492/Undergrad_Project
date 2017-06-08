<%-- 
    Document   : registration
    Created on : Mar 20, 2014, 11:07:07 PM
    Author     : sony
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        
<script>

 	function checkFormValidator()
        {
            var P1=document.getElementById("Password1").value;
                var P2=document.getElementById("Password2").value;
                document.write(P1);
                document.write(P2);
                
                    if(P1==P2)
 		{
                    alert(" Password Mismatch ");
 			document.adminloginform.password.focus();
 			return false;
 			
 		}

 		else 
 		{
 			alert(" Password match ");
 			document.adminloginform.password.focus();
 			return false;
 		}
        }
</script>

    </head>
    <body>
                    <form action="registration">

 <center>
                          <font face="Arial" size="+3">REGISTRATION</font>
                          </center>
                                             
                                        </br>
                                        </br>
                                        
                                    

    <table>
        <tr>    
            <td> <font face="Arial" size="+1.5">FIRST NAME</font><br/><br/></td>
            <td><input type="text" name="Firstname"/><br/><br/></td>
        </tr>
        
        <tr>
            <td> <font face="Arial" size="+1.5">LAST NAME</font><br/><br/></td>
            <td><input type="text" name="Lastname"><br/><br/></td>
        </tr>
        <tr>
            <td> <font face="Arial" size="+1.5">DATE OF BIRTH</font><br/><br/></td>
            <td><input type="number" name="DOB" /><br/><br/></td>
            </tr>
         <tr>
            <td> <font face="Arial" size="+1.5">SEX</font></td>
            <td><input type="radio" name="Sex" value="Male"> <font face="Arial" size="+0.5"> Male</font><br/><br/></td>
<td><input type="radio" name="Sex" value="Female"> <font face="Arial" size="+0.5"> Female</font><br/><br/></td>
         </tr>
          <tr>
            <td> <font face="Arial" size="+1.5">EMAIL</font><br/><br/></td>
            <td><input type="text" name="email"/><br/><br/></td>
            </tr>
          <tr>
            <td> <font face="Arial" size="+1.5">PASSWORD</font><br/><br/></td>
            <td><input type="password" name="Password1" /><br/><br/></td>
            </tr>
          <tr>
            <td> <font face="Arial" size="+1.5">CONFIRM PASSWORD</font><br/><br/></td>
            <td><input type="password" name="Password2" /><br/><br/></td>
            </tr>
        
    </table>
                                        <center>
</br>
                                        <input type="submit" value="SUBMIT">
</br>
<input type="reset" value="RESET">
    </center>
</br>
                    </form>
    </body>
</html>
