package chapter9;

public class StringBuilderTest {
    public static void main(String[] args) {
        //1、创建对象
        StringBuilder sb = new StringBuilder("bac");

        //2、添加元素
        sb.append(1);
        sb.append(2.3);
        sb.append(true);
        //bac12.3true

        //反转
        sb.reverse();
        /*
        * cab
        * */

        //获取长度
        int len = sb.length();
        System.out.println(len);

        //打印
        //解释：因为StringBuilder是java已经定好的类。
        //java在底层对他做了一些特殊处理。
        //****打印对象不是地址值而是属性值。****
        System.out.println(sb);
    }
}
