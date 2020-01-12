var formId = "userLoginForm";

$(document).ready(function () {
    init();
    funInit();


});

function funInit() {
    $("#loginBtn").on("click", function () {
        sendPostRequest(contextPath + "/user/login", $("#" + formId).serialize(), function (json) {
            if (json.status == "F") {
                alert(json.msg);
            }
            var res = json.data;
            // TODO 跳转主页
            window.location = contextPath + "/jsp/home/home.jsp"
        }, "json", false);
    })
}

function init() {

}

function test() {
    window.location = contextPath + '/resources/shards/shards-demo.html';
}