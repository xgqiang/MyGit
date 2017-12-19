<html>
<head lang="en">
    <meta charset="UTF-8">
    <title>新建课程</title>
    <link href="../../css/teacher/TeacherCreateCoursePage.css"rel="stylesheet" type="text/css"/>
    <script>
function createCourseForm()
{
  $.ajax({
    url: "/course",
    dataType: "json",
    type: "post",
    content-type:"application/json;charset=utf-8",
    data: JSON.stringify( { "name": $('#name').val(), "startTime": $('#startTime').val() , "endTime": $('#endTime').val()
    , "description": $('#description').val(), "numClass": $('#numClass').val(), "numStudent": $('#numStudent').val(),
    "presentation": $('#presentation').val(),"report": $('#report').val(), "a": $('#a').val(), "b": $('#b').val()
     , "c": $('#c').val()} ),
    processData: false,
    success: function( data, textStatus, jQxhr ){
	//成功回调
    },
    error: function( jqXhr, textStatus, errorThrown ){
	//失败回调
    }
});
      
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
                <div class="courseIntroduction">
                  <a class="guidefont" href="/me?type=teacher" style="text-decoration:none">基本信息</a>
                  <a class="guidefont" href="/course?type=teacher" style="text-decoration:none" >课程信息</a>
                  <a class="guidefont" href="/course/create" style="text-decoration:none" onclick="return createcourseForm()">新建课程</a>
                </div>
            </div>
            <div class="content">
           
		  <h2 class="newcourse">新建课程</h2>
		  <hr class="line"/>
	     
        <br/>
       <div class="form">
          <form name="myForm" onsubmit="return createCourseForm()" action="/course/create"  method="post">
         课程名称*：<input type="text" name="name"/>
         
         <br/>
         <br/>
          开始时间*：<input type="date" name="startTime"/>  结束时间*：<input type="date" name="endTime"/><br/><br/>
          
          课程介绍：<br/>
          <textarea name="description" cols="80" rows="5"></textarea><br/>
          
       班级个数：<input type="text" name="numClass"/>
         
         <br/>
         班级人数：<input type="text" name="numStudent"/>
         
         <br/>  
          评分规则*： <br/>
         
       <div class="scorerule"><p> 讨论课分数占比:<input type="text" name="presentation">报告分数占比：<input type="text" name="report"></p>
      
       <p>五分占比:<input type="text" name="a">四分占比：<input type="text" name="b">三分占比：<input type="text" name="c"></p>
         </div>
         
         
        <br/>
        <div class="buttons">
          
          <input class="button" type="submit" name="submit"/><input class="button" type="reset" name="reset"/>
          
    </div>
          </form>
      </div>
          </div>

		
            </div>
            
           
            <div class="clear"></div>
      
</body>
</html>
