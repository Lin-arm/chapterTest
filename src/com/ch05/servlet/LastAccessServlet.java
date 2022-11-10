package com.ch05.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @className: LastAccessServlet
 * @author: Lin
 * @描述: 利用Cookie，显示用户上次访问时间
 * @date: 2022/10/23 1:25
 * @version: 1.0
 */
@WebServlet(name = "LastAccess",value = "/LastAccessServlet")
public class LastAccessServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=utf-8");
        Cookie[] cookies = req.getCookies();
        boolean flag = false;
        if (cookies != null && cookies.length > 0) {
            for (Cookie cook:cookies) {
                String name = cook.getName();
                if ("lastTime".equals(name)){
                    flag = true;
                    String value = cook.getValue();
                    System.out.println("value解码前: "+value);
                    value = URLDecoder.decode(value);
                    System.out.println("value解码后: "+value);
                    resp.getWriter().write("<h3>欢迎回来，您上次访问时间为: </h3>"+value);
                    cook = updateCookie();
                    resp.addCookie(cook);
                    break;
                }
            }
        }
        if (cookies == null || cookies.length == 0 || flag == false) {
            resp.addCookie(updateCookie());
            resp.getWriter().write("<h3>您好，欢迎您首次访问</h3>");
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doGet(req, resp);
    }

    /**
     * @描述 获取当前时间的Cookie
     * @return Cookie
     * @author Lin
     * @date 2022/10/23 17:47
     */
    private Cookie updateCookie() throws IOException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        String str_date = sdf.format(new Date());
        System.out.println("str_date编码前: "+str_date);
        str_date = URLEncoder.encode(str_date);                //Cookie不能存中文，一定要存的话先转码
        System.out.println("str_date编码后: "+str_date);

        Cookie timeCookie = new Cookie("lastTime",str_date);
        timeCookie.setMaxAge(7*24*60*60);   //一周
        return timeCookie;
    }

}
