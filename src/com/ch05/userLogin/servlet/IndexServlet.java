package com.ch05.userLogin.servlet;

import com.ch05.userLogin.entity.User;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import java.io.IOException;

/**
 * @className: IndexServlet
 * @author: Lin
 * @描述: 显示网站的首界面
 * @date: 2022/10/24 10:57
 * @version: 1.0
 */
@WebServlet(name = "IndexServlet",value = "/IndexServlet")
public class IndexServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=utf-8");
        HttpSession session = req.getSession();
        User user = (User) session.getAttribute("user");
        if (user == null) {
            resp.getWriter().write("您还没有登录，请<a href='/html/ch05/login.html'>登录</a>");
        }else {
            resp.getWriter().write("<center><br><h2>您已登录，欢迎您，"+user.getUsername()+"! </h2><br></center>");
            resp.getWriter().print("<br><center><a href='LogoutServlet'>退出</a></center>");
            Cookie cookie = new Cookie("JSESSIONID",session.getId());
            cookie.setMaxAge(30*60);
            cookie.setPath("/ch05");
            resp.addCookie(cookie);
        }

    }
}
