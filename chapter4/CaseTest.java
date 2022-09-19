package chapter4;


import java.util.Scanner;

/*
*需求：键盘录入星期数，输出工作日、休息日。
* （1-5）工作日，（6-7）休息日
* */
public class CaseTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数表示星期");
        int week = sc.nextInt();

        switch (week){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:{
                System.out.println("工作日");
                break;
            }
            case 6:
            case 7:{
                System.out.println("休息日");
                break;
            }
        }
    }
}
