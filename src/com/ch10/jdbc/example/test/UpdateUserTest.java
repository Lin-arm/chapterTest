package com.ch10.jdbc.example.test;

import com.ch10.jdbc.example.dao.UsersDao;
import com.ch10.jdbc.example.domain.JUser;

import java.util.Date;

/**
 * @className: UpdateUserTest
 * @author: Lin
 * @描述: 修改 users表中的数据:  update()是根据 id来修改的
 * @date: 2022/11/20 11:43
 * @version: 1.0
 */
public class UpdateUserTest {
    public static void main(String[] args) {
        UsersDao ud = new UsersDao();
        JUser user = new JUser("lin_arm","666666","lin@qq.com",new Date());
        user.setId(5);
        System.out.println("是否修改成功: "+ud.update(user));
    }
}
