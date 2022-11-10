<%--
  Created by IntelliJ IDEA.
  User: Lin
  Date: 2022/10/30
  Time: 17:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>welcome</title>
    <link rel="shortcut icon" href="https://pic1.imgdb.cn/item/635d4e9516f2c2beb139a016.png">
</head>
<body>
    <jsp:include page="/jsp/header.jsp" /><br><br>
    <h3>你好，欢迎进入首页，当前访问时间是: </h3>
    <% out.print(new java.util.Date()); %>

    <br><br>
    <jsp:include page="/jsp/footer.jsp" />
</body>
</html>
