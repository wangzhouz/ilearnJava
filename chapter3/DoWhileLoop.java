package chapter3;

public class DoWhileLoop {
    public static void main(String[] args){
        int limit = 4;
        int sum = 0;
        int i = 1;

        do{
            sum += i;
            i++;
        }while(i<=limit);
        System.out.println("sum = " + sum);
    }
}
