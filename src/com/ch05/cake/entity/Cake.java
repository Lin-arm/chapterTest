package com.ch05.cake.entity;

/**
 * @className: Cake
 * @author: Lin
 * @描述: 蛋糕_实体类
 * @date: 2022/10/24 0:44
 * @version: 1.0
 */
public class Cake {
    private static final long serialVersionUID = 1L;
    private String id;
    private String name;

    public Cake(){
    }
    public Cake(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
