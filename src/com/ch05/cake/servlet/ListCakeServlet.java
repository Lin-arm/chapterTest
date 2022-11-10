package com.ch05.cake.servlet;

import com.ch05.cake.entity.Cake;
import com.ch05.cake.entity.CakeDB;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Collection;

/**
 * @className: ListCakeServlet
 * @author: Lin
 * @描述: 用于显示所有可购买蛋糕的列表，通过单击“购买” 链接，便可将指定的蛋糕添加到购物车中
 * @date: 2022/10/24 1:03
 * @version: 1.0
 */
@WebServlet(name = "ListCakeServlet",value = "/ListCakeServlet")
public class ListCakeServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=utf-8");
        PrintWriter out = resp.getWriter();
        Collection<Cake> cakes = CakeDB.getAll();
        out.write("本站提供的蛋糕有: <br>");
        for (Cake cake:cakes) {
            String url = "PurchaseServlet?id="+cake.getId();
//            System.out.println("url= "+url);
            out.write(cake.getName()+"<a href='"+url+"'>点击购买</a><br>");
        }

    }
}
