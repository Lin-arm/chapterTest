package com.ch08.model2.web;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

/**
 * @className: Test
 * @author: Lin
 * @描述: 测试路径
 * @date: 2022/11/13 2:39
 * @version: 1.0
 */
@WebServlet(name = "Test",value = "/Test")
public class Test extends HttpServlet {
    @Override
    public void init(ServletConfig config) throws ServletException {
        System.out.println("Test正在初始化init()--------\n");
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=UTF-8");
        resp.getWriter().print("路径没有问题<br>");
        resp.getWriter().print(req.getRequestURI());
    }

    @Override
    public void destroy() {
        System.out.println("Test已被销毁destroy()---------\n");
    }
}
