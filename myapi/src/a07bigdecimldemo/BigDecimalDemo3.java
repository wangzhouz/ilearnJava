package a07bigdecimldemo;

import java.math.BigDecimal;

public class BigDecimalDemo3 {
    public static void main(String[] args) {
//        System.out.println(0.09 + 0.01);
//        System.out.println(0.216 - 0.1);
//        System.out.println(0.226 * 0.01);
//        System.out.println(0.09 / 0.1);


        //通过传递字符串表示的小数来创建对象
//        BigDecimal bd3 = new BigDecimal("0.01");
//        BigDecimal bd4 = new BigDecimal("0.09");
//        BigDecimal bd5 = bd3.add(bd4);
//        System.out.println(bd3);
//        System.out.println(bd4);
//        System.out.println(bd5);

        //通过静态方法获取对象
        BigDecimal bd6 = BigDecimal.valueOf(10);
        System.out.println(bd6);

    }
}
