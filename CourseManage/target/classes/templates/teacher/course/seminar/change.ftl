<html>
<head lang="en">
    <meta charset="UTF-8">
    <title>新建课程</title>
    <link href="/新新建课程css.css" rel="stylesheet" type="text/css"/>
    
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
           
		  <h2 class="newcourse">讨论课</h2>
		  <hr class="line"/>
	     
        <br/>
       <div class="form">
          <form >
         讨论课名称*：<input type="text" name="coursename" value=${Seminar.name} />
         
         <br/>
         <br/>
                   讨论课说明：<br/>
          <textarea name="courseinfo" cols="80" rows="5">${Seminar.description}</textarea><br/>
                分组方式*：<select style="width: 15%;height: 4%;">
                          <option value="volvo">随机分组</option>
                          <option value="saab">固定分组</option>
             </select>
         
         <br/>
         <br/> 
          开始时间*：<input type="date" name="begintime" value=${Seminar.startTime} />  结束时间*：<input type="date" name="endtime" value=${Seminar.endTime} /><br/><br/>
          

          
         
          评分规则*： <br/>
         
       <div class="scorerule"><p> 讨论课分数占比:<input type="text" name="seminarscore">报告分数占比：<input type="text" name="reportscore"></p>
      
       <p>五分占比:<input type="text" name="five">四分占比：<input type="text" name="four">三分占比：<input type="text" name="three"></p>
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
