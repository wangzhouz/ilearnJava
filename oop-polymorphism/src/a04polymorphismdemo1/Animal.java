package a04polymorphismdemo1;

public class Animal {
    private String name;
    private String color;
    private String food;
    private int age;

    public Animal() {
    }

    public Animal(String name, String color, int age, String food) {
        this.name = name;
        this.color = color;
        this.age = age;
        this.food = food;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void eat(String food) {
        System.out.println( "吃" +food);
    }
}
