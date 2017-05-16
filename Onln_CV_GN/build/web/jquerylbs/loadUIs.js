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

function loadSearchForm(){
    var filterBy=document.getElementById("filterCriteria").value;
    var obj=getXMLHttprequest();
   
    if(filterBy==="Job or Sector"){
    if(obj!==null){
        obj.onreadystatechange=function(){
            if(obj.readyState===4){
                var res=obj.responseText;
                //alert(res);
                document.getElementById("searchResults").innerHTML=res;
            }
        }   ;             
        obj.open("POST","searchCVJobPrefernce.jsp",true);
        obj.setRequestHeader("Content-Type", "application/x-www-form-urlencoded");
        obj.send(null);                
    }}
  if(filterBy==="Minimum education level"){
    if(obj!==null){
        obj.onreadystatechange=function(){
            if(obj.readyState===4){
                var res=obj.responseText;
                //alert(res);
                document.getElementById("searchResults").innerHTML=res;
            }
        }   ;             
        obj.open("POST","searchCVMinEduLevel.jsp",true);
        obj.setRequestHeader("Content-Type", "application/x-www-form-urlencoded");
        obj.send(null);                
    }}
  if(filterBy==="Minimum number of GCSE passes"){
    if(obj!==null){
        obj.onreadystatechange=function(){
            if(obj.readyState===4){
                var res=obj.responseText;
                //alert(res);
                document.getElementById("searchResults").innerHTML=res;
            }
        }   ;             
        obj.open("POST","searchCVNoOfGCSEs.jsp",true);
        obj.setRequestHeader("Content-Type", "application/x-www-form-urlencoded");
        obj.send(null);                
    }}
  if(filterBy==="Specific educational qualification"){
    if(obj!==null){
        obj.onreadystatechange=function(){
            if(obj.readyState===4){
                var res=obj.responseText;
                //alert(res);
                document.getElementById("searchResults").innerHTML=res;
            }
        }   ;             
        obj.open("POST","searchCVEduQualification.jsp",true);
        obj.setRequestHeader("Content-Type", "application/x-www-form-urlencoded");
        obj.send(null);                
    }}
  if(filterBy==="Specific professional qualification"){
    if(obj!==null){
        obj.onreadystatechange=function(){
            if(obj.readyState===4){
                var res=obj.responseText;
                alert(res);
                document.getElementById("searchResults").innerHTML=res;
            }
        }   ;             
        obj.open("POST","searchCVProfQualification.jsp",true);
        obj.setRequestHeader("Content-Type", "application/x-www-form-urlencoded");
        obj.send(null);                
    }}

                                        
  if(filterBy==="Specific skill"){
    if(obj!==null){
        obj.onreadystatechange=function(){
            if(obj.readyState===4){
                var res=obj.responseText;
                //alert(res);
                document.getElementById("searchResults").innerHTML=res;
            }
        }   ;             
        obj.open("POST","searchCVSkill.jsp",true);
        obj.setRequestHeader("Content-Type", "application/x-www-form-urlencoded");
        obj.send(null);                
    }}

 if(filterBy==="Specific experience"){
    if(obj!==null){
        obj.onreadystatechange=function(){
            if(obj.readyState===4){
                var res=obj.responseText;
                //alert(res);
                document.getElementById("searchResults").innerHTML=res;
            }
        }   ;             
        obj.open("POST","searchCVExperience.jsp",true);
        obj.setRequestHeader("Content-Type", "application/x-www-form-urlencoded");
        obj.send(null);                
    }}
}


function searchCVJobPrefernce(){
    //  alert("jj")
    var paramSet="jobTitle="+document.getElementById('jobTitle').value;
    
   
    
    var obj=getXMLHttprequest();
    if(obj!==null){
   
        obj.onreadystatechange=function(){
            // alert("okkkkoo")  
            if(obj.readyState===4){
                var res=obj.responseText;
                //   alert(res);
                document.getElementById("resultsJobPrefer").innerHTML=res;
            }
        };
        
        //  alert("OKKKKKKKK");
        obj.open("POST", "searchCVJobPrefernce.jsp", true);
        obj.setRequestHeader("Content-Type", "application/x-www-form-urlencoded");
        obj.send(paramSet);
 
    }
    
}

function searchCVMinEduLevel(){
    //  alert("jj")
    var paramSet="ucasPoints="+document.getElementById('ucasPoints').value;
    paramSet+="&gcseMathsGrade="+document.getElementById('gcseMathsGrade').value;
    paramSet+="&gcseEnglishGrade="+document.getElementById('gcseEnglishGrade').value;
    
    
    var obj=getXMLHttprequest();
    if(obj!==null){
   
        obj.onreadystatechange=function(){
            // alert("okkkkoo")  
            if(obj.readyState===4){
                var res=obj.responseText;
                //   alert(res);
                document.getElementById("resultsMinEduLvl").innerHTML=res;
            }
        };
        
        //  alert("OKKKKKKKK");
        obj.open("POST", "searchCVMinEduLevel.jsp", true);
        obj.setRequestHeader("Content-Type", "application/x-www-form-urlencoded");
        obj.send(paramSet);
 
    }
    
}

