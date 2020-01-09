//发送请求封装方法                                 "json",false,"POST"
function sendPostRequest(url, param, callBack, dataType, async, type) {
    if (dataType === undefined || dataType === "" || dataType === null) {
        dataType = "json";
    }
    if (async === undefined) {
        async = true;
    }
    if (type === undefined || type === "" || type === null) {
        type = "POST";
    }
    $.ajax({
        type: type,
        url: url,
        async: async,
        data: param,
        dataType: dataType,
        beforeSend: function () {//打开加载动画

        },
        success: callBack,
        error: function () {//请求发送失败
            alert("请求发送失败");
        },
        complete:function () {//关闭加载动画

        }
    });
}