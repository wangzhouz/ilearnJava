package com.wzz.mycollection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class a03_CollectionDemo3 {
    public static void main(String[] args) {
        /*collection系列集合3种通用的遍历方法：
        * 1、迭代器遍历
        * 2、增强for遍历
        * 3、lambda表达式遍历
        * */

        //1、创建集合并添加元素
        Collection<String> coll = new ArrayList<>();
        coll.add("aaa");
        coll.add("bbb");
        coll.add("ccc");
        coll.add("ddd");

        //2、获取迭代器对象
        //迭代器就好比是一个箭头，默认指向集合的0索引处。
        Iterator<String> it = coll.iterator();
        //利用循环不断的去获取集合中每一个元素
        while (it.hasNext()){
            //4、.next方法的两件事情：获取元素并移动指针
            String str = it.next();
            System.out.println(str);
        }

    }
}
