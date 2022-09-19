package chapter2;

public class MethodTest {
    public static void main(String[] args){
//        int a = 10;
//        int b = 20;
//        int c = a + b;
////        System.out.print(a + "+" + b + "=" +c);
//
//        int i1 = 50;
//        int i2 = 100;
//        int i3 = i1+i2;
//        System.out.println(i1 + "+" + i2 + "=" + i3);
        MethodTest.sumInt(10,20);
        MethodTest.sumInt(100, 50);
   }
    public static void sumInt(int a, int b){
        int c = a + b;
        System.out.println(a + "+" + b + "=" + c);
    }
}
