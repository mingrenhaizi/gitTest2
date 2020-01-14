var formId = "registerForm";

$(document).ready(function () {


});

function submitBtn() {
    //检查有无error

    //发送请求保存此用户

}

function checkPassword2() {
    var password = $("#password").val();
    var password2 = $("#password2").val();
    if (password2 != password) {//确认出错
        setErrorInput("password2", true);
        showMsg(3, '两次密码输入不一样');
    } else {
        setErrorInput("password2", false);//恢复输入框
    }
}

function checkPassword() {
    var password = $("#password").val();
    if (password.toString().length < 8 || password.toString().length > 18) {//密码长度
        setErrorInput("password", true);
        showMsg(3, '密码长度要在8~18之间');
    } else {
        setErrorInput("password", false);//恢复输入框
    }
}

function checkNikeName() {
    var nikeName = $("#nikeName").val();
    if (nikeName.toString().length < 2 || nikeName.toString().length > 10) {
        setErrorInput("nikeName", true);
        showMsg(3, '昵称长度要在2~10之间');
    } else {//昵称长度 检查通过
        setErrorInput("nikeName", false);//恢复输入框
    }
}

function checkAccount() {
    var account = $("#account").val();
    if (account.toString().length < 6 || account.toString().length > 20) {//不在4~10位之间
        setErrorInput("account", true);
        showMsg(3, '账号长度要在6~20之间');
    } else if (/[^0-9a-zA-Z]/g.test(account)) {//字符判断
        setErrorInput("account", true);
        showMsg(3, '账号只能输入英文或数字');
    } else {//格式正确
        //访问数据库查看此账号是否已被注册
        sendPostRequest(contextPath + "/user/accountExit", {"account": account}, function (json) {
            if (json.status == "F") {//账号已注册
                setErrorInput("account", true);
                showMsg(3, json.msg);
                return;
            }
            //账号可用
            setErrorInput("account", false);//恢复输入框
        });
    }
}

//设置error输入框背景 flag = true ,错误 ，flag = 0，取消错误样式
function setErrorInput(id, flag) {
    if (flag) {
        $("#" + id).parent().attr('class', 'col-sm-10 has-error');
    } else {//取消错误样式
        $("#" + id).parent().attr('class', 'col-sm-10');
    }
}

