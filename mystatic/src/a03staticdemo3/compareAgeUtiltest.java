package a03staticdemo3;

import java.util.ArrayList;

public class compareAgeUtiltest {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        Student stu1 = new Student("����",19,"Ů");
        Student stu2 = new Student("����",30,"��");
        Student stu3 = new Student("����",29,"��");
        list.add(stu1);
        list.add(stu2);
        list.add(stu3);

        int  maxAge = compareAgeUtil.compareAgeStu(list);
        System.out.println(maxAge);
    }
}
