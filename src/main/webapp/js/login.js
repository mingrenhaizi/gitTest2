var formId = "userLoginForm";

$(document).ready(function () {
    init();
    funInit();
});

function funInit() {
    $("#loginBtn").on("click", function () {
        sendPostRequest(contextPath + "/user/login", $("#" + formId).serialize(), function (json) {
            if (json.status == "F") {
                showMsg(3,json.msg);
                return;
            }
            var res = json.data;
            window.location = contextPath + "/jsp/home/home.jsp"
        }, "json", false);
    })
}

function init() {

}

function test() {
    window.location = contextPath + '/resources/index.jsp';
}