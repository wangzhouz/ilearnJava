package a01abstractdemo1;

public class Test {
    public static void main(String[] args) {
        //抽象类不能创建对象。
        // Person p = new Person() ;

        Student s = new Student("王五", 18);
        System.out.println(s.getName() + "," + s.getAge());

    }
}
