<%@page import="java.util.List"%>
<%@page import="com.cv_gn.dao.ManagerDAO"%>
<%@page import="com.cv_gn.model.EducationLevel"%>

    <form method="POST" action="SaveEducationalQualification" >
<div class="grid_16 experiences">
    <div class="grid_8 apropos">

        <p> 
            <label for="eduLevel" > Education level</label>
            <select name="eduLevel">
                <%
                    List<EducationLevel> educationLevels = ManagerDAO.searchAll(new EducationLevel());
                    for (EducationLevel el : educationLevels) {
                %>
                <option value="<%= el.getIdEducationLevel()%>"><%= el.getEducationLevel()%></option>
                <% }%>
            </select>
        </p>
    </div>
    <div class="grid_8 competences">
        <div class="grid_2_c3">

        </div>
        <div class="grid_2_c4">
            <p> 
                <label for="vocational" class="uname" > Vocational qualified</label>
                <input id="vocational" name="vocational" type="checkbox" placeholder="">
            </p> 
        </div>
    </div>

</div>
<div class="grid_16 experiences">
    <div class="grid_8 apropos">
        <p> 
            <label for="courseName" > Course Name</label>
            <input id="courseName" name="courseName" type="text" placeholder="Biology with Computing">

        </p>
    </div>

    <div class="grid_6 competences">
        <p> 
            <label for="mainSubject" >Main Subject</label>
            <input id="mainSubject" name="mainSubject" type="text" placeholder="Computer science">
        </p>
    </div>
</div>
<div class="grid_16 experiences">
    <div class="grid_8 apropos">
        <p> 
            <label for="nameOfInstitution" class="uname" >  Name of Institution</label>
            <input id="nameOfInstitution" name="nameOfInstitution" type="text" placeholder="school, college, university">
        </p> 
    </div>
    <div class="grid_8 competences">
        <p> 
            <label for="country" >Country</label>
<input id="country" name="country" type="text" placeholder="Sri Lanka">
        </p>
    </div></div>

<div class="container_tbl">

    <div class="grid_2_c1">    
        <p> 
            <label for="yearObtained" class="uname" >  Date Obtained</label>
            <input id="yearObtained" name="yearObtained" type="date" placeholder="">
        </p> 
    </div>
    <div class="grid_2_c3">
        <p> 
            <label for="result" class="uname" > Result</label>
            <input id="result" name="result" type="text" placeholder="e.g. A grade, PASS, 2nd Class Hons, Distinction">
        </p> 
    </div>
</div>
<div class="grid_16">
    <p> 
        <label for="thesesTitle" class="uname" >  Theses Title</label>
        <input id="thesesTitle" name="thesesTitle" type="text" placeholder=" e.g.final year BSc project title">
    </p> 
</div>
            <div class="container_tbl">
   
            <p><input name="saveEdu" type="submit" value="Save"/> 
                </p>
</div></form>
            