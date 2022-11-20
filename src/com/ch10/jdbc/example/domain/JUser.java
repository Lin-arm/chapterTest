package com.ch10.jdbc.example.domain;

import java.util.Date;

/**
 * @className: JUser
 * @author: Lin
 * @描述: 用户实体类，为了避免类名(User)重复，我将其命名为 JUser
 * @date: 2022/11/19 19:49
 * @version: 1.0.2
 */
public class JUser {
    private int id;
    private String username;
    private String password;
    private String email;
    private Date birthday;

    public JUser() {
    }

    public JUser(String username, String password, String email, Date birthday) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.birthday = birthday;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
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

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
}
