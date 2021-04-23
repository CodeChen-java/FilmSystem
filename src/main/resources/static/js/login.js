$(function () {
    //处理login.html各种事件
    $("#btn_button").click(function () {
        let username = $("#username").val();
        let password = $("#password").val();
        if(username.length==0) {
            alert("请输入用户名！");
            return false;
        }
        if(password.length==0) {
            alert("请输入密码！");
            return false;
        }
    });
});