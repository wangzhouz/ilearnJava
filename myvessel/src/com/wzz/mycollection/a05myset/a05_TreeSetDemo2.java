package com.wzz.mycollection.a05myset;

import java.util.TreeSet;

public class a05_TreeSetDemo2 {
    public static void main(String[] args) {
        /*
        * 需求：创建TreeSet集合，并添加3个学生对象
        * 学生对象属性：
        *   姓名、年龄
        * 要求按照学生的年龄进行排序
        * 同年龄按照姓名字母排序（暂不考虑中文）
        * 同姓名，同年龄认为是同一个人
        *
        * 方式1：默认排序/自然排序：
        *   Student类实现Comparable接口，重写里面的抽象规则，再指定比较规则。
        * */

        //1、创建3个学生对象
        Student s1 = new Student("zhangsan", 23);
        Student s2 = new Student("lisi", 24);
        Student s3 = new Student("wangwu", 25);
        Student s4 = new Student("zhaoliu", 26);

        //2、创建集合对象
        TreeSet<Student> ts = new TreeSet<>();

        //3、添加元素
        ts.add(s3);
        ts.add(s2);
        ts.add(s1);
        ts.add(s4);

        //4、打印集合(如果不指定比较规则会报错)
        System.out.println(ts);
        //在Studnet类中实现了Comparable接口，并重写了抽象方法后的打印结果，即使我们添加的时候是乱的，但打印的时候是升序
        //[Student{name='zhangsan', age=23}, Student{name='lisi', age=24}, Student{name='wangwu', age=25}]
    }
}
