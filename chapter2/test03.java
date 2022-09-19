package chapter2;

import java.util.Scanner;

public class test03 {
    public static void main(String[] args) {
//        int a = 10;
//        int b = 9;
//
//        //三元表达式
//        //如果a > b 为true，则将a=10赋值给max
//        int max = a > b  ? a : b;
//        System.out.println(max);

        Scanner tiger  = new Scanner(System.in);

        System.out.println("请输入第一只老虎的体重");
        int weight1 = tiger.nextInt();

        System.out.println("请输入第二只老虎的体重");
        int weight2 = tiger.nextInt();


//        boolean equ = weight1 == weight2 ? true : false;
//
//        if(equ == true){
//            System.out.println("老虎体重相同");
//        }else {
//            System.out.println("老虎体重不相同");
//        }
        String result = weight1 == weight2 ? "相同" : "不相同";
        System.out.print(result);
    }
}
