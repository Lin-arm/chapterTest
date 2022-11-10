<%--
  Created by IntelliJ IDEA.
  User: Lin
  Date: 2022/10/30
  Time: 0:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.util.Date" %>
<%@ page import="java.text.SimpleDateFormat" %>
<html>
<head>
    <title>显示系统时间</title>
    <link rel="shortcut icon" href="https://pic1.imgdb.cn/item/635d507516f2c2beb1416f56.png">
<%--    <link rel="shortcut icon" href="favicon.ico">--%>
</head>
<body>
    <%
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String newTime = sdf.format(new Date());
    %>
    <h2>当前时间: <%=newTime%></h2>

</body>
</html>
