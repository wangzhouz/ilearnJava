package chapter2;

public class StudentTest {
    public static void main(String[] args){
        student student01 = new student();
        student01.no = 100;
        student01.name = "wangzhou";
        student01.age = 18;
        student01.address = "huji";

        student01.no = 200;
        System.out.println(student01.no);
    }
}
