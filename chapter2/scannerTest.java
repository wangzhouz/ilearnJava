package chapter2;
//1、导包
import java.util.Scanner;

public class scannerTest {
    public static void main(String[] args) {
        //2、创建对象，表示我现在准备要用Scanner这个对象。
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入第一个整数");
        //3、接收数据
        int number1 = sc.nextInt();

        System.out.println("请输入第二个整数");
        int number2 = sc.nextInt();
        System.out.println(number1+number2);
    }
}
