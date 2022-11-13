<%--
  Created by IntelliJ IDEA.
  User: Lin
  Date: 2022/11/12
  Time: 16:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>用户输入用户名界面</title>
    <link rel="shortcut icon" href="https://pic1.imgdb.cn/item/635d4e8716f2c2beb1396ca7.png">
</head>
<body>
    <jsp:include page="/jsp/header.jsp"/><br><br>

    <form action="judge.jsp" method="post" style="font-size: 20px;">
        <li>
            请输入用户名： <input type="text" name="username"/>只能由字母、数字或者下划线组成
        </li>
        <li>
            <input type="submit" name="submit" value="验证"/>
        </li>
    </form>

    <jsp:include page="/jsp/footer.jsp"/>
</body>
</html>
