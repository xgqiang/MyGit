// JavaScript Document
$.ajax({
		url:"/signin",
		method:"POST",
		content:"application/json;charset=utf-8",
		data: JSON.stringify( { "id": $('#id').val(), "password": $('#password').val() } ),
		success:function(data){
			alert("登录成功");
				//window.location.href="teacher_index.html";
		},
		error:function(data){
			alert("登录失败");
				//window.location.href="teacher_index.html";
		}
});
$(function(){
	$('.update_btn').click(function(){
		alert("还没做");
	});
});

$(function(){
	$('.classtitle').click(function(){
		var courseid=$(this).attr('data-course-id');
		window.location.href="../teacher/course/teacher_course_index.html?id="+courseid;
	});
});

$(function(){
	$('.classinfo').click(function(){
		var courseid=$(this).attr('data-course-id');
		window.location.href="../teacher/course/teacher_course_index.html?id="+courseid;
	});
});
