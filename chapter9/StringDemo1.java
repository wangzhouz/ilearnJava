package chapter9;

public class StringDemo1 {
    public static void main(String[] args) {
        //使用new的方式来获取一个字符串对象
        String s2 = new String();
        System.out.println("@" + s2 + "!");//@!

        //传递一个字符数组，根据字符数组的内容再创建一个字符串
        //需求：因为字符串中内容是不能改变的;
        //所以可以通过数组的方式修改"abc--> {'a', 'b', 'c'} -->  {'Q', 'b', 'c'} -->Qbc"
        char[] chs = {'a', 'b', 'c','d'};
        String s3 = new String(chs);
        System.out.println(s3);//abcd

        //传递一个字节数组，根据字节的内容再创建一个新的字符串对象
        //应用场景：在网络当中传输的数据期实都是字节信息，
        //我们可以把字节信息进行转换，转成字符串，此时就要用到这个构造方法。
        byte[] bytes = {97, 98, 99, 100};
        String s4 = new String(bytes);
        System.out.println(s4);//abcd
    }
}
