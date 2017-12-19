<html>
<head lang="en">
    <meta charset="UTF-8">
	<meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>学生课程首页</title>
   <link href="../../css/student/StudentCourseInformation.css" rel="stylesheet" type="text/css"/>
</head>

<body>
    <div style="width: 100%; height: 100%;">
        <div class="top"><div class="font">课堂管理系统</div></div>
        <div class="body">
            <div class="navigation">
                <div class="courseName">OOAD</div>
                <div class="line"></div>
                <div class="courseIntroduction">ooad is xxx</div>
            </div>
            <div class="content">
                <div class="classInfo">
                    <div class="title">讨论课</div>
                    <div class="line"></div>
                    <div class="blockBody">
                        <#list SeminarList as Seminar> 
                        <a href="/seminar/${Seminar.id}?type=student" style="text-decoration:none;"><div class="block"><div class="blockFont">${Seminar.name}</div></div></a>
                        </#list>
                    </div>
                </div>
                <div class="seminarInfo">
                    <div class="title">课程分组</div>
                    <div class="line"></div>
                    <div class="blockBody">
                        <div class="block"><div class="blockFont"><a href="/group/message" style="text-decoration:none">固定分组</a></div></div>
                    </div>
                </div>
            </div>
            <div class="clear"></div>
        </div>
    </div>
</body>
</html>