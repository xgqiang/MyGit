<html>
<head lang="en">
    <meta charset="UTF-8">
    <title>学生基本信息</title>
    <link href="../../css/common/HomePage.css" rel="stylesheet" type="text/css"/>
    <script>
function courseForm()
{
  alert("确定选择OOAD吗");
}
function createcourseForm()
{
  alert("确定新建课程吗？");
}
function deletecourseForm()
{
  alert("确定要删除课程吗？");
}
function putcourseForm()
{
  window.open ("/teacher/course/change", "newwindow", "height=400, width=600, top=200, left=400, toolbar=no, menubar=no, scrollbars=no, resizable=no,location=no, status=no")&nbsp; 
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
                <div class="courseName">导航</div>
                <div class="line"></div>
                <div class="courseIntroduction"><a class="guidefont" href="/me?type=teacher" style="text-decoration:none">基本信息</a>
                  <a class="guidefont" href="/course?type=teacher" style="text-decoration:none">课程信息</a>
                  <a class="guidefont" href="/course/create" style="text-decoration:none">新建课程</a>
                </div>
            </div>
            <div class="content">
              <h2 class="newcourse">课程信息</h2>
              <hr class="line"/>
                
              
          
        
            </div>
            
           
            <div class="clear"></div>
        </div>
</body>
</html>