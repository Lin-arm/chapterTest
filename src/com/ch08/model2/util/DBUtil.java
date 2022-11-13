package com.ch08.model2.util;

import com.ch08.model2.domain.UserBean;

import java.util.HashMap;

/**
 * @className: DBUtil
 * @author: Lin
 * @描述: 工具类
 * @date: 2022/11/12 19:09
 * @version: 1.0
 */
public class DBUtil {
    private static DBUtil instance = new DBUtil();
    private HashMap<String, UserBean> users = new HashMap<String, UserBean>();   //定义users集合，用于模拟数据库
    private DBUtil(){
        //向数据库(users)中存入3条数据
        UserBean user1 = new UserBean("Jack","12345678","jack@163.com");
        UserBean user2 = new UserBean("Rose","asdfghjkl","rose@163.com");
        UserBean user3 = new UserBean("Lin","123456","lin@163.com");
        users.put("Jack",user1);
        users.put("Rose",user2);
        users.put("Lin",user3);
    }

    public static DBUtil getInstance() {
        return instance;
    }

    //获取数据库(users)中的数据
    public UserBean getUsers(String userName) {
        UserBean user = (UserBean) users.get(userName);
        return user;
    }

    //向数据库(users)插入数据
    public boolean insertUser(UserBean user){
        if (user == null) {
            return false;
        }
        String userName = user.getName();
        if (users.get(userName) != null) {
            return false;
        }
        users.put(userName,user);
        return true;
    }

}
