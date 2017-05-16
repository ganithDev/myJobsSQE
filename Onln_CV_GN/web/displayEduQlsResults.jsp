
    <%@page import="java.util.List"%>
<%@page import="com.cv_gn.dao.PersonDAOImpl"%>
<%@page import="com.cv_gn.model.Person"%>
<div>
        <%
            String eduLevel="",courseName="",mainSubject="",nameOfInstitution="",country="",result="",thesesTitle="";
            eduLevel=request.getParameter("sectorID");
            if(eduLevel==null){
            %>
          <p>No Results.</p>
        <%
            }else{
            
            List<Person> Lst = new PersonDAOImpl().searchCVSpecificEduQualification(eduLevel, courseName, mainSubject, nameOfInstitution, country, result, thesesTitle);
        if (Lst.size()==0) {
                %>
                <p>No Results.</p>
        <%
            }else{
%>
<div class="container_tb2">
<div class="grid_three_c1">Name</div>
<div class="grid_three_c2">Preferred Job</div>
<div class="grid_three_c3">Email</div>
<div class="grid_three_c4">Mobile</div>
                <%
         for (Person itm : Lst) {%>

<div class="grid_three_c1"><%= itm.getPersonTitle().getTitle()+"."+itm.getForename1()+" "+itm.getSurname() %></div>
<div class="grid_three_c2"><%= new PersonDAOImpl().loadPreferredJobForPerson(itm) %></div>
<div class="grid_three_c3"><%= itm.getUser().getUsername() %> </div>
<div class="grid_three_c4"><%= itm.getMobile() %></div>
        <%}
}}
        %>
</div>
    </div>
