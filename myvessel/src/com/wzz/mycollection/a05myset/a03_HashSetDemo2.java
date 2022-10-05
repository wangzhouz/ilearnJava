package com.wzz.mycollection.a05myset;

import java.util.HashSet;

public class a03_HashSetDemo2 {
    public static void main(String[] args) {
        /*
         * 需求：创建一个存储学生对象的集哈，存储多个学生对象。
         * 使用程序实现在控制台遍历该集哈。
         * 要求：学生对象成员变量值相同，我们就认为是同一个对象。
         * */

        //1、创建3个学生对象
        Student s1 = new Student("zhangsan",23);
        Student s2 = new Student("lisi",24);
        Student s3 = new Student("wangwu",25);
        Student s4 = new Student("zhangsan",23);

        //2、创建集合用来添加学生
        HashSet<Student> hs = new HashSet<>();

        //3、添加元素
        System.out.println(hs.add(s1));
        System.out.println(hs.add(s2));
        System.out.println(hs.add(s3));
        System.out.println(hs.add(s4));
        /*没有重写HashCode他Equals方法
        * true
        * true
        * true
        * true
        * [Student{name='zhangsan', age=23}, Student{name='wangwu', age=25},
        *  Student{name='zhangsan', age=23}, Student{name='lisi', age=24}]
        * */

        /*重写HashCode和Equals方法
        * true
        * true
        * true
        * false
        * [Student{name='wangwu', age=25}, Student{name='lisi', age=24},
        *  Student{name='zhangsan', age=23}]
        * */

        //4、打印集合
        System.out.println(hs);
    }
}
