<html>
<head lang="en">
    <meta charset="UTF-8">
    <title>创建话题</title>
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
      .icon{
        width:20%;
        font-family: YouYuan;
        font-size: 20px;
        text-align: center;
        color: white;
        padding-top: 4%;
        float: right;
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
        width: 20%;
        font-family: YouYuan;
        font-size: 40px;
        font-weight: bold;
        margin-left: 35%;
        text-align: center;
        padding: 2%;
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
      .block{
        width: 100%;
        height: 65%;
        margin: 0 auto;
      }
      .itemBody{
        width: 96%;
        height: 80%;
        margin-top: 2%;
        margin-left: auto;
        margin-right: auto;
      }
      .item{
        width: 80%;
        height: 15%;
        padding-bottom: 1%;
        margin: 0 auto;
      }
      .itemName{
        font-family: YouYuan;
        font-size: 18px;
      }
      .bigInput{
        border: 1px solid black;
        width: 80%;
        height: 80%;
      }
      .smallInput{
        border: 1px solid black;
        width: 15%;
        height: 80%;
      }
      .bigSelect{
        width: 30%;
        height: 80%;
        margin-right: 2%;
        border: 1px solid black;
      }
      .smallSelect{
        width: 15%;
        height: 80%;
        margin-right: 2%;
        border: 1px solid black;
      }
      .addButton{
        background-color: #D4EEF2;
        border: 1px solid #D4EEF2;
        border-radius: 8px;
        text-align: center;
        width: 10%;
        height: 80%;
      }
      .selectFile{
        width: 10%;
        height: 80%;
        background-color: #D4EEF2;
        border: 1px solid #D4EEF2;
        border-radius: 8px;
        text-align: center;
      }
      .submit{
        width: 15%;
        height: 80%;
        margin-left: 30%;
        border-radius: 10px;
        float: left;
        background-color: #D4EEF2;
        border: 1px solid #D4EEF2;
        border-radius: 8px;
        text-align: center;
      }
      .reset{
        width: 15%;
        height: 80%;
        margin-right: 30%;
        border-radius: 10px;
        float: right;
        background-color: #D4EEF2;
        border: 1px solid #D4EEF2;
        border-radius: 8px;
        text-align: center;
      }
      .line{
        width: 96%;
        margin: 0 auto;
        border: 1.5px solid #41C7DB;
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
                <div class="block">
                    <div class="title">查看话题</div>
                    <div><input class="returnButton" type="button" onclick="roll_back()" value="返回上一页" /></div>
                    <div class="line"></div>
                    <div class="itemBody">
                        <div class="item">
                          <label class="itemName">题目:Domain model与模块划分</label>
                        </div>
                        <div class="item">
                          <label class="itemName">说明:xxxx</label>
                        </div>
                        <div class="item">
                          <label class="itemName">组数限制:5</label>
                        </div>
                        <div class="item">
                          <label class="itemName">已选小组:1A1 1A2 2A1 2A2</label>
                        </div>
                        <div class="item">
                          <a href="/topic/change" style="text-decoration:none"><button class="submit">修改</button></a>
                          <button class="reset">删除话题</button>
                          <div class="clear"></div>
                        </div>
                    </div>
                </div>
            </div>
            <div class="clear"></div>
        </div>
</body>
</html>