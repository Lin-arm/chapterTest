package com.ch10.jdbc.example.test;

import com.ch10.jdbc.example.dao.UsersDao;

/**
 * @className: DeleteUserTest
 * @author: Lin
 * @描述: 删除 users表中数据
 * @date: 2022/11/20 12:59
 * @version: 1.0
 */
public class DeleteUserTest {
    public static void main(String[] args) {
        UsersDao ud = new UsersDao();
        System.out.println("是否删除成功: "+ud.delete(1));
    }
}
