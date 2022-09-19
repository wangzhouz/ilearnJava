package myProgram2;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        System.out.println("-----------------学生管理系统-----------------");
        System.out.println("1:添加学生");
        System.out.println("2:删除学生");
        System.out.println("3:修改学生");
        System.out.println("4:查询学生");
        System.out.println("5:退出系统");
        System.out.println("请输入您的选对");
        Scanner sc = new Scanner(System.in);
        String choose = sc.next();
        switch (choose) {
            case "1":
                System.out.println("添加学生");
            case "2":
                System.out.println("删除学生");
            case "3":
                System.out.println("修改学生");
            case "4":
                System.out.println("查询学生");
            case "5": {
                System.out.println("退出");
//                break loop;//第一种退出循环的方法
                //System.exit(0);//停止虚拟机运行
            }
            default:
                System.out.println("没有这个选项");
        }
    }
}
