<%@ include file="/improt.jsp" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>

<head>
    <script src="${ContextPath}/js/register.js"></script>
    <title>注册</title>
</head>

<body>
<div style="width: 400px;margin: auto;position: relative;left: 42px" align="center">
    <br><br>
    <h3>开始注册！</h3><br>
    <form class="form-horizontal" id="registerForm" >
        <div class="form-group">
            <label for="account" class="col-sm-2 control-label">账号</label>
            <div class="col-sm-10" style="width: 280px">
                <input type="text" class="form-control" id="account" name="account" placeholder="请输入账号"
                       onblur="checkAccount()">
            </div>
        </div>
        <div class="form-group">
            <label for="nikeName" class="col-sm-2 control-label">昵称</label>
            <div class="col-sm-10" style="width: 280px">
                <input type="text" class="form-control" id="nikeName" name="nikeName" placeholder="请输入昵称"
                       onblur="checkNikeName()">
            </div>
        </div>
        <div class="form-group">
            <label for="password" class="col-sm-2 control-label">密码</label>
            <div class="col-sm-10" style="width: 280px">
                <input type="password" class="form-control" id="password" name="password" placeholder="请输入密码"
                       onpaste="return false" oncontextmenu="return false" onblur="checkPassword()">
            </div>
        </div>
        <div class="form-group">
            <label for="password2" class="col-sm-2 control-label"> </label>
            <div class="col-sm-10" style="width: 280px">
                <input type="password" class="form-control" id="password2" name="password2" placeholder="请再次输入密码"
                       onpaste="return false" oncontextmenu="return false" onblur="checkPassword2()">
            </div>
        </div>
        <div class="form-group">
            <label class="col-sm-2 control-label">性别</label>
            <div class="checkbox" style="position: relative;left: -80px;">
                <label class="radio">
                    <input type="radio" name="sex" id="sex1" value="先生" checked data-toggle="radio">
                    <i></i>&nbsp;&nbsp;男&nbsp;&nbsp;
                </label>
                <label class="radio" style="position:relative;left: 38px;">
                    <input type="radio" name="sex" id="sex2" value="女士" data-toggle="radio">
                    <i></i>&nbsp;&nbsp;女&nbsp;&nbsp;
                </label>
            </div>
        </div>
        <div class="form-group">
            <div class="col-sm-offset-2 col-sm-10" style="position: relative;left: -70px;">
                <button onclick="submitBtn()" class="btn btn-primary btn-lg btn-block">注册</button>
            </div>
        </div>

        <a href="../index.do" style="position: relative;left: 60px;">已有账号？点此登录！</a>
    </form>
</div>
</body>

</html>