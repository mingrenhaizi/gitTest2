<!DOCTYPE HTML>
<%@ include file="/improt.jsp"  %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <script src="${contextPath}/js/login.js"></script>
    <title>主页</title>
</head>

<body>
${user.account}<br>
${user.nikeName}<br>
${user.password}<br>

</body>
</html>