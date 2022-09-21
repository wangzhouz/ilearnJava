package a03polymorphismdemo1;

public class Test {
    public static void main(String[] args) {
        //创建对象（多态方式）
        // Fu f = new Zi();
        Animal a = new Dog();
        a.eat();//狗吃骨头

        //多态的弊端：不能调用子类的特点功能
//        a.lookHome();

        //解决方案：变回子类型就可以了
        Dog d = (Dog)a;
        d.lookHome();

        //注意：如果我也不知道你创建的变量是什么类型，那我该转成什么？
        //可以先作一个判断
        if (a instanceof Dog) {
            Dog dd  = (Dog)a;
            dd.lookHome();
        }else if(a instanceof Cat){
            Cat c = (Cat) a;
            c.catchMouse();
        }else {
            System.out.println("没有这个动物");
        }
    }

}

class Animal {
    public void eat() {
        System.out.println("动物在吃东西");
    }
}

class Dog extends Animal {
    @Override
    public void eat() {
        System.out.println("狗吃骨头");
    }

    public void lookHome() {
        System.out.println("狗看家");
    }
}

class Cat extends Animal {
    @Override
    public void eat() {
        System.out.println("猫吃小鱼干");
    }

    public void catchMouse() {
        System.out.println("猫抓老鼠");
    }
}
