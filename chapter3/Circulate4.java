package chapter3;

public class Circulate4 {
    public static void main(String[] args){
        int limit = 5;
        int sum = 0;

        for(int i=1, j=0; i<=limit; ++i){
            sum +=i * j++;
//            System.out.println("i =" +i);
//            System.out.println("j =" +j);
        }
        System.out.println("sum = " + sum);
    }
}
