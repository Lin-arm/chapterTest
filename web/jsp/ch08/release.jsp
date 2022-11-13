<%--
  Created by IntelliJ IDEA.
  User: Lin
  Date: 2022/11/12
  Time: 13:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>数据处理</title>
    <link rel="shortcut icon" href="https://pic1.imgdb.cn/item/635d4e8716f2c2beb1396ca7.png">
</head>
<body>
    <jsp:useBean id="email" class="com.ch08.javaBean.Email"/>
    <jsp:useBean id="encoding" class="com.ch08.tools.CharactorEncoding"/>
    <jsp:setProperty name="email" property="*"/>

    <div align="center">
        <div id="container">
            <div id="title">
                <%=encoding.toString(email.getTitle())%>
            </div>
            <hr>
            <div id="content">
                <%=encoding.toString(email.getContent())%>
            </div>
        </div>
    </div>

    <jsp:include page="/jsp/footer.jsp"/>
</body>
</html>
