<%--
  Created by IntelliJ IDEA.
  User: Lin
  Date: 2022/11/1
  Time: 20:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isErrorPage="true" %>
<html>
<head>
    <title>错误调试页</title>
    <link rel="shortcut icon" href="https://pic1.imgdb.cn/item/635d4e7f16f2c2beb1394e9a.png">
</head>
<body>
    <h3>出错了</h3>
    <%="异常信息: "+exception.getMessage()%><br>
    <%="异常类名: "+exception.toString()%><br>
<%--    <% exception.printStackTrace(response.getWriter());%>--%>
</body>
</html>
