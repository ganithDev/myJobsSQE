<%-- 
    Document   : profile
    Created on : May 8, 2017, 11:06:11 PM
    Author     : Ganith Perera
--%>

<%@page import="java.util.List"%>
<%@page import="com.cv_gn.model.EducationalQualification"%>
<%@page import="com.cv_gn.model.Person"%>
<%@page import="com.cv_gn.dao.PersonDAOImpl"%>
<%@page import="com.cv_gn.model.User"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
    if (session.getAttribute("JobSeeker") == null) {
        response.sendRedirect("login.jsp");
    } else {

 User u = (User) session.getAttribute("JobSeeker");
 Person p=new PersonDAOImpl().getPersonFromUser(u);
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
                    <form action="PDFGeneratorServlet" method="POST">
                        <input type="hidden" name="personID" value="<%=p.getIdPerson() %>"/>

                    <div id="register" class="animate form"> <!--Contain design related to form-->
                        <section role="main" class="container_16 clearfix"><!--Contain design related to two grids-->
                            <div class="grid_16 experiences"><!-- Bottom Grid  -->
                                <div class="grid_16">
                                    <div class="grid_8 apropos">
                                        <p><label for="addressLine1" class="uname"> <%=p.getPersonTitle().getTitle()+"."+p.getForename1()+" "+p.getSurname() %></label></p>
                                        <input type="hidden" name="personNm" value="<%=p.getPersonTitle().getTitle()+"."+p.getForename1()+" "+p.getSurname() %>"/>
                                    </div>
                                    <div class="container_tb2">
                                        <div class="grid_three_c1">
                                            <p><label for="addressLine1" class="uname"> <%=p.getUser().getUsername() %></label></p>
                                        <input type="hidden" name="pEmail" value="<%=p.getUser().getUsername() %>"/>
                                        </div>
                                         <div class="grid_three_c2">
                                            <p><label for="addressLine1" class="uname"> <%=p.getUser().getUsername() %></label></p>
                                        <input type="hidden" name="pMobile" value="<%=p.getUser().getUsername() %>"/>
                                        </div>
                                         <div class="grid_three_c3">
                                             <p><label for="addressLine1" class="uname"> <%=new PersonDAOImpl().loadPreferredJobForPerson(p) %></label></p>
                                        <input type="hidden" name="pJobTitle" value="<%=new PersonDAOImpl().loadPreferredJobForPerson(p) %>"/>
                                        </div>
                                         <div class="grid_three_c4">
                                            <p><label for="addressLine1" class="uname"> <%=p.getDob()%></label></p>
                                        <input type="hidden" name="dob" value="<%=p.getDob()%>"/>
                                        </div>
                                    </div>
                                </div>
                                <div class="grid_16">
                                    <div class="grid_16 experiences"> <h3>Educational Qualifications</h3>
                                        <%
                                            int i=0;
                                       List<EducationalQualification> lstEd= new PersonDAOImpl().loadEduQualification(p.getUser());
                                       for(EducationalQualification eq:lstEd){
                                           i++;
                                        %>
                                        <div class="grid_16 experiences">
                                            <%= "=======================Edu Qual ("+i+")======================" %>
                                            <div class="grid_8 apropos">
                                                <p> 
                <label for="educationLevel" > Course:<%=eq.getEducationLevel().getEducationLevel() %></label>
                <input id="courseName" name="educationLevel" type="hidden" value="<%=eq.getEducationLevel().getEducationLevel()  %>">

            </p>
                                            </div>
        <div class="grid_8 apropos">
            <p> 
                <label for="courseName" > Course:<%=eq.getCourseName() %></label>
                <input id="courseName" name="courseName" type="hidden" value="<%=eq.getCourseName() %>">

            </p>
        </div>

        <div class="grid_6 competences">
            <p> 
                <label for="mainSubject" >Main Subject:<%=eq.getMainSubject()%></label>
                <input id="mainSubject" name="mainSubject" ttype="hidden" value="<%=eq.getMainSubject()%>">
            </p>
        </div>
    </div>
    <div class="grid_16 experiences">
        <div class="grid_8 apropos">
            <p> 
                <label for="nameOfInstitution" class="uname" >  Institution:<%=eq.getNameOfInstitution()%></label>
                <input id="nameOfInstitution" name="nameOfInstitution" type="hidden" value="<%=eq.getNameOfInstitution()%>">
            </p> 
        </div>
        <div class="grid_8 competences">
            <p> 
                <label for="country" >Country:<%=eq.getCountry()%></label>
                <input id="country" name="country" type="hidden" value="<%=eq.getCountry()%>">
            </p>
        </div></div>

    <div class="container_tbl">

        <div class="grid_2_c1">    
            <p> 
                <label for="yearObtained" class="uname" >  Date Obtained:<%=eq.getYearObtained()%></label>
                <input id="yearObtained" name="yearObtained" type="hidden" value="<%=eq.getYearObtained()%>">
            </p> 
        </div>
        <div class="grid_2_c3">
            <p> 
                <label for="result" class="uname" > Result:<%=eq.getResult()%></label>
                <input id="result" name="result" type="hidden" value="<%=eq.getResult()%>">
            </p> 
        </div>
    </div>
    <div class="grid_16">
        <p> 
            <label for="thesesTitle" class="uname" >  Theses Title:<%=eq.getThesesTitle()%></label>
            <input id="thesesTitle" name="thesesTitle" type="hidden" value="<%=eq.getThesesTitle()%>">
        </p> 
    </div>
                                        <%
                                        }
                                        %>
                                    </div>
                                    
                                    
                                </div>
                                <div class="grid_16" id="profile_edu">
                                    <!--addEduQualifications form-->
                                </div>

                                <div class="grid_16">
                                    <div class="grid_8 apropos"> <h3>Professional Qualifications</label></h3>
                                    </div>
                                    

                                </div>
                                <div class="grid_16" id="profile_prof">
                                   <!--addProfQualification form-->
                                </div>
                                <div class="grid_16">
                                    <div class="grid_8 apropos"> <h3>Experience</h3>
                                    </div>
                                   

                                </div>

                                <div class="grid_16" id="profile_exprnce">

                                </div>
                              
                                <div class="grid_16">
                                    <div class="grid_8 apropos"> <h3>Skills</h3>
                                    </div>
                                    
                                   
                                </div>
                                 <div class="grid_16" id="profile_skill">
<!--addSkill form-->
                                    </div>
                                 <div class="grid_16">
                                     <div class="grid_8 apropos"> <h3>Referee Details</h3>>
                                    </div>
                                    
                                   
                                </div>
                                  <div class="grid_16" id="profile_referee">
<!--addRefereeDetails form-->
                                    </div>
                                
                               
                            </div><!--grid 16 Bottom Grid ends -->
                            <div class="grid_16"><!--Generate CV to PDF-->
                                
                            </div>
                            <div class="grid_16 experiences">
                                            <div class="grid_8 apropos"><p class="signin button"> 
                                        <input name="AddUser" type="submit" value="Download as PDF"/> </div>
                                        </div>
                        </section><!--Contain design related to two grids-->
                         
                    </div>
                                      
                         </form>
                </div>
                        
            </div>
        </section>
    </body>
    <%@include file="Footer_RecruitMe.html" %>
</html>
<%
}
%>