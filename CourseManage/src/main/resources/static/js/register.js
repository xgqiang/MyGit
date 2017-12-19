function registerForm()
{
  $.ajax({
    url: "/register",
    dataType: "json",
    type: "post",
    content-type:"application/json;charset=utf-8",
    data: JSON.stringify( { "email": $('#email').val(), "password": $('#password').val() , "name": $('#name').val()
    , "school": $('#school').val(),"gender": $('#gender').val(),"type": $('#type').val(),
     "number": $('#number').val(), "email": $('#email').val()} ),
    processData: false,
    success: function( data, textStatus, jQxhr ){
	//成功回调
    },
    error: function( jqXhr, textStatus, errorThrown ){
	//失败回调
    }
    });

}