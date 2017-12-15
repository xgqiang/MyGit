<html>

	<head>
		<meta charset="utf-8">
		<meta http-equiv="X-UA-Compatible" content="IE=edge">
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<title>ClassManage</title>
		<link rel="stylesheet" type="text/css" href="login.css" />
		<!--<link rel="stylesheet" type="text/css" href="../css/bootstrap-theme.min.css" />-->
		<link rel="stylesheet" type="text/css" href="../css/bootstrap.min.css" />
		<script src="../js/jquery-1.12.4.min.js" type="text/javascript" charset="utf-8"></script>
		<script src="../js/bootstrap.min.js" type="text/javascript" charset="utf-8"></script>
	</head>

	<body>
		<div class="container">
			<div class="login_container">
				<div class="ClassManage">课堂管理系统</div>
				<div class="login_choice">
					<div class="LoginWayOne">
						<a href="javascript:;">账号密码登录</a>
					</div>
					<div class="LoginWayTwo">
						<a href="javascript:;">微信登录</a>
					</div>

				</div>

				<div class="login_details" style="text-align: center;">

					<ul>
						<!--
                        	作者：Mr_Jackey@aliyun.com
                        	时间：2017-11-27
                        	描述：微信扫码登录
                        -->
						<li class="login_right" id="login_right" >
							<img class="QR_code" src="images/二维码.png" />
							<p>微信扫一扫登录</p>
						</li>
						<!--
                        	作者：Mr_Jackey@aliyun.com
                        	时间：2017-11-27
                        	描述：账号密码登录
                        -->
						<li class="login_left" id="login_left" >
							<div>
								<span class="UserName">用户名</span>
								<input type="text" class="UserNameField"></input>
							</div>

							<div>
								<span class="Password">密码</span>
								<input type="password" class="PasswordField"></input>
							</div>

							<button class="Login">登录</button>
							<div class="Enroll">
								<a href="enroll.html">注册</a>
							</div>
						</li>
					</ul>
				</div>

			</div>
		</div>

	</body>
	<script type="text/javascript">
		$(function() {
					$(".login_choice .LoginWayOne").click(function(e) {
						$(this).css({
							"background-color": "#00FFFF"
						});
						$(".login_choice .LoginWayTwo").css({
							"background-color": "#FFF"
						});
						$("#login_left").css("display", "block");
//						$(".login_details ul .login_left").css("display", "block");
						$("#login_right").css("display", "none");
//						
						
					});
					$(".login_choice .LoginWayTwo").click(function(e) {
						$(this).css({
							"background-color": "#00FFFF"
						});
						$(".login_choice .LoginWayOne").css({
							"background-color": "#FFF"
						});
						$("#login_right").css("display", "block");
//						$(".login_details ul .login_right").css("display", "block");
//						$(".login_details ul .login_left").css("display", "none !important");
						$("#login_left").css("display", "none");
					});
			})
	</script>

</html>