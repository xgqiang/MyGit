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
    <link href="../../css/common/AccountLoginPage.css" rel="stylesheet" type="text/css"/>
    <script type="text/javascript" src="js/login_home.js"></script>
</head>
<body>
<div class="GreyPanel"></div>
<!-- cxcxzczx -->
<div class="ClassManage">课堂管理系统</div>
<div class="LoginWayOne"><a href="home.html">账号密码登录</a></div>
<div class="LoginWayTwo"><a href="wechat.html">微信登录</a></div>
<form name="myForm" onsubmit="return loginForm()" action="signin" method="post">
<div class="UserName"> 用户名</div>
<input type="text" class="UserNameField" name="phone"></input>
<div class="Password"> 密码</div>
<input type="password" class="PasswordField" name="password"></input>
<input type="submit" class="Login" value="登录" />
</form>
<div class="Enroll"><a href="register.html">注册</a></div>
</body>
</html>