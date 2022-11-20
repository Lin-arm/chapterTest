package com.ch10.jdbc.example.test;

import com.ch10.jdbc.example.dao.UsersDao;
import com.ch10.jdbc.example.domain.JUser;

/**
 * @className: FindUserByIdTest
 * @author: Lin
 * @描述: 根据 id 读取 users表中指定的数据
 * @date: 2022/11/20 11:39
 * @version: 1.0
 */
public class FindUserByIdTest {
    public static void main(String[] args) {
        UsersDao ud = new UsersDao();
        JUser user = ud.find(2);
        System.out.println("id为2的User对象的name值为: "+user.getUsername());
    }
}
