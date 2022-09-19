package chapter5;

public class MethodDemon6 {
    public static void main(String[] args) {
        int value = sum(1,2);
        System.out.println(value);

        double value2 =sum(1,2.2,2);
        System.out.println(value2);
    }

    public static int sum(int a, int b){
        return a + b;
    }

    public static double sum( double a, double b, double c){
        return a + b + c;
    }
}
