package com.ch08.javaBean;

import java.io.Serializable;

/**
 * @className: Email
 * @author: Lin
 * @描述: 邮件
 * @date: 2022/11/12 12:04
 * @version: 1.0
 */
public class Email implements Serializable {
    private String title;
    private String content;

    public Email() {
    }

    public Email(String title, String content) {
        this.title = title;
        this.content = content;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
