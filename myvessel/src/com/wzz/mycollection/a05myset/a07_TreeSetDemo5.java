package com.wzz.mycollection.a05myset;

import java.util.TreeSet;

public class a07_TreeSetDemo5 {
    public static void main(String[] args) {
        /*
        * 需求：创建5个学生对象
        * 属性：姓名、年龄、语文成绩、数学成绩、英语成绩
        * 按照总分从高到低输出到控制台：
        * 如果总分一样，按照语文成绩排
        * 如果语文一样，按照数字成绩排
        * 如果数学一样，按照英文成绩排
        * 如果英文一样，按照年龄排
        * 如果年龄一样，按照姓名的字母顺序排
        * 如果都一样，认为是同一个学生，不存。
        *
        * 方式1：默认排序/自然排序
        * 方式2：比较器排序
        * 默认情况下，用第一种排序，如果第一种不能满足当前需求，采取第二种方式
        * */

        //1、创建学生
        Student2 s1 = new Student2("zhangsan", 23,90,99,50);
        Student2 s2 = new Student2("lisi", 24,90,98,50);
        Student2 s3 = new Student2("wangwu", 25,95,100,30);
        Student2 s4 = new Student2("zhaoliu", 26,60,99,70);
        Student2 s5 = new Student2("qianqi", 26,70,80,70);

        //2、创集集哈
        //默认ArrayList
        //如果想要数据唯一就选HashSet
        //如果既要唯一又要排序就选TreeSet
        TreeSet<Student2> ts = new TreeSet<>();

        //3、添加元素
        ts.add(s1);
        ts.add(s2);
        ts.add(s3);
        ts.add(s4);
        ts.add(s5);

        //4、打印集合
        //System.out.println(ts);
        for (Student2 t : ts) {
            System.out.println(t);
        }

    }
}
