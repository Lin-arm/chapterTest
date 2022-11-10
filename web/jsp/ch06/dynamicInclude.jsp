<%--
  Created by IntelliJ IDEA.
  User: Lin
  Date: 2022/10/30
  Time: 17:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>dynamicInclude page</title>
    <link rel="shortcut icon" href="https://pic1.imgdb.cn/item/635d4e8716f2c2beb1396ca7.png">
</head>
<body>
    <jsp:include page="/jsp/header.jsp"/>
    <br><br><br><br>

    dynamicInclude.jsp内的中文<br><br>
    <jsp:include page="included.jsp" flush="true" />

    <br><br>
    <jsp:include page="/jsp/footer.jsp"/>

</body>
</html>
