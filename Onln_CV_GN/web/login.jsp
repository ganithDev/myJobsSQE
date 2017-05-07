<%-- 
    Document   : login
    Created on : Apr 6, 2017, 9:47:50 PM
    Author     : Naduni Pulsarani
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" type="text/css" href="CSS_styl/demo.css">
        <link rel="stylesheet" type="text/css" href="CSS_styl/style3.css">
        
    </head>
    <body>
        
         <section>				
                <div id="container_demo">
               
                    <div id="wrapper">
                       

                        <div id="register" class="animate form">
                            <form method="POST" action="/Onln_CV_GN/UserRegistrationController?actionType=AddUser" novalidate id="register-form">
                                <h1> Signin </h1>
                                <table>
                                    <tr>
                                        <td> <p> 
                                    <label for="usernamesignup" class="uname" data-icon="u">Your username</label>
                                    <input id="usernamesignup" name="usernamesignup" required type="text" placeholder="mysuperusername690">
                                </p>
                                <p> 
                                    <label for="emailsignup" class="youmail" data-icon="e"> Your email</label>
                                    <input id="emailsignup" name="emailsignup" required type="email" placeholder="mysupermail@mail.com"> 
                                </p>
                                <p> 
                                    <label for="passwordsignup" class="youpasswd" data-icon="p">Your password </label>
                                    <input id="passwordsignup" name="passwordsignup" required type="password" placeholder="eg. X8df!90EO">
                                </p>
                                <p> 
                                    <label for="passwordsignup_confirm" class="youpasswd" data-icon="p">Please confirm your password </label>
                                    <input id="passwordsignup_confirm" name="passwordsignup_confirm" required type="password" placeholder="eg. X8df!90EO">
                                </p></td>
                                        <td>
                                             <p> 
                                    <label for="usernamesignup" class="uname" data-icon="u">Your username</label>
                                    <input id="usernamesignup" name="usernamesignup" required type="text" placeholder="mysuperusername690">
                                </p>
                                <p> 
                                    <label for="emailsignup" class="youmail" data-icon="e"> Your email</label>
                                    <input id="emailsignup" name="emailsignup" required type="email" placeholder="mysupermail@mail.com"> 
                                </p>
                                <p> 
                                    <label for="passwordsignup" class="youpasswd" data-icon="p">Your password </label>
                                    <input id="passwordsignup" name="passwordsignup" required type="password" placeholder="eg. X8df!90EO">
                                </p>
                                <p> 
                                    <label for="passwordsignup_confirm" class="youpasswd" data-icon="p">Please confirm your password </label>
                                    <input id="passwordsignup_confirm" name="passwordsignup_confirm" required type="password" placeholder="eg. X8df!90EO">
                                </p>
                                        </td>
                                    </tr>
                                </table>
                               
                                <p class="signin button"> 
									<input type="submit" value="Sign up"> 
								</p>
                                <p class="change_link">  
									New to RecruitMe?
                                                                        <a href="registerUser.jsp" class="to_register"> Create an Account </a>
								</p>
                            </form>
                        </div>
						
                    </div>
                    
                </div>  
    </section>
                				
                
    </body>
</html>
