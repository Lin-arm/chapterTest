<%--
  Created by IntelliJ IDEA.
  User: Lin
  Date: 2022/11/8
  Time: 13:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>用户登录</title>
    <link rel="shortcut icon" href="https://pic1.imgdb.cn/item/635d4e7f16f2c2beb1394e9a.png">
</head>
<body>
    <jsp:include page="/jsp/header.jsp" /><br><br>

    <form action="" method="post">
        用户名:<input type="text" name="uname" style="width: 200px"/><br>
        密&nbsp;&nbsp;&nbsp;码:<input type="password" name="upwd" style="width: 200px"/><br>
        <input type="submit" value="登录"/>
    </form>

    <jsp:include page="/jsp/footer.jsp" />
</body>
</html>
