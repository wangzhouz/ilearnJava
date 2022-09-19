package chapter3;

class Ball{
    float volume;
}

public class TestFloat {
    public static void main(String[] args){
        Ball b1 = new Ball();
        Ball b2 = new Ball();

        b1.volume = (float) Math.random();
        b2.volume = (float) Math.random();

        System.out.println("b1.volume= " + b1.volume + ", b2.volume= " + b2.volume);
    }
}
