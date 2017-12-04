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
html
{
height:100%;
margin:0;
}
body
{
height:100%;
margin:0; 
background-image:url(back.png);
background-repeat:no-repeat;
background-size:cover;
}
.titleBackground{
background-color:rgba(65,199,219,0.7);
width:100%;
height:16%;
z-index:-1;
text-align: center;
margin: 0 auto;
}
.title{
font-style:normal;
font-family:YouYuan;
font-size:40px;
font-weight:blod;
display:block;
position:absolute;
left:40%;top:20px;
color:white
}
.icon{
width:20%;
margin-top:-3.5%;
font-family: YouYuan;
font-size: 20px;
text-align: center;
color: white;
padding-top: -4%;
float: right;
}
.phoneNum{
font-family:Arial;
font-size:20px;
display:block;
position:absolute;
width:90px;height:26px;
left:40%;top:202px;
color:black
}
.phoneNum input{
position:absolute;	
width:130px;height:23px;
left:70px;top:4px;
font-size:15px;
}
.password{
font-family:Arial;
font-size:20px;
display:block;
position:absolute;
width:90px;height:26px;
left:40%;top:246px;
color:black
}
.password input{
position:absolute;	
width:130px;height:23px;
left:70px;top:6px;
font-size:15px;
}
.name{
font-family:Arial;
font-size:20px;
display:block;
position:absolute;
width:90px;height:26px;
left:40%;top:290px;
color:black
}
.name input{
position:absolute;	
width:130px;height:23px;
left:70px;top:5px;
font-size:15px;
}
.school{
font-family:Arial;
font-size:20px;
display:block;
position:absolute;
width:90px;height:26px;
left:40%;top:329px;
color:black
}
.school input{
position:absolute;	
width:130px;height:23px;
left:70px;top:5px;
font-size:15px;
}
.gender{
font-family:Arial;
font-size:20px;
display:block;
position:absolute;
width:90px;height:26px;
left:40%;top:375px;
color:black
}
.male{
font-family:Arial;
font-size:20px;
display:block;
position:absolute;
width:90px;height:26px;
left:47%;top:375px;
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
left:52%;top:375px;
color:black
}
.female input{
position:absolute;	
width:80px;height:23px;
left:-50px;top:1px;
}
.role{
font-family:Arial;
font-size:20px;
display:block;
position:absolute;
width:90px;height:26px;
left:40%;top:425px;
color:black
}
.student{
font-family:Arial;
font-size:20px;
display:block;
position:absolute;
width:90px;height:26px;
left:47%;top:425px;
color:black
}
.student input{
position:absolute;	
width:80px;height:23px;
left:-50px;top:1px;
}
.teacher{
font-family:Arial;
font-size:20px;
display:block;
position:absolute;
width:90px;height:26px;
left:52%;top:425px;
color:black
}
.teacher input{
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
left:40%;top:470px;
color:black
}
.stuffNum input{
position:absolute;	
width:190px;height:23px;
left:70px;top:4px;
font-size:15px;
}
.eMail{
font-family:Arial;
font-size:20px;
display:block;
position:absolute;
width:90px;height:26px;
left:40%;top:515px;
color:black
}
.eMail input{
position:absolute;	
width:190px;height:23px;
left:70px;top:4px;
font-size:15px;
}
.submit{
position:absolute;
left:47%;top:585px;
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
<script type="text/javascript">
function registerForm()
{
  $.ajax({
    url: "/register",
    dataType: "json",
    type: "post",
    content-type:"application/json;charset=utf-8",
    data: JSON.stringify( { "email": $('#email').val(), "password": $('#password').val() , "name": $('#name').val()
    , "school": $('#school').val(),"gender": $('#gender').val(),"type": $('#type').val(),
     "number": $('#number').val(), "email": $('#email').val()} ),
    processData: false,
    success: function( data, textStatus, jQxhr ){
	//成功回调
    },
    error: function( jqXhr, textStatus, errorThrown ){
	//失败回调
    }
    });

}

</script>
</head>

<body>
<div class="titleBackground"></div>
<div class="title">课程管理系统</div>
<div class="icon">
<img src="/home0.png">首页
<img src="/help.png">帮助
<img src="/exit.png"><a href="/home" style="text-decoration:none">退出</a>
</div>
<form name="registerForm" action="/register" onsubmit="return registerForm()" method="post">
<div class="phoneNum">手机号:<input type="text" name="phone" value="18911114514"/></div>
<div class="password">密码:<input type="password" name="password" value="qwer2345!"/></div>
<div class="name">姓名:<input type="text" name="name" value="张三"/></div>
<div class="school">学校:<input type="text" name="school" value="厦门大学"/></div>
<div class="gender">性别:</div>
<div class="male">男<input type="radio" value="female" name="gender" checked="checked"/></div>
<div class="female">女<input type="radio" value="male" name="gender"/></div>
<div class="role">角色:</div>
<div class="student">学生<input type="radio" value="student" name="type" checked="checked"/></div>
<div class="teacher">教师<input type="radio" value="teacher" name="type"/></div>
<div class="stuffNum">教工号:<input type="text" name="number" value="24320152202333"/></div>
<div class="eMail">邮箱:<input type="text" name="email" value="xxxxx@xx.com"/></div>
<div class="submit"><input type="submit" value="提交" /></div>
</form>
</body>

</html>