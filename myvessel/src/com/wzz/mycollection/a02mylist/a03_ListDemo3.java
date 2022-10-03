package com.wzz.mycollection.a02mylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.Consumer;

public class a03_ListDemo3 {
    public static void main(String[] args) {
        //创建集合并添加元素
        List<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");

        //1、迭代器
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            String str = it.next();
//            System.out.println(str);
        }

        //2、增强for
        //变量s，其实就是一个第三方变量
        for (String s : list) {
//            System.out.println(s);
        }

        //3、lambda表达式遍历
        list.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
//                System.out.println(s);
            }
        });

        //3、lambda表达式遍历
//        list.forEach(s -> System.out.println(s));

        //4、普通for循环
        //利用size方法跟get方法还有循环结合的方式，再利用索引获取集合中的每一个元素
        for (int i = 0; i < list.size(); i++) {
            String s = list.get(i);
//            System.out.println(s);
        }

        //5、列表迭代器
        //获取一个列表迭代器的对象，里面的指针默认也是指向0索引的
        ListIterator<String> it2  = list.listIterator();
        while(it2.hasNext()){
            String str = it2.next();
            //额外添加了一个方法：在遍历的过程中，可以添加元素
            if ("bbb".equals(str)) {
                it2.add("QQQ");
            }
            //System.out.println(str);
        }
        System.out.println(list);

    }
}
