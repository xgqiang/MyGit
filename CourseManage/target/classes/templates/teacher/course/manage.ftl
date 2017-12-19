<html>
<head lang="en">
    <meta charset="UTF-8">
    <title>教师课程首页</title>
    <link rel="stylesheet" href="./bootstrap.min.css">
    <link rel="stylesheet" href="../../css/teacher/content.css">
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
        		<img src="Img/home.png">首页
                <img src="Img/help.png">帮助
                <img src="Img/exit.png"><a href="/home" style="text-decoration:none">退出</a>
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
                <div class="classInfo">
                    <div class="title">课程班级</div>
                    <div><input class="returnButton" type="button" onclick="roll_back()" value="返回上一页" /></div>
                    <div class="line"></div> 
                    <div class="blockBody">
                    <#list ClassList as Class> 
                        <a href="/class/classes?classId=${Class.id}" style="text-decoration:none;"><div class="block"><div class="blockFont">${Class.name}</div></div></a> 
                    </#list>
                    <a href="/class/create" style="text-decoration:none;"><img src="/Img/add.png"></a>
                    </div>                   
                </div>
                <div class="seminarInfo">
                    <div class="title">讨论课</div>
                    <div class="line"></div>
                    <div class="blockBody">
                    <#list SeminarList as Seminar> 
                        <a href="/seminar/manage?type=teacher&seminarId=${Seminar.id}" style="text-decoration:none;"><div class="block"><div class="blockFont">${Seminar.name}</div></div></a>
                    </#list>
                     <a href="/class/seminar/create" style="text-decoration:none"><div class="block"><img src="/Img/add.png"></a>
                    </div> 
                </div>
            </div>
            <div class="clear"></div>
        </div>
</body>
</html>