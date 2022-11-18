package com.ch10.jdbc.example;

import java.sql.*;

/**
 * @className: Example01
 * @author: Lin
 * @描述: PreparedStatement(增强版的stmt)，将新数据写入users表
 * @date: 2022/11/18 0:59
 * @version: 1.0
 */
public class Example02 {
    public static void main(String[] args) throws SQLException {
        Connection conn = null;
        PreparedStatement preStmt = null;

        try {
            //1.加载数据库的驱动
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://127.0.0.1:3306/ch10?serverTimezone=GMT%2B8";
            String username = "root";
            String password = "123456";
            //2.创建应用程序与数据库连接的 Connection对象
            conn = DriverManager.getConnection(url,username,password);

            //3.执行的SQL语句
            String sql = "INSERT INTO users(name,password,email,birthday)"+"VALUES(?,?,?,?)";

            //4.创建执行SQL语句的 prepareStatement对象
            preStmt = conn.prepareStatement(sql);

            //5.为SQL语句中的参数赋值
            preStmt.setString(1,"zl");
            preStmt.setString(2,"123456");
            preStmt.setString(3,"zl@163.com");
            preStmt.setString(4,"1989-12-23");

            //6.执行SQL
            preStmt.executeUpdate();

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }finally {
            //7.释放资源
            if (preStmt != null) {
                try {
                    preStmt.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                preStmt = null;
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
