$(function(){
$("#delete_select_button").click(function(){
	if(confirm("确定退选此课？"))
	{
		var courseid=$(this).attr('data-course-id');
		alert("courseId="+courseid);
		$.ajax({
			url:"/course/"+courseid+"?type=student",
			method:"DELETE",
			content:"application/json",
			success:function(data){
				alert("退选成功");
				window.location.href="/course?type=student";
			},
			error:function(data){
				alert("退选失败");
				//window.location.href="/course?type=student";
			}
		});
	}
});

});