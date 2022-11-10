package com.ch05.userLogin.servlet;

import com.ch05.userLogin.entity.User;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

/**
 * @className: LoginServlet
 * @author: Lin
 * @描述: 显示用户登录成功后的界面
 * @date: 2022/10/24 11:48
 * @version: 1.0
 */
@WebServlet(name = "LoginServlet",value = "/LoginServlet")
public class LoginServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=utf-8");
        String username = req.getParameter("username");
        String password = req.getParameter("password");

        if (("admin").equals(username) && ("123456").equals(password)) {
            User user = new User();
            user.setUsername(username);
            user.setPassword(password);
            req.getSession().setAttribute("user",user);
            resp.sendRedirect("/lin/IndexServlet");
        }else {
            resp.getWriter().write("用户名或密码错误，登录失败");
        }

    }
}
