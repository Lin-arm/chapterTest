<%--
  Created by IntelliJ IDEA.
  User: Lin
  Date: 2022/11/12
  Time: 11:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>图书信息</title>
</head>
<body>
    <%request.setCharacterEncoding("UTF-8");%>
    <jsp:useBean id="book" class="com.ch08.javaBean.Book" scope="page">
        <jsp:setProperty name="book" property="*"/>
    </jsp:useBean>

    <table align="center" width="400">
        <tr>
            <td align="center">书名: <jsp:getProperty name="book" property="bookName"/></td>
        </tr>
        <tr>
            <td align="center">价格: <jsp:getProperty name="book" property="price"/></td>
        </tr>
        <tr>
            <td align="center">作者: <jsp:getProperty name="book" property="author"/></td>
        </tr>
    </table>

</body>
</html>
