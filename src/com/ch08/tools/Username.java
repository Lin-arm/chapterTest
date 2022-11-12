package com.ch08.tools;

/**
 * @className: Username
 * @author: Lin
 * @描述: 判断用户名是否有效，并给出提示
 * @date: 2022/11/12 16:16
 * @version: 1.0
 */
public class Username {
    String reg = "[a-zA-Z]";
    String regx = "[a-zA-Z0-9_]";
    String username;
    Boolean isval;
    String tip;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Boolean getIsval() {
        return isval;
    }

    public void setIsval(Boolean isval) {
        this.isval = isval;
    }

    public String getTip() {
        return tip;
    }

    public void setTip(String tip) {
        this.tip = tip;
    }

    public Boolean isValid() {
        String name = getUsername();
        String firstname = String.valueOf(name.charAt(0));        //charAt()返回指定索引处的字符; valueOf()类型转换
        if (firstname.matches(reg)) {       //首字母为字母
            for (int i=1; i<name.length(); i++) {
                if (!String.valueOf(name.charAt(i)).matches(regx)) {
                    setTip("用户姓名错误，只能由字母、数字和下划线组成！");
                    return false;
                }
            }
            setTip("用户格式正确！");
            return true;
        }else {
            setTip("用户姓名错误，首字符必须为字母！");
            return false;
        }
    }
}
