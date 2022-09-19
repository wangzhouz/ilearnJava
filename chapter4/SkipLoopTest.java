package chapter4;

public class SkipLoopTest {
    public static void main(String[] args) {
        for (int i = 1; i <= 5  ; i++) {
            if(i == 3){
                //结束本次循环，继续下次循环。
                continue;
            }
            System.out.println("上老虎号第"+ i + "个包子");
        }
    }
}




