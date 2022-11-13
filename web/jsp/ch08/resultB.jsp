<%--
  Created by IntelliJ IDEA.
  User: Lin
  Date: 2022/11/12
  Time: 0:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="com.ch08.javaBean.BUser" %>
<html>
<head>
    <title>结果提示</title>
    <link rel="shortcut icon" href="https://pic1.imgdb.cn/item/635d4e8716f2c2beb1396ca7.png">
</head>
<body>
    <div align="center">
        <%
            String uname = request.getParameter("uname");
            String upwd = request.getParameter("upwd");
            BUser user = new BUser(uname, upwd);
            if (!user.getUname().equals("") && !user.getUpwd().equals("")) {
                out.print("恭喜您，登录成功！");
            }else {
                out.print("请输入正确的用户名和密码！");
            }
        %><br><br>
        <a href="indexB.jsp">返回</a>
    </div>

</body>
</html>
