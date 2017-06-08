<!DOCTYPE HTML>
<!--
	Prologue 1.2 by HTML5 UP
	html5up.net | @n33co
	Free for personal and commercial use under the CCA 3.0 license (html5up.net/license)
-->
 <%@page import="com.sixdegrees.model.personalshow"
         import="com.sixdegrees.model.workshow"
         import="com.sixdegrees.model.edushow"
         import="com.sixdegrees.model.getdetails"%>
<%@page contentType="text/html" pageEncoding="UTF-8"
        import="java.io.*"
        import="java.sql.*"%>
<html>
	<head>
		<title>Prologue by HTML5 UP</title>
		<meta http-equiv="content-type" content="text/html; charset=utf-8" />
		<meta name="description" content="" />
		<meta name="keywords" content="" />
		<link href="http://fonts.googleapis.com/css?family=Source+Sans+Pro:200,300,400,600" rel="stylesheet" type="text/css" />
		<!--[if lte IE 8]><script src="js/html5shiv.js"></script><![endif]-->
		<script src="js/jquery.min.js"></script>
		<script src="js/skel.min.js"></script>
		<script src="js/skel-panels.min.js"></script>
		<script src="js/init.js"></script>
		<noscript>
			<link rel="stylesheet" href="css/skel-noscript.css" />
			<link rel="stylesheet" href="css/style.css" />
			<link rel="stylesheet" href="css/style-wide.css" />
		</noscript>
		<!--[if lte IE 9]><link rel="stylesheet" href="css/ie9.css" /><![endif]-->
		<!--[if lte IE 8]><link rel="stylesheet" href="css/ie8.css" /><![endif]-->
	</head>
	<body>
		 <%String d1=null,d2=null;
                 String name=request.getParameter("name");
            System.out.println(name);
             ResultSet rs=getdetails.get(name);
             
               while(rs.next())
                    {
                  
                            d1=rs.getString(1);
                             d2=rs.getString(2);
                             
                                                           
             System.out.println(d1+d2);
                         }
             %>
		<!-- Header -->
			<div id="header" class="skel-panels-fixed">

				<div class="top">

					<!-- Logo -->
						<div id="logo">
							<span class="image avatar48"><img src="images/avatar.jpg" alt="" /></span>
							<h1 id="title"><%=d1%> <%=d2%></h1>
							<span class="byline"><%=name%></span>
						</div>
					<!-- Nav -->
						<nav id="nav">
							<!--
							
								Prologue's nav expects links in one of two formats:
								
								1. Hash link (scrolls to a different section within the page)
								
								   <li><a href="#foobar" id="foobar-link" class="skel-panels-ignoreHref"><span class="fa fa-whatever-icon-you-want">Foobar</span></a></li>

								2. Standard link (sends the user to another page/site)

								   <li><a href="http://foobar.tld"><span class="fa fa-whatever-icon-you-want">Foobar</span></a></li>
							
							-->
							    <ul>
                                                               <li><a href="userhome.jsp">HOME</a></li>

                                                               <li><a href="showdetails.jsp?name=<%=name%>"><%=d1%>'S WALL</a></li>
                                                                <li><a href="friendprofile.jsp?name=<%=name%>"><%=d1%>'S PROFILE</a></li>
                                                                <li><a href="showfriends.jspname=<%=name%>"><%=d1%>'S FRIENDS</a></li>
                                                       
							
                                                               
							</ul>
						</nav>
						
				</div>
				
				<div class="bottom">

					<!-- Social Icons -->
						<ul class="icons">
							<li><a href="#" class="fa fa-twitter solo"><span>Twitter</span></a></li>
							<li><a href="#" class="fa fa-facebook solo"><span>Facebook</span></a></li>
							<li><a href="#" class="fa fa-github solo"><span>Github</span></a></li>
							<li><a href="#" class="fa fa-dribbble solo"><span>Dribbble</span></a></li>
							<li><a href="#" class="fa fa-envelope solo"><span>Email</span></a></li>
						</ul>
				
				</div>
			
			</div>

		<!-- Main -->
			<div id="main">
                            <div class="container">
                            	<a href="http://ineedchemicalx.deviantart.com/art/Moonscape-381829905" class="image featured"><img src="images/pic01.jpg" alt="" /></a>
                                
  
  <header><center>
								<h2 class="alt"><strong>PROFILE</strong></h2></center>
							</header>   
                                <center>  <strong>PERSONAL DETAILS</strong></center><br/>
       <table cellpadding="5" cellspacing="5" border="1">
            
            
              <%   
                     String s1,s2,s3,s4,s5,s6,s7,s8;       
               rs=personalshow.showdetails(name);
               while(rs.next())
                                     {
                               s1=rs.getString(1);
                               s2=rs.getString(2);
                               s3=rs.getString(3);
                               s4=rs.getString(4);
                               s5=rs.getString(5);
                               s6=rs.getString(6);
                                                                                  
                                                                                     
             %>  
           <tr>
        <td>EMAIL</td>
        <td><%=name%></td>
          </tr>     
    
                           
          <tr>
        <td>RELATIONSHIP STATUS</td>
        <td><%=s1%></td>
          </tr>
              <tr>
        <td>RELIGION</td>
        <td><%=s2%></td>
          </tr>    <tr>
        <td>CURRENT CITY</td>
        <td><%=s3%></td>
          </tr>
              <tr>
        <td>HOMETOWN</td>
        <td><%=s4%></td>
          </tr>    <tr>
        <td>POLITICAL VIEW</td>
        <td><%=s5%></td>
          </tr>
             <tr>
        <td>NATIONALITY</td>
        <td><%=s6%></td>
          </tr>
                                             </table>
          
             <%
       }
                             
               %>
                                  
               <center>  <strong>EDUCATION DETAILS</strong></center><br/>
                                             <table cellpadding="5" cellspacing="5" border="1">
            
            
              <%   
               rs=edushow.showdetails(name);
               while(rs.next())
                                     {
                               s1=rs.getString(1);
                               s2=rs.getString(2);
                                                            
                                                                                     
             %>  
                           
          <tr>
        <td>INSTITUTION NAME</td>
        <td><%=s1%></td>
          </tr>
              <tr>
        <td>YEAR</td>
        <td><%=s2%></td>
          </tr>    
                                             </table>
          
             <%
       }
                             
               %>
               <center> <strong>WORK DETAILS</strong></center><br/>
               
                 <table cellpadding="5" cellspacing="5" border="1">
            
            
              <%   
                 
              rs=workshow.showdetails(name);
               while(rs.next())
                                     {
                               s1=rs.getString(1);
                               s2=rs.getString(2);
                                                            
                                                                                     
             %>  
                           
          <tr>
        <td>COMPANY NAME</td>
        <td><%=s1%></td>
          </tr>
              <tr>
        <td>YEAR</td>
        <td><%=s2%></td>
          </tr>    
                                             </table>
          
             <%
       }
                             
               %>
                                
                                
			</div>
                        </div>

		<!-- Footer -->
			<div id="footer">
				
				<!-- Copyright -->
					<div class="copyright">
						<p>&copy; 2013 Jane Doe. All rights reserved.</p>
						<ul class="menu">
							<li>Design: <a href="http://html5up.net">HTML5 UP</a></li>
							<li>Images: <a href="http://ineedchemicalx.deviantart.com">Felicia Simion</a></li>
						</ul>
					</div>
				
			</div>

	</body>
</html>