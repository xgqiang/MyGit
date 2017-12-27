function createCourseForm()
{
  $.ajax({
    url: "/course",
    dataType: "json",
    type: "post",
    contentType:"application/json;charset=utf-8",
    data: JSON.stringify( { "name": $('#name').val(), "startTime": $('#startTime').val() , "endTime": $('#endTime').val()
    , "description": $('#description').val(), "numClass": $('#numClass').val(), "numStudent": $('#numStudent').val(),
    "presentation": $('#presentation').val(),"report": $('#report').val(), "a": $('#a').val(), "b": $('#b').val()
     , "c": $('#c').val()} ),
    processData: false,
    success: function( data, textStatus, jQxhr ){
	//成功回调
    },
    error: function( jqXhr, textStatus, errorThrown ){
	//失败回调
    }
});     
}