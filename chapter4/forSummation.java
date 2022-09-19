package chapter4;

/*
* 求1~5的累加和。
* */
public class forSummation {
    public static void main(String[] args){
        int sum = 0;//成员变理

        //建议：如果写累加求和的变理，可以把变理定义在循环外面。
        for (int i = 1; i <=5 ; i++) {
            //i为局部变理
            sum = sum +i;//可简写sum +=i;
            System.out.println(sum);
        }
    }
}
