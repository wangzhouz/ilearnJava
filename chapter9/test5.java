package chapter9;

import java.util.Scanner;

public class test5 {
    public static void main(String[] args) {
        //1、定我两个变量记录正确的用户和密码
        String rightUsername = "wz";
        String rightPassword = "12345";

        Scanner sc = new Scanner(System.in);
        //2、键盘录入用户名和密码
        for (int i = 0; i < 3; i++) {
            System.out.println("请输入用户名");
            String username = sc.next();
            System.out.println("请输入密码");
            String password = sc.next();

            //3、比较
            if (username.equals(rightUsername) && password.equals(rightPassword)) {
                System.out.println("用户登录成功");
                break;
            } else {
                if (i == 2) {
                    //最后一次机会输入错误时，提示账号被锁定
                    System.out.println("" + username + "被锁定，请联系客服：XXX-XXXX");

                } else {
                    System.out.print("用户登录失败，用户名或密码错误，你还剩下" + (2 - i) + "次机会");
                }
            }
        }
    }
}
