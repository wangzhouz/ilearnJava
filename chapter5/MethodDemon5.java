package chapter5;

public class MethodDemon5 {
    public static void main(String[] args) {
        //目标：掌握带反馈值方法的定义和调用格式

        //直接调用
        getSum(10,20,30);

        //赋值调用
        double sum = getSum(1,2,300.2);
        System.out.println(sum);

        //输出调用
        System.out.println(getSum(10,200,3000));

        //先计算4个季度(sum1,sum2,sum3,sum4)的营业额
        double sum1 = getSum(10,20,30);
        double sum2 = getSum(40,50,60);
        double sum3 = getSum(70,80,90);
        double sum4 = getSum(100,110,120);

        //求全年的总营业额
        double sumSum = sum1+ sum2+sum3+sum4;
        System.out.println("全年的总营业额: " + sumSum);
    }

    public static double getSum(double num1, double num2, double num3){
        double result = num1 + num2 + num3;
        return result;//返回给方法的调用处。
    }
}
