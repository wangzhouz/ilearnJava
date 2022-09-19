package chapter9;

import java.util.Arrays;

public class StringTest5 {
    public static void main(String[] args) {
        String s = numReversal(9123);
        System.out.println(s);
    }
    public static String numReversal() {
        System.out.println("请录入正确的金额");
        return null;
    }

    public static String numReversal(int number) {
        char[] zh = {'零', '壹', '贰', '叁', '肆', '伍', '陆', '柒', '捌', '玖' };
        System.out.println("输入的金额为：" + number);

        //计算出输入的数字串长度。
        int a = number;
        int j = 0;//数字长度计数器
        while (true) {
            if (a > 0) {
                a = a / 10;
                j++;
            } else {
                break;
            }
        }
        //System.out.println("数字长度为：" + j);

        //取Number的十进制位，并将其放入数组中。
        int remainder = 0;
        int n = number;
        int[] arr = new int[j];
        for (int i = arr.length - 1; i >= 0; i--) {
            remainder = n % 10;
            n = n / 10;
            arr[i] = remainder;
        }
        //System.out.println("数组为" + Arrays.toString(arr));


        //将阿拉伯数字数组转化为中文数组。
        char[] zhNum = new char[arr.length];
        int c = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            c = arr[i];
            zhNum[i] = zh[c];
        }
        //System.out.println(Arrays.toString(zhNum));

        //格式化数组，生成新的7位数组。
        String result = "";
        /*
         * 输入的金额为：7539
         * 数字长度为：4
         * 数组为[7, 5, 3, 9]
         * [柒, 伍, 叁, 玖]
         *  佰 拾 万 仟 佰 拾 元
         * */
        int x = 0;
        char c1 = '零';
        if (zhNum.length < 7) {
            x = 7 - zhNum.length;
            for (int i = 0; i < x; i++) {
                result = result + c1;
            }
            for (int i = 0; i < zhNum.length; i++) {
                result = result + zhNum[i];
            }
        }
        //System.out.println(result);

        //按收据样式，格式化金额。
        String str = "";
        for (int i = 0; i < 7; i++) {
            if (i == 0) {
                str = result.charAt(i) + "佰";
            } else if (i == 1) {
                str = str + result.charAt(i) + "拾";
            } else if (i == 2) {
                str = str + result.charAt(i) + "万";
            } else if (i == 3) {
                str = str + result.charAt(i) + "仟";
            } else if (i == 4) {
                str = str + result.charAt(i) + "佰";
            } else if (i == 5) {
                str = str + result.charAt(i) + "拾";
            } else {
                str = str + result.charAt(i) + "元";
            }
        }
        //System.out.println(str);
        return str;
    }
}




