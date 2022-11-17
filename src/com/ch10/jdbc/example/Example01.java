package com.ch10.jdbc.example;

import java.sql.*;

/**
 * @className: Example01
 * @author: Lin
 * @描述: 用于读取数据库中的users表，并将读取到的数据输出到控制台
 * @date: 2022/11/18 0:59
 * @version: 1.0
 */
public class Example01 {
    public static void main(String[] args) throws SQLException {
        Statement stmt = null;
        ResultSet rs = null;
        Connection conn = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://127.0.0.1:3306/ch10?serverTimezone=GMT%2B8";
            String username = "root";
            String password = "123456";

            conn = DriverManager.getConnection(url,username,password);
            stmt = conn.createStatement();
            String sql = "SELECT * FROM users";
            rs = stmt.executeQuery(sql);

            System.out.println("id | name   | pwd    | email         | birthday ");
            while (rs.next()){
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String pwd = rs.getString("password");
                String email = rs.getString("email");
                Date birthday = rs.getDate("birthday");
                System.out.println(id+" | "+name+" | "+pwd+" | "+email+" | "+birthday);
            }

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }finally {
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                rs = null;
            }
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
