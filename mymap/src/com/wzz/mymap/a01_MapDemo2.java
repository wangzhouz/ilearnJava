package com.wzz.mymap;

import java.util.HashMap;
import java.util.Map;

public class a01_MapDemo2 {
    public static void main(String[] args) {
        //1、创建Map集合的对象
        Map<String, String> m = new HashMap<>();

        //2、添加元素
        //put方法的细节：
        //添加/覆盖
        //在添加数据的时候，如果键不存在，那么直接把键值对对象添加到map2集合当中，方法返回Null
        m.put("郭靖", "黄蓉");
        m.put("韦小宝", "沐剑屏");
        m.put("张无忌", "周自若");

        //在添加数据的时候，如果键是存在的，那么会把原来键值对对象覆盖，并返回被覆盖的值。
        String value2 = m.put("韦小宝","双儿");
        System.out.println(value2);//沐剑屏

        //删除
        String result = m.remove("郭靖");
        System.out.println(result);//黄蓉

        //清空
        m.clear();

        //判断是否包含
        boolean keyResult = m.containsKey("郭靖");
        System.out.println(keyResult);//true

        //判断值是否存在
        boolean valueResult = m.containsValue("周自若");
        System.out.println(valueResult);//true

        //判断是否为空
        boolean result1 = m.isEmpty();
        System.out.println(result1);

        //集合的长度
        int size = m.size();
        System.out.println(size);//3

        //3、打印集合
        System.out.println(m);

    }
}
