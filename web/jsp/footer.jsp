<%--
  Created by IntelliJ IDEA.
  User: Lin
  Date: 2022/10/30
  Time: 11:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>footer</title>
<%--  IDEA静态资源加载不出来解决方法: ${pageContext.request.contextPath}/ --%>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/footer.css">
<%--    <link rel="stylesheet" href="css/footer.css">--%>
    <script src="${pageContext.request.contextPath}/js/showTime.js" type="text/javascript"></script>  <%--计算当前时间--%>
</head>
<body>

    <footer>
        <div id="div_student">
            <div>
                <p class="p_student">姓名:</p>
                <h4 class="h4_student" style="font-size: 20px;color: aqua">林国清</h4>
            </div>
            <div>
                <p class="p_student">&nbsp;&nbsp;&nbsp;学号尾数:</p>
                <h4 class="h4_student" style="font-size: 20px;color: aqua">21</h4>
            </div>
        </div>
        <div id="currentTime" class="showTime">当前时间：2022年10月24-10:26:55</div>
    </footer>
</body>
</html>
