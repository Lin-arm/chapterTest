package com.ch08.javaBean;

import java.io.Serializable;

/**
 * @className: BUser
 * @author: Lin
 * @描述: JavaBean
 * @date: 2022/11/12 0:13
 * @version: 1.0
 */
public class BUser implements Serializable {
    private static final long seralVersionUID = 1L;
    private String uname;
    private String upwd;

    public BUser() {
    }

    public BUser(String uname, String upwd) {
        this.uname = uname;
        this.upwd = upwd;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getUpwd() {
        return upwd;
    }

    public void setUpwd(String upwd) {
        this.upwd = upwd;
    }
}
