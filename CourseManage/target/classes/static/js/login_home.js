// JavaScript Document
function loginForm()
{
var x=document.forms["myForm"]["id"].value;
if (x==null || x==""){
  alert("用户名不能为空！");
  return false;
  }
var y=document.forms["myForm"]["password"].value;
if (y==null || y==""){
  alert("密码不能为空！");
  return false;
  }
  else{
  $.ajax({
    url: "/signin",
    dataType: "json",
    type: "post",
    content-type:"application/json;charset=utf-8",
    data: JSON.stringify( { "id": $('#id').val(), "password": $('#password').val() } ),
    processData: false,
    success: function( data, textStatus, jQxhr ){
	//成功回调
    },
    error: function( jqXhr, textStatus, errorThrown ){
	//失败回调
    }
});
}
}
