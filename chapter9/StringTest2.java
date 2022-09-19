package chapter9;

import java.sql.SQLOutput;
import java.util.Arrays;

/*
 * 定义一个方法，把int数组中的数据按照指定的格式拼接成一个字符串返回，
 * 调用该方法，并在控制台输出结果
 * 例如：
 * 数组为in[] arr = {1,2,3};
 * 执行方法后输出结果为：[1,2,3]
 * */
public class StringTest2 {
    public static void main(String[] args) {
        int[] arr = {1, 9, 3, 0, 5};

        String str = stringJoint(arr);
        System.out.println(str);
    }

    public static String stringJoint(int[] number) {
        //先将int数组中的数字，转换为1所对应的ASCII码表中的字符（x+48）。
        int[] data = new int[number.length];
        char[] charArr = new char[number.length];
        for (int i = 0; i < data.length; i++) {
            data[i] = number[i] + 48;
            charArr[i] = (char) data[i];
        }

        //新建一个char数组，用于对charArr数组的格式化。
        // 即：首尾为方括号“[]”，字符间用逗号“，”隔开。
        int j = 0;
        char[] arrToString = new char[charArr.length * 2 + 1];
        for (int i = 0; i < arrToString.length; i++) {
            if (i == arrToString.length - 1) {
                arrToString[i] = ']';
            } else if (i == 0) {
                arrToString[i] = '[';
            } else if (i % 2 == 0) {
                arrToString[i] = ',';
            } else {
                arrToString[i] = charArr[j];
                j++;
            }
        }
        String str = new String(arrToString);
        return str;
    }
}
