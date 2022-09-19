package chapter2.test2;

public class StudentTest {
    public static void main(String[] args) {
//        //创建对象
//        Student s  =  new Student();//调用的空参构造方法。
////        s.setName("WangZhou");
//        System.out.println(s.getName());//返回null
//
//        Student s1 = new Student("WangZhou", 18);//调用的带参构造方法。
//        System.out.println(s1.getName());
//        System.out.println(s1.getAge());

        Student stu1 = new Student();
        stu1.setName("阿强");
        Student stu2 = stu1;

        stu2.setName("阿珍");
        System.out.println(stu1.getName() + "..." + stu2.getName());

    }
}
