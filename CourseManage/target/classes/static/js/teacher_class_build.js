function createClassForm()
{
  $.ajax({
    url: "/class/create",
    dataType: "json",
    type: "post",
    contentType:"application/json;charset=utf-8",
    data: JSON.stringify( { "name": $('#name').val(), "site": $('#site').val() , "week": $('#week').val()
    , "day": $('#day').val(), "lesson": $('#lesson').val(), "presentation": $('#presentation').val(),
     "report": $('#report').val(), "a": $('#a').val(), "b": $('#b').val()
     , "c": $('#c').val()} ),
    processData: false,
    success: function( data, textStatus, jQxhr ){
    alert("创建班级成功");
    window.location.href="/class?type=teacher";
	//成功回调
    },
    error: function( jqXhr, textStatus, errorThrown ){
    alert("创建班级失败");
	//失败回调
    }
});    
}