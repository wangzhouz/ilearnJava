package chapter9;


import java.util.Scanner;

/*
 * 需求：
 * 已知正确的用户名和密码，请用程序实现模拟用户登录。
 * 总共给3次机会，登录之后，给出相应的提示。
 * */
public class test4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = "wz";
        String passwd = "abcd123";

        //设置密码验证标记，如果要passwdFlag为true则表示用户名与密码验证通过
        boolean passwdFlag = false;
        int i = 0;
        while (true) {
            //如果passwdFlag为true就结束循环，否则继续。
            if (passwdFlag == true) {
                break;
            } else {
                System.out.println("请输入用户名");
                String userName = sc.next();
                if (name.equals(userName) == true) {
                    System.out.println("用户名" + userName + "正确，请输入密码");
                    while (true) {
                        String userPasswd = sc.next();
                        if (passwd.equals(userPasswd) == false) {
                            i++;
                            System.out.println("请重新输入密码" + "第" + (i) + "次");
                            if (i == 3) {
                                i = 0;
                                System.out.println("提示:密码由“abcd与123”组成");
                            }
                        } else {
                            System.out.println("账号密码正确");
                            passwdFlag = true;
                            break;
                        }
                    }
                } else {
                    System.out.println("用户名错误，请重新输入用户名");
                }
            }
        }
        System.out.println("······进入系统······");
    }
}
