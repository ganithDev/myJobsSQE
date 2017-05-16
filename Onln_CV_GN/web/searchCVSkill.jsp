<%@page import="com.cv_gn.model.SkillLevel"%>
<%@page import="com.cv_gn.model.Skill"%>
<%@page import="com.cv_gn.dao.ManagerDAO"%>

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
         <label for="skillNm" > Skill Name</label>
         <select name="skillNm" id="skillID">
                <%
                    List<Skill> skills = ManagerDAO.searchAll(new Skill());
                    for (Skill s : skills) {
                %>
                <option value="<%= s.getIdSkill()%>"><%= s.getSkillName()%></option>
                <% }%>
            </select>
        </p>
    </div>
    <div class="grid_8 competences">
        <p>
         <label for="skilllevel" > Skill Level</label>
            <select name="skilllevel" id="skilllevelID">
                <%
                    List<SkillLevel> skilLvls = ManagerDAO.searchAll(new SkillLevel());
                    for (SkillLevel sl : skilLvls) {
                %>
                <option value="<%= sl.getIdskillLevel()%>"><%= sl.getSkillLevel()%></option>
                <% }%>
            </select>
        </p>
    </div>
    
</div>

            <div class="grid_8 competences">

        <p class="signin button"> 
            <input id="addReferee" name="ShowUser" type="button" value="Search" onclick="searchCVSpecificSkill()"/>

    </div>
           
<div id="resultsSkills">
   
</div>


<%
}
%>