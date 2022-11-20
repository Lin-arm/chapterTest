package com.ch10.jdbc.example;

import java.sql.*;

/**
 * @className: Example03
 * @author: Lin
 * @描述: 使用 ResutSet对象取出指定数据的信息
 * @date: 2022/11/19 1:18
 * @version: 1.0
 */
public class Example03 {
    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://127.0.0.1:3306/ch10?serverTimezone=GMT%2B8";
            String username = "root";
            String passwod = "123456";

            //1.获取Connection对象
            conn = DriverManager.getConnection(url,username,passwod);
            String sql = "SELECT * FROM users";

            //2.创建Statement对象并设置常量                  可滚动                             只读
            stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);

            //3.执行SQL并将获取的信息存放在ResultSet中
            ResultSet rs = stmt.executeQuery(sql);

            //4.取出ResultSet结果集中指定数据的信息
            System.out.print("第2条数据的name值为: ");
            rs.absolute(2);         //将指针定位到结果集中第2条数据
            System.out.println(rs.getString("name"));

            System.out.print("第1条数据的name值为: ");
            rs.beforeFirst();           //指到第1条数据数据之前
            rs.next();                  //向后滚动
            System.out.println(rs.getString("name"));

            System.out.print("最后一条数据的name值为: ");
            rs.afterLast();             //指到第最后一条数据数据之后
            rs.previous();              //向前滚动
            System.out.println(rs.getString("name"));

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        } finally {   //5.释放资源
            if (stmt != null) {
                try {
                    stmt.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                stmt = null;
            }
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                conn = null;
            }
        }
    }
}
