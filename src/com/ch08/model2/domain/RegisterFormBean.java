package com.ch08.model2.domain;

import java.util.HashMap;
import java.util.Map;

/**
 * @className: RegisterFormBean
 * @author: Lin
 * @描述: 用于封装注册表单信息, 另含三个方法.
 * @date: 2022/11/12 19:09
 * @version: 1.0
 */
public class RegisterFormBean {
    private String name;         //用户名
    private String password;     //密码
    private String password2;    //确认密码
    private String email;        //邮箱
    private Map<String,String> errors = new HashMap<String,String>();   // 定义成员变量errors,用于封装表单验证时的错误信息

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

    public String getPassword2() {
        return password2;
    }

    public void setPassword2(String password2) {
        this.password2 = password2;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    //获取 error 集合
    public Map<String, String> getErrors() {
        return errors;
    }

    public void setErrors(Map<String, String> errors) {
        this.errors = errors;
    }

    /**
     * @描述 validate()用于对注册表单内各字段所填写的数据进行校验.
     * @return boolean
     * @author Lin
     * @date 2022/11/12 19:41
     */
    public boolean validate(){
        boolean flag = true;
        System.out.println("已进入validate()方法验证用户输入的信息------\n");
        System.out.println("name="+name+"  pwd="+password+"  pwd2="+password2+"  email="+email+"\n");

        if (name == null || name.trim().equals("")) {
            errors.put("name","请输入用户名.");
            flag = false;
        }
        if (password == null || password.trim().equals("")) {
            errors.put("password","请输入密码.");
            flag = false;
        }else if (password.length() <6 || password.length() >12) {
            errors.put("password","请输入6-12个字符.");
            flag = false;
        }
        if (password != null && !password.equals(password2)) {
            errors.put("password2","两次输入的密码不一致.");
            flag = false;
        }
        //对email格式的校验采用了正则表达式
        if (email == null || email.trim().equals("")) {
            errors.put("email","请输入邮箱.");
            flag = false;
        }else if (!email.matches("[a-zA-Z0-9_-]+@[a-zA-Z0-9_-]+(\\.[a-zA-Z0-9_-]+)+")) {
            errors.put("email","邮箱格式错误.");
            flag = false;
        }
        System.out.println("flag= "+flag);
        return flag;
    }

    //向Map集合error中添加错误信息
    public void setErrorMsg(String err, String errMsg){
        if ((err != null) && (errMsg != null)) {
            errors.put(err,errMsg);
        }
    }

}
