package a01polymorphismdemo1;

public class Test {
    public static void main(String[] args) {
        //创建3个对象，并调用register方法
        Student s  = new Student();
        s.setName("张三");
        s.setAge(18);

        Teacher t = new Teacher();
        t.setName("罗翔");
        t.setAge(40);

        Administrator admin = new Administrator();
        admin.setName("王五");
        admin.setAge(18);

        register(s);
        register(t);
        register(admin);
    }

    //要求这个方法即可以接收老师、又可以接收学生，还能接收管理员
    //只能把参数写成这3个类型的父类
    public static void register(Person p){
        p.show();
    }
}
