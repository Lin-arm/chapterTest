package com.ch05.userLogin.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @className: LogoutServlet
 * @author: Lin
 * @描述: 退出登录界面
 * @date: 2022/10/24 11:43
 * @version: 1.0
 */
@WebServlet(name = "LogoutServlet",value = "/LogoutServlet")
public class LogoutServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=utf-8");
        resp.getWriter().write("<h4>您已退出登录!</h4><br><br>");

        resp.getWriter().write("5");
        resp.getWriter().println("秒后返回导航页");
//        resp.setHeader("Refresh","5");   //5秒刷新一次
        resp.setHeader("Refresh","5;URL=index.jsp");
    }
}
