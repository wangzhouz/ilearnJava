package chapter4;

public class SkipLoopTest2 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            System.out.println("上老虎号第" + i + "个包子");
            if (i == 3) {
                //结束整个循环。
                break;
            }
        }
    }
}




