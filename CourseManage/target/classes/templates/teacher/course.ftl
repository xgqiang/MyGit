<html>
<head lang="en">
    <meta charset="UTF-8">
    <title>教师主页</title>
    <link href="/新主页css.css" rel="stylesheet" type="text/css"/>
<script type="text/javascript" src="/jquery-3.2.1.min.js"></script>
<script type="text/javascript">
function roll_back()
{
window.history.back(-1); 
}


$(function(){
$("#delete_button").click(function(){
	if(confirm("确定删除此课？"))
	{
		var courseid=$(this).attr('data-course-id');
		alert("courseId="+courseid);
		$.ajax({
			url:"/course/"+courseid,
			method:"DELETE",
			content:"application/json",
			success:function(data){
				alert("删除成功");
				window.location.href="/course?type=teacher";
			},
			error:function(data){
				alert("删除失败");
				//window.location.href="/course?type=teacher";
			}
		});
	}
});

});

$(function(){
$("#update_button").click(function(){
	if(confirm("确定要修改课程？"))
	{
		var courseId=$(this).attr('data-course-id');
		alert("courseId="+courseId);
		window.open ("/course/change?id="+courseId, "修改课程", "height=400, width=600, top=150, left=400, toolbar=no, menubar=no, scrollbars=no, resizable=no,location=no, status=no");
	}
});
});
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
                <div class="courseName">导航</div>
                <div class="line"></div>
                <div class="courseIntroduction"><a class="guidefont" href="/me?type=teacher" style="text-decoration:none">基本信息</a><br>
                  <a class="guidefont" href="/course?type=teacher" style="text-decoration:none">课程信息</a><br>
                  <a class="guidefont" href="/course/create" style="text-decoration:none" onclick="return createcourseForm()">新建课程</a><br>
                </div>
            </div>
            <div class="content">
              <h2 class="newcourse">课程信息</h2>
              <hr class="line"/>
                
              
          <#list CourseList as Course>   
          <div class="main_box_right_content">
				<h3 class="classtitle"><a href="/class?type=teacher"  data-id=${Course.id} style="text-decoration:none">${Course.name}</a>
					<button data-course-id=${Course.id} id="delete_button">删除课程</button>
					<button data-course-id=${Course.id} id="update_button" >修改课程</button>
				</h3>
				<hr/>
				<div  class="classinfo">
					<span>班级数：${Course.numClass}</span><br/>
					<span>学生人数：${Course.numStudent}</span><br/>
					<span>开始时间：${Course.startTime}</span><br/>
					<span>结束时间：${Course.endTime}</span><br/>
					<span>courseId：${Course.id}</span><br/>
				</div>
		    </div>
		    </#list>
        
            </div>
            
           
            <div class="clear"></div>
        </div>
</body>
</html>