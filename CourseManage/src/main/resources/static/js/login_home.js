$.ajax({
    url:"signin",
    dataType: "json",
    type: "get",
    contentType:"application/json;charset=utf-8",
    success:function(data){
        alert("success!");
        window.location.href="home.html";
    }
});
function loginForm()
{
var x=document.forms["myForm"]["id"].value;
if (x==null){
    //window.location.href="/static/home.html";
    alert("用户名不能为空！");
    window.location.href="student.html";
    return false;
  }
var y=document.forms["myForm"]["password"].value;
if (y==null){
  alert("密码不能为空！");
  return false;
  }
  else{
  $.ajax({
    url: "/signin",
    dataType: "json",
    type: "post",
    contentType:"application/json;charset=utf-8",
    data: JSON.stringify( { "id": $('#id').val(), "password": $('#password').val() } ),
    processData: false,
    success: function( data, textStatus, jQxhr ){
	//成功回调
        alert(data.toString());
        window.location.href="/course?type=teacher";
    },
    error: function( jqXhr, textStatus, errorThrown ){
	//失败回调
    }
});
}
}
