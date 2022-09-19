package chapter4;

import java.util.Scanner;

public class UserSelect {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入1~4业务编号:" + "\n" + "1机票查询，" + "2机票预定，"+ "3机票改签，"+ "4退出服务");
        int userSelect = sc.nextInt();

        switch (userSelect){
            case 1:{
                System.out.println("机票查询");
                break;
            }
            case 2:{
                System.out.println("机票预定");
                break;
            }
            case 3:{
                System.out.println("机票改签");
                break;
            }
            default:{
                System.out.println("退出服务");
                break;
            }
        }
    }
}
