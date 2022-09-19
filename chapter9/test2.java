package chapter9;

public class test2 {
    public static void main(String[] args) {
        String s1 = new String("abc");
        String s2 = "Abc";


        //==号比较
        //基本数据类型：比的是数据值
        //引用数据类型：比的是地址值
        System.out.println(s1 == s2);//false

        //比较字符串对象的内容是否相等
        boolean result1 = s1.equals(s2);;
        System.out.println(result1);//false

        //比较字符串对象中的内容是否相等，忽略大小写
        boolean b = s1.equalsIgnoreCase(s2);
        System.out.println(b);//true
    }
}



