<%@ include file="/improt.jsp" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <script src="${ContextPath}/js/login.js"></script>
    <title>登录</title>
</head>

<body>

<div style="width: 400px;margin: auto;position: relative; left: 42px" align="center">
    <br><br>
    <h3>欢迎进入超市购物系统！</h3><br>
    <form id="userLoginForm" class="form-horizontal">
        <div class="form-group">
            <label for="account" class="col-sm-2 control-label">账号</label>
            <div class="col-sm-10" style="width: 280px">
                <input type="text" class="form-control" id="account" name="account" placeholder="请输入账号"
                       onblur="if(/[^0-9a-zA-Z]/g.test(value))alert('账号只能输入英文或数字')">
            </div>
        </div>
        <div class="form-group">
            <label for="password" class="col-sm-2 control-label">密码</label>
            <div class="col-sm-10" style="width: 280px">
                <%--密码禁止粘贴--%>
                <input type="password" class="form-control" id="password" name="password" placeholder="请输入密码"
                       onpaste="return false" oncontextmenu="return false">
            </div>
        </div>
        <div class="form-group">
            <div class="col-sm-offset-2 col-sm-10">
                <div class="switch"
                     data-on-label="<i class='fa fa-check'></i>"
                     data-off-label="<i class='fa fa-times'></i>"
                     style="position: relative;left: -70px">
                    <%--<input name="saveUserByCookie" class="ct-blue" type="checkbox" checked/>--%>
                        <input name="saveUserByCookie" type="checkbox" class="ct-blue" checked/>
                </div>
                <div style="position: relative;left: -70px;top: -8px;display: inline">7天内在此电脑保存登录状态</div>
            </div>
        </div>
        <div class="form-group">
            <div class="col-sm-offset-2 col-sm-10" style="position: relative;left: -70px;">
                <button id="loginBtn" type="button" class="btn btn-block btn-lg btn-primary btn-fill">登录</button>
            </div>
        </div>

        <a href="${ContextPath}/jsp/register.jsp" class="ct-blue" style="position: relative;left: 60px;">没有账号？点此注册！</a>
    </form>
</div>
<button onclick="test()">测试按钮</button>

</body>
</html>