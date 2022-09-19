package chapter4;

import java.util.Scanner;

/*
 *假设某影院卖了100张票，票的序号为1~100。
 * 其中寄数票号坐左侧，偶数票号坐右侧。
 * 键盘上录入一个整数表示电影票的票号。
 * 根据不同的情况，给出不同的提示。
 * */
public class ChooseToSit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入电影票号");
        int ticket = sc.nextInt();

        if (ticket >= 1 && ticket <= 100) {
            if (ticket % 2 == 1) {
                System.out.println("电影票：" + ticket + "号" + "请坐左边");
            } else {
                System.out.println("电影票：" + ticket + "号" + "请坐右边");
            }
        }
    }
}



