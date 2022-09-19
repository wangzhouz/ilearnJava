package chapter5;

import java.net.SocketOption;

public class MethodDemo4 {
    public static void main(String[] args) {
        getSum(10,20);

        int a =1;
        int b =2;
        getSum(a,b);
    }

    public static void getSum(int num1, int num2){
        int result = num1 + num2;
        System.out.println(result);
    }
}
