package RegisterSystem;


import javax.security.auth.login.CredentialNotFoundException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import static RegisterSystem.RegisterSystem.checkChar;
import static RegisterSystem.RegisterSystem.checkNumber;

public class test {
    public static void main(String[] args) {
        /*String id = "34082619831023302x";
        System.out.println("身份证号码：" + id.length() + "," + id.charAt(id.length() - 1));
        if (id.charAt(0) != '0' && id.length() == 18) {
            if (checkNumber(id, 18)) {
                System.out.println("正确");
            } else if (checkNumber(id, 17)) {
                if (id.charAt(id.length() - 1) == 'x' | id.charAt(id.length() - 1) == 'X') {
                    System.out.println("最后一位正确");
                } else {
                    System.out.println("最后一个字符必须为x");
                }
            } else {
                System.out.println("前17位非数字");
            }
        } else {
            System.out.println("第1位不能为0或号码长度不足18位");
        }*/

        System.out.println(getCode());

    }


    /**
     * 只能是字母加数字的组合，但是不能是纯数字。
     */
    public static boolean testStr(String str) {
        int numCount = 0;
        for (int i = 0; i < str.length(); i++) {
            char symbol = str.charAt(i);
            if (symbol >= '0' && symbol <= '9') {
                numCount++;
                if (numCount == str.length()) {
                    System.out.println("用户名不能全是数字");
                    return false;
                }
                System.out.println(symbol);
            } else {
                if (symbol >= 'a' && symbol <= 'z') {
                    System.out.println(symbol);
                } else {
                    if (symbol >= 'A' && symbol <= 'Z') {
                        System.out.println(symbol);
                    } else {
                        System.out.println(symbol);
                        return false;
                    }
                }
            }
        }
        return true;
    }


    public static boolean checkStr(String str) {
        for (int i = 0; i < str.length(); i++) {
            char symbol = str.charAt(i);
            if (symbol >= '0' && symbol <= '9') {
                System.out.println(symbol);
            } else {
                if (symbol >= 'a' && symbol <= 'z') {
                    System.out.println(symbol);
                } else {
                    if (symbol >= 'A' && symbol <= 'Z') {
                        System.out.println(symbol);
                    } else {
                        System.out.println(symbol);
                        return false;
                    }
                }
            }
        }
        return true;
    }


    private static String getCode() {
        //1、创建一个集合添加所有的大写和小写字母
        ArrayList<Character> list = new ArrayList<>();
        for (int i = 0; i < 26; i++) {
            list.add((char) ('a' + i));
            list.add((char) ('A' + i));
        }
        //System.out.println(list);
        //[a, A, b, B, c, C, d, D, e, E, f, F, g, G, h, H, i, I, j, J, k, K, l, L, m, M,
        // n, N, o, O, p, P, q, Q, r, R, s, S, t, T, u, U, v, V, w, W, x, X, y, Y, z, Z]

        StringBuilder sb = new StringBuilder();
        //2、要随机抽取4个字符
        Random r = new Random();
        for (int i = 0; i < 4; i++) {
            //获取随机索引
            int index = r.nextInt(list.size());
            //利用随机索引获取字符
            char c = list.get(index);
            sb.append(c);
        }

        //3、把一个随机数字添加到末尾
        int number = r.nextInt(10);
        sb.append(number);
        //System.out.println(sb);

        //4、如果我们要修改字符串的内容
        //先把字符串变成字符数组，在数组中修改，然后再创建一个新的字符串
        char[] arr = sb.toString().toCharArray();
        //拿着最后一个索引，跟随机索引进行交换
        int randomIndex = r.nextInt(arr.length);
        //最大索引指向的元素，跟随机索引指向的元索交换
        char temp  = arr[randomIndex];
        arr[randomIndex] = arr[arr.length-1];
        arr[arr.length -1 ] = temp;

        return new String(arr);

    }
}


