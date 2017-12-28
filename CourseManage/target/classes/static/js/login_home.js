function loginForm()
{
    var username=$("#username").val();
    if (username==null||username==""){
        alert("用户名不能为空！");
        $("#username").val("");
        $("#password").val("");
        //window.location.href="/teacher";
        return false;
    }
    var password=$("#password").val();
    if (password==null||password==""){
        alert("密码不能为空！");
        $("#password").val("");
        return false;
    }
    else{
        var ata={ "phone": $('#username').val(), "password": $('#password').val() };
        alert(password);
        $.ajax({
            url: "/signin",
            dataType: "json",
            type: "post",
            contentType:"application/json",
            data: JSON.stringify(ata),
            processData: false,
            success: function( data, textStatus, xhr ){
                //成功回调
                alert("登录成功");
                window.location.href="/teacher";
            },
            statusCode:{
                404: function () {
                    $("#password").val("");
                    alert("用户名或密码错误！");
                }
            }
        });
    }
}
