package chapter3;

public class Scope {
    public static void main(String[] args){
        int outer = 1;
        {
            int inner = 2;
            System.out.println("inner =" + inner);
            System.out.println("outer =" + outer);
        }

        int inner = 3;
        System.out.println("inner =" + inner);
        System.out.println("outer =" + outer);
    }
}
