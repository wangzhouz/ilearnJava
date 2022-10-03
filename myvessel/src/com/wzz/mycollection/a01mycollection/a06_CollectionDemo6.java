package com.wzz.mycollection.a01mycollection;

import java.util.ArrayList;
import java.util.Collection;

public class a06_CollectionDemo6 {
    public static void main(String[] args) {
        /*
         * 增强for格式：
         *   for（数据类型 变量名：集合/数组）{
         *
         *   }
         * 在IDEA中输入"集合名.for"会自动生成。
         * */

        //1、创建集合并添加元素
        Collection<String> coll = new ArrayList<>();
        coll.add("zhangsan");
        coll.add("lisi");
        coll.add("wangwu");

        //2、利用增强for进行遍历
        //注意点：
        //s其实就是一个第3方变量，在循环的过程中依次表示集合中的每一个数据
        for (String s : coll) {
            System.out.println(s);
        }

    }
}
