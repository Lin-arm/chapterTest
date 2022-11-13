<%--
  Created by IntelliJ IDEA.
  User: Lin
  Date: 2022/11/12
  Time: 16:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:useBean id="username" class="com.ch08.tools.Username" scope="page">
    <jsp:setProperty name="username" property="*"/>
</jsp:useBean>
<html>
<head>
    <title>验证反馈界面</title>
    <link rel="shortcut icon" href="https://pic1.imgdb.cn/item/635d4e8716f2c2beb1396ca7.png">
</head>
<body>

    <% username.setIsval(username.isValid()); %>
    <ul style="font-size: 20px;">
        <li>
            输入的用户名为: <jsp:getProperty property="username" name="username"/>
        </li>
        <li>
            &nbsp;&nbsp;&nbsp;是否有效: <jsp:getProperty property="isval" name="username"/>
        </li>
        <li>
            &nbsp;&nbsp;&nbsp;提示信息: <jsp:getProperty property="tip" name="username"/>
        </li>
    </ul>

</body>
</html>
