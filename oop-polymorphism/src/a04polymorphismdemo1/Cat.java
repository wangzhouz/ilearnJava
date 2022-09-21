package a04polymorphismdemo1;

public class Cat extends Animal {
    public Cat() {
    }

    public Cat(String name, String color, int age, String food) {
        super(name, color, age, food);
    }

    public void catchMouse() {
        System.out.println("猫在抓老鼠");
    }
}
