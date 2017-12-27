function updateMessageForm()
{
  $.ajax({
    url: "/me",
    dataType: "json",
    type: "post",
    contentType:"application/json;charset=utf-8",
    data: JSON.stringify( {"id": $('#id').val(),"name": $('#name').val(), "number": $('#number').val() , "email": $('#email').val()
    , "school": $('#school').val(), "gender": $('#gender').val(), "phone": $('#phone').val()} ),
    processData: false,
    success: function( data, textStatus, jQxhr ){
	//成功回调
    },
    error: function( jqXhr, textStatus, errorThrown ){
	//失败回调
    }
});
      
}