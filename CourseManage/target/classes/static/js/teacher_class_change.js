$(function(){
$("#update_button").click(function(){
     var classId=$(this).attr('data-class-id');
	if(confirm("确定保存修改？"))
	{
		$.ajax({
			url:"/class/update",
			method:"PUT",
			content:"application/json",
			data: JSON.stringify( { "classId": classId,"name": $('#name').val(), "startTime": $('#startTime').val(),
			"endTime": $('#endTime').val(),"description": $('#description').val(),"a": $('#a').val(),
			"b": $('#b').val(),"c": $('#c').val(), } ),
			success:function(data){
				alert("修改成功");
				window.location.href="/class?type=teacher";
			},
			error:function(data){
				alert("修改失败");
			}
		});
	}
}); 
});