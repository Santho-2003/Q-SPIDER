function table(){
    var name=document.getElementById("name").value
    var reg=document.getElementById("reg").value
    var no=document.getElementById("no").value
    var sub1=document.getElementById("mark1").value
    var sub2=document.getElementById("mark2").value
    var sub3=document.getElementById("mark3").value
    var sub4=document.getElementById("mark4").value
    var sub5=document.getElementById("mark5").value
    
    var total=sub1+sub2+sub3+sub4+sub5
    var avg=total/5
    alert(total)
   }