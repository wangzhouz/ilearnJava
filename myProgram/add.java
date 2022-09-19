package myProgram;

import java.util.ArrayList;
import java.util.Scanner;

public class add {
    /*public static void main(String[] args) {
        ArrayList<student> test = addStudent();
        for (int i = 0; i < test.size(); i++) {
            student x = test.get(i);
            System.out.println(x.getId() + "," + x.getName() + "," + x.getAge() + "," + x.getAddress());
        }
        //System.out.println(test);
    }*/

    public static ArrayList<myProgram.student> addStudent(ArrayList<myProgram.student> resultList) {
        ArrayList<myProgram.student> temp = resultList;
        Scanner sc = new Scanner(System.in);
        System.out.println("-----------------添加学生，输入end结束-----------------");
        String[] stuDes = {"请输入学生ID", "请输入学生姓名", "请输入学生年龄", "请输入学生地址"};

        boolean flag = true;
        while (flag) {
            myProgram.student stu = new myProgram.student();
            for (int i = 0; i < stuDes.length; i++) {
                System.out.println(stuDes[i]);
                String x = sc.next();
                if (x.equals("end")) {
                    System.out.println("退出");
                    flag = false;
                    break;
                } else {
                    if (i == 0) {
                        String id = x;
                        stu.setId(id);
                    } else if (i == 1) {
                        String name = x;
                        stu.setName(name);
                    } else if (i == 2) {
                        String age = x;
                        stu.setAge(age);
                    } else {
                        String address = x;
                        stu.setAddress(address);
                        //只有把学生“ID”、“姓名”、“年龄”、“地址”都输入完整了，
                        // 才把这个学生加入到temp中。
                        temp.add(stu);
                        System.out.println(stu.getId()+":"+stu.getName()+",添加成功");
                    }
                }
            }
        }
        return temp;
    }
}
