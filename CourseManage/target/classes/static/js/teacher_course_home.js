function roll_back()
{
window.history.back(-1); 
}


$(function(){
$("#delete_button").click(function(){
	if(confirm("确定删除此课？"))
	{
		var courseid=$(this).attr('data-course-id');
		alert("courseId="+courseid);
		$.ajax({
			url:"/course/"+courseid,
			method:"DELETE",
			content:"application/json",
			success:function(data){
				alert("删除成功");
				window.location.href="/course?type=teacher";
			},
			error:function(data){
				alert("删除失败");
				//window.location.href="/course?type=teacher";
			}
		});
	}
});
});

$(function(){
$("#update_button").click(function(){
	if(confirm("确定要修改课程？"))
	{
		var courseId=$(this).attr('data-course-id');
		alert("courseId="+courseId);
		window.open ("/course/change?id="+courseId, "修改课程", "height=400, width=600, top=150, left=400, toolbar=no, menubar=no, scrollbars=no, resizable=no,location=no, status=no");
	}
});
});
$(function(){
	$("#update_button").click(function(){
		if(confirm("确定要修改课程？"))
		{
			var courseId=$(this).attr('data-course-id');
			alert("courseId="+courseId);
			window.open ("/course/change?id="+courseId, "修改课程", "height=400, width=600, top=150, left=400, toolbar=no, menubar=no, scrollbars=no, resizable=no,location=no, status=no");
		}
});
});