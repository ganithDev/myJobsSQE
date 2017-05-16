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
         <div class="container_tbl">

                                    <div class="grid_2_c1">
                                        <p> 
                                            <label for="ucasPoints" > UCAS Points</label>
                                            <input id="ucasPoints" name="NoofGCSESpasses" required type="number" placeholder="5">
                                        </p>
                                    </div>
                                    <div class="grid_2_c2">
                                        <p> 
                                            <label for="GCSEEnglishGrade">GCSE English Grade </label>
                                            <input id="gcseMathsGrade" name="GCSEEnglishGrade" type="text" placeholder="A*">
                                        </p>
                                    </div>

                                    <div class="grid_2_c3">
                                        <p> 
                                            <label for="GCSEMathsGrade" >GCSE Maths Grade </label>
                                            <input id="gcseEnglishGrade" name="GCSEMathsGrade" type="text" placeholder="A">
                                        </p>
                                    </div>

                                    

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
            <input id="addReferee" name="ShowUser" type="button" value="Search" onclick="searchCVMinEduLevel()"/>

    </div>
</div>
<div id="resultsMinEduLvl">
    
</div>



<%
}
%>