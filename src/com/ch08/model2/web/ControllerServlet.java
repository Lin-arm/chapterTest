package com.ch08.model2.web;

import com.ch08.model2.domain.RegisterFormBean;
import com.ch08.model2.domain.UserBean;
import com.ch08.model2.util.DBUtil;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @className: ControllerServlet
 * @author: Lin
 * @描述: 处理用户(注册信息)请求
 * @date: 2022/11/12 19:10
 * @version: 1.0
 */
@WebServlet(name = "ControllerServlet",value = "/ControllerServlet")
public class ControllerServlet extends HttpServlet {
    @Override
    public void init(ServletConfig config) throws ServletException {
        System.out.println("ControllerServlet正在初始化init()--------\n");
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        resp.setHeader("Content-type","text/html;charset=GBK");
//        resp.setCharacterEncoding("GBK");
        resp.setContentType("text/html;charset=UTF-8");

        String name = req.getParameter("name");
        String password = req.getParameter("password");
        String password2 = req.getParameter("password2");
        String email = req.getParameter("email");

        //将获取的参数封装到注册表单相关的RegisterFormBean类中
        RegisterFormBean formBean = new RegisterFormBean();
        formBean.setName(name);
        formBean.setPassword(password);
        formBean.setPassword2(password2);
        formBean.setEmail(email);

        //验证参数填写是否符合要求，不符合，转发到register.jsp重新填写
        if (!formBean.validate()) {
            System.out.println("已进入formBean.validate()判断--------为false");
            req.setAttribute("formBean",formBean);
            req.getRequestDispatcher("jsp/ch08/model2/register.jsp").forward(req,resp);
            return;
        }

        //符合要求，则将数据封装到UserBean类中
        UserBean userBean = new UserBean();
        userBean.setName(name);
        userBean.setPassword(password);
        userBean.setEmail(email);

        //调用DBUtil类中的insertUser()方法执行添加操作，并返回一个boolean类型的标志
        boolean b = DBUtil.getInstance().insertUser(userBean);

        //如果返回为false，注册的用户已存在，重定向到register.jsp重新填写
        if (!b) {
            req.setAttribute("DBMes","您注册的用户已存在");
            req.setAttribute("formBean",formBean);
            req.getRequestDispatcher("jsp/ch08/model2/register.jsp").forward(req,resp);    //注意路径，别跳转错了404
            return;
        }

        //成功
        System.out.println("用户信息校验成功--------");
        resp.getWriter().print("<h3>恭喜您("+formBean.getName()+")注册成功，3秒后自动跳转</h3>");
        req.getSession().setAttribute("userBean",userBean);       //将用户信息存入Session
        resp.setHeader("refresh","3;url=jsp/ch08/model2/loginSuccess.jsp");   //3秒后跳转到登录成功页面 (注意路径)
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.service(req, resp);
    }

}
