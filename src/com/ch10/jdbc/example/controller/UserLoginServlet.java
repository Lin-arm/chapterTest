package com.ch10.jdbc.example.controller;

import com.ch10.jdbc.example.dao.UsersDao;
import com.ch10.jdbc.example.domain.JUser;
import com.ch10.jdbc.example.utils.JDBCUtils;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import javax.jms.Session;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
/**
 * @className: UserLoginServlet
 * @author: Lin
 * @描述: 处理用户登录请求
 * @date: 2022/11/22 21:16
 * @version: 1.0
 */
@WebServlet(name = "UserLoginServlet",value = "/UserLoginServlet")
public class UserLoginServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=UTF-8");
        String name = req.getParameter("name");
        String pwd = req.getParameter("password");

        UsersDao usersDao = new UsersDao();
        ArrayList<JUser> jUserList = usersDao.findAll();

        //判断参数是否为空
        if (name == null || name.equals("")) {
            req.setAttribute("errorName","用户名不能为空!");
            req.getRequestDispatcher("jsp/ch10/loginJdbc.jsp").forward(req,resp);
            return;
        }
        if (pwd == null || pwd.equals("")) {
            req.setAttribute("errorPwd","密码不能为空!");
            req.setAttribute("uname",name);
            System.out.println("密码为空");
            req.getRequestDispatcher("jsp/ch10/loginJdbc.jsp").forward(req,resp);
            return;
        }

        //循环判断集合中是否存在所要登录的name
        for (int i = 0; i < jUserList.size(); i++) {
            if (jUserList.get(i).getUsername().equals(name)) {
                System.out.println(name+"用户存在");
                if (jUserList.get(i).getPassword().equals(pwd)){
                    System.out.println(pwd+"密码正确");
                    //校验成功
                    resp.getWriter().println("<h2>欢迎登录!  "+name+"</h2>");
                    return;
                }else {
                    req.setAttribute("errorPwd","密码错误!");
                    req.setAttribute("uname",name);
                    req.getRequestDispatcher("jsp/ch10/loginJdbc.jsp").forward(req,resp);
                    return;
                }
            }
        }
        //name不存在
        req.setAttribute("errorName","用户不存在!");
        req.getRequestDispatcher("jsp/ch10/loginJdbc.jsp").forward(req,resp);
    }
}
