updateClassForm(){
	if(confirm("确定保存修改？"))
	{
		$.ajax({
			url:"/course/update",
			method:"post",
			content:"application/json",
			data: JSON.stringify( { "name": $('#name').val(), "startTime": $('#startTime').val(),
			"endTime": $('#endTime').val(),"description": $('#description').val(),"a": $('#a').val(),
			"b": $('#b').val(),"c": $('#c').val(), } ),
			success:function(data){
				alert("修改成功");
				window.close();
			},
			error:function(data){
				alert("修改失败");
				window.close();
			}
		});
	} 
}