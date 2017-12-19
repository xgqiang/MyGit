
<!DOCTYPE html>
<html>
<head lang="en">
    <meta charset="UTF-8">
    <title>教师基本信息改</title>
    <link href="../../css/common/InfoModifyPage.css" rel="stylesheet" type="text/css"/>
</head>
<body>
    	<div class="top">
        	<div class="font">
        		课堂管理系统
        	</div>
        	<div class="icon">
        		<img src="/Img/home.png">首页
                <img src="/Img/help.png">帮助
                <img src="/Img/exit.png"><a href="/home" style="text-decoration:none">退出</a>
        	</div>
        	<div class="clear"></div>
    	</div>
        <div class="body">
            <div class="navigation">
                <div class="courseName">导航</div>
                <div class="line"></div>
                <div class="courseIntroduction"><a class="guidefont" href="/me?type=teacher" style="text-decoration:none">基本信息</a>
                  <a class="guidefont" href="/course?type=teacher" style="text-decoration:none">课程信息</a>
                  <a class="guidefont" href="/course/create" style="text-decoration:none">新建课程</a>
                </div>
            </div>
            <div class="content">
              <h2 class="newcourse">基本信息</h2>
              <hr class="line"/>
                <div class="imgarea"><img class="img" src="/Img/someone1.jpg"/></div>
                
                 <div class="info">
                
        <form name="myForm" onsubmit="return updateMessageForm()" action="/me?type=teacher"  method="post">
        <table class="table">
        <tr>
        <td>用户名：<input type="text" name="id" value=${User.id} /></td>
        <td>教工号：<input type="text" name="number" value=${User.number} /></td>
        </tr>
        <tr>
        <td>姓名：<input type="text" name="name" value=${User.name} /></td>
        <td>性别：<input type="text" name="gender" value=${User.gender} /></td>
        </tr>
        <tr>
        <td>学校：<input type="text" name="school" value=${User.school} /></td>
        <td>职称：${User.type}</td>
        </tr>
        <tr>
        <td>E-mail：<input type="text" name="email" value=${User.email} /></td>
        <td>联系方式：<input type="text" name="phone" value=${User.phone} /></td>
        </tr>
         </table>
         <br/>
        <br/>
        <br/>
        <br/>
       <div class="button">
        <input class="button" type="submit" name="submit"/>
        </div>
        </form>
       
        
        </div>
            </div>
            
           
            <div class="clear"></div>
        </div>
</body>
</html>