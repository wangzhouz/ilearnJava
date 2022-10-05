package com.wzz.mycollection.a05myset;

public class a02_HashSetDemo1 {
    public static void main(String[] args) {
        /*
        * 对象的整数表现形式：
        *   如果没有重写hashCode方法，不同对象计算出的哈希值是不同的。
        *   如果已经重写hashCode方法，不同的对象只要属性值相同，计算出的哈希值就是一样的。
        *   在小部分情况下，不同的属性值或者不同的地址值计算出来的哈希值也有可能一样（哈希碰撞）。
        * */

        //1、创建对象
        Student s1 = new Student("zhangsan",23);
        Student s2 = new Student("zhangsan",23);

        //2、如果没有重写hashCode方法，不同对象计算出的哈希值是不同的。
        System.out.println(s1.hashCode());//668386784
        System.out.println(s2.hashCode());//1329552164

        //3、如果已经重写hashCode方法，不同的对象只要属性值相同，计算出的哈希值就是一样的。
        //已在Student类中重写了hashCode方法
        System.out.println(s1.hashCode());//-1461067292
        System.out.println(s2.hashCode());//-1461067292




    }
}
