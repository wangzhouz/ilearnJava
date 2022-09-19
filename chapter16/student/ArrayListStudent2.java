package chapter16.student;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListStudent2 {
    public static void main(String[] args) {
        ArrayList<student> list = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            student s = new student();
            System.out.println("请输入学生的姓名");
            String name = sc.next();
            System.out.println("请输入学生的年龄");
            int age = sc.nextInt();

            s.setName(name);
            s.setAge(age);

            list.add(s);
        }

        for (int i = 0; i < list.size(); i++) {
            student stu = list.get(i);
            System.out.println("学生：" + stu.getName() + ", " + stu.getAge());
        }
    }
}

