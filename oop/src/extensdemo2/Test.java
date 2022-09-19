package extensdemo2;

public class Test {
    public static void main(String[] args) {
        //利用空参构造创建子类对象。
        Zi z1 = new Zi();

        //利用带参构造创建子类对象。
//        Zi z2 = new Zi("王舟"，18);//报错了。
    }
}

class Fu{
    String name;
    int age;

    public Fu(){
    }

    public Fu(String name, int age){
        this.name = name;
        this.age = age;
    }
}

class Zi extends Fu{
    public Zi(){
    }
}