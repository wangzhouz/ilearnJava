package a01innerclassdemo1;

public class Car {
    String carName;
    int carAge;
    String carColor;

    public void show() {
        System.out.println(carName);
        //外部类要访问内部类的成员，必须阳建对象。
        //System.out.println(engineName);
        Engine e = new Engine();
        System.out.println(e.engineName);
    }

    class Engine {
        String engineName;
        int engineAge;

        public void show() {
            System.out.println(engineName);
            //内部类可以直接访问外部类的成员，包括私有。
            System.out.println(carName);
        }
    }
}
