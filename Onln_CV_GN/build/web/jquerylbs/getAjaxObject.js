function getXMLHttprequest(){
    
    var jsobject;
    if(window.XMLHttpRequest){
        jsobject=new XMLHttpRequest();
    }else if(window.ActiveXObject){
        jsobject=new ActtiveXObject("Microsoft.XMLHTTP");
    }
    else{
        alert("Browser dosnt suppport ajax");
    }
    
    return jsobject;
}
