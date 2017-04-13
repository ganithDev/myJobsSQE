<%-- 
    Document   : registerUser
    Created on : Apr 9, 2017, 11:50:31 AM
    Author     : Naduni Pulsarani
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <!-- Load jQuery and the validate plugin -->

        <script src="/Onln_CV_GN/jquerylbs/jquery-19.1.js"></script>
        <script src="/Onln_CV_GN/jquerylbs/jquery.validate.min.js"></script>
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
                        userEmail:{required: true,email: true},
                        password:{required: true,minlength: 6},
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
                        photo: {required: "Please select your photo"},
                        studentstatus: {required: "Student Staus required"},
                        mobile: {required: "Mobile required"},
                        landline: {required: "Land Line required"},
                        dob: {required: "Date of Birth required"},
                        userEmail:{required: "Enter valid email for your username"},
                        password:{required: "Filed "},
                        agree: "Please accept our policy"

                    },
                    submitHandler: function (form) {
                        form.submit();
                    }
                });

            });

        </script>
        <!-- End jQuery Form Validation code -->

    </head>
    <body>
        <h1 align="center">User Registration Page

        </h1>
        <form method="POST" action="/Onln_CV_GN/UserRegistrationController?actionType=AddUser" novalidate="novalidate" id="register-form">
            <table border="0" align="center">

                <tbody>
                    <tr>
                        <td>Title</td>
                        <td><select name="title">

                                <option value="Mrs">Mrs</option>


                                <option value="Mr">Mr</option>

                            </select></td>
                    </tr>
                    <tr>
                        <td>First Name</td>
                        <td><input type="text" name="firstName" id ="firstname" value="" /></td>
                    </tr>
                    <tr>
                        <td>Second Name</td>
                        <td><input type="text" name="secondName" id="secondname" value="" /></td>
                    </tr>
                    <tr>
                        <td>Sur Name</td>
                        <td><input type="text" name="surName" id="surname"  value="" /></td>
                    </tr>
                    <tr>
                        <td>Address line 1</td>
                        <td><input type="text" name="address1" id="address1" value="" /></td>
                    </tr>
                    <tr>
                        <td>Address line 2</td>
                        <td><input type="text" name="address2" id="address2" value="" /></td>
                    </tr>
                    <tr>
                        <td>Town</td>
                        <td><input type="text" name="town" id ="town" value="" /></td>
                    </tr>
                    <tr>
                        <td>Post Code</td>
                        <td><input type="text" name="postcode" id ="postcode" value="" /></td>
                    </tr>
                    <tr>
                        <td>Second Email</td>
                        <td><input type="email" name="secondEmail" id ="secondemail" value="" /></td>
                    </tr>
                    <tr>
                        <td>Personal URL</td>
                        <td><input type="url" name="personalurl" id="personalUrl" value="" /></td>
                    </tr>
                    <tr>
                        <td>Photo</td>
                        <td><input type="file" name="photo" id="photo" value="" /></td>
                    </tr>
                    <tr>
                        <td>Student Status</td>
                        <td><input type="text" name="studentStatus" id="studentstatus" value="" /></td>
                    </tr>
                    <tr>
                        <td>Mobile</td>
                        <td><input type="tel" name="mobile" id="mobile" value="" size="10" /></td>
                    </tr>
                    <tr>
                        <td>Land Line</td>
                        <td><input type="text" name="landLine" id="landline" value="" size="10" /></td>
                    </tr>
                    <tr>
                        <td>Date of Birth</td>
                        <td><input type="date" name="dob" id ="dob" value="" /></td>
                    </tr>
                     <tr>
                        <td>Username</td>
                        <td><input type="email" name="userEmail" id ="userEmail" value="" /></td>
                    </tr>
                     <tr>
                        <td>Password</td>
                        <td><input type="password" name="password" id ="password" value="" /></td>
                    </tr>
                    <%
                    String msg="";
                    if(msg.equals("")){
                       
                    }else{
                    %>
                <div><%=msg%></div>
                    <%
                    }
                    %>
                   
                    

                </tbody>
            </table>
            <center >
                <input name="adduser" type="submit"   value= "Register" height="20" width="60"/>


            </center>
        </form>

    </body>
</html>
