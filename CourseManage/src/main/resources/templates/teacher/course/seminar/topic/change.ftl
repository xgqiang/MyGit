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
                    <div class="title">创建话题</div>
                    <div><input class="returnButton" type="button" onclick="roll_back()" value="返回上一页" /></div>
                    <div class="line"></div>
                    <div class="itemBody">
                        <div class="item">
                          <label class="itemName">题目:</label>
                          <input type="text" name="topic" class="bigInput" value="Domain model与模块划分">
                        </div>
                        <div class="item">
                          <label class="itemName">说明:</label>
                          <input type="text" name="details" class="bigInput" value="XXX">
                        </div>
                        <div class="item">
                          <label class="itemName">组数限制:</label>
                          <input type="text" name="number" class="Input" value="5">
                        </div>
                        <div class="item">
                          <button class="submit">提交</button>
                          <button class="reset">重置</button>
                          <div class="clear"></div>
                        </div>
                    </div>
                </div>
            </div>
            <div class="clear"></div>
        </div>
</body>
</html>