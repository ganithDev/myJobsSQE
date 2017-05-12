<%@page import="com.cv_gn.model.EducationalQualification"%>
<%@page import="com.cv_gn.dao.PersonDAOImpl"%>
<%@page import="com.cv_gn.model.User"%>
<%@page import="java.util.List"%>
<%@page import="com.cv_gn.dao.ManagerDAO"%>
<%@page import="com.cv_gn.model.EducationLevel"%>

<div class="grid_16 experiences"><!--available EduQualification-->

    <%
        if (session.getAttribute("JobSeeker") == null) {
            response.sendRedirect("login.jsp");
        } else {
            User u = (User) session.getAttribute("JobSeeker");
            List<EducationalQualification> eduLst = new PersonDAOImpl().loadEduQualification(u);
            if (eduLst.size() == 0) {%>
    <p>No Experience to show</p>
    <%
} else {%>
    <div class="container_tbl">
        <div class="grid_2_c1">Course Name</div>
        <div class="grid_2_c2">Qualification Level</div>
        <div class="grid_2_c3">Institution Name</div>
    </div>
    <%
    for (EducationalQualification edu : eduLst) {%>
    <div class="container_tbl">
        <div class="grid_2_c1"><%= edu.getCourseName()%></div>
        <div class="grid_2_c2"><%= edu.getEducationLevel().getEducationLevel()%> </div>
        <div class="grid_2_c3"><%= edu.getNameOfInstitution()%></div>
    </div>
    <%
            }
        }
    %>


</div>
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

        <div class="grid_2_c1">    
            <p> 
                <label for="yearObtained" class="uname" >  Date Obtained</label>
                <input id="yearObtained" name="yearObtained" required type="date" placeholder="">
            </p> 
        </div>
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
    <div class="container_tbl">

        <p class="signin button"><input name="saveEdu" type="submit" value="Add"/> 
        </p>
    </div></form>
<%
    }
%>   