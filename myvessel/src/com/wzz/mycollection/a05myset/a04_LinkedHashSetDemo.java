package com.wzz.mycollection.a05myset;

import java.util.LinkedHashSet;

public class a04_LinkedHashSetDemo {
    public static void main(String[] args) {
        //1、创建4个学生对象
        Student s1 = new Student("zhangsan",23);
        Student s2 = new Student("lisi",24);
        Student s3 = new Student("wangwu",25);
        Student s4 = new Student("zhangsan",23);

        //2、创建集合的对象
        LinkedHashSet<Student> lhs = new LinkedHashSet<>();

        //3、添加元素
        System.out.println(lhs.add(s1));
        System.out.println(lhs.add(s2));
        System.out.println(lhs.add(s3));
        System.out.println(lhs.add(s4));
        /*重写了HashCode和Equals方法
        * true
        * true
        * true
        * false
        * //注意：这里是按添加时的顺序取出的
        * [Student{name='zhangsan', age=23}, Student{name='lisi', age=24}, Student{name='wangwu', age=25}]
        * */

        //4、打印集合
        System.out.println(lhs);
    }
}
