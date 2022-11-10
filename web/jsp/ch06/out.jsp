<%--
  Created by IntelliJ IDEA.
  User: Lin
  Date: 2022/11/8
  Time: 11:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" errorPage="logError.jsp" %>
<%--<%@ page contentType="text/html;charset=UTF-8" language="java" errorPage="logError.jsp" buffer="0kb" %>--%>
<html>
<head>
    <title>out对象</title>
</head>
<body>
    <%
        out.print("1.这是out.print()-----"+"<br>");
        response.getWriter().println("2.这是response.getWriter().println()----"+"<br>");
    %>

</body>
</html>
