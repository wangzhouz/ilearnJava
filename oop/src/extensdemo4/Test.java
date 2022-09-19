package extensdemo4;

public class Test {
    public static void main(String[] args) {
//        Student s = new Student();
//        s.lunch();
        OverseasStudent os = new OverseasStudent();
        os.lunch();
    }
}

class Person {
    public void eat() {
        System.out.println("吃米饭，吃菜");
    }

    public void drink() {
        System.out.println("喝开水");
    }
}

class OverseasStudent extends Person{
    public void lunch(){
        this.eat();
        this.drink();

        super.eat();
        super.drink();
    }

    //注意：这里我们把父类的方法在子类中进行了重写。
    //应用场景：当父类中的方法，不能满足子类现在的需求时，我们就需要把这个方法重写。
    @Override
    public void eat() {
        System.out.println("吃面包");
    }

    @Override
    public void drink() {
        System.out.println("喝凉水");
    }
}

class Student extends Person {
    public void lunch() {
        //先在本类中查看eat和drink方法，就会调用子类，如果没有，
        //就会调用从父类中继承下来的eat和drink方法。
        eat();
        drink();

        //直接调用父类中的eat和drink方法
        super.eat();
        super.drink();
    }
}