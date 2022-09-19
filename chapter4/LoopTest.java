package chapter4;

import java.util.Random;
import java.util.Scanner;

public class LoopTest {
    public static void main(String[] args) {
        Random r = new Random();
        int number = r.nextInt(100) + 1;

        Scanner sc = new Scanner(System.in);

        //计数器
        int count = 0;

        while (true) {
            System.out.println("请输入你要猜的数字");
            int guessNumber = sc.nextInt();

            count++;
            //增加一个保底机制，猜到第5次不管是什么数，都显法猜中了。
            if (count == 5) {
                System.out.println("猜中了");
                break;
            }

            if (guessNumber > number) {
                System.out.println("大了");
            } else if (guessNumber < number) {
                System.out.println("小了");
            } else {
                System.out.println("恭喜你猜中了");
                break;
            }
        }
    }
}



