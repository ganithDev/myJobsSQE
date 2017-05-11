<%-- 
    Document   : searchCV
    Created on : May 10, 2017, 4:16:38 PM
    Author     : Ganith Perera
--%>

<%@page import="com.cv_gn.model.EducationLevel"%>
<%@page import="com.cv_gn.model.Sector"%>
<%@page import="java.util.List"%>
<%@page import="com.cv_gn.model.JobTitle"%>
<%@page import="com.cv_gn.dao.ManagerDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
    if (session.getAttribute("Agency") == null) {
        response.sendRedirect("login.jsp");
    } else {
           
        
%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Search Profiles | RecruitMe</title>
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
                                <h3>Select Filters</h3>
                                
                                <!--Job or Sector (they want to work in) preference-->
                                <div class="grid_6">
                                    <p> 
                                        <label for="SectorPreference">Sector preference</label>
                                        <select name="SectorPreference">
                                            <%
                                                List<Sector> sectors = ManagerDAO.searchAll(new Sector());
                                                for (Sector sec : sectors) {
                                            %>
                                            <option value="<%= sec.getIdSector()%>"><%= sec.getSectorTitle()%></option>
                                            <% }%>
                                        </select>
                                    </p>
                                </div>
                                <div class="grid_6">
                                    <p> 
                                        <label for="JobPreference" > Job preference</label>
                                        <select name="JobPreference">
                                            <%
                                                List<JobTitle> jobTitles = ManagerDAO.searchAll(new JobTitle());
                                                for (JobTitle jt : jobTitles) {
                                            %>
                                            <option value="<%= jt.getIdJobTitle()%>"><%= jt.getJobTitle()%></option>
                                            <% }%>
                                        </select>
                                    </p>
                                </div><!--Job or Sector (they want to work in) preference ends-->

                                <!--
                                ii.	Minimum education level
iii.	Minimum number of GCSE passes
iv.	Specific educational qualification
                                -->
                                <div class="grid_8">
                                    <div class="grid_6">

                                        <p> 
                                            <label for="JobPreference" > Education level</label>
                                            <select name="JobPreference">
                                                <%
                                                    List<EducationLevel> educationLevels = ManagerDAO.searchAll(new EducationLevel());
                                                    for (EducationLevel el : educationLevels) {
                                                %>
                                                <option value="<%= el.getIdEducationLevel()%>"><%= el.getEducationLevel()%></option>
                                                <% }%>
                                            </select>
                                        </p>
                                    </div>
                                            <div class="grid_8">
                                    <div class="grid_2_c3">
                                        <p> 
                                            <label for="noOfGCSEpasses" class="uname" > No: of GCSE passes</label>
                                            <input id="noOfGCSEpasses" name="noOfGCSEpasses" type="number" placeholder="5">
                                        </p>
                                    </div>
                                    <div class="grid_2_c4">
                                        <p> 
                                            <label for="noOfGCSEpasses" class="uname" > Vocational</label>
                                            <input id="noOfGCSEpasses" name="noOfGCSEpasses" type="checkbox" placeholder="5">
                                        </p> 
                                    </div>
                                            </div>

                                </div>
                                <div class="grid_6">
                                    <p> 
                                        <label for="courseName" > Course Name</label>
                                        <select name="courseName">
                                            <option>Biology with Computing</option>
                                            <option>Business Studies</option>
                                        </select>
                                    </p>
                                </div>

                                <div class="grid_6">
                                    <p> 
                                        <label for="courseName" >Main Subject</label>
                                        <select name="courseName">
                                            <option>Computer Science</option>
                                            <option>Mechanical Engineering</option>
                                        </select>
                                    </p>
                                </div>
                                <div class="grid_6">
                                    <p> 
                                        <label for="nameOfInstitution" class="uname" >  Name of Institution</label>
                                        <input id="nameOfInstitution" name="nameOfInstitution" type="text" placeholder="school, college, university">
                                    </p> 
                                </div>
                                            <div class="grid_6">
                                    <p> 
                                        <label for="country" >Country</label>
                                        <select name="country">
                                            <option>United Kingdom</option>
                                            <option>United States</option>
                                        </select>
                                    </p>
                                </div>
                                            <div class="grid_16">
                                                
                                                <div class="grid_8">    
                                                     <p> 
                                        <label for="yearObtained" class="uname" >  Date Obtained</label>
                                        <input id="yearObtained" name="yearObtained" type="date" placeholder="">
                                    </p> 
                                                </div>
                                                <div class="grid_8">
                                                     <p> 
                                        <label for="nameOfInstitution" class="uname" > </label>
                                        <input id="nameOfInstitution" name="nameOfInstitution" type="text" placeholder="e.g. A grade, PASS, 2nd Class Hons, Distinction">
                                    </p> 
                                                </div>
                                            </div>
                                            <div class="grid_16">
                                                <p> 
                                        <label for="thesesTitle" class="uname" >  Theses Title</label>
                                        <input id="thesesTitle" name="thesesTitle" type="text" placeholder=" e.g.final year BSc project title">
                                    </p> 
                                            </div>
                                            
                                
<!--
v.	Specific professional qualification

-->

<div class="grid_16">
    <h3>Professional Qualifications</h3>
    <div class="grid_8">
      <p> 
                                        <label for="qualificationName" class="uname"> Qualification Name</label>
                                        <input id="qualificationName" name="qualificationName" type="text" placeholder="">
                                    </p> 
    </div>
     <div class="grid_8">
         <div class="grid_6">
              <p> 
                                        <label for="awardingBody" class="uname"> Awarding Body</label>
                                        <input id="awardingBody" name="awardingBody" type="text" placeholder="e.g. institute of chartered surveyors">
                                    </p> 
                                    <p> 
                                        <label for="classification" class="uname">Classification</label>
                                        <input id="classification" name="classification" type="text" placeholder="e.g. the legal practice certificate: distinctinction, commendation, pass">
                                    </p> 
         </div>
    </div>
</div>


<!--

vi.	Specific skill
vii.	Specific experience 
     
-->


                                <div class="grid_16">
                                    <div class="grid_8 competences">

                                        <p class="change_link">  
                                            Clear Search
                                            <a href="searchCV.jsp" class="to_register"> Reset </a>
                                    </div>
                                    <div class="grid_8 apropos"><p class="signin button"> 
                                            <input name="AddUser" type="submit" value="Search"/> 
                                    </div>

                                </div>



                            </div><!--grid 16 Bottom Grid ends -->
                        </section><!--Contain design related to two grids-->
                    </div></div></div>
        </section>
    </body>
    <%@include file="Footer_RecruitMe.html" %>
</html>
<% }
%>