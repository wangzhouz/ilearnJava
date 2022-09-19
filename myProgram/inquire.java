package myProgram;

import java.util.ArrayList;
import java.util.Scanner;

public class inquire {
    public static void inquireStudent(ArrayList<student> resultList) {
        ArrayList<student> temp = resultList;
        Scanner sc = new Scanner(System.in);

        boolean flag = true;
        while (flag) {
            System.out.println("-----------------查询学生-----------------" +
                    "\n" + "1:查询学生" + "\n" + "2:退出");
            int number = sc.nextInt();
            if (number > 0 && number < 3) {
                switch (number) {
                    case 1:
                        /*System.out.println("id" + "\t" + "姓名" + "\t" + "年龄" + "\t" + "家庭地址");
                        for (int i = 0; i < temp.size(); i++) {
                            student x = temp.get(i);
                            System.out.println(x.getId() + "\t" + x.getName() +
                                    "\t" + x.getAge() + "\t" + x.getAddress());
                        }
                        break;*/
                        if (temp.isEmpty()) {
                            System.out.println("***当前无学生信息，请录入后查询***");
                        } else {
                            System.out.println("id" + "\t" + "姓名" + "\t" + "年龄" + "\t" + "家庭地址");
                            for (int i = 0; i < temp.size(); i++) {
                                student x = temp.get(i);
                                System.out.println(x.getId() + "\t" + x.getName() +
                                        "\t" + x.getAge() + "\t" + x.getAddress());
                            }
                        }
                        break;
                    case 2:
                        System.out.println("退出");
                        flag = false;
                        break;
                }
            } else {
                System.out.println("***请输入菜单对应数字***");
            }
        }
    }
}
