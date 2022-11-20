package com.ch10.jdbc.example.utils;

import java.sql.*;

/**
 * @className: JDBCUtils
 * @author: Lin
 * @����: ���ڲ������ݿ�Ĺ�����: ���������ӡ��ر�
 * @date: 2022/11/19 19:54
 * @version: 1.0
 */
public class JDBCUtils {
    //�������������������ݿ�����
    public static Connection getConnection() throws SQLException,ClassNotFoundException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url = "jdbc:mysql://127.0.0.1:3306/ch10?serverTimezone=GMT%2B8";
        String username = "root";
        String password = "123456";
        Connection conn = DriverManager.getConnection(url,username,password);
        return conn;
    }

    //�ر����ݿ����ӣ��ͷ���Դ
    public static void release(Statement stmt, Connection conn){
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
    public static void release(ResultSet rs, Statement stmt, Connection conn){
        if (rs != null) {
            try {
                rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            rs = null;
        }
        release(stmt, conn);
    }

}
