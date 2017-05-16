<%@page import="com.cv_gn.dao.ManagerDAO"%>
<%@page import="java.util.List"%>
<%@page import="com.cv_gn.model.Person"%>
<%@page import="com.cv_gn.dao.PersonDAOImpl"%>
<%
    if (session.getAttribute("Agency") == null) {
        response.sendRedirect("login.jsp");
    } else {


%>
<div class="grid_16">
    <div class="grid_8 apropos">
        <div class="grid_three_c1">

            <p> 
                <label for="NoofGCSESpasses" >Enter No of GCSEs Passes</label>
                <input id="NoofGCSESpasses" name="NoofGCSESpasses" required type="number" placeholder="5">
            </p>
        </div>
    </div>
    <div class="grid_8 competences">

        <p class="signin button"> 
            <input id="addReferee" name="ShowUser" type="button" value="Show" onclick="searchCVNoOfGCSEs()"/>

    </div>
</div>
<div id="resultsNoofGCSESpasses">
    
</div>

<%    }
%>