package chapter2;

/*
* 数组的动态初始化
* 数据类型[] 数组名 = new 数据类型[数组的长充]
* 创建的时候，由我们自己指定数组的长度，由虚拟机给出默认的初始化值。
* */
public class arrayTest4 {
    public static void main(String[] args) {
        //创建的时候，由我们自己指定数组的长度，由虚拟机给出默认的初始化值。
        String[] arr = new String[50];

        //添加学生
        arr[0] = "张三";
        arr[1] = "李四";
        arr[2] = "王五";

        //获取
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);//打印出来的是默认初始化值null
    }
}
