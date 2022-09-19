package chapter3;

public class Circulate3 {
    public static void main(String[] args){
        int limit = 20;
        int sum  = 0;

        for (int i=1; i<=limit; ++i){
            sum += i;
        }
        System.out.print("sum = " + sum);
    }
}
