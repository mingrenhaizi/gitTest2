//全局初始化     UI自带
$(document).ready(function () {
    $('.btn-tooltip').tooltip();
    $('.label-tooltip').tooltip();
    $('.pick-class-label').click(function () {
        var new_class = $(this).attr('new-class');
        var old_class = $('#display-buttons').attr('data-class');
        var display_div = $('#display-buttons');
        if (display_div.length) {
            var display_buttons = display_div.find('.btn');
            display_buttons.removeClass(old_class);
            display_buttons.addClass(new_class);
            display_div.attr('data-class', new_class);
        }
    });
    $("#slider-range").slider({
        range: true,
        min: 0,
        max: 500,
        values: [75, 300],
    });
    $("#slider-default").slider({
        value: 70,
        orientation: "horizontal",
        range: "min",
        animate: true
    });
    $('.carousel').carousel({
        interval: 4000
    });
});

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
        complete: function () {//关闭加载动画
        }
    });
}

//flag = success info warning danger
function showMsg(flag, msg) {
    flag = (flag == 1) ? "success" : (flag == 2) ? "info" : (flag == 3) ? "warning" : "danger";
    var alertTag = $("#alertMsg");
    alertTag.attr("class", "alert alert-" + flag);
    alertTag.html('<div class="container alert-"><b>' + flag + '</b> ' + msg + ' </div>');
    alertTag.show(800);
    setTimeout(function () {
        alertTag.hide(800);
    }, 5000);
}


