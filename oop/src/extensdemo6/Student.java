package extensdemo6;

public class Student {
    String name;
    int age;
    String school;

    //需求：默认传智大学

    public Student(){
        //表示调用本类其他构造方法
        //细节：虚拟机就不会再添加super();
        this(null,0,"传智大学");
        //这里表示调用下面的带参Student(String name, int age, String school)方法
    }

    public Student(String name, int age, String school){
        this.name = name;
        this.age = age;
        this.school = school;
    }
}
