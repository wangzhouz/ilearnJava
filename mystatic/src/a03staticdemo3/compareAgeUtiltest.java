package a03staticdemo3;

import java.util.ArrayList;

public class compareAgeUtiltest {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        Student stu1 = new Student("张三",19,"女");
        Student stu2 = new Student("李四",30,"男");
        Student stu3 = new Student("王五",29,"男");
        list.add(stu1);
        list.add(stu2);
        list.add(stu3);

        int  maxAge = compareAgeUtil.compareAgeStu(list);
        System.out.println(maxAge);
    }
}
