<html>
<head lang="en">
<meta charset="UTF-8">
	<meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>学生查看成绩</title>
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
            <img src="../../Img/home.png">首页
            <img src="../../Img/help.png">帮助
            <img src="../../Img/exit.png">退出
          </div>
          <div class="clear"></div>
        </div>
        <div class="body">
            <div class="navigation">
                <div class="courseName">OOAD</div>
                <div class="line"></div>
                <div class="courseIntroduction">ooad is xxx</div>
            </div>
            <div class="content">
                <div class="block">
                    <div class="title">学生成绩</div>
                    <div class="returnButton">返回上一页</div>
                    <div class="line"></div>
                    <div class="itemBody">
                        <div class="item">
                          <table id="studenttable">
						    <tr>
                              <th>讨论课</th>
                              <th>组名</th>
                              <th>组长</th>
							  <th>课堂讨论课得分</th>
                              <th>报告分数</th>
                              <th>总分</th>
                            </tr>

                            <tr>
                              <td>1</td>
							  <td>1-A-4</td>
                              <td>Steven Jobs</td>
							  <td>5</td>
							  <td>4</td>
							  <td>4</td>
                            </tr>

                            <tr class="alt">
                              <td>2</td>
                              <td>1-A-1</td>
                              <td>Li YanHong</td>
							  <td>5</td>
							  <td></td>
							  <td></td>
                            </tr>
							
							<tr>
                              <td>3</td>
							  <td></td>
                              <td></td>
							  <td></td>
							  <td></td>
							  <td></td>
                            </tr>
							
							<tr class="alt">
                              <td>4</td>
							  <td></td>
                              <td></td>
							  <td></td>
							  <td></td>
							  <td></td>
                            </tr>

						  </table>
                        </div>
					</div>
                </div>
            </div>
            <div class="clear"></div>
        </div>
</body>
</html>