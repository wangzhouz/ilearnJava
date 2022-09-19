package myProgram;

import java.util.ArrayList;
import java.util.Scanner;

public class delete {
    public static ArrayList<myProgram.student> deleteStudent(ArrayList<student> resultList) {
        ArrayList<myProgram.student> temp = resultList;
        Scanner sc = new Scanner(System.in);

        boolean flag = true;
        while (flag) {
            System.out.println("-----------------删除学生-----------------" +
                    "\n" + "1:删除学生" + "\n" + "2:退出");
            int number = sc.nextInt();
            if (number > 0 && number < 3) {
                switch (number) {
                    case 1:
                        if (temp.isEmpty()) {
                            System.out.println("***当前无学生信息***");
                        } else {
                            System.out.println("输入要删除的学生ID");
                            String x = sc.next();
                            for (int i = 0; i < temp.size(); i++) {
                                if (temp.get(i).getId().equals(x)) {
                                    System.out.println("****删除id:" + temp.get(i).getId() + ",学生:" + temp.get(i).getName() + "****");
                                    temp.remove(i);
                                } else if (!temp.get(i).getId().equals(x) && i == temp.size() - 1) {
                                    System.out.println("***学生ID不存在***");
                                    break;
                                }
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
        return temp;
    }
}

