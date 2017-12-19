function createClassForm()
{
  $.ajax({
    url: "/class/seminar/create",
    dataType: "json",
    type: "post",
    content-type:"application/json;charset=utf-8",
    data: JSON.stringify( { "name": $('#name').val(), "description": $('#description').val(), 
    "groupingMethod": $('#groupingMethod').val(), "presentation": $('#presentation').val(),
    "startTime": $('#startTime').val(), "endTime": $('#endTime').val(), "report": $('#report').val(),
     "a": $('#a').val(), "b": $('#b').val(), "c": $('#c').val()} ),
    processData: false,
    success: function( data, textStatus, jQxhr ){
	//成功回调
    },
    error: function( jqXhr, textStatus, errorThrown ){
	//失败回调
    }
});    
}