package com.ch04.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

/**
 * @className: LoginServlet
 * @author: Lin
 * @描述: 登录(重定向)
 * @date: 2022/10/22 23:25
 * @version: 1.0
 */
@WebServlet(name = "LoginServletTest",value = "/LoginServletTest")
public class LoginServletTest extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=utf-8");
        String uname = req.getParameter("username");
        String pwd = req.getParameter("password");
        String[] hobbys = req.getParameterValues("hobby");

        System.out.print("\n用户名: "+uname+"   密码: "+pwd+"\n爱好: ");
        if (hobbys != null && hobbys.length > 0){
            for (String hobby : hobbys){
                System.out.print(hobby+" ");
            }
            System.out.println("\n");
        }

        if (("admin").equals(uname) && ("123456".equals(pwd))){
            resp.sendRedirect("html/ch04/welcome.html");
        }else{
            resp.getWriter().println("<script language='javascript'>alert('用户名或密码错误');window.location.href='html/ch04/userLogin.html';</script>");
//            resp.sendRedirect("userLogin.html");
        }
    }

}
