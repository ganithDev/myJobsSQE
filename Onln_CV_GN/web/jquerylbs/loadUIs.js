function loadEducationalQualifications() {
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