package chapter3;

public class WhileLoop {
    public static void main(String[] args){
        int limit = 6;
        int sum = 0;
        int i = 1;

        while(i<=limit){
            sum += i++;
        }
        System.out.println("sum = " +sum);
    }
}
