<%--
  Created by IntelliJ IDEA.
  User: Lin
  Date: 2022/10/30
  Time: 1:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.util.Date" %>
<html>
<head>
    <title>JSP基本语法</title>
    <link rel="shortcut icon" href="https://pic1.imgdb.cn/item/635d4e7f16f2c2beb1394e9a.png">
</head>
<%!
    //(全局)声明
    public int intAdd(){
        int n = 1, m = 2;
        return n+m;
    }
%>
<body>
    <%
        out.write("example01.jsp<br>");
        int a = 1, b = 2;
        out.print(a+b);
        out.write("<br>改后: <br>");
    %>
    <%=a+b%>
    <br><hr><br>

    <%
        out.write("example02.jsp<br>");
        //调用
        out.print(intAdd());
    %><br><hr><br>

    <% out.write("example03.jsp----注释<br>"); %>
    <!--  这个是HTML注释  -->
    <%--  这个是JSP注释  --%>
    <br><hr><br>

    <% out.write("example04.jsp----动态注释<br>"); %>
    <!--  <%=new Date()%>  -->
    <br><hr><br>

</body>
</html>
