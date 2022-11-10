package com.ch05.cake.servlet;

import com.ch05.cake.entity.Cake;
import com.ch05.cake.entity.CakeDB;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @className: PurchaseServlet
 * @author: Lin
 * @描述: ① 将用户购买的蛋糕信息保存到Session对象中
 *       ② 在用户购买蛋糕结束后，将页面重定向到用户已经购买的蛋糕列表
 * @date: 2022/10/24 1:47
 * @version: 1.0
 */
@WebServlet(name = "PurchaseServlet",value = "/PurchaseServlet")
public class PurchaseServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=utf-8");

        //获得用户点击的商品
        String id = req.getParameter("id");
        if (id == null) {
            resp.sendRedirect("ListCakeServlet");     //重定向
            return;
        }
        Cake cake = CakeDB.getCake(id);
        HttpSession cakeSssion = req.getSession();
        //从Session对象中获得用户的购物车（用List集合模拟购物车）
        List<Cake> cartList = (List<Cake>) cakeSssion.getAttribute("cart");
        if (cartList == null) {
            //首次购买，将购物车存入Session对象
            cakeSssion.setAttribute("cart", cartList=new ArrayList<Cake>());
        }
        //将商品放入购物车
        cartList.add(cake);
        //创建Cookie存放Session的标识号
        Cookie cookie = new Cookie("JSESSIONID",cakeSssion.getId());
        cookie.setMaxAge(30*60);
        cookie.setPath("/Servlet");
        resp.addCookie(cookie);

        //重定向到购物车页面
        resp.sendRedirect("CartServlet");
    }
}
