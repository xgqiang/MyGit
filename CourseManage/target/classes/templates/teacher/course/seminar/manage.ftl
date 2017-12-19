<html>
<head lang="en">
    <meta charset="UTF-8">
	<meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>学生查看讨论课（随机）</title>
    <link href="../../css/teacher/content.css" rel="stylesheet" type="text/css"/>
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
          <div class="classInfo">
           
		  <div class="title">讨论课1</div>
          <div><input class="returnButton" type="button" onclick="roll_back()" value="返回上一页" /></div>
		  <div class="line"></div>    
              <div class="itemBody">
                        <div class="item">
                          <label class="itemName">讨论课名称：${Seminar.name}</label>
                        </div>
                      </br>
                        <div class="item">
                          <label class="itemName">讨论课说明:${Seminar.description}</label>
                        </div>
                      </br>
                        <div class="item">
                          <label class="itemName">分组方式:${Seminar.groupingMethod}</label>
                        </div>
                      </br>
                        <div class="item">
                          <label class="itemName">开始时间:${Seminar.startTime}</label>
                        </div>  
                      </br>                      
                        <div class="item">
                          <label class="itemName">结束时间*:${Seminar.endTime}</label>
                        </div>
        </div>
        <div class="item">
                          <a href="/seminar/${Seminar.id}/grade?type=teacher" style="text-decoration:none"><button class="submit">评分</button></a>
                          <a href="/seminar/${Seminar.id}/change" style="text-decoration:none"><button class="submit">修改</button></a>
                          <button class="submit">删除讨论课</button>
                          <div class="clear"></div>
        </div>
          <div class="seminarInfo">
                    <div class="title">topic</div>
                    <div class="line"></div>
                    <div class="blockBody">
                        <a href="/seminar/${Seminar.id}/topic" style="text-decoration:none"><div class="block"><div class="blockFont">TopicA</div></div></a>
                        <div class="block"><div class="blockFont">TopicB</div></div>
                        <a href="/seminar/${Seminar.id}/buildtopic" style="text-decoration:none"><div class="block"><div class="blockFont">+</div></div></a>
                    </div>
          </div>
            </div>
            
           
            <div class="clear"></div>
      
</body>
</html>
