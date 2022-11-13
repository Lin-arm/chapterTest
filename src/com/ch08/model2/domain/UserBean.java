package com.ch08.model2.domain;

/**
 * @className: UserBean
 * @author: Lin
 * @描述: 用于封装用户信息
 * @date: 2022/11/12 19:08
 * @version: 1.0
 */
public class UserBean {
    private String name;     //定义用户名
    private String password; //定义密码
    private String email;    //定义邮箱

    public UserBean() {
    }

    public UserBean(String name, String password, String email) {
        this.name = name;
        this.password = password;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
