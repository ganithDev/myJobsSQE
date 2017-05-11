<%-- 
    Document   : registerUser
    Created on : Apr 9, 2017, 11:50:31 AM
    Author     : Naduni Pulsarani
--%>


<%@page import="com.cv_gn.model.EmploymentLevel"%>
<%@page import="com.cv_gn.model.PersonContactMode"%>
<%@page import="com.cv_gn.model.PersonTitle"%>
<%@page import="com.cv_gn.dao.ManagerDAO"%>
<%@page import="java.util.List"%>
<%@page import="org.hibernate.Criteria"%>
<%@page import="com.cv_gn.model.PersonStatus"%>
<%@page import="org.hibernate.Session"%>
<%@page import="com.cv_gn.model.OnlnCVHiberUtil"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">


        <title>Registration Form | RecruitMe</title>
<%@include file="fileSet.html" %>
        
        <%@include file="Header_RecruitMe.html" %>
    </head>
    <body>

        <!-- Corps -->
        <form method="get" action="UserRegistrationController?actionType=AddUser" novalidate id="register-form" autocomplete="on">
            <section>				
                <div id="container_demo"><!--Contain design related to form-->

                    <div id="wrapper"><!--Contain design related to form-->


                        <div id="register" class="animate form"> <!--Contain design related to form-->
                            <section role="main" class="container_16 clearfix"><!--Contain design related to two grids-->
                                <h1> User Registration</h1> 
                                <div class="grid_16">
                                    <h3>Personal Information</h3>
                                    <!-- Left grid -->
                                    <div class="grid_8 apropos">

                                        <p> 

                                            <label for="firstName" class="uname" data-icon="u"> First Name</label>
                                           <select name="title" required type="text" placeholder="--Select--">
                                                <%
                                                    List<PersonTitle> ptsList = ManagerDAO.searchAll(new PersonTitle());
                                                    for (PersonTitle pt : ptsList) {
                                                %>
                                                <option value="<%= pt.getIdpersonTitle()%>"><%= pt.getTitle()%></option>
                                                <%}%>

                                            </select> <input id="firstname" name="firstName" required type="text" placeholder="John">
                                        </p>
                                        <p> 
                                            <label for="surName" class="uname" data-icon="s"> Sur Name</label>
                                            <input id="surname" name="surName" required type="text" placeholder="Smith">
                                        </p>
                                        <p> 
                                            <label for="addressLine1" class="uname" data-icon="a2"> Address Line 1</label>
                                            <input id="address1" name="addressLine1" required type="text" placeholder="103, Royal Residence">
                                        </p>
                                        <p> 
                                            <label for="town" class="uname" data-icon="t">   Town</label>
                                            <input id="town" name="town" required type="text" placeholder="Smith">
                                        </p>
                                        <p> 
                                            <label for="secondEmail" class="uname" data-icon="e">  Secondary Email</label>
                                            <input id="secondemail" name="secondEmail" required type="email" placeholder="Smith">
                                        </p>


                                        <p> 
                                            <label for="mobile" class="uname" data-icon="t">   Mobile</label>
                                            <input id="mobile" name="mobile" required type="tel" placeholder="Smith">
                                        </p>
                                        <p> 
                                            <label for="landLine" class="uname" data-icon="t">   Land Line</label>
                                            <input id="mobile" name="landLine" type="tel" placeholder="0114785412">
                                        </p>

                                        <p> 
                                            <label for="preferredContactMode" class="uname" >  Select Preferred Contact Mode</label>

                                            <select name="preferredContactMode">
                                                <%
                                                    List<PersonContactMode> listPcm = ManagerDAO.searchAll(new PersonContactMode());
                                                    for (PersonContactMode pcm : listPcm) {
                                                %>
                                                <option value="<%=pcm.getIdcontactPreference()%>"><%=pcm.getContactMode()%></option>
                                                <%}%>

                                            </select>

                                        </p>
                                        <p> 
                                            <label for="employmentLevel" class="uname" > Select your current Employment Level</label>
                                            <select name="employmentLevel">
                                                <%
                                                    List<EmploymentLevel> listEmp = ManagerDAO.searchAll(new EmploymentLevel());
                                                    for (EmploymentLevel el : listEmp) {
                                                %>
                                                <option value="<%=el.getIdLevelOfEmployment()%>"><%=el.getEmploymentLevel()%></option>
                                                <%}%>

                                            </select>
                                        </p>


                                    </div><!-- Left grid -->

                                    <!-- Right Grid -->
                                    <div class="grid_8 competences">
                                        <p> 
                                            <label for="secondName" class="uname" data-icon="s">  Second Name</label>
                                            <input id="secondname" name="secondName" type="text" placeholder="Steven">
                                        </p>
                                        <p> 
                                            <label for="dob" class="uname" data-icon="b">  Date of Birth</label>
                                            <input id="dob" name="dob" required type="date" placeholder="">
                                        </p>
                                        <p> 
                                            <label for="addressLine2" class="uname" data-icon="a2">     Address Line 2</label>
                                            <input id="address2" name="addressLine2" type="text" placeholder="">
                                        </p>
                                        <p> 
                                            <label for="usernamesignup" class="uname" data-icon="p">   Post Code</label>
                                            <input id="postcode" name="postcode" required type="text" placeholder="">
                                        </p>
                                        <p> 
                                                <label for="postcodeStart">Postcode Start</label>
                                                <input id="postcodeStart" name="postcodeStart" required type="text">
                                            </p>


                                        <p> 
                                            <label for="personalUrl" class="uname" data-icon="u">  Personal URL</label>
                                            <input id="personalUrl" name="personalurl" type="url" placeholder="">
                                        </p>
                                         




                                        <p> 
                                            <label for="photo" class="uname" data-icon="p">  Photo</label>
                                            <input id="photo" name="photo" type="file" placeholder="">
                                        </p>




                                        <p> 
                                            <label for="studentStatus" class="uname" >   Select your Status</label>
                                            <select name="studentStatus">
                                                <%
                                                    List<PersonStatus> listPs = ManagerDAO.searchAll(new PersonStatus());
                                                    for (PersonStatus personStatus : listPs) {
                                                %>
                                                <option value="<%= personStatus.getIdpersonStatus()%>"><%= personStatus.getPersonStatus()%></option>
                                                <%}%>

                                            </select>
                                        </p>



                                        

                                    </div>  <!-- Right Grid ends -->
                                    <div class="grid_16 experiences">
                                     <h3>Basic Educational Information</h3>
