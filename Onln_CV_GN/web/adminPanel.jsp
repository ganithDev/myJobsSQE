<%-- 
    Document   : adminPanel
    Created on : May 10, 2017, 4:20:36 PM
    Author     : Ganith Perera
--%>


<%@page import="com.cv_gn.model.JobTitle"%>
<%@page import="com.cv_gn.model.Sector"%>
<%@page import="com.cv_gn.model.UserType"%>
<%@page import="com.cv_gn.model.SkillLevel"%>
<%@page import="com.cv_gn.model.Skill"%>
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


        <title>Admin Panel | RecruitMe</title>
        <%@include file="fileSet.html" %>

        <!-- jQuery Form Validation code -->
        <script>

            // When the browser is ready...
            $(function () {

                // Setup form validation on the #register-form element
                $("#register-form").validate({
                    // Specify the validation rules
                    rules: {
                        firstname: {required: true},
                        secondname: {required: true},
                        surname: {required: true},
                        address1: {required: true},
                        address2: {required: true},
                        town: {required: true},
                        postcode: {required: true},
                        secondemail: {required: true, email: true},
                        // personalurl: {required: true},
                        // photo: {required: true},
                        studentstatus: {required: true},
                        mobile: {required: true, minlength: 10, number: true},
                        // landline: {required: true, minlength: 10, number: true},
                        dob: {required: true},
                        userEmail: {required: true, email: true},
                        password: {required: true, minlength: 6},
                        agree: "required"
                    },
                    // Specify the validation error messages
                    messages: {
                        firstname: {required: "First Name required"},
                        secondname: {required: "Second Name required"},
                        surname: {required: "Surname required"},
                        address1: {required: "Address 1 required"},
                        address2: {required: "Address 2 required"},
                        town: {required: "Town required"},
                        postcode: {required: "Postcode required"},
                        secondemail: {required: "Please enter a valid email address"},
                        // photo: {required: "Please select your photo"},
                        studentstatus: {required: "Student Staus required"},
                        mobile: {required: "Mobile required"},
                        landline: {required: "Land Line required"},
                        dob: {required: "Date of Birth required"},
                        userEmail: {required: "Enter valid email for your username"},
                        password: {required: "Field is required "},
                        agree: "Please accept our policy"

                    },
                    submitHandler: function (form) {
                        form.submit();
                    }
                });

            });

        </script>
        <!-- End jQuery Form Validation code -->
        <%@include file="Header_RecruitMe.html" %>
    </head>
    <body>

        <!-- Corps -->
        <form method="POST" action="UserRegistrationController?actionType=AddUser" novalidate id="register-form" autocomplete="on">
            <section>				
                <div id="container_demo"><!--Contain design related to form-->

                    <div id="wrapper"><!--Contain design related to form-->


                        <div id="register" class="animate form"> <!--Contain design related to form-->
                            <section role="main" class="container_16 clearfix"><!--Contain design related to two grids-->
                                <h1> Admin Panel</h1> 
                                <div class="container_tb2">
                                    <!-- Left grid -->
                                    <div class="grid_three_c1">

                                        <p> 

                                            <label for="title" class="uname" data-icon="u"> Available Data</label>
                                            <select name="title">
                                                <%
                                                    List<PersonTitle> ptsList = ManagerDAO.searchAll(new PersonTitle());
                                                    for (PersonTitle pt : ptsList) {
                                                %>
                                                <option value="<%= pt.getIdpersonTitle()%>"><%= pt.getTitle()%></option>
                                                <%}%>

                                            </select> 
                                        </p>
                                        <p> 
                                            <label for="studentStatus" class="uname" >  Your Status</label>
                                            <select name="studentStatus">
                                                <%
                                                    List<PersonStatus> listPs = ManagerDAO.searchAll(new PersonStatus());
                                                    for (PersonStatus personStatus : listPs) {
                                                %>
                                                <option value="<%= personStatus.getIdpersonStatus()%>"><%= personStatus.getPersonStatus()%></option>
                                                <%}%>

                                            </select>
                                        </p>
                                        <p> 
                                            <label for="preferredContactMode" class="uname" > Preferred Contact Mode</label>

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
                                            <label for="employmentLevel" class="uname" > Current Employment Level</label>
                                            <select name="employmentLevel">
                                                <%
                                                    List<EmploymentLevel> listEmp = ManagerDAO.searchAll(new EmploymentLevel());
                                                    for (EmploymentLevel el : listEmp) {
                                                %>
                                                <option value="<%=el.getIdLevelOfEmployment()%>"><%=el.getEmploymentLevel()%></option>
                                                <%}%>

                                            </select>
                                        </p>

                                        <p> 
                                            <label for="skillLevel" class="uname" > Skill Level</label>
                                            <select name="skillLevel">
                                                <%
                                                    List<SkillLevel> listSkillLevel = ManagerDAO.searchAll(new SkillLevel());
                                                    for (SkillLevel el : listSkillLevel) {
                                                %>
                                                <option value="<%=el.getIdskillLevel()%>"><%=el.getSkillLevel()%></option>
                                                <%}%>

                                            </select>
                                        </p>
                                        <p> 
                                            <label for="sector" class="uname" > Skill</label>
                                            <select name="sector">
                                                <%
                                                    List<Skill> listSkill = ManagerDAO.searchAll(new Skill());
                                                    for (Skill el : listSkill) {
                                                %>
                                                <option value="<%=el.getIdSkill()%>"><%=el.getSkillName()%></option>
                                                <%}%>

                                            </select>
                                        </p>
                                        <p> 
                                            <label for="userType" class="uname" > User Type</label>
                                            <select name="userType">
                                                <%
                                                    List<UserType> listUserType = ManagerDAO.searchAll(new UserType());
                                                    for (UserType el : listUserType) {
                                                %>
                                                <option value="<%=el.getIdUserType()%>"><%=el.getUserType()%></option>
                                                <%}%>

                                            </select>
                                        </p>


                                        <p> 
                                            <label for="sector" class="uname" > Sector</label>
                                            <select name="sector">
                                                <%
                                                    List<Sector> listSector = ManagerDAO.searchAll(new Sector());
                                                    for (Sector el : listSector) {
                                                %>
                                                <option value="<%=el.getIdSector()%>"><%=el.getSectorTitle()%></option>

                                                <%}%>

                                            </select>
                                        </p>

                                    </div><!-- Left grid -->
                                    <div class="grid_three_c2">
                                        <p> 
                                            <label for="title" class="uname" data-icon="u"> Enter Title</label>
                                            <input type="text" name="title" value="" />
                                        </p>
                                        <p>
                                            <label for="title" class="uname" data-icon="u"> Enter Status</label>
                                            <input type="text" name="status" value="" />
                                        </p>
                                        <p>
                                            <label for="title" class="uname" data-icon="u"> Enter Contact Mode</label>
                                            <input type="text" name="contactmode" value="" />
                                        </p>
                                        <p>
                                            <label for="title" class="uname" data-icon="u"> Enter Current Employee Level</label>
                                            <input type="text" name="employeelevel" value="" />
                                        </p>
                                        <p>
                                            <label for="title" class="uname" data-icon="u"> Enter Skill Level</label>
                                            <input type="text" name="skilllevel" value="" />
                                        </p>
                                        <p>
                                            <label for="title" class="uname" data-icon="u"> Enter Skill</label>
                                            <input type="text" name="skilllevel" value="" />
                                        </p>
                                        <p>
                                            <label for="title" class="uname" data-icon="u"> Enter User Type</label>
                                            <input type="text" name="usertype" value="" />
                                        </p>
                                        <p> 
                                            <label for="jobtitle" class="uname" > Sector</label>
                                            <select name="jobtitle">
                                                <%
                                                    List<JobTitle> listJobTitle = ManagerDAO.searchAll(new JobTitle());
                                                    for (JobTitle el : listJobTitle) {
                                                %>
                                                <option value="<%=el.getIdJobTitle()%>"><%=el.getJobTitle()%></option>

                                                <%}%>

                                            </select>
                                        </p>

                                    </div>

                                    <!-- Right Grid -->
                                    <div class="grid_three_c3">  
                                        <p> 
                                            <input type="submit" value="Add" />
                                        </p>
                                        <p> 
                                            <input type="submit" value="Add" />
                                        </p>
                                        <p> 
                                            <input type="submit" value="Add" />
                                        </p>
                                        <p> 
                                            <input type="submit" value="Add" />
                                        </p>
                                        <p> 
                                            <input type="submit" value="Add" />
                                        </p>
                                        <p> 
                                            <input type="submit" value="Add" />
                                        </p>
                                        <p> 
                                            <input type="submit" value="Add" />
                                        </p>
                                         <p>
                                            <label for="title" class="uname" data-icon="u"> Enter Job Title</label>
                                            <input type="text" name="usertype" value="" />
                                        </p>
                                        


                                    </div>  <!-- Right Grid ends -->
                                    <div class="grid_three_c4">   

                                       <p> 
                                            <input type="submit" value="Add" />
                                        </p>



                                    </div>
                                </div>

                                <!-- Login Details -->
                                <div class="grid_16 experiences"><!-- Bottom Grid  -->
                                    <h3>Signin Details</h3>
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

