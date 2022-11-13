<%--
  Created by IntelliJ IDEA.
  User: Lin
  Date: 2022/11/12
  Time: 19:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>用户注册</title>
    <link rel="shortcut icon" href="https://pic1.imgdb.cn/item/635d4e8716f2c2beb1396ca7.png">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/ch08_model2/register.css">
</head>
<body>
<%--    <jsp:include page="/jsp/header.jsp"/><br><br>--%>

    <div id="div_userlogin">
        <div id="div_main">
            <form action="/lin/ControllerServlet" method="post">
                <h3>用户注册</h3>
                <div id="outer">
                    <div>
                        <div class="ch">姓名:</div>
                        <div class="ip">
                            <input type="text" name="name" value="${formBean.name}">
                            <span>${formBean.errors.name}${DBMes}</span>
                        </div>
                    </div>
                    <div>
                        <div class="ch">密码:</div>
                        <div class="ip">
                            <input type="text" name="password">
                            <span>${formBean.errors.password}</span>
                        </div>
                    </div>
                    <div>
                        <div class="ch">确认密码:</div>
                        <div class="ip">
                            <input type="text" name="password2">
                            <span>${formBean.errors.password2}</span>
                        </div>
                    </div>
                    <div>
                        <div class="ch">邮箱:</div>
                        <div class="ip">
                            <input type="text" name="email" value="${formBean.email}">
                            <span>${formBean.errors.email}</span>
                        </div>
                    </div>
                    <div id="btn">
                        <input type="reset" value="重置" />
                        <input type="submit" value="注册" />
                    </div>
                </div>
            </form>
        </div>
    </div>
<%--    <jsp:include page="/jsp/footer.jsp"/>--%>
</body>
</html>
