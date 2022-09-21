package a02abstractdemo1;

public class Test {
    public static void main(String[] args) {
        Forg f = new Forg("剑蛙",3);
        f.eat();
        f.drink();

        Dog d = new Dog("金毛",4);
        d.eat();
        d.drink();

        Sheep s = new Sheep("山羊",5);
        s.eat();
        s.drink();

    }
}
