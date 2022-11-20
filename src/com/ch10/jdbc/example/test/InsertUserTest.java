package com.ch10.jdbc.example.test;

import com.ch10.jdbc.example.dao.UsersDao;
import com.ch10.jdbc.example.domain.JUser;

import java.util.Date;

/**
 * @className: InsertUserTest
 * @author: Lin
 * @描述: 向 users表中添加数据
 * @date: 2022/11/20 0:38
 * @version: 1.0.2
 */
public class InsertUserTest {
    public static void main(String[] args) {
        UsersDao ud = new UsersDao();
        JUser user = new JUser("yyds","aa321","ye@163.com",new Date());
        System.out.println("是否添加成功: "+ud.insert(user));
    }
}
