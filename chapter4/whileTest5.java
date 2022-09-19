package chapter4;

/*
 * 需求：给定两个整数，被除数和除数（都是正数，且不超过int范围）
 * 将两数相除，要求不使用乘法、除法和%运算符。
 * 得到商和余数。
 * */
public class whileTest5 {
    public static void main(String[] args) {
        int dividend = 10;
        int divisor = 3;
        int i = 0;

        /*
         * int a = 100;
         * int b = 10;
         * 100 - 10 = 90
         * 90 - 10 = 80
         * 80 - 10 = 70
         * ...
         * 10 - 10 = 0(余数)
         * 一共减了几次（商）
         * */
        while (dividend >= divisor) {
            dividend = dividend - divisor;
            i++;
        }
        System.out.println("商为：" + i + ",余数为：" + dividend);
    }
}
