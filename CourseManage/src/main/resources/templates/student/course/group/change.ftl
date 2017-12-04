<html>
<head lang="en">
    <meta charset="UTF-8">
    <title>学生上传固定分组</title>
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
	  
   /*表格*/
#studenttable{
  font-family:"Trebuchet MS", Arial, Helvetica, sans-serif;
  position:absolute;
	top:30%;
	left:25%;
  width:65%;
  border-collapse:collapse;

  font-size:1em;
  border:1px solid #98bf21;
  padding:3px 7px 2px 7px; 
  }
#studenttable th 
  {
  font-size:1.1em;
  text-align:center;
  padding-top:5px;
  padding-bottom:4px;
  background-color:#D4EEF2;
  color:#000000;
  }

#studenttable tr.alt td 
  {
  color:#000000;
  background-color:#EAF2D3;
  }
  
  .studentlist
 {
     line-height: 200%;
     font-size:20px;
    list-style-type :none
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
                    <div class="title">固定分组</div>
                    <div><input class="returnButton" type="button" onclick="roll_back()" value="返回上一页" /></div>
                    <div class="line"></div>
                    <div class="itemBody">
                        <div class="item">
                          <table id="studenttable">
<tr>
<th>Company</th>
<th>Contact</th>
<th>Country</th>
</tr>

<tr>
<td>Apple</td>
<td>Steven Jobs</td>
<td>USA</td>
</tr>

<tr class="alt">
<td>Baidu</td>
<td>Li YanHong</td>
<td>China</td>
</tr>

<tr>
<td>Google</td>
<td>Larry Page</td>
<td>USA</td>
</tr>

<tr class="alt">
<td>Lenovo</td>
<td>Liu Chuanzhi</td>
<td>China</td>
</tr>

<tr>
<td>Microsoft</td>
<td>Bill Gates</td>
<td>USA</td>
</tr>

<tr class="alt">
<td>Nokia</td>
<td>Stephen Elop</td>
<td>Finland</td>
</tr>
</table>
                        </div>
						</div>
					<div class="block">
					    <div class="title">添加队员</div>
						<div class="line"></div>
						<div class="itemBody">
						  <div class="item">
                            <label class="itemName">学号：</label>
							<input type="text"/>
							<label class="itemName">姓名：</label>
							<input type="text"/>
							 <div class="returnButton">查询</div>
                          </div>
						  <div class="item">
                            <ul class="studentlist">
	                           <li>学生A</li>
	                           <li>学生B</li>
	                           <li>学生C</li>
	                        </ul>
							<div class="returnButton">确定</div>
                           </div>
						</div>
                    </div>
                </div>
            </div>
            <div class="clear"></div>
        </div>
</body>
</html>