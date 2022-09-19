package myProgram;

import java.util.ArrayList;
import java.util.Scanner;

public class alter {
    public static ArrayList<myProgram.student> alterStudent(ArrayList<myProgram.student> resultList) {
        ArrayList<myProgram.student> temp = resultList;
        Scanner sc = new Scanner(System.in);
        String[] stuDes = {"请输入学生ID", "请输入学生姓名", "请输入学生年龄", "请输入学生地址"};

        boolean flag = true;
        while (flag) {
            System.out.println("-----------------修改学生信息-----------------" +
                    "\n" + "1:修改学生信息" + "\n" + "2:退出");
            int number = sc.nextInt();
            if (number > 0 && number < 3) {
                switch (number) {
                    case 1:
                        if (temp.isEmpty()) {
                            System.out.println("***当前无学生信息***");
                        } else {
                            System.out.println("输入学生ID修改信息");
                            String x = sc.next();
                            for (int i = 0; i < temp.size(); i++) {
                                if (temp.get(i).getId().equals(x)) {
                                    System.out.println("****学生id:" + temp.get(i).getId() + ",学生:" + temp.get(i).getName() + "****");
                                    myProgram.student stuTemp = new myProgram.student();
                                    for (int j = 0; j < stuDes.length; j++) {
                                        System.out.println(stuDes[j]);
                                        String z = sc.next();
                                        if (j == 0) {
                                            String id = z;
                                            stuTemp.setId(id);
                                        } else if (j == 1) {
                                            String name = z;
                                            stuTemp.setName(name);
                                        } else if (j == 2) {
                                            String age = z;
                                            stuTemp.setAge(age);
                                        } else {
                                            String address = z;
                                            stuTemp.setAddress(address);
                                        }
                                    }
                                    temp.set(i, stuTemp);
                                    System.out.println("学生信息修改成功");
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
