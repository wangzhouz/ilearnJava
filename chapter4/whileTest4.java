package chapter4;

/*
 * 需求：给你一个整数x.
 * 如果x是一个回文整数，打印true，否则，返回false。
 * 解释：回文数是指正序列（从左向右）和倒序（从右到左）读都是一样的整数。
 * 例如：121是回文数，而123不是。*
 * */
public class whileTest4 {
    public static void main(String[] args) {
        int x = 1331;
        //定义一个临时变量用于记录x原来的值，用于最后进行比较
        int temp = x;
        //记录倒过来之后的结果
        int num = 0;

        /*
         * 思路：把数字倒过来比较
         * 1、模于10.
         * */
        while (x != 0) {
            //从右往右获取每一位数字
            int ge = x % 10;
            //修改一下x记录的值
            x = x / 10;
            //把当前获取到的数字拼接到最右边
            num = num * 10 + ge;
        }
        System.out.println(num);
        System.out.println(num == temp);
    }
}
