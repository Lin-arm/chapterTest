<%--
  Created by IntelliJ IDEA.
  User: Lin
  Date: 2022/11/20
  Time: 13:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" errorPage="/jsp/ch06/logError.jsp" %>
<html>
<head>
    <title>登录页面</title>
    <link rel="shortcut icon" href="https://pic1.imgdb.cn/item/635d4e8716f2c2beb1396ca7.png">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/ch08_model2/register.css">
</head>
<body>
    <div id="div_userlogin">
        <div id="div_main">
            <form action="/lin/UserLoginServlet" method="post">
                <h3>用户注册</h3>
                <div id="outer">
                    <div>
                        <div class="ch">姓名:</div>
                        <div class="ip">
                            <input type="text" name="name" value="${uname}">
                            <span>${errorName}</span>
                        </div>
                    </div>
                    <div>
                        <div class="ch">密码:</div>
                        <div class="ip">
                            <input type="text" name="password">
                            <span>${errorPwd}</span>
                        </div>
                    </div>

                    <div id="btn">
                        <input type="reset" value="重置" />
                        <input type="submit" value="登录" />
                    </div>
                </div>
            </form>
        </div>
    </div>


</body>
</html>
