package chapter4;

import java.util.Scanner;

/*
 * 根据不同的星期数，选择不同的活动；
 * 星期一：跑步；星期二：游泳；星期三：慢走；星期四：动感单车；星期五：拳击；星期六：爬山；
 * 星期日：好好吃一顿。
 * */
public class TestSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入今天是星期几：");
        int number = sc.nextInt();

        switch (number) {
            case 1:
                System.out.println("跑步");
                break;
            case 2:
                System.out.println("游泳");
                break;
            case 3:
                System.out.println("慢走");
                break;
            case 4:
                System.out.println("动感单车");
                break;
            case 5:
                System.out.println("拳击");
                break;
            case 6:
                System.out.println("爬山");
                break;
            case 7:
                System.out.println("好好吃一顿");
                break;
            default:
                System.out.println("没有这个星期");
                break;
        }
    }
}
