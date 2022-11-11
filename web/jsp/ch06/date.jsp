<%@ page import="java.text.SimpleDateFormat" %>
<%@ page import="java.util.Date" %>
<%--
  Created by IntelliJ IDEA.
  User: Lin
  Date: 2022/10/30
  Time: 11:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>date</title>
</head>
<body>
    <h3>欢迎访问，现在的时间是:</h3>
        <%
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String today = sdf.format(new Date());
            out.print(today);
        %>

</body>
</html>
