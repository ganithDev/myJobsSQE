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
<div class="grid_16">
    <div class="grid_16">
      
    <div class="grid_16 experiences">   
        <div class="grid_8 apropos">
            <p>
                <label for="sector" > Sector</label>
                <select name="sector" id="sectorID">
                    <%
                        List<Sector> sectors = ManagerDAO.searchAll(new Sector());
                        for (Sector s : sectors) {
                    %>
                    <option value="<%= s.getIdSector()%>"><%= s.getSectorTitle()%></option>
                    <% }%>
                </select>
            </p> 
        </div>
        <div class="grid_8 competences">
            <p>
                <label for="sector" > Sector</label>
                <select name="sector" id="jobTitle">
                    <%
                        List<JobTitle> lst = ManagerDAO.searchAll(new JobTitle());
                        for (JobTitle itm : lst) {
                    %>
                    <option value="<%= itm.getIdJobTitle()%>"><%= itm.getJobTitle()%></option>
                    <% }%>
                </select>
            </p>
        </div>

    </div>
    
 

    </div>
    <div class="grid_8 apropos">
        

            <p> 
                <label for="NoofGCSESpasses" ></label>
                
            </p>
        
    </div>
    <div class="grid_8 competences">

        <p class="signin button"> 
            <input id="addReferee" name="ShowUser" type="button" value="Search" onclick="searchCVJobPrefernce()"/>

    </div>
</div>
<div class="grid_16">
    <div id="resultsJobPrefer"></div>
</div>


<%
}
%>