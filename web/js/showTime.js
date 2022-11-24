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