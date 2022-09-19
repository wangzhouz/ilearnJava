package chapter5;

public class MethodDemo3 {
    public static void main(String[] args) {
        /*
        * 需求：在方法里面定义2个变量并求和打印*/
//        getSum();
        getSum1(10,30);
    }

    public static void getSum(){
        int num1 = 10;
        int num2 = 20;

        int result = num1 + num2;
        System.out.println(result);
    }

    public static void getSum1(int num1val, int num2val){
//        int num1 = num1val;
//        int num2 = num2val;
//        int result = num1 + num2;
        int result = num1val + num2val;
        System.out.println(result);
    }
}
