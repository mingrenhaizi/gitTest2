<%--全局导入(head标签中)--%>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false" %>
<%
    String basePath = request.getScheme() + "://"
            + request.getServerName() + ":" + request.getServerPort()
            + request.getContextPath();
    session.setAttribute("ContextPath",basePath);//将web根目录保存到session中，用el可以直接取到
    String userIp = request.getRemoteHost();
    session.setAttribute("UserIp",userIp);//用户IP地址
%>
<script>
    var contextPath = "${ContextPath}";
</script>
<meta charset="UTF-8">
<link rel="stylesheet" href="${ContextPath}/resources/bootstrap.min.css"/>
<script src="${ContextPath}/resources/jquery-3.1.0.js"></script>
<script src="${ContextPath}/resources/bootstrap.min.js"></script>











<script>

</script>