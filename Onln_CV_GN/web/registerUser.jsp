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
                                <h1> User Registration</h1> 
                                <div class="grid_16">
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

                                    </div>  <!-- Right Grid ends -->
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

