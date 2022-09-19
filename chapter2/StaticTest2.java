package chapter2;

public class StaticTest2 {

    static int i = 47;

    public static void main(String[] args){
//        Incrementable sf = new Incrementable();
//        sf.increment();

        Incrementable.increment();

    }
}

class Incrementable{
    static void increment(){
        StaticTest.i++;
        System.out.print(StaticTest.i++);
    }
}
