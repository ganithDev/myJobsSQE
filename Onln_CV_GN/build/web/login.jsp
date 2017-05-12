<%-- 
    Document   : login
    Created on : Apr 6, 2017, 9:47:50 PM
    Author     : Naduni Pulsarani
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
if(session.getAttribute("Admin")!=null){
response.sendRedirect("adminPanel.jsp");    
}else if(session.getAttribute("Agency")!=null){
response.sendRedirect("searchCV.jsp");
}else if(session.getAttribute("JobSeeker")!=null){
response.sendRedirect("profile.jsp");
}else{
%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Sigin | RecruitMe</title>
        <%@include file="fileSet.html" %>
        <%@include file="Header_RecruitMe.html" %>
         
    </head>
    <body>
        
         <section>				
                <div id="container_demo">
               
                    <div id="wrapper">
                       

                        <div id="register" class="animate form">
                            <form method="POST" action="UserLogin?actionType=LoginUser" novalidate id="login-form">
                                <h1> Signin </h1>
                               
                                <p> 
                                    <label for="userEmail" class="youmail"> Username/ Primary Email</label>
                                    <input id="userEmail" name="userEmail" required type="email" placeholder="mysupermail@mail.com"> 
                                </p>
                                <p> 
                                    <label for="passwordsignup" class="youpasswd" >Your password </label>
                                    <input id="password" name="passwordsignup" required type="password" placeholder="eg. X8df!90EO">
                                </p>
                                <section role="main" class="container_16 clearfix"><!--Contain design related to two grids-->
                                <div class="grid_16">
                                    <div class="grid_8"><p class="signin button"> 
                                        <input name="LoginUser" type="submit" value="Sign in"/> </div>
                                        
                                        <div class="grid_8">
                                             <p class="change_link">  
                                       New to RecruitMe ?
                                       <a href="login.jsp" class="to_register"> Create an Account </a></p>
                                        </div>
                                       
                                    </div>
                                </section>
                                   
                                        
                               
                              
                            </form>
                        </div>
						
                    </div>
                    
                </div>  
    </section>
                				
                
    </body>
    <%@include file="Footer_RecruitMe.html" %>
</html>
<%
}
%>