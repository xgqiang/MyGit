<html>
<head lang="en">
    <meta charset="UTF-8">
    <title>查看话题</title>
    <link rel="stylesheet" href="./bootstrap.min.css">
    <link rel="stylesheet" href="../../css/teacher/content.css">
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
            <img src="Img/home.png">首页
            <img src="Img/help.png">帮助
            <img src="Img/exit.png"><a href="/home" style="text-decoration:none">退出</a>
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
                    <div class="title">讨论课1</div>
                    <div><input class="returnButton" type="button" onclick="roll_back()" value="返回上一页" /></div>
                    <div class="line"></div>
                    <div class="itemBody">
                      <div class="item">
                          <label class="itemName">讨论课名称:</label>
                          <label class="itemName">讨论课1</label>
                        </div>
                        <div class="item">
                          <label class="itemName">讨论课说明:</label>
                          <label class="itemName">第一章练习</label>
                        </div>
                        <div class="item">
                          <label class="itemName">分组方式:</label>
                          <label class="itemName">固定分组</label>
                        </div>
                        <div class="item">
                          <label class="itemName">开始时间:</label>
                          <label class="itemName">11/10/2017</label>
                        </div>
                        <div class="item">
                          <label class="itemName">结束时间*:</label>
                          <label class="itemName">17/10/2017</label>
                        </div>
                        <div class="item" >
                          <a href="/teacher/course/seminar/grade" style="text-decoration:none"><button class="submit">评分</button></a>
                          <a href="/teacher/course/seminar/change" style="text-decoration:none"><button class="reset">修改</button></a>
                        </div>
                       <div class="item">
                       <div class="line"></div>
                       <label class="title">Topic A</label>
						  </div>
                         <div class="item">
						   <ul class="topicUl ">
	                           <li>话题名称</li>
	                           <li>说明</li>
	                           <li>组数限制</li>
                               <li>已选小组</li>
	                       </ul>
						   </div>
                            <div class="item"></div>
						<div class="item"></div>
                         <div class="item" >
                          <a href="/teacher/course/seminar/topic/change" style="text-decoration:none"><button class="submit">修改</button></a>
                          <button class="reset">删除</button>
                        </div>
                           <div class="item">
						  <div class="line"></div>
                          </div>
                      <div class="item">
                        <a href="/teacher/course/seminar/buildtopic" style="text-decoration:none"><button class="addseminarbutton">+</button></a>
                          <div class="clear"></div>
					  </div>
                </div>
            </div>
            <div class="clear"></div>
        </div>
</body>
</html>

