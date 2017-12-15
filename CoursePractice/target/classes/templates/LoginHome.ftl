<html>
	<head>
		<meta charset="UTF-8">
		<title></title>
		<style type="text/css">
			* {
				margin: 0;
				padding: 0;
			}
			
			.right {
				width: 600px;
				height: 600px;
				padding-top: 30px;
				background-color: rgba(160,160,160,0.5);
				/*border: 1px solid black;*/
				text-align: center;
				position: absolute;
				top: 0;
				right: 0;
				font-family:verdana;
			}
			
			.right .ways1{
			    width: 100px;
				height: 30px;
				position: absolute;
				top: 110px;
				right: 260px;
				background-color:#7FFFD4;
			}
			.right .ways2{
			    width: 80px;
				height: 30px;
				position: absolute;
				top: 110px;
				right: 180px;
				background-color:white;
			}
			
			.right .enter{
				width: 172px;
				height: 30px;
				background: skyblue;
				color: black;
				position: absolute;
				top: 230;
				right: 180px;
			}
			
			.register{
				position: absolute;
				top: 270px;
				right: 200px;
			}
		</style>
<script>
function validateForm()
{
var x=document.forms["myForm"]["id"].value;
var y=document.forms["myForm"]["password"].value;
if (y==null || y==""){
  alert("密码不能为空！");
  return false;
  }
}
</script>
	</head>

	<body background="/images/main_background.jpg">

		<div class="right">
			<h2 style="font-size:50px;color: white;">课堂管理系统</h2> 
			<br />
			
			
			<div class="ways1">
				<p>帐号密码登陆</p>	
			</div>
			<div class="ways2">
				<p>微信登录</p>	
			</div>
			<form name="myForm" action="/LoginHome" onsubmit="return validateForm()" method="post">
			<br /><br />
			用户名：<input type="text" name="id" required="required"/>

			<br /> <br /> 
			
			密&nbsp;&nbsp;&nbsp;码：<input type="text" name="password"/>
			
			<br /><br />
			<input type="submit" class="enter" value="登录" />
			
			<br /><br />
			<a href="#" class="register">注册</a>
			</form>
		</div>

	</body>

</html>