<!--align four divs inline-->
                                <div class="container_tbl">

                                    <div class="grid_2_c1">
                                        <p> 
                                            <label for="NoofGCSESpasses" > No of GCSEs Passes</label>
                                            <input id="NoofGCSESpasses" name="NoofGCSESpasses" required type="number" placeholder="5">
                                        </p>
                                    </div>
                                    <div class="grid_2_c2">
                                        <p> 
                                            <label for="GCSEEnglishGrade">GCSE English Grade </label>
                                            <input id="GCSEEnglishGrade" name="GCSEEnglishGrade" type="text" placeholder="A*">
                                        </p>
                                    </div>

                                    <div class="grid_2_c3">
                                        <p> 
                                            <label for="GCSEMathsGrade" >GCSE Maths Grade </label>
                                            <input id="GCSEMathsGrade" name="GCSEMathsGrade" type="text" placeholder="A">
                                        </p>
                                    </div>

                                    <div class="grid_2_c4">
                                        <p> 
                                            <label for="fiveOrMoreGCSES" >  Five or More GCSEs passes</label>
                                            <input id="fiveOrMoreGCSES" name="fiveOrMoreGCSES" required type="checkbox" placeholder="">
                                        </p>
                                    </div>

                                </div>
                                <div class="container_tbl">
                                    <div class="grid_2_c1">
                                        <p>    

                                            <label for="noOfAlevels" > No Of A-levels</label>
                                            <input id="noOfAlevels" name="noOfAlevels" type="number" placeholder="1">
                                        </p>
                                    </div>
                                    <div class="grid_2_c2">
                                        <p> 
                                            <label for="ucasPoints">UCAS Points </label>
                                            <input id="ucasPoints" name="ucasPoints" type="number" placeholder="145">
                                        </p>
                                    </div>
                                </div>
                                    </div><!--basic edu ends-->
                                         <div class="grid_16">
                                    <h3>Other Information</h3>
                                    <p> 
                                        <label for="authorityToWorkStatement">Work Statement </label>
                                        <input id="authorityToWorkStatement" name="authorityToWorkStatement" type="text" placeholder="List restrictions on work, e.g. max 20 hours per week">
                                    </p>
                                    <div class="container_tbl">
                                        <div class="grid_2_c1">
                                            <p> 
                                                <label for="legallyBond">Legally Bond</label>
                                                <input id="legallyBond" name="legallyBond" type="checkbox">
                                            </p>
                                        </div>
                                        <div class="grid_2_c2">
                                           
                                        </div>
                                        <div class="grid_2_c4">
                                            <p> 
                                                <label for="penaltyPoints">Penalty Points</label>
                                                <input id="penaltyPoints" name="penaltyPoints" type="number">
                                            </p>
                                        </div>
                                    </div>

                                    

                                </div>
                                </div>

                                <!-- Login Details -->
                                <div class="grid_16 experiences"><!-- Bottom Grid  -->
                                    <h3>Signin Details</h3>



                                    <p> 
                                        <label for="userEmail" class="youmail" data-icon="e">Username(Primary Email)</label>
                                        <input id="userEmail" name="userEmail" required type="email" placeholder="mysupermail@mail.com"> 
                                    </p>
                                    <p> 
                                        <label for="password" class="youpasswd" data-icon="p">Your password </label>
                                        <input id="password" name="password" required type="password" placeholder="eg. X8df!90EO">
                                    </p>
                                    <p> 
                                        <label for="password" class="youpasswd" data-icon="p">Please confirm your password </label>
                                        <input id="confirmpassword" name="confirmpassword" type="password" placeholder="eg. X8df!90EO">
                                    </p>
                                    <div class="grid_16">
                                    <div class="grid_8 apropos"><p class="signin button"> 
                                        <input name="AddUser" type="submit" value="Sign up"/> </div>
                                        
                                        <div class="grid_8 competences">
                                             <p class="change_link">  
                                        Already a member ?
                                        <a href="login.jsp" class="to_register"> Go and log in </a>
                                        </div>
                                       
                                    </div>
                                   
                                    
                                    
                                </div><!--grid 16 Bottom Grid ends -->


                            </section><!--Container 16-->

                        </div><!--register-->

                    </div><!--wrapper-->
                </div>  <!--container_demo-->
            </section>

        </form>




        <%
            String msg = "";
            if (msg.equals("")) {

            } else {
        %>
        <div><%=msg%></div>
        <%
            }
        %>

   
        <%@include file="Footer_RecruitMe.html" %>

</body>
</html>

