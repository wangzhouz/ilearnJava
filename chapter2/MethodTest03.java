package chapter2;

public class MethodTest03 {
    int storage(String s){
        return s.length() * 2;
    }

    public static void main(String[] args){
        MethodTest03 c  = new MethodTest03();
        System.out.println(c.storage("aBc"));
    }
}
