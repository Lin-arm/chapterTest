package com.ch08.tools;

import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;

/**
 * @className: CharactorEncoding
 * @author: Lin
 * @描述: 该类中编写toString()方法对字符编码进行转换
 * @date: 2022/11/12 12:07
 * @version: 1.0
 */
public class CharactorEncoding {
    public CharactorEncoding() {
    }
    public String toString(String str){
        String text = "";
        if (str != null && !"".equals(str)) {
            try {
//                text = new String(str.getBytes("ISO-8859-1"),"UTF-8");           //新版本软件都默认utf-8编码，几乎没有乱码问题了。
                text = new String(str.getBytes("UTF-8"),"UTF-8");
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
        }
        return text;
    }
}
