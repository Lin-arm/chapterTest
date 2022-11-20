package com.ch10.jdbc.example.test;

import com.ch10.jdbc.example.dao.UsersDao;
import com.ch10.jdbc.example.domain.JUser;

import java.util.ArrayList;

/**
 * @className: FindAllUserTest
 * @author: Lin
 * @描述: 读取 users表中所有的数据
 * @date: 2022/11/20 1:22
 * @version: 1.0
 */
public class FindAllUserTest {
    public static void main(String[] args) {
        UsersDao ud = new UsersDao();
        ArrayList<JUser> list = ud.findAll();    //将UsersDao对象的findAll()方法执行后的结果放入list集合\

        for (int i = 1; i <= list.size(); i++) {
            System.out.println("第"+i+"条数据的name值为: "+list.get(i-1).getUsername());
        }
    }
}
