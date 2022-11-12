package com.ch08.javaBean;

import java.io.Serializable;

/**
 * @className: Student
 * @author: Lin
 * @描述: 学生_JavaBean
 * @date: 2022/11/12 0:52
 * @version: 1.0
 */
public class Student implements Serializable {
    private String name;
    private int age;
    private String sex;

    public Student() {
    }

    public Student(String name, int age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
