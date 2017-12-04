<html>
<head lang="en">
    <meta charset="UTF-8">
    <title>班级信息</title>
    <link rel="stylesheet" href="/content.css">
    <script>
function createClassForm()
{
  $.ajax({
    url: "/class/create",
    dataType: "json",
    type: "post",
    contentType:"application/json;charset=utf-8",
    data: JSON.stringify( { "name": $('#name').val(), "site": $('#site').val() , "week": $('#week').val()
    , "day": $('#day').val(), "lesson": $('#lesson').val(), "presentation": $('#presentation').val(),
     "report": $('#report').val(), "a": $('#a').val(), "b": $('#b').val()
     , "c": $('#c').val()} ),
    processData: false,
    success: function( data, textStatus, jQxhr ){
    alert("创建班级成功");
    window.location.href="/class?type=teacher";
	//成功回调
    },
    error: function( jqXhr, textStatus, errorThrown ){
    alert("创建班级失败");
	//失败回调
    }
});
      
}

</script>

<script type="text/javascript">
function roll_back()
{
window.history.back(-1); 
}
</script>
</head>
<body>
    
        <div class="top">
          <div class="font">课堂管理系统</div>
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
                    <form name="myForm" onsubmit="return createClassForm()" action="/class/create" method="post" >
                    <div class="itemBody">
                        <div class="item">
                          <label class="itemName">班级名称:</label>
                          <input type="text" name="name" style="width: 60%;height: 60%;" value="">
                        </div>
                        <div class="item">
                          <label class="itemName">上课地点:</label>
                          <input type="text" name="site" style="width: 60%;height: 60%;" value="">
                        </div>
                        <div class="item">
                          <label class="itemName">上课时间:</label>
                          <select style="width: 15%;height: 60%;" name="week">
                          <option value="single_week">单周</option>
                          <option value="dual_weeks">双周</option>
                          </select>
                          <select style="width: 10%;height: 60%;" name="day">
                          <option value="1">周一</option>
                          <option value="2">周二</option>
                          <option value="3">周三</option>
                          <option value="4">周四</option>
                          <option value="5">周五</option>
                          </select>
                          <select style="width: 10%;height: 60%;" name="lesson">
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
                          <input type="text" name="presentation" class="smallInput" value="">
                          <label class="itemName"> 报告分数占比</label>
                          <input type="text" name="report" class="smallInput" value="">
                        </div>
                        <div class="item" style="margin-left: 18%">
                          <label class="itemName">5分占比</label>
                          <input type="text" name="a" class="smallInput" value="">
                          <label class="itemName">4分占比</label>
                          <input type="text" name="b" class="smallInput" value="">
                          <label class="itemName">3分占比</label>
                          <input type="text" name="c" class="smallInput" value="">
                        </div>
                        <div class="item">
                          <label class="itemName">导入学生名单:</label>
                          <button class="selectFile">下载文件</button>
                        </div>
                        <div class="item">
                        <input class="submit" type="submit" value="提交"/>
                          <button class="reset">删除班级</button>
                          <div class="clear"></div>
                        </div>
                    </div>
                    </form>
                </div>
            </div>
            <div class="clear"></div>
        </div>
</body>
</html>