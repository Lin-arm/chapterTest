package com.ch05.cake.entity;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @className: CakeDB
 * @author: Lin
 * @描述: 蛋糕数据库
 * @date: 2022/10/24 0:53
 * @version: 1.0
 */
public class CakeDB {
    private static Map<String,Cake> cakeMap = new LinkedHashMap<String,Cake>();
    static {
        cakeMap.put("1",new Cake("1","A类蛋糕"));
        cakeMap.put("2",new Cake("2","B类蛋糕"));
        cakeMap.put("3",new Cake("3","C类蛋糕"));
        cakeMap.put("4",new Cake("4","D类蛋糕"));
        cakeMap.put("5",new Cake("5","E类蛋糕"));
    }

    //获得所有的蛋糕
    public static Collection<Cake> getAll(){
        return cakeMap.values();
    }
    //根据指定的id获取蛋糕
    public static Cake getCake(String id){
        return cakeMap.get(id);
    }

}
