package a04polymorphismdemo1;

public class Porson {
    private String name;
    private int age;

    public Porson() {
    }

    public Porson(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //需求：能否想办法在keepPet中调用子类特有方法?
    //狗：lookHome()，猫：catchMouse()
    public void keepPet(Porson p, Animal a) {
        String str = "";
        if (a instanceof Dog) {
            str = "两只前腿死死的抱住骨头猛吃。";
            Dog d = (Dog)a;
            d.lookHome();
        } else if (a instanceof Cat) {
            str = "咪着眼睛侧着头吃鱼。";
            Cat c = (Cat)a;
            c.catchMouse();
        } else {
            System.out.println("null");
        }
        System.out.println("年龄" + p.getAge() + "的" + p.getName() + "养了一只" +
                a.getColor() + "颜色的" + a.getAge() + "岁的" + a.getName());
        System.out.println(a.getAge() + "岁的" + a.getColor() + a.getName() + str);
    }

}
