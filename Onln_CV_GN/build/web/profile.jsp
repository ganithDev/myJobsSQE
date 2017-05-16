<%-- 
    Document   : profile
    Created on : May 8, 2017, 11:06:11 PM
    Author     : Ganith Perera
--%>

<%@page import="com.cv_gn.model.Person"%>
<%@page import="com.cv_gn.dao.PersonDAOImpl"%>
<%@page import="com.cv_gn.model.User"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
    if (session.getAttribute("JobSeeker") == null) {
        response.sendRedirect("login.jsp");
    } else {
User u=(User)session.getAttribute("JobSeeker");
Person p= new PersonDAOImpl().getPersonFromUser(u);
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

                                <div class="grid_16 experiences">
                                    <div class="grid_8 apropos">
                                    <h3>Welcome !!!<%=  " "+p.getPersonTitle().getTitle() + "." + p.getForename1() + " " + p.getSurname() %></h3>
                                </div>
                                <div class="grid_8 competences">
                                    <form action="profile.jsp" method="Get">
                                    
                                    
                                        
                                            <div class="grid_8 apropos"><p class="signin button"> 
                                        <input name="AddUser" type="submit" value="Refresh"/> </div>
                                       
                                </form>
                                </div>
                                </div>
                                    <div class="grid_16">
                                    <div class="grid_8 apropos"> <h3>Educational Qualifications</h3>
                                    </div>
                                    <div class="grid_6">

                                        <p class="signin button"> 
                                            <input id="addEduQl" name="ShowUser" type="button" value="Show" onclick="loadEducationalQualificationForm()"/>

                                    </div>

                                </div>
                                <div class="grid_16" id="profile_edu">
                                    <!--addEduQualifications form-->
                                </div>

                                <div class="grid_16">
                                    <div class="grid_8 apropos"> <h3>Professional Qualifications</h3>
                                    </div>
                                    <div class="grid_6">

                                        <p class="signin button"> 
                                            <input id="addProfQl" name="ShowUser" type="button" value="Show" onclick="loadProfessionalQualificationForm()"/>

                                    </div>

                                </div>
                                <div class="grid_16" id="profile_prof">
                                   <!--addProfQualification form-->
                                </div>
                                <div class="grid_16">
                                    <div class="grid_8 apropos"> <h3>Experience</h3>
                                    </div>
                                    <div class="grid_6">

                                        <p class="signin button"> 
                                            <input id="addEcprnc" name="ShowUser" type="button" value="Show" onclick="loadExperienceForm()"/>

                                    </div>

                                </div>

                                <div class="grid_16" id="profile_exprnce">

                                </div>
                              
                                <div class="grid_16">
                                    <div class="grid_8 apropos"> <h3>Skills</h3>
                                    </div>
                                    <div class="grid_6">

                                        <p class="signin button"> 
                                            <input id="addSkills" name="ShowUser" type="button" value="Show" onclick="loadSkillForm()"/>

                                    </div>
                                   
                                </div>
                                 <div class="grid_16" id="profile_skill">
<!--addSkill form-->
                                    </div>
                                 <div class="grid_16">
                                    <div class="grid_8 apropos"> <h3>Referee Details</h3>
                                    </div>
                                    <div class="grid_6">

                                        <p class="signin button"> 
                                            <input id="addReferee" name="ShowUser" type="button" value="Show" onclick="loadRefereeDetailForm()"/>

                                    </div>
                                   
                                </div>
                                  <div class="grid_16" id="profile_referee">
<!--addRefereeDetails form-->
                                    </div>
                                
                               
                            </div><!--grid 16 Bottom Grid ends -->
                            <div class="grid_16 experiences"><!--Generate CV to PDF-->
                                
                                  
                                <form action="PDFGeneratorServlet" method="POST">
                                    
                                    <div class="grid_16 experiences">
                                        <div class="grid_16 competences">
                                        <input type="hidden" name="personID" value="<%=p.getIdPerson() %>"/>
                                            <p class="signin button"> 
                                        <input name="AddUser" type="submit" value="Download CV as PDF"/> 
                                        </div></div>
                                </form>
                              
                        </section><!--Contain design related to two grids-->
                    </div></div>
                        
            </div>
        </section>
    </body>
    <%@include file="Footer_RecruitMe.html" %>
</html>
<%
}
%>