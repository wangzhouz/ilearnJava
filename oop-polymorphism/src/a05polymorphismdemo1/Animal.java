package a05polymorphismdemo1;

public class Animal {
    /**
     * 属性：年龄、颜色
     * 行为：eat()
     * */
    private int age;
    private String color;

    public Animal() {
    }

    public Animal(int age, String color) {
        this.age = age;
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public  void eat(String something){
        System.out.println("动物在吃" + something);
    }

}
