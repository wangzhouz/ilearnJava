package chapter9;

import java.util.StringJoiner;

public class StringJoinerTest {
    public static void main(String[] args) {
        //1、创建一个对象，并指定中间的间隔符号
        StringJoiner sj = new StringJoiner("---");

        //2、添加元素
        sj.add("aaa").add("bbb").add("ccc");

        System.out.println(sj);
    }
}
