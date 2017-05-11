<%-- 
    Document   : profile
    Created on : May 8, 2017, 11:06:11 PM
    Author     : Ganith Perera
--%>

<%@page import="com.cv_gn.model.User"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
    if (session.getAttribute("JobSeeker") == null) {
        response.sendRedirect("login.jsp");
    } else {


%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Profile | RecruitMe</title>
        <%@include file="fileSet.html" %>
        <%@include file="Header_RecruitMe.html" %>
    </head>
    <body>
        <section>				
            <div id="container_demo"><!--Contain design related to form-->

                <div id="wrapper"><!--Contain design related to form-->


                    <div id="register" class="animate form"> <!--Contain design related to form-->
                        <section role="main" class="container_16 clearfix"><!--Contain design related to two grids-->
                            <div class="grid_16 experiences"><!-- Bottom Grid  -->

                                <div class="grid_16">
                                    <div class="grid_8 apropos"> <h3>Educational Qualifications</h3>
                                    </div>
                                    <div class="grid_6">

                                        <p class="signin button"> 
                                            <input id="addEduQl" name="AddUser" type="button" value="Add" onclick="loadEducationalQualifications()"/>

                                    </div>

                                </div>
                                <div class="grid_16" id="profile_edu">
                                    kjhjygukyg
                                </div>

                                <div class="grid_16">
                                    <div class="grid_8 apropos"> <h3>Professional Qualifications</h3>
                                    </div>
                                    <div class="grid_6">

                                        <p class="signin button"> 
                                            <input id="addProfQl" name="AddUser" type="submit" value="Add"/>

                                    </div>

                                </div>
                                <div class="grid_16" id="profile_prof">
                                    ukjkjnknk
                                </div>
                                <div class="grid_16">
                                    <div class="grid_8 apropos"> <h3>Experience</h3>
                                    </div>
                                    <div class="grid_6">

                                        <p class="signin button"> 
                                            <input id="addEcprnc" name="AddUser" type="submit" value="Add"/>

                                    </div>

                                </div>

                                <div class="grid_16" id="profile_exprnce">

                                </div>
                                <div class="grid_16">
                                    <div class="grid_8 apropos"> <h3>Job Preference</h3>
                                    </div>
                                    <div class="grid_6">

                                        <p class="signin button"> 
                                            <input id="addJobPref" name="AddUser" type="submit" value="Add"/>

                                    </div>
                                   
                                </div>
                                <div class="grid_16" id="profile_jobPrefer">

                                    </div>
                                <div class="grid_16">
                                    <div class="grid_8 apropos"> <h3>Skills</h3>
                                    </div>
                                    <div class="grid_6">

                                        <p class="signin button"> 
                                            <input id="addSkills" name="AddUser" type="submit" value="Add"/>

                                    </div>
                                   
                                </div>
                                 <div class="grid_16" id="profile_skill">

                                    </div>
                                 <div class="grid_16">
                                    <div class="grid_8 apropos"> <h3>Referee Details</h3>
                                    </div>
                                    <div class="grid_6">

                                        <p class="signin button"> 
                                            <input id="addReferee" name="AddUser" type="submit" value="Add"/>

                                    </div>
                                   
                                </div>
                                  <div class="grid_16" id="profile_referee">

                                    </div>
                                
                               
                            </div><!--grid 16 Bottom Grid ends -->
                        </section><!--Contain design related to two grids-->
                    </div></div></div>
        </section>
    </body>
    <%@include file="Footer_RecruitMe.html" %>
</html>
<%    }
%>