<html>
<head lang="en">
    <meta charset="UTF-8">
    <title>创建讨论课</title>
    <link rel="stylesheet" href="/css/common/bootstrap.min.css">
    <link rel="stylesheet" href="/css/teacher/content.css">
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
        		<img src="/Img/home.png">首页
                <img src="/Img/help.png">帮助
                <img src="/Img/exit.png"><a href="/home" style="text-decoration:none">退出</a>
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
		  <h2 class="newcourse">创建讨论课</h2>
		  <hr class="line"/>
	     
        <br/>
       <div class="form">
         <form name="myForm" onsubmit="return createSeminarForm()" action="/class/seminar/create"  method="post">
         讨论课名称*：<input type="text" name="name"/>
         
         <br/>
         <br/>
                   讨论课说明：<br/>
          <textarea cols="80" rows="5" name="description"></textarea><br/>
                分组方式*：<select style="width: 15%;height: 4%;" name="groupingMethod">
                          <option value="random">随机分组</option>
                          <option value="fixed">固定分组</option>
             </select>
         
         <br/>
         <br/> 
          开始时间*：<input type="date" name="startTime"/>  结束时间*：<input type="date" name="endTime"/><br/><br/>
          

          
         
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
