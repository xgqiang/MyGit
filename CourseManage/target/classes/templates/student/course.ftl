<html>
<head lang="en">
    <meta charset="UTF-8">
    <title>学生主页</title>
    <link href="../../css/student/StudentCourseHomePage.css" rel="stylesheet" type="text/css"/>
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
                <div class="courseName">导航</div>
                <div class="line"></div>
                <div class="courseIntroduction"><a class="guidefont" href="/me?type=student" style="text-decoration:none">基本信息</a>
                  <a class="guidefont" href="/course?type=student" style="text-decoration:none">课程信息</a>
                  <a class="guidefont" href="/student/select" style="text-decoration:none">选择课程</a>
                </div>
            </div>
            <div class="content">
              <h2 class="newcourse">课程信息</h2>
              <hr class="line"/>
                
		    <#list CourseList as Course>   
          <div class="main_box_right_content">
				<h3 class="classtitle"><a href="/class?type=student"  data-id=${Course.id} style="text-decoration:none">${Course.name}</a>
					<button data-course-id=${Course.id} id="delete_select_button">退选课程</button>
				</h3>
				<hr/>
				<div  class="classinfo">
					<span>班级数：${Course.numClass}</span><br/>
					<span>学生人数：${Course.numStudent}</span><br/>
					<span>开始时间：${Course.startTime}</span><br/>
					<span>结束时间：${Course.endTime}</span><br/>
				</div>
		    </div>
		    </#list>
        
            </div>
            
           
            <div class="clear"></div>
        </div>
</body>
</html>