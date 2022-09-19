package chapter2;

//如何交换两个变量的值。
public class switchTest {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        /*
         * 先定义第三个变量temp，先定义temp等于a值（暂存）10:
         * 然后定义a等于b的值20；
         * 再然后定义b等于temp的值10；
         * */
        int temp;
        temp = a;
        a = b;
        b = temp;
        System.out.println("temp(a)=" + temp + "\na=" + a + "\nb=" + b);
        /*
         * temp(a)=10
         * a=20
         * b=10
         * */
    }
}





