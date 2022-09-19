package chapter5;

import java.util.Arrays;
import java.util.Random;

/*
 * 需求：
 * 定义方法实现随机产生一个5位的验证码。
 * 验证码格式：
 * ·长度为5；
 * ·前4位是大写字母货小写字母；
 * ·最后一位是数字。
 * ASCII(48,58)//123456789
 * ASCII(65,90)//ABCDEFGHIJKLMNOPQRSTUVWXYZ
 * ASCII(97,122)//abcdefghijklmnopqrstuvwxyz
 * */
public class MethodExercise {
    public static void main(String[] args) {
        String s = verificationCode(15);
        System.out.println(s);

        //String s1 = verCode();
        //System.out.println(s1);
    }

    public static String verificationCode(int codeLength) {
        Random r = new Random();
        //定义一个char数组。
        char[] arrChar = new char[codeLength];
        for (int i = 0; i < arrChar.length; i++) {
            //System.out.println(i);
            char cx;
            //判断是否为数组的索引的最后位，如果是则执行else语句，生成0~9数字。
            if (i != arrChar.length - 1) {
                //定义一个随机循环0~1
                int x = r.nextInt(2);
                //如果为0则生成大写字母，为1则生成小写字母。
                if (x == 0) {
                    int num1 = r.nextInt(26) + 65;
                    cx = (char) num1;
                    //System.out.println("大写字母对应数字：" + num1 + "," + cx);
                } else {
                    int num2 = r.nextInt(26) + 97;
                    cx = (char) num2;
                    //System.out.println("小写字母对应数字：" + num2 + "," + cx);
                }
                arrChar[i] = cx;
            } else {
                int num3 = r.nextInt(10) + 48;
                cx = (char) num3;
                arrChar[i] = cx;
            }
        }
        //System.out.println(Arrays.toString(arrChar));
        //将已生成的char数组，转换为String字串并返回给方法的调用者。
        String str = new String(arrChar);
        return str;
    }

    public static String verCode() {
        /*
         * 方法：
         * 如果要在一堆没有什么规律的数据中随机抽取；
         * 可以先把这些数据放到数组当中，再随机抽取一个索引。
         * */

        //1、大/小写字母都放到数组当中
        char[] chs = new char[52];
        for (int i = 0; i < chs.length; i++) {
            //ASCII码表
            if (i <= 25) {
                chs[i] = (char) (97 + i);
            } else {
                chs[i] = (char) (65 + i - 26);
            }
        }

        //定义一个字符串类型的变量，用来记录最张明的结果
        String result = "";

        //2、随机抽取4次
        Random r = new Random();
        for (int i = 0; i < 4; i++) {
            int randomIndex = r.nextInt(chs.length);
            result = result + chs[randomIndex];
        }

        //3、随机抽取一个数字0~9
        int number = r.nextInt(10);

        //生成最终的结果
        result = result + number;
        return result;
    }
}
