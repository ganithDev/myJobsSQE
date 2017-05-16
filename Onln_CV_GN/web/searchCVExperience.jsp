<%@page import="com.cv_gn.model.EmploymentLevel"%>
<%@page import="com.cv_gn.model.JobTitle"%>
<%@page import="com.cv_gn.dao.ManagerDAO"%>
<%@page import="com.cv_gn.model.Sector"%>
<%@page import="java.util.List"%>
<%@page import="com.cv_gn.dao.PersonDAOImpl"%>
<%@page import="com.cv_gn.model.Person"%>
<%
    if (session.getAttribute("Agency") == null) {
        response.sendRedirect("login.jsp");
    } else {


%>


    <div class="grid_16 experiences">   
        <div class="grid_8 apropos">
            <p> 
                <label for="jobTitle" class="uname"> Job Title</label>
                <select name="jobTitleID" id="jobTitleID">
                    <%
                        List<JobTitle> jobTitles = ManagerDAO.searchAll(new JobTitle());
                        for (JobTitle jt : jobTitles) {
                    %>
                    <option value="<%= jt.getIdJobTitle()%>"><%= jt.getJobTitle()%></option>
                    <% }%>
                </select>
               <!-- <input id="jobTitle" name="jobTitle" required type="text" placeholder="">-->
            <div id="jobTitleList"><!--Search results will added here-->

            </div>
            </p> 
        </div>
        <div class="grid_8 competences">
            <p>
                <label for="levelOfEmployment" > Level of Employment</label>
                <select name="levelOfEmployment" id="levelOfEmployment">
                    <%
                        List<EmploymentLevel> employmentLevels = ManagerDAO.searchAll(new EmploymentLevel());
                        for (EmploymentLevel el : employmentLevels) {
                    %>
                    <option value="<%= el.getIdLevelOfEmployment()%>"><%= el.getEmploymentLevel()%></option>
                    <% }%>
                </select>
            </p>
        </div>

    </div>
   
    <div class="grid_16">
        <div class="grid_8 experiences">    
            <p> 
                <label for="employerName" class="uname" >Company</label>
                <input id="employerName" name="employerName" required placeholder=""/>
            </p> 
        </div>
        <div class="grid_16 experiences">    
            <p><label for="keyDuties" class="uname" >Key Duties</label></p>
            <p> 

                <textarea style="width: 400px;height: 150px;" id="keyDuties" name="keyDuties" required placeholder=""></textarea>
            </p> 
        </div>



    </div>
      <div class="grid_8 competences">

        <p class="signin button"> 
            <input id="addReferee" name="ShowUser" type="button" value="Search" onclick="searchCVSpecificExperience()"/>

    </div>
<div class="grid_16">
    <div id="resultsExperince">
        
</div>
    </div>



<%
}
%>