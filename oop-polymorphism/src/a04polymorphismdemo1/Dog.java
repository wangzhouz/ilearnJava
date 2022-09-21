package a04polymorphismdemo1;

public class Dog extends Animal {
    public Dog() {
    }

    public Dog(String name, String color, int age, String food) {
        super(name, color, age, food);
    }

    public void lookHome() {
        System.out.println("狗在看家");
    }
}
