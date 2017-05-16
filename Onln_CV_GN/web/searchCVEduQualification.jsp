<%@page import="com.cv_gn.model.EducationLevel"%>
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
                <label for="eduLevel" > Education level</label>
                <select name="eduLevel" id="eduLevel">
                    <%
                        List<EducationLevel> educationLevels = ManagerDAO.searchAll(new EducationLevel());
                        for (EducationLevel el : educationLevels) {
                    %>
                    <option value="<%= el.getIdEducationLevel()%>"><%= el.getEducationLevel()%></option>
                    <% }%>
                </select>
            </p>
        </div>
       
    </div>
    <div class="grid_16 experiences">
        <div class="grid_8 apropos">
            <p> 
                <label for="courseName" > Course Name</label>
                <input id="courseName" name="courseName" type="text" required placeholder="Biology with Computing">

            </p>
        </div>

        <div class="grid_6 competences">
            <p> 
                <label for="mainSubject" >Main Subject</label>
                <input id="mainSubject" name="mainSubject" type="text" required placeholder="Computer science">
            </p>
        </div>
    </div>
    <div class="grid_16 experiences">
        <div class="grid_8 apropos">
            <p> 
                <label for="nameOfInstitution" class="uname" >  Name of Institution</label>
                <input id="nameOfInstitution" name="nameOfInstitution" type="text" required placeholder="school, college, university">
            </p> 
        </div>
        <div class="grid_8 competences">
            <p> 
                <label for="country" >Country</label>
                <input id="country" name="country" type="text" placeholder="Sri Lanka">
            </p>
        </div></div>

    <div class="container_tbl">

        
        <div class="grid_2_c3">
            <p> 
                <label for="result" class="uname" > Result</label>
                <input id="result" name="result" type="text" required placeholder="e.g. A grade, PASS, 2nd Class Hons, Distinction">
            </p> 
        </div>
    </div>
    <div class="grid_16">
        <p> 
            <label for="thesesTitle" class="uname" >  Theses Title</label>
            <input id="thesesTitle" name="thesesTitle" type="text" required placeholder=" e.g.final year BSc project title">
        </p> 
    </div>
                <div class="grid_8 competences">

        <p class="signin button"> 
            <input id="addReferee" name="ShowUser" type="button" value="Search" onclick="searchCVSpecificEduQualification()"/>

    </div>
    
<div id="resultsEduQualification">
</div>

<%
}
%>