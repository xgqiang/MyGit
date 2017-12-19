<html>
<head lang="en">
    <meta charset="UTF-8">
    <title>选择课程</title>
    <link href="../../css/student/StudentChooseCoursePage.css" rel="stylesheet" type="text/css"/>
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
              <h2 class="newcourse">选择课程</h2>
              <hr class="line"/>
                   
          <div class="checkcourse">
          <form>
          <p>任课教师：<input type="text" name="teacher"></p>
           <p>课程名称：<input type="text" name="course"><input type="submit" value="查询"></p>
           
           </form>
              </div>
          <#list CourseList as Course>
          <#list ClassList as Class>     
          <div class="main_box_right_content">
				<h3 class="classtitle">${Course.name}
					<button data-course-id=${Course.id} data-class-id=${Class.id} id="select_course" >申请加入</button>
				</h3>
				<hr/>
				<div  class="classinfo">
					<span>班级：${Class.name}</span><br/>
					<span>学生人数：${Course.numStudent}</span><br/>
					<span>开始时间：${Course.startTime}</span><br/>
					<span>结束时间：${Course.endTime}</span><br/>
				</div>
		    </div>
		    </#list>
		    </#list>
        
            </div>
            
           
            <div class="clear"></div>
        </div>
</body>
</html>