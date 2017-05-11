<%-- 
    Document   : profile
    Created on : May 8, 2017, 11:06:11 PM
    Author     : Ganith Perera
--%>

<%@page import="java.util.List"%>
<%@page import="com.cv_gn.dao.ManagerDAO"%>
<%@page import="com.cv_gn.model.PersonContactMode"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Profile | RecruitMe</title>
        <%@include file="fileSet.html" %>
        <%@include file="Header_RecruitMe.html" %>
    </head>
    <body>
        <section>				
            <div id="container_demo"><!--Contain design related to form-->

                <div id="wrapper"><!--Contain design related to form-->


                    <div id="register" class="animate form"> <!--Contain design related to form-->
                        <section role="main" class="container_16 clearfix"><!--Contain design related to two grids-->
                            <div class="grid_16 experiences"><!-- Bottom Grid  -->
                                <h3>Educational Qualifications</h3>
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
                                            <input id="GCSEEnglishGrade" name="GCSEEnglishGrade" required type="text" placeholder="A*">
                                        </p>
                                    </div>

                                    <div class="grid_2_c3">
                                        <p> 
                                            <label for="GCSEMathsGrade" >GCSE Maths Grade </label>
                                            <input id="GCSEMathsGrade" name="GCSEMathsGrade" required type="text" placeholder="A">
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
                                            <input id="noOfAlevels" name="noOfAlevels" required type="number" placeholder="1">
                                        </p>
                                    </div>
                                    <div class="grid_2_c2">
                                        <p> 
                                            <label for="ucasPoints">UCAS Points </label>
                                            <input id="ucasPoints" name="ucasPoints" required type="number" placeholder="145">
                                        </p>
                                    </div>



                                </div>

                                <div class="grid_16">
                                    <p> 
                                        <label for="authorityToWorkStatement">Work Statement </label>
                                        <input id="authorityToWorkStatement" name="authorityToWorkStatement" required type="text" placeholder="List restrictions on work, e.g. max 20 hours per week">
                                    </p>
                                    <div class="container_tbl">
                                        <div class="grid_2_c1">
                                            <p> 
                                                <label for="legallyBond">Legally Bond</label>
                                                <input id="legallyBond" name="legallyBond" required type="checkbox">
                                            </p>
                                        </div>
                                        <div class="grid_2_c2">
                                            <p> 
                                                <label for="postcodeStart">Postcode Start</label>
                                                <input id="postcodeStart" name="postcodeStart" required type="checkbox">
                                            </p>
                                        </div>
                                        <div class="grid_2_c4">
                                            <p> 
                                                <label for="penaltyPoints">Penalty Points</label>
                                                <input id="penaltyPoints" name="penaltyPoints" required type="number">
                                            </p>
                                        </div>
                                    </div>

                                    <div class="grid_8 apropos"><p class="signin button"> 
                                            <input name="AddUser" type="submit" value="Generate CV"/> 
                                    </div>


                                </div>


                            </div><!--grid 16 Bottom Grid ends -->
                        </section><!--Contain design related to two grids-->
                    </div></div></div>
        </section>
        <br><br><br>
        <p> 
            
  
        <form method="POST" action="/Onln_CV_GN/PDFGeneratorServlet">
            <input type="text" id="secondname" name="secondName" value="Email" readonly="readonly" />
            <input type="text" id="firstname" name="firstName" value="Naduni" readonly="readonly" />
            
            <input type="submit" value="Generate PDF" name="submit" />
        </form>
    </p>


</body>
<%@include file="Footer_RecruitMe.html" %>
</html>
