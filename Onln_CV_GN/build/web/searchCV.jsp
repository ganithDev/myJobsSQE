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
                                <h3>Search CV profiles</h3>
                                  <label for="saveRef" class="uname" >Filter By</label>
                                <p>
                                    <select id="filterCriteria" name="filterCriteria" onchange="loadSearchForm()">
                                        <option value="Job or Sector">Job or Sector</option>
                                        <option value="Minimum education level">Minimum education level</option>
                                        <option value="Minimum number of GCSE passes">Minimum number of GCSE passes</option>
                                        <option value="Specific educational qualification">Specific educational qualification</option>
                                        <option value="Specific professional qualification">Specific professional qualification</option>
                                        <option value="Specific skill">Specific skill</option>
                                        <option value="Specific experience">Specific experience</option>
                                    </select> 
                                </p>
                            </div>
                          
                            <div id="searchResults" class="grid_16">
                                
                            </div>


                        </section>
                    </div><!--grid 16 Bottom Grid ends -->
                    </section><!--Contain design related to two grids-->
                </div></div></div>
    </section>
</body>
<%@include file="Footer_RecruitMe.html" %>
</html>
<% }
%>