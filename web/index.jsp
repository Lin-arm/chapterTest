<%@ page import="jakarta.servlet.jsp.PageContext" %><%--
  Created by IntelliJ IDEA.
  User: Lin
  Date: 2022/10/22
  Time: 23:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>导航页</title>
<%--    <link rel="shortcut icon" href="https://www.w3school.com.cn/ui2019/logo-16-red.png"/>--%>
    <link rel="shortcut icon" href="https://pic1.imgdb.cn/item/635d4e7f16f2c2beb1394e9a.png">
    <link rel="stylesheet" href="css/index.css">

  </head>

  <body>

  <script>
    var t = null;
    t = setTimeout(time, 1000); //開始运行
    function time() {
      clearTimeout(t); //清除定时器
      date = new Date();
      var year = date.getFullYear();
      var mt = date.getMonth() + 1;
      var day = date.getDate();
      var hours = date.getHours(); //获取时
      var min = date.getMinutes(); //获取分
      var sec = date.getSeconds(); //获取秒
      document.querySelector(".showTime").innerHTML =
              "当前时间：" + year +"年"+ mt +"月" + day +"-"+ hours +":" + min +":" + sec ;
      t = setTimeout(time, 1000); //设定定时器，循环运行
    }
  </script>

    <div id="container">
      <header class="header">
        <div id="div1">
          <img src="https://gpnu.edu.cn/images/logo.png" width="250px" height="40px">
        </div>
        <div id="div2"><h1>欢迎</h1></div>
        <div id="div3"></div>

      </header>

      <main>
        <div class="chapter">
          <h3><abbr title="第4章-Servlet基础">&#128640;ch04</abbr></h3><br>
          <ul title="ch04">
            <li class="double">
              <a href="html/ch04/userLogin.html" target="_blank" class="ch04">
                <p>登录界面</p>
              </a>
            </li>
          </ul>
        </div>
        <div class="chapter">
          <h3><abbr title="第5章-会话及会话技术">ch05&#129338;</abbr></h3><br>
          <ul title="ch05">
            <li class="empty">
              <a href="#" onclick="javascript:void(0); return false">
                <p></p>
              </a>
            </li>
            <li class="double">
              <a href="LastAccessServlet" target="_blank" class="ch05">
                <p>上次访问时间</p>
              </a>
            </li>
            <li class="empty">
              <a href="#" onclick="javascript:void(0); return false">
                <p></p>
              </a>
            </li>
            <li class="double">
              <a href="ListCakeServlet" target="_blank" class="ch05">
                <p>选购蛋糕</p>
              </a>
            </li>
            <li class="empty">
              <a href="#" onclick="javascript:void(0); return false">
                <p></p>
              </a>
            </li>
            <li class="double">
              <a href="html/ch05/login.html" target="_blank" class="ch05">
                <p>Session模拟用户登录</p>
              </a>
            </li>
          </ul>
        </div>
        <div class="chapter">
          <h3><abbr title="第6章-JSP技术">&#128077;ch06</abbr></h3><br>
          <ul title="ch06">
            <li class="double">
              <a href="jsp/ch06/timeInfo.jsp" target="_blank" class="ch06">
                <p>显示系统时间</p>
              </a>
            </li>
            <li class="double">
              <a href="jsp/ch06/example01.jsp" target="_blank" class="ch06">
                <p>example</p>
              </a>
            </li>
            <li class="double">
              <a href="jsp/ch06/include.jsp" target="_blank" class="ch06">
                <p>include(课后题1)</p>
              </a>
            </li>
            <li class="double">
              <a href="jsp/header.jsp" target="_blank" class="ch06">
                <p>header</p>
              </a>
            </li>
            <li class="double">
              <a href="jsp/footer.jsp" target="_blank" class="ch06">
                <p>footer</p>
              </a>
            </li>
            <li class="double">
              <a href="jsp/ch06/dynamicInclude.jsp" target="_blank" class="ch06">
                <p>include动态(课后题2)</p>
              </a>
            </li>
            <li class="double">
              <a href="jsp/ch06/jspforward.jsp" target="_blank" class="ch06">
                <p>forword请求转发</p>
              </a>
            </li>
            <li class="double">
              <a href="jsp/ch06/out.jsp" target="_blank" class="ch06">
                <p>out对象</p>
              </a>
            </li>
            <li class="double">
              <a href="jsp/ch06/pageContext.jsp" target="_blank" class="ch06">
                <p>pageContext对象</p>
              </a>
            </li>
            <li class="double">
              <a href="jsp/ch06/cake/user_register.jsp" target="_blank" class="ch06">
                <p>蛋糕商城用户注册</p>
              </a>
            </li>
          </ul>
        </div>
        <div class="chapter">
          <h3><abbr title="第7章-EL表达式和JSTL">&#11093;ch07</abbr></h3><br>
          <ul title="ch07">
            <li class="double">
              <a href="#" target="_blank" class="ch07">
                <p>暂无</p>
              </a>
            </li>
          </ul>
        </div>
        <div class="chapter">
          <h3><abbr title="第8章-JavaBean与JSP开发模型">&#126980;ch08</abbr></h3><br>
          <ul title="ch08">
            <li class="double">
              <a href="jsp/ch08/indexB.jsp" target="_blank" class="ch08">
                <p>登录页面</p>
              </a>
            </li>
            <li class="double">
              <a href="jsp/ch08/stuInfo.jsp" target="_blank" class="ch08">
                <p>学生信息</p>
              </a>
            </li>
            <li class="double">
              <a href="jsp/ch08/addBook.jsp" target="_blank" class="ch08">
                <p>添加图书</p>
              </a>
            </li>
            <li class="double">
              <a href="jsp/ch08/email.jsp" target="_blank" class="ch08">
                <p>邮件发送</p>
              </a>
            </li>
            <li class="double">
              <a href="jsp/ch08/login.jsp" target="_blank" class="ch08">
                <p>输入用户名</p>
              </a>
            </li>
            <li class="double">
              <a href="jsp/ch08/model2/register.jsp" target="_blank" class="ch08">
                <p>用户注册</p>
              </a>
            </li>
          </ul>
        </div>
        <div class="chapter">
          <h3><abbr title="个人测试">&#10024;Test</abbr></h3><br>
          <ul title="ch_test">
            <li class="double">
              <a href="jsp/modal.jsp" target="_blank" class="ch_test">
                <p>弹窗</p>
              </a>
            </li>
          </ul>
        </div>

      </main>

      <footer>
        <div id="div_student">
          <div>
            <p class="p_student">姓名:</p>
            <h4 class="h4_student" style="font-size: 25px;color: aqua">林国清</h4>
          </div>
          <div>
            <p class="p_student">&nbsp;&nbsp;&nbsp;学号:</p>
            <h4 class="h4_studentID" style="font-size: 20px;color: aqua">2020035723021</h4>
          </div>
        </div>
        <div id="currentTime" class="showTime">当前时间：2022年10月24-10:26:55</div>
      </footer>

    </div>

  </body>
</html>
