package myProgram;

import java.util.ArrayList;
import java.util.Scanner;

public class menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        ArrayList<student> resultList = new ArrayList<>();

        while (flag) {
            System.out.println("-----------------学生管理系统-----------------" + "\n" + "1:添加学生" +
                    "\n" + "2:删除学生" + "\n" + "3:修改学生" + "\n" + "4:查询学生" + "\n" + "5:退出系统" + "\n" + "请输入您的选择:");
            int number = sc.nextInt();
            if (number > 0 && number < 6) {
                switch (number) {
                    case 1:
                        System.out.println("添加学生");
                        resultList = add.addStudent(resultList);
                        break;
                    case 2:
                        System.out.println("删除学生");
                        delete.deleteStudent(resultList);
                        break;
                    case 3:
                        System.out.println("修改学生");
                        alter.alterStudent(resultList);
                        break;
                    case 4:
                        System.out.println("查询学生");
                        inquire.inquireStudent(resultList);
                        break;
                    case 5:
                        System.out.println("退出系统");
                        flag = false;
                }
            } else {
                System.out.println("***请输入菜单对应数字***");
            }
        }
    }
}
