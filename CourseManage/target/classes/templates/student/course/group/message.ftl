<html>
<head lang="en">
<meta charset="UTF-8">
	<meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>学生查看小组</title>
    <link href="../../css/student/content.css" rel="stylesheet" type="text/css"/>
<script type="text/javascript">
function roll_back()
{
window.history.back(-1); 
}
</script>
</head>
<body>
    
        <div class="top">
          <div class="font">
            课堂管理系统
          </div>
          <div class="icon">
            <img src="/images/home.png">首页
        	<img src="/images/help.png">帮助
        	<img src="/images/exit.png"><a href="/home" style="text-decoration:none">退出</a>
          </div>
          <div class="clear"></div>
        </div>
        <div class="body">
            <div class="navigation">
                <a href="/teacher/message" style="text-decoration:none"><div class="courseName">OOAD</div></a>
                <div class="line"></div>
                <div class="courseIntroduction">ooad is xxx</div>
            </div>
            <div class="content">
                <div class="block">
                    <div class="title">固定分组</div>
                    <div><input class="returnButton" type="button" onclick="roll_back()" value="返回上一页" /></div>
                    <div class="line"></div>
                    <div class="itemBody">
                        <div class="item">
                          <table id="studenttable">
<tr>
                              <th>角色</th>
                              <th>学号</th>
                              <th>姓名</th>
                            </tr>

                            <tr>
                              <td>队长</td>
							  <td>24320152200001</td>
                              <td>Steven Jobs</td>
                            </tr>

                            <tr class="alt">
                              <td>队员</td>
                              <td>24320152209999</td>
                              <td>Li YanHong</td>
                            </tr>
                        </table>
                        </div>
						<div class="itemBody">
						  <div class="item">
						<a href="/group/change" style="text-decoration:none"><div class="modifyButton"> 修改 </div></a>
						</div>
					</div>
					</div>
                </div>
            </div>
            <div class="clear"></div>
        </div>
</body>
</html>