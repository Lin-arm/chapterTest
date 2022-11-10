<%--
  Created by IntelliJ IDEA.
  User: Lin
  Date: 2022/11/8
  Time: 13:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" errorPage="../logError.jsp" %>
<html>
<head>
    <meta name="viewport" content="width=divice-width, initial-scale=1">
    <meta http-equiv="content-type" content="text/html; charset=utf-8">
    <title>注册新用户</title>
<%--    <link rel="shortcut icon" href="https://pic1.imgdb.cn/item/635d4e7f16f2c2beb1394e9a.png">--%>
    <link rel="shortcut icon" href="https://pic1.imgdb.cn/item/635d507516f2c2beb1416f56.png">

    <link href="${pageContext.request.contextPath}/css/ch06_cake/bootstrap.css" type="text/css" rel="stylesheet"/>
    <link href="${pageContext.request.contextPath}/css/ch06_cake/style.css" type="text/css" rel="stylesheet"/>
</head>
<body>
    <jsp:include page="/jsp/ch06/cake/cakeHeader.jsp"/>

    <!-- 注册表单 -->
    <div class="accordion">
        <div class="container">
            <div class="register">
                <form action="/user_register" method="POST">
                    <div class="register-top-grid">
                        <h3>注册新用户</h3>
                        <div class="input">
                            <span>用户名 <label style="color: red;">*</label></span>
                            <input type="text" name="username" placeholder="请输入用户名" required="required">
                        </div>
                        <div class="input">
                            <span>邮箱 <label style="color: red;">*</label></span>
                            <input type="text" name="email" placeholder="请输入邮箱" required="required">
                        </div>
                        <div class="input">
                            <span>密码 <label style="color: red;">*</label></span>
                            <input type="password" name="password" placeholder="请输入密码" required="required">
                        </div>
                        <div class="input">
                            <span>收货人 <label style="color: red;">*</label></span>
                            <input type="text" name="name" placeholder="请输入收货人" required="required">
                        </div>
                        <div class="input">
                            <span>收货电话 <label style="color: red;">*</label></span>
                            <input type="text" name="phone" placeholder="请输入收货电话" required="required">
                        </div>
                        <div class="input">
                            <span>收货地址 <label style="color: red;">*</label></span>
                            <input type="text" name="address" placeholder="请输入收货地址" required="required">
                        </div>
                        <div class="clearfix"> </div>
                    </div>
                    <div class="register-but text-center">
                        <input type="submit" value="提交"/>
                        <div class="clearfix"> </div>
                    </div>
                </form>
                <div class="clearfix"> </div>
            </div>
        </div>
    </div>



    <jsp:include page="/jsp/ch06/cake/cakeFooter.jsp"/>

</body>
</html>
