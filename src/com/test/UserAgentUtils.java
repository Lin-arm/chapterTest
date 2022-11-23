package com.test;

import eu.bitwalker.useragentutils.Browser;
import eu.bitwalker.useragentutils.OperatingSystem;
import eu.bitwalker.useragentutils.UserAgent;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

/**
 * @className: UserAgentUtils
 * @author: Lin
 * @描述: 浏览器解析工具
 * @date: 2022/11/21 2:27
 * @version: 1.0
 */
@WebServlet(name = "UserAgentUtils",value = "/UserAgentUtils")
public class UserAgentUtils extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=utf-8");

        String agent = req.getHeader("User-Agent");
        System.out.println("\n"+agent);
        resp.getWriter().println("<h3>"+agent+"</h3><br>");

        UserAgent userAgent = UserAgent.parseUserAgentString(agent);   //解析agent字符串
        Browser browser = userAgent.getBrowser();                      //获取浏览器对象
        OperatingSystem system = userAgent.getOperatingSystem();       //获取操作系统对象

        //userAgent
        resp.getWriter().println("浏览器名: "+browser.getName()+"<br>");
        resp.getWriter().println("类型: "+browser.getBrowserType().toString().toLowerCase()+"<br>");
        resp.getWriter().println("家族: "+browser.getGroup().toString().toLowerCase()+"<br>");  //toLowerCase()将字符串转换为小写
        resp.getWriter().println("生产厂商: "+browser.getManufacturer().toString().toLowerCase()+"<br>");
        resp.getWriter().println("渲染引擎: "+browser.getRenderingEngine()+"<br>");
        resp.getWriter().println("版本: "+userAgent.getBrowserVersion()+"<br><br>");

        resp.getWriter().println("操作系统名: "+system.getName()+"<br>");
        resp.getWriter().println("设备类型: "+system.getDeviceType().toString().toLowerCase()+"<br>");
        resp.getWriter().println("家族: "+system.getGroup().toString().toLowerCase()+"<br>");
        resp.getWriter().println("生产厂商: "+system.getManufacturer().toString().toLowerCase()+"<br>");

    }
}
