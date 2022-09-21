package a04polymorphismdemo1;

public class Test {
    public static void main(String[] args) {
        //1、定义第一位饲养员
        Breeder b1 = new Breeder("老王", 30);
//        System.out.println(b1.getName()+b1.getAge());

        //2、定义第二位饲养员
        Breeder b2 = new Breeder("老李", 35);
//        System.out.println(b2.getName()+b2.getAge());

        //3、定义一条狗
        Dog d = new Dog("狗", "黑", 2, "骨头");
//        d.lookHome();

        //4、定义一只猫
        Cat c = new Cat("猫", "灰", 3, "鱼");
//        c.catchMouse();

        b1.keepPet(b1,d);
        System.out.println("------------------------------------");
        b2.keepPet(b2,c);

//        d.eat(d.getFood());
//        c.eat(c.getFood());

        /*Animal x = new Dog();
        //Animal x = new Cat()
        if(x instanceof Dog ){
            Dog dd = (Dog)x;
            dd.lookHome();
        } else if (x instanceof Cat) {
            Cat cc = (Cat)x;
            cc.catchMouse();
        }else {
            System.out.println("没有这种动物");
        }*/

    }
}
