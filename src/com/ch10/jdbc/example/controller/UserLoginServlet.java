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
 * @����: �����û���¼����
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

        //�жϲ����Ƿ�Ϊ��
        if (name == null || name.equals("")) {
            req.setAttribute("errorName","�û�������Ϊ��!");
            req.getRequestDispatcher("jsp/ch10/loginJdbc.jsp").forward(req,resp);
            return;
        }
        if (pwd == null || pwd.equals("")) {
            req.setAttribute("errorPwd","���벻��Ϊ��!");
            req.setAttribute("uname",name);
            System.out.println("����Ϊ��");
            req.getRequestDispatcher("jsp/ch10/loginJdbc.jsp").forward(req,resp);
            return;
        }

        //ѭ���жϼ������Ƿ������Ҫ��¼��name
        for (int i = 0; i < jUserList.size(); i++) {
            if (jUserList.get(i).getUsername().equals(name)) {
                System.out.println(name+"�û�����");
                if (jUserList.get(i).getPassword().equals(pwd)){
                    System.out.println(pwd+"������ȷ");
                    //У��ɹ�
                    resp.getWriter().println("<h2>��ӭ��¼!  "+name+"</h2>");
                    return;
                }else {
                    req.setAttribute("errorPwd","�������!");
                    req.setAttribute("uname",name);
                    req.getRequestDispatcher("jsp/ch10/loginJdbc.jsp").forward(req,resp);
                    return;
                }
            }
        }
        //name������
        req.setAttribute("errorName","�û�������!");
        req.getRequestDispatcher("jsp/ch10/loginJdbc.jsp").forward(req,resp);
    }
}
