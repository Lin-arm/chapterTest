<%--
  Created by IntelliJ IDEA.
  User: Lin
  Date: 2022/10/31
  Time: 23:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>modal弹窗</title>
    <link rel="shortcut icon" href="https://pic1.imgdb.cn/item/635d4e7f16f2c2beb1394e9a.png">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/modal.css">
</head>
<body>
    <button id="myBtn">打开弹窗</button>
    <div id="myModal" class="modal">
        <div class="modal-content">
            <div class="modal-header">
                <span class="close">&times;</span>
                <h2>弹窗头部</h2>
            </div>
            <div class="modal-body">
                <p>弹窗文本</p>
                <p>弹窗文本</p>
            </div>
            <div class="modal-footer">
                <h3>弹窗底部</h3>
            </div>
        </div>
    </div>



    <script>
        //<script>要放在后面，否则获取不了控件 id
        var modal = document.getElementById('myModal');           //获取弹窗
        var btn = document.getElementById("myBtn");               //打开弹窗的按钮对象
        var span = document.getElementsByClassName("close")[0];   //获取 <span> 元素，用于关闭弹窗 that closes the modal

        // window.alert(btn);
        // 点击按钮打开弹窗
        btn.onclick = function () {
            modal.style.display = "block";
        }
        // 点击 <span> (x), 关闭弹窗
        span.onclick = function () {
            modal.style.display = "none";
        }
        // 在用户点击其他地方时，关闭弹窗
        window.onclick = function (event) {
            if (event.target == modal){
                modal.style.display = "none";
            }
        }
    </script>

</body>
</html>
