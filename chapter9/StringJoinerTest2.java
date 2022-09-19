package chapter9;

import java.util.StringJoiner;

public class StringJoinerTest2 {
    public static void main(String[] args) {
        //1、创建一个对象，并指定中间的间隔符号
        StringJoiner sj = new StringJoiner(", ","[","]");

        //2、添加元素
        sj.add("aaa").add("bbb").add("ccc");
        System.out.println("sj对象拼接："+sj);

        int len = sj.length();
        System.out.println("sj对象的长度："+len);//15

        String str = sj.toString();
        System.out.println("sj的otString方法："+str);
    }
}
