<%--
  Created by IntelliJ IDEA.
  User: Lin
  Date: 2022/11/8
  Time: 11:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" errorPage="logError.jsp" %>
<html>
<head>
    <title>pageContext对象</title>
</head>
<body>
    <%
//        ServletRequest req = pageContext.getRequest();
        pageContext.setAttribute("str","Java",pageContext.PAGE_SCOPE);     //设置page范围内属性
        request.setAttribute("str","JavaWeb");                             //设置request范围内属性

        String str1 = (String) pageContext.getAttribute("str", pageContext.PAGE_SCOPE);
        String str2 = (String) pageContext.getAttribute("str", pageContext.REQUEST_SCOPE);
    %>

    <%="page范围: "+str1%><br>
    <%="request范围: "+str2%><br>

</body>
</html>
