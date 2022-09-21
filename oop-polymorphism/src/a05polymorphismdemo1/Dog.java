package a05polymorphismdemo1;

public class Dog extends Animal {
    /**
     * 行为：
     * eat(String somehing)
     * lookHome(无参数)
     */

    public Dog() {
    }

    public Dog(int age, String color) {
        super(age, color);
    }

    @Override
    public void eat(String something) {
        System.out.println(getAge() + "岁的" + getColor() +
                "颜色狗两只前腿死死的抱住" + something + "猛吃。");
    }

    public void lookHome(){
        System.out.println("狗在看家");
    }

}
