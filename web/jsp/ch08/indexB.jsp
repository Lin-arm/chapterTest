<%--
  Created by IntelliJ IDEA.
  User: Lin
  Date: 2022/11/12
  Time: 0:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录页面</title>
</head>
<body>
    <form action="resultB.jsp" method="post">
        <table align="center" width="300" border="1" height="150">
            <tr>
                <td colspan="2" align="center">
                    <b>登录页面</b>
                </td>
            </tr>
            <tr>
                <td align="right">
                    用户名:<input type="text" name="uname" />
                </td>
            </tr>
            <tr>
                <td align="right">
                    密码:<input type="password" name="upwd" />
                </td>
            </tr>
            <tr>
                <td colspan="2" align="center">
                    <input type="submit" value="提交">
                </td>
            </tr>
        </table>
    </form>

</body>
</html>
