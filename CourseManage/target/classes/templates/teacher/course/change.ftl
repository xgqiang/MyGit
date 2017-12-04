<html>
<head lang="en">
    <meta charset="UTF-8">
    <title>修改课程</title>
    <link href="/新新建课程css.css" rel="stylesheet" type="text/css"/>
<script type="text/javascript" src="/jquery-3.2.1.min.js"></script>
<script type="text/javascript">
updateClassForm(){
	if(confirm("确定保存修改？"))
	{
		$.ajax({
			url:"/course/update",
			method:"post",
			content:"application/json",
			data: JSON.stringify( { "name": $('#name').val(), "startTime": $('#startTime').val(),
			"endTime": $('#endTime').val(),"description": $('#description').val(),"a": $('#a').val(),
			"b": $('#b').val(),"c": $('#c').val(), } ),
			success:function(data){
				alert("修改成功");
				window.close();
			},
			error:function(data){
				alert("修改失败");
				window.close();
			}
		});
	} 
}
</script>    
</head>
<body>
<br/>
<br/>
<div class="form">
    <form action="/course/update/${Course.id}" onsubmit="return updateClassForm()" method="post" >
         课程名称*：<input type="text" name="name" value=${Course.name} />
         
         <br/>
         <br/>
          开始时间*：<input type="date" name="startTime" value=${Course.startTime} />  结束时间*：<input type="date" name="endTime" value=${Course.endTime} /><br/><br/>
          
          课程介绍：<br/>
          <textarea name="description" cols="80" rows="5">${Course.description}</textarea><br/>
          
         
          评分规则*： <br/>
         
       <div class="scorerule"><p> 讨论课分数占比:<input type="text" name="seminarscore" value=${Course.proportions.presentation} >报告分数占比：<input type="text" name="reportscore" value=${Course.proportions.report} ></p>
      
       <p>五分占比:<input type="text" name="a" value=${Course.proportions.a} >四分占比：<input type="text" name="b" value=${Course.proportions.b} >三分占比：<input type="text" name="c" value=${Course.proportions.c} ></p>
         </div>
         
         
        <br/>
        <div class="buttons">
          <input class="button" type="submit" value="保存"/>
          <input class="button" type="reset" value="重置"/>
          
    </div>
     </form>
 </div>      
</body>
</html>