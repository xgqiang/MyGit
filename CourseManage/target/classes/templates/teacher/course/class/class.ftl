<html>
<head lang="en">
    <meta charset="UTF-8">
    <title>班级信息</title>
    <link rel="stylesheet" href="./bootstrap.min.css">
    <link rel="stylesheet" href="/content.css">
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
                <div class="courseName">OOAD</div>
                <div class="line"></div>
                <div class="courseIntroduction">ooad is xxx</div>
            </div>
            <div class="content">
                <div class="block">
                    <div class="title">周三1-2节</div>
                    <div><input class="returnButton" type="button" onclick="roll_back()" value="返回上一页" /></div>
                    <div class="line"></div>
                    <div class="itemBody">
                        <div class="item">
                          <label class="itemName">班级名称:</label>
                          <label class="itemName">${Class.name}</label>
                        </div>
                        <div class="item">
                          <label class="itemName">上课地点:</label>
                          <label class="itemName">${Class.timeSite.site}</label>
                        </div>
                        <div class="item">
                          <label class="itemName">上课时间:</label>
                          <label class="itemName">${Class.timeSite.week}</label>
                          <label class="itemName">周${Class.timeSite.day}-${Class.timeSite.lesson}节</label>
                        </div>
                        <div class="item">
                          <label class="itemName">评分规则:</label>
                          <label class="itemName">讨论课分数占比：</label>
                          <label class="itemName">${Class.proportions.presentation}% </label>
                          <label class="itemName"> 报告分数占比：</label>
                          <label class="itemName">${Class.proportions.report}%</label>
                        </div>
                        <div class="item" style="margin-left: 18%">
                          <label class="itemName">5分占比：</label>
                          <label class="itemName">${Class.proportions.a}%</label>
                          <label class="itemName">4分占比：</label>
                          <label class="itemName">${Class.proportions.b}%</label>
                          <label class="itemName">3分占比：</label>
                          <label class="itemName">${Class.proportions.c}%</label>
                        </div>
                        <div class="item">
                          <label class="itemName">导入学生名单:</label>
                          <button class="selectFile">下载文件</button>
                        </div>
                        <div class="item">
                          <a href="/class/change?classId=${Class.id}" style="text-decoration:none"><button class="submit">修改</button></a>
                          <button class="reset">删除班级</button>
                          <div class="clear"></div>
                        </div>
                    </div>
                </div>
            </div>
            <div class="clear"></div>
        </div>
</body>
</html>