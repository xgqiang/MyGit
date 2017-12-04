<html>
<head lang="en">
    <meta charset="UTF-8">
    <title>管理员界面</title>
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
        height: 15%;
        background-color: #41C7DB;
        margin: 0 auto;
        text-align: center;
        opacity: 0.7;
      }

      /**
      *这个是指下面的导航和显示信息的块的样式，从整体上来讲，下面是一个大块
      */

      .body{
        width: 100%;
        height: 85%;
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
        font-family: YouYuan;
        font-size: 40px;
        font-weight: bold;
        padding: 2%;
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
      
      .line{
        width: 96%;
        margin: 0 auto;
        border: 1.5px solid #41C7DB;
      }
    </style>
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