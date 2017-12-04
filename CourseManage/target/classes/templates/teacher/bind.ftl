<html lang="en">

<head>
    <meta http-equiv="Content-Type" content="text/html; charset=gb2312">
    <meta name="viewport" content="width=device-width,
                                     initial-scale=1.0,
                                     maximum-scale=1.0,
                                     user-scalable=no">
    <title>ClassManage</title>
    <!-- 閺堚偓閺傛壆澧楅張顒傛畱 Bootstrap 閺嶇ǹ绺?CSS 閺傚洣娆?-->
    <link rel="stylesheet" href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css"
          integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">

    <!-- 閸欘垶鈧娈?Bootstrap 娑撳顣介弬鍥︽閿涘牅绔撮懜顑跨瑝閻劌绱╅崗銉礆 -->
    <link rel="stylesheet" href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap-theme.min.css"
          integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp" crossorigin="anonymous">

    <!-- 閺堚偓閺傛壆娈?Bootstrap 閺嶇ǹ绺?JavaScript 閺傚洣娆?-->
    <script src="https://cdn.bootcss.com/bootstrap/3.3.7/js/bootstrap.min.js"
            integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa"
            crossorigin="anonymous"></script>
<style type="text/css">
body{background-image:url(images/back.png);}
.titleBackground{
background-color:#41C7DB;
width:100%;
height:92px;
z-index:-1;
}
.title{
font-style:normal;
font-family:YouYuan;
font-size:40px;
font-weight:blod;
display:block;
position:absolute;
left:524px;top:20px;
color:white
}
.home{
font-family:Arial;
font-size:20px;
display:block;
position:absolute;
width:47px;height:26px;
left:1109px;top:55px;
color:white
}
.help{
font-family:Arial;
font-size:20px;
display:block;
position:absolute;
width:47px;height:26px;
left:1185px;top:55px;
color:white
}
.quit{
font-family:Arial;
font-size:20px;
display:block;
position:absolute;
width:47px;height:26px;
left:1262px;top:55px;
color:white
}
.phoneNum{
font-family:Arial;
font-size:20px;
display:block;
position:absolute;
width:90px;height:26px;
left:543px;top:202px;
color:black
}
.phoneNum input{
position:absolute;	
width:130px;height:23px;
left:70px;top:4px;
}
.password{
font-family:Arial;
font-size:20px;
display:block;
position:absolute;
width:90px;height:26px;
left:543px;top:246px;
color:black
}
.password input{
position:absolute;	
width:130px;height:23px;
left:70px;top:6px;
}
.name{
font-family:Arial;
font-size:20px;
display:block;
position:absolute;
width:90px;height:26px;
left:543px;top:290px;
color:black
}
.name input{
position:absolute;	
width:130px;height:23px;
left:70px;top:5px;
}
.school{
font-family:Arial;
font-size:20px;
display:block;
position:absolute;
width:90px;height:26px;
left:543px;top:329px;
color:black
}
.school input{
position:absolute;	
width:130px;height:23px;
left:70px;top:5px;
}
.gender{
font-family:Arial;
font-size:20px;
display:block;
position:absolute;
width:90px;height:26px;
left:543px;top:375px;
color:black
}
.male{
font-family:Arial;
font-size:20px;
display:block;
position:absolute;
width:90px;height:26px;
left:633px;top:375px;
color:black
}
.male input{
position:absolute;	
width:80px;height:23px;
left:-50px;top:1px;
}
.female{
font-family:Arial;
font-size:20px;
display:block;
position:absolute;
width:90px;height:26px;
left:713px;top:375px;
color:black
}
.female input{
position:absolute;	
width:80px;height:23px;
left:-50px;top:1px;
}
.stuffNum{
font-family:Arial;
font-size:20px;
display:block;
position:absolute;
width:90px;height:26px;
left:543px;top:420px;
color:black
}
.stuffNum input{
position:absolute;	
width:190px;height:23px;
left:70px;top:4px;
}
.eMail{
font-family:Arial;
font-size:20px;
display:block;
position:absolute;
width:90px;height:26px;
left:543px;top:465px;
color:black
}
.eMail input{
position:absolute;	
width:190px;height:23px;
left:70px;top:4px;
}
.submit{
position:absolute;
left:671px;top:535px;
background-color: white;
color:black;
padding:3px 4px;
text-align: center;
text-decoration: none;
display: inline-block;
font-size: 20px;
font-family:Arial;
cursor: pointer;
}
</style>
</head>

<body>
<div class="titleBackground"></div>
<div class="title">课程管理系统</div>
<div class="home"><a href="#">主页</a></div>
<div class="help"><a href="#">帮助</a></div>
<div class="quit"><a href="#">退出</a></div>
<div class="phoneNum">手机号:<input type="text" name="phoneNum"/></div>
<div class="password">密码:<input type="text" name="password"/></div>
<div class="name">姓名:<input type="text" name="name"/></div>
<div class="school">学校:<input type="text" name="school"/></div>
<div class="gender">性别:</div>
<div class="male">男<input type="radio" value="男" name="gender" checked="checked"/></div>
<div class="female">女<input type="radio" value="女" name="gender"/></div>
<div class="stuffNum">教工号:<input type="text" name="stuffNum"/></div>
<div class="eMail">邮箱:<input type="text" name="eMail"/></div>
<div class="submit">提交</div>
</body>

</html>