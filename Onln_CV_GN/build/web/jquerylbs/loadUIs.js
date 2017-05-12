function loadEducationalQualificationForm() {
    var obj=getXMLHttprequest();               
    if(obj!==null){
        obj.onreadystatechange=function(){
            if(obj.readyState===4){
                var res=obj.responseText;
                //alert(res);
                document.getElementById("profile_edu").innerHTML=res;
            }
        }   ;             
        obj.open("POST","addEduQualifications.jsp",true);
        obj.setRequestHeader("Content-Type", "application/x-www-form-urlencoded");
        obj.send(null);                
    }   
}

function loadProfessionalQualificationForm(){
    
    var obj=getXMLHttprequest();               
    if(obj!==null){
        obj.onreadystatechange=function(){
            if(obj.readyState===4){
                var res=obj.responseText;
                //alert(res);
                document.getElementById("profile_prof").innerHTML=res;
            }
        }   ;             
        obj.open("POST","addProfQualification.jsp",true);
        obj.setRequestHeader("Content-Type", "application/x-www-form-urlencoded");
        obj.send(null);                
    }   
}

function loadExperienceForm(){
    
    var obj=getXMLHttprequest();               
    if(obj!==null){
        obj.onreadystatechange=function(){
            if(obj.readyState===4){
                var res=obj.responseText;
                //alert(res);
                document.getElementById("profile_exprnce").innerHTML=res;
            }
        }   ;             
        obj.open("POST","addExperience.jsp",true);
        obj.setRequestHeader("Content-Type", "application/x-www-form-urlencoded");
        obj.send(null);                
    }   
}

function loadJobPreferenceForm(){
    
    var obj=getXMLHttprequest();               
    if(obj!==null){
        obj.onreadystatechange=function(){
            if(obj.readyState===4){
                var res=obj.responseText;
                //alert(res);
                document.getElementById("profile_jobPrefer").innerHTML=res;
            }
        }   ;             
        obj.open("POST","addJobPreference.jsp",true);
        obj.setRequestHeader("Content-Type", "application/x-www-form-urlencoded");
        obj.send(null);                
    }   
}

function loadSkillForm(){
    
    var obj=getXMLHttprequest();               
    if(obj!==null){
        obj.onreadystatechange=function(){
            if(obj.readyState===4){
                var res=obj.responseText;
                //alert(res);
                document.getElementById("profile_skill").innerHTML=res;
            }
        }   ;             
        obj.open("POST","addSkill.jsp",true);
        obj.setRequestHeader("Content-Type", "application/x-www-form-urlencoded");
        obj.send(null);                
    }   
}

function loadRefereeDetailForm(){
    
    var obj=getXMLHttprequest();               
    if(obj!==null){
        obj.onreadystatechange=function(){
            if(obj.readyState===4){
                var res=obj.responseText;
                //alert(res);
                document.getElementById("profile_referee").innerHTML=res;
            }
        }   ;             
        obj.open("POST","addRefereeDetails.jsp",true);
        obj.setRequestHeader("Content-Type", "application/x-www-form-urlencoded");
        obj.send(null);                
    }   
}
