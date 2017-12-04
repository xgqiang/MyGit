
<!DOCTYPE html>
<html lang="en">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=gb2312">
    <meta name="viewport" content="width=device-width,
                                     initial-scale=1.0,
                                     maximum-scale=1.0,
                                     user-scalable=no">
    <title>ClassManage</title>
    <!-- 最新版本的 Bootstrap 核心 CSS 文件 -->
    <link rel="stylesheet" href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css"
          integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">

    <!-- 可选的 Bootstrap 主题文件（一般不用引入） -->
    <link rel="stylesheet" href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap-theme.min.css"
          integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp" crossorigin="anonymous">

    <!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
    <script src="https://cdn.bootcss.com/bootstrap/3.3.7/js/bootstrap.min.js"
            integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa"
            crossorigin="anonymous"></script>
<style type="text/css">
body {background-image:url("back.png");
background-repeat:no-repeat;
background-size:100%!important;
overflow: hidden;
position: fixed;
 width:100%;  
    height:100%; 
font-size:100%;
}

.GreyPanel
{
width: 45%;
height: 100%;
background-color: #262626;
opacity:0.4;
  filter:alpha(opacity=40); 
  position:absolute;
  left:55%;
  top:0%;
}

.ClassManage
{
 position:absolute;
  left:61%;
  top:15%;
font-size: 7.2em;
font-family:"YouYuan";
font-weight:bold;
color:white;
width: 600px;
}


.LoginWayOne
{
position:absolute;
  left:70%;
  top:33%;
 width: 9%;
 height: 5%;
background-color:#00FFFF;
font-size:1.5em;
text-align:center;
font-family:"Arial";
}


.LoginWayTwo
{
position:absolute;
  left:79%;
  top:33%;
 width: 6%;
 height: 5%;
background-color:#FFFFFF;
font-size:1.5em;
text-align:center;
font-family:"Arial";
}


.UserName
{
position:absolute;
  left:61%;
  top:44%;
font-size:2.5em;
font-weight:bold;
font-family:"Arial";
color:white;
}


.UserNameField
{
position:absolute;
  left:70%;
  top:44%;
 width: 22%;
 height: 3.5%;
}


.Password
{
position:absolute;
  left:61%;
  top:54%;
font-size:2.5em;
font-weight:bold;
font-family:"Arial";
color:white;
}

.PasswordField
{
position:absolute;
  left:70%;
  top:54%;
 width: 22%;
 height: 3.5%;
}


.Login
{
position:absolute;
  left:70%;
  top:63%;
background-color:#00FFFF;
color:#0;
width: 21%;
 height: 6%;
font-size:2.5em;
text-align:center;
}


.Enroll
{
position:absolute;
  left:87%;
  top:75%;
font-size:2.5em;
}
</style>

<script>
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

</script>
</head>
<body>
<div class="GreyPanel"></div>
<!-- cxcxzczx -->
<div class="ClassManage">课堂管理系统</div>
<div class="LoginWayOne"> <a href="home.html">账号密码登录</a></div>
<div class="LoginWayTwo"> <a href="wechat.html">微信登录</a></div>
<form name="myForm" onsubmit="return loginForm()" action="/signin" method="post">
<div class="UserName"> 用户名</div>
<input type="text" class="UserNameField" name="phone"></input>
<div class="Password"> 密码</div>
<input type="password" class="PasswordField" name="password"></input>
<input type="submit" class="Login" value="登录" />
</form>
<div class="Enroll"><a href="register">注册</a></div>
</body>
</html>