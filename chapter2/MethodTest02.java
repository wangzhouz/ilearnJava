package chapter2;

public class MethodTest02 {

    //静态方法（方法修饰符中有static关键字）
    public static int sumInt(int a, int b){
        return a + b;
    }

    public static void main(String[] args){
        int x = MethodTest02.sumInt(5,6);
        System.out.println(x);
    }

}
