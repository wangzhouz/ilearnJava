package chapter4;


import java.util.Scanner;

/*
 * 根据不同的分数送不同的礼物：
 * 95~100分，送自行车一辆；
 * 90~94分，游乐院玩一天；
 * 80~89分，送变形金刚一个；
 * 80分，揍一顿。
 * */
public class TestIfElse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入考试分数");
        double score = sc.nextDouble();

        //对异常数据进行判断校验
        //0~100合理数据
        if(score >0 && score <=100){
            if (score >= 95 && score <= 100) {
                System.out.println("考试分数" + score + "送自行车一辆");
            } else if (score >= 90 && score <= 94) {
                System.out.println("考试分数" + score + "游乐院玩一天");
            } else if (score >= 80 && score <= 89) {
                System.out.println("考试分数" + score + "送变形金刚一个");
            } else {
                System.out.println("考试分数" + score + "揍一顿");
            }
        }else {
            System.out.println("当前录入的成绩不合法");
        }

    }
}




