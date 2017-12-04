<html>
<head lang="en">
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width,height=device-height,initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=no">
    <title>教师课程首页</title>
    <link rel="stylesheet" href="{$base}/raffle/bootstrap.min.css">
    <style>
        html
        {
         height:100%;
         margin:0;
        }
        body
        {
            height:100%;
            margin:0; 
        }
      .top{
        width: 100%;
        height: 16%;
        min-height: 100px;
        background-color: rgba(65,199,219,0.7);
        text-align: center;
        margin: 0 auto;
      }

      /**
      *这个是指下面的导航和显示信息的块的样式，从整体上来讲，下面是一个大块
      */

      .body{
        width: 100%;
        height: 84%;
        background-color: white;
      }
      .navigation{
        width: 20%;
        height: 100%;
        background-color: rgba(204,204,204,0.6);
        float: left;
      }
      .content{
        width: 80%;
        height: 100%;
        background-color: white;
        float: right;
      }
      .clear{
        clear: both;
      }
      .font{
      	width: 50%;
        font-family: YouYuan;
        font-size: 40px;
        font-weight: bold;
        text-align: right;
        padding-top: 2%;
        padding-bottom: 2%;
        margin-left: 9%;
        float: left;
        color: #FFFFFF;
      }
      .courseName{
        width: 20%;
        font-family: consolas;
        font-size: 20px;
        color: #0BACE1;
        margin-left: 5%;
        margin-top: 5%;
      }
      .courseIntroduction{
        width: 90%;
        height: 80%;
        margin-top: 4%;
        margin-left: auto;
        margin-right: auto;
        font-family: YouYuan;
        font-size: 18px;
      }
      .title{
        width: 20%;
        font-family: YouYuan;
        font-size: 20px;
        font-weight: bold;
        padding: 1px;
        margin-left: 2%;
        margin-top: 1.2%;
        color: #0BACE1;
      }
      .classInfo{
        width: 100%;
        height: 35%;
        margin: 0 auto;
      }
      .seminarInfo{
        width: 100%;
        height: 65%;
        margin: 0 auto;
      }
      .blockBody{
        width: 96%;
        height: 80%;
        margin-top: 2%;
        margin-left: auto;
        margin-right: auto;
      }
      .block{
        width:24%;
        height: 120px;
        background-color: rgba(11, 172, 225, 0.2);
        border-radius: 24px;
        text-align: center;
        margin-right: 2%;
        margin-bottom: 1%;
        float: left;
      }
      .blockFont{
        font-family: YouYuan;
        font-size: 20px;
        font-weight: bold;
        padding-top: 20%;
        color: #000000;
      }
      .blockFont0{
        font-family: YouYuan;
        font-size: 100px;
        font-weight: bold;
        font-color: red;
        padding-top: 0%;
        color:white;
      }
      .line{
        width: 96%;
        margin: 0 auto;
        border: 1.5px solid #41C7DB;
      }
      .icon{
      	width:25%;
      	font-family: YouYuan;
      	font-size: 20px;
      	text-align: center;
      	color: white;
      	padding-top: 4%;
      	float: right;
      }
      .returnButton{
      	width: 10%;
      	background-color: #D4EEF2;
      	border: 1px solid #D4EEF2;
      	border-radius: 8px;
      	text-align: center;
      	margin-top: -2%;
      	margin-bottom: 1%;
      	margin-left: 85%;
      	z-index: 100;
      }
    </style>
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
                <div class="classInfo">
                    <div class="title">课程班级</div>
                    <div><input class="returnButton" type="button" onclick="roll_back()" value="返回上一页" /></div>
                    <div class="line"></div> 
                    <div class="blockBody">
                    <#list ClassList as Class> 
                        <a href="/class/classes?classId=${Class.id}" style="text-decoration:none;"><div class="block"><div class="blockFont">${Class.name}</div></div></a> 
                    </#list>
                    <a href="/class/create" style="text-decoration:none;"><div class="block"><div class="blockFont0">+</div></div></a>
                    </div>                   
                </div>
                <div class="seminarInfo">
                    <div class="title">讨论课</div>
                    <div class="line"></div>
                    <div class="blockBody">
                    <#list SeminarList as Seminar> 
                        <a href="/seminar/manage?type=teacher&seminarId=${Seminar.id}" style="text-decoration:none;"><div class="block"><div class="blockFont">${Seminar.name}</div></div></a>
                    </#list>
                     <a href="/class/seminar/create" style="text-decoration:none"><div class="block"><div class="blockFont0">+</div></div></a>
                    </div> 
                </div>
            </div>
            <div class="clear"></div>
        </div>
</body>
</html>