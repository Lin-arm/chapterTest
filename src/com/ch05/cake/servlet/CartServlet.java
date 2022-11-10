package com.ch05.cake.servlet;

import com.ch05.cake.entity.Cake;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

/**
 * @className: CartServlet
 * @author: Lin
 * @描述: 购物车: 展示用户已经购买的蛋糕列表
 * @date: 2022/10/24 2:10
 * @version: 1.0
 */
@WebServlet(name = "CartServlet",value = "/CartServlet")
public class CartServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=utf-8");
        PrintWriter out = resp.getWriter();
        List<Cake> cart = null;
        boolean purFlag = true;
        HttpSession cakeSession = req.getSession(false);
        System.out.println("JSESSIONID= "+cakeSession.getAttribute("JSESSIONID")+"  id= "+cakeSession.getId());
        if (cakeSession == null) {
            purFlag = false;
        }else {
            //获得用户购物车
            cart = (List<Cake>) cakeSession.getAttribute("cart");
            if (cart == null) {
                purFlag = false;
            }
        }

        if (purFlag) {
            out.write("您购买的蛋糕有: <br>");
            double price = 0;
            for (Cake cake:cart) {
                out.write(cake.getName()+"<br>");
            }
        }else {
            out.write("对不起! 您还没有购买任何商品! <br>");
        }
    }
}
