<%--
  Created by IntelliJ IDEA.
  User: Lin
  Date: 2022/11/12
  Time: 0:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>学生信息</title>
    <link rel="shortcut icon" href="https://pic1.imgdb.cn/item/635d4e8716f2c2beb1396ca7.png">
</head>
<body>
    <jsp:include page="/jsp/header.jsp"/><br><br>

    <jsp:useBean id="student" class="com.ch08.javaBean.Student" ></jsp:useBean>
    <jsp:setProperty name="student" property="name" value="小明"/>
    <jsp:setProperty name="student" property="age" value="21"/>
    <jsp:setProperty name="student" property="sex" value="男"/>
    <div>
        <ul>
            <li>
                姓名:<jsp:getProperty name="student" property="name"/>
            </li>
            <li>
                年龄:<jsp:getProperty name="student" property="age"/>
            </li>
            <li>
                性别:<jsp:getProperty name="student" property="sex"/>
            </li>
        </ul>
    </div>

    <jsp:include page="/jsp/footer.jsp"/>
</body>
</html>