function searchCVNoOfGCSEs(){
    //  alert("jj")
    var paramSet="NoofGCSESpasses="+document.getElementById('NoofGCSESpasses').value;
   
   
    
    var obj=getXMLHttprequest();
    if(obj!==null){
   
        obj.onreadystatechange=function(){
            // alert("okkkkoo")  
            if(obj.readyState===4){
                var res=obj.responseText;
                //   alert(res);
                document.getElementById("resultsNoofGCSESpasses").innerHTML=res;
            }
        };
        
        //  alert("OKKKKKKKK");
        obj.open("POST", "displayNoOfGCSEResults.jsp", true);
        obj.setRequestHeader("Content-Type", "application/x-www-form-urlencoded");
        obj.send(paramSet);
 
    }
    
}
function searchCVSpecificEduQualification(){
    //  alert("jj")
    var paramSet="eduLevel="+document.getElementById('eduLevel').value;
    paramSet+="&courseName="+document.getElementById('courseName').value;
    paramSet+="&mainSubject="+document.getElementById('mainSubject').value;
    paramSet+="&nameOfInstitution="+document.getElementById('nameOfInstitution').value;
    paramSet+="&country="+document.getElementById('country').value;
    paramSet+="&result="+document.getElementById('result').value;
    paramSet+="&thesesTitle="+document.getElementById('thesesTitle').value;
   
    
    var obj=getXMLHttprequest();
    if(obj!==null){
   
        obj.onreadystatechange=function(){
            // alert("okkkkoo")  
            if(obj.readyState===4){
                var res=obj.responseText;
                //   alert(res);
                document.getElementById("resultsEduQualification").innerHTML=res;
            }
        };
        
        //  alert("OKKKKKKKK");
        obj.open("POST", "displayEduQlsResults.jsp", true);
        obj.setRequestHeader("Content-Type", "application/x-www-form-urlencoded");
        obj.send(paramSet);
 
    }
    
}
function searchCVSpecificProfQualification(){
     alert("jj")
    var paramSet="qualificationName="+document.getElementById("qualificationName").value;
    paramSet+="&sectorID="+document.getElementById("sectorID").value;
    paramSet+="&awardingBody="+document.getElementById("awardingBody").value;
    paramSet+="&nameOfInstitution="+document.getElementById("nameOfInstitution").value;
    alert("params:"+paramSet);
   
    
    var obj=getXMLHttprequest();
    if(obj!==null){
   
        obj.onreadystatechange=function(){
            // alert("okkkkoo")  
            if(obj.readyState===4){
                var res=obj.responseText;
                //   alert(res);
                document.getElementById("resultsProfQualification").innerHTML=res;
            }
        };
        
        //  alert("OKKKKKKKK");
        obj.open("POST", "displayProfQlsResults.jsp", true);
        obj.setRequestHeader("Content-Type", "application/x-www-form-urlencoded");
        obj.send(paramSet);
 
    }
    
}
function searchCVSpecificSkill(){
   //  alert("jj");
     //alert("skillLvlID="+document.getElementById('skilllevelID').value);
    var paramSet="skilllevelID="+document.getElementById('skilllevelID').value;
    paramSet+="&skillID="+document.getElementById('skillID').value;
    
    alert("params"+paramSet);
    
    var obj=getXMLHttprequest();
    if(obj!==null){
   
        obj.onreadystatechange=function(){
            // alert("okkkkoo")  
            if(obj.readyState===4){
                var res=obj.responseText;
                  alert(res);
                document.getElementById("resultsSkills").innerHTML=res;
            }
        };
        
        //  alert("OKKKKKKKK");
        obj.open("POST", "displaySkillResults.jsp", true);
        obj.setRequestHeader("Content-Type", "application/x-www-form-urlencoded");
        obj.send(paramSet);
 
    }
    
}
function searchCVSpecificExperience(){
    //  alert("jj")
    var paramSet="jobTitleID="+document.getElementById('jobTitleID').value;
    paramSet+="&levelOfEmployment="+document.getElementById('levelOfEmployment').value;
    paramSet+="&employerName="+document.getElementById('employerName').value;
    paramSet+="&keyDuties="+document.getElementById('keyDuties').value;
  
    
    var obj=getXMLHttprequest();
    if(obj!==null){
   
        obj.onreadystatechange=function(){
            // alert("okkkkoo")  
            if(obj.readyState===4){
                var res=obj.responseText;
                //   alert(res);
                document.getElementById("resultsExperince").innerHTML=res;
            }
        };
        
        //  alert("OKKKKKKKK");
        obj.open("POST", "searchCVExperience.jsp", true);
        obj.setRequestHeader("Content-Type", "application/x-www-form-urlencoded");
        obj.send(paramSet);
 
    }
    
}

