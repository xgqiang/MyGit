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


<script type="text/javascript" src="/jquery-3.2.1.min.js"></script>
<script type="text/javascript">
$(function(){
$("#update_button").click(function(){
     var classId=$(this).attr('data-class-id');
	if(confirm("确定保存修改？"))
	{
		$.ajax({
			url:"/class/update",
			method:"PUT",
			content:"application/json",
			data: JSON.stringify( { "classId": classId,"name": $('#name').val(), "startTime": $('#startTime').val(),
			"endTime": $('#endTime').val(),"description": $('#description').val(),"a": $('#a').val(),
			"b": $('#b').val(),"c": $('#c').val(), } ),
			success:function(data){
				alert("修改成功");
				window.location.href="/class?type=teacher";
			},
			error:function(data){
				alert("修改失败");
			}
		});
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
                          <input type="text" name="seminarGrade" style="width: 60%;height: 60%;" value=${Class.name} >
                        </div>
                        <div class="item">
                          <label class="itemName">上课地点:</label>
                          <input type="text" name="seminarGrade" style="width: 60%;height: 60%;" value=${Class.timeSite.site} >
                        </div>
                        <div class="item">
                          <label class="itemName">上课时间:</label>
                          <select style="width: 15%;height: 60%;">
                          <option value="single week">单周</option>
                          <option value="dual weeks">双周</option>
                          </select>
                          <select style="width: 10%;height: 60%;">
                          <option value="1">周一</option>
                          <option value="2">周二</option>
                          <option value="3">周三</option>
                          <option value="4">周四</option>
                          <option value="5">周五</option>
                          </select>
                          <select style="width: 10%;height: 60%;">
                          <option value="12">12节</option>
                          <option value="34">34节</option>
                          <option value="56">56节</option>
                          <option value="78">78节</option>
                          <option value="910">910节</option>
                          </select>
                        </div>
                        <div class="item">
                          <label class="itemName">评分规则:</label>
                          <label class="itemName">讨论课分数占比</label>
                          <input type="text" name="seminarGrade" class="smallInput" value=${Class.proportions.presentation} >
                          <label class="itemName"> 报告分数占比</label>
                          <input type="text" name="seminarGrade" class="smallInput" value=${Class.proportions.report} >
                        </div>
                        <div class="item" style="margin-left: 18%">
                          <label class="itemName">5分占比</label>
                          <input type="text" name="seminarGrade" class="smallInput" value=${Class.proportions.a} >
                          <label class="itemName">4分占比</label>
                          <input type="text" name="seminarGrade" class="smallInput" value=${Class.proportions.b} >
                          <label class="itemName">3分占比</label>
                          <input type="text" name="seminarGrade" class="smallInput" value=${Class.proportions.c} >
                        </div>
                        <div class="item">
                          <label class="itemName">导入学生名单:</label>
                          <button class="selectFile">下载文件</button>
                        </div>
                        <div class="item">
                          <button class="submit" data-class-id=${Class.id} id="update_button" >修改</button>
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