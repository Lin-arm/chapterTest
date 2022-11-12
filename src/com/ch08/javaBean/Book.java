package com.ch08.javaBean;

import java.io.Serializable;

/**
 * @className: Book
 * @author: Lin
 * @描述: 书籍类
 * @date: 2022/11/12 11:42
 * @version: 1.0
 */
public class Book implements Serializable {
    private String bookName;
    private double price;
    private String author;

    public Book() {
    }

    public Book(String bookName, double price, String author) {
        this.bookName = bookName;
        this.price = price;
        this.author = author;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
