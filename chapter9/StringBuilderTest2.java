package chapter9;

public class StringBuilderTest2 {
    public static void main(String[] args) {
        //1、创建对象
        StringBuilder sb = new StringBuilder();

        //2、添加字符串
        /*sb.append("aaa");
        sb.append("bbb");
        sb.append("ccc");*/

        //3、把2改成链式
        sb.append("aaa").append("bbb").append("ccc");

        System.out.println(sb);//aaabbbccc

        //3、再把StringBuilder变回字符串
        String str = sb.toString();
        System.out.println(str);
    }
}



