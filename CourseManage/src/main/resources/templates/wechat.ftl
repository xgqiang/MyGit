
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
 width:100%;  
    height:100%;  
  overflow: hidden;
   position: fixed;
font-size:100%;}
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
background-color:#FFFFFF;
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
background-color:#00FFFF;
font-size:1.5em;
text-align:center;
font-family:"Arial";
}
.WechatText
{
position:absolute;
  left:70%;
  top:77%;
font-size:32px;
color:#0;
font=family="Arial";
}
Identity
{
position:absolute;
  left:74%;
  top:72%;
font-size:2em;

}
.QRCode
{
position:absolute;
  left:71%;
  top:45%;
}
</style>
</head>
<body>
<div class="GreyPanel"></div>
<div class="ClassManage">课堂管理系统</div>
<div class="LoginWayOne"> <a href="home">账号密码登录</a></div>
<div class="LoginWayTwo"> <a href="wechat">微信登录</a></div>
<div class="WechatText">使用微信扫一扫</div>
<Identity>
<input id="man" type="radio" checked="checked" name="1" />老师<input id="woman" type="radio"  name="1"/>学生
</Identity>
<img src="二维码.png" class="QRCode">
</body>
</html>