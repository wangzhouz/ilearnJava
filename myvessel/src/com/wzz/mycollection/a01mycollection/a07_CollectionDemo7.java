package com.wzz.mycollection.a01mycollection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Consumer;

public class a07_CollectionDemo7 {
    public static void main(String[] args) {
        /*
         * lambda表达式遍历：
         *   default void forEach(Consumer<? super T> action):
         * */

        //1、创建集合并添加元素
        Collection<String> coll = new ArrayList<>();
        coll.add("zhangsan");
        coll.add("lisi");
        coll.add("wangwu");

        //2、利用匿名内部类的形式进行遍历
        coll.forEach(new Consumer<String>() {
            @Override
            //s依次形示集合中的每一个数据
            public void accept(String s) {
                System.out.println(s);
            }
        });

        //2、lambda表达式行遍历
        coll.forEach(s -> System.out.println(s));

    }
}
