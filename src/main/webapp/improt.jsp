<%--全局导入(head标签中)--%>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false" %>
<%
    String basePath = request.getScheme() + "://"
            + request.getServerName() + ":" + request.getServerPort()
            + request.getContextPath();
    session.setAttribute("ContextPath", basePath);//将web根目录保存到session中，用el可以直接取到
    String userIp = request.getRemoteHost();
    session.setAttribute("UserIp", userIp);//用户IP地址
%>
<script>
    var contextPath = "${ContextPath}";
</script>
<meta charset="UTF-8">
<%--全局提示框--%>
<div id="alertMsg" onclick="$(this).hide(800)" style="display: none ;position: absolute;left: 183px"></div>

<link href="${ContextPath}/resources/bootstrap3/css/bootstrap.css" rel="stylesheet" />
<link href="${ContextPath}/resources/assets/css/gsdk.css" rel="stylesheet" />
<link href="${ContextPath}/resources/assets/css/demo.css" rel="stylesheet" />
<link href="${ContextPath}/resources/bootstrap3/css/font-awesome.css" rel="stylesheet">
<%--这个没用到，不知道是什么--%>
<%--<link href='http://fonts.googleapis.com/css?family=Grand+Hotel' rel='stylesheet' type='text/css'>--%>
<script src="${ContextPath}/resources/jquery/jquery-3.4.1.js" type="text/javascript"></script>
<script src="${ContextPath}/resources/assets/js/jquery-ui-1.10.4.custom.min.js" type="text/javascript"></script>

<script src="${ContextPath}/resources/bootstrap3/js/bootstrap.js" type="text/javascript"></script>
<script src="${ContextPath}/resources/assets/js/gsdk-checkbox.js"></script>
<script src="${ContextPath}/resources/assets/js/gsdk-radio.js"></script>
<script src="${ContextPath}/resources/assets/js/gsdk-bootstrapswitch.js"></script>
<script src="${ContextPath}/resources/assets/js/get-shit-done.js"></script>
<script src="${ContextPath}/resources/assets/js/custom.js"></script>

<script src="${ContextPath}/utils.js"></script>


