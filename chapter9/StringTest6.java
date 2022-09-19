package chapter9;

public class StringTest6 {
    public static void main(String[] args) {
        //1、定义/获取一个手机号
        String phoneNumber = "1492378883";

        //2、截取手机号码的前3位。
        String start = phoneNumber.substring(0,3);
        System.out.println(start);

        //截取手机号码后4位。
        String end = phoneNumber.substring(6);
        System.out.println(end);

        //4、拼接
        String result = start + "****" + end;
        System.out.println(result);
    }
}
