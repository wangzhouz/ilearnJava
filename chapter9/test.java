package chapter9;

public class test {
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "abc";
        System.out.println(s1 == s2);//true

        String s3 = new String("abc");
        String s4 = new String("abc");
        System.out.println(s3 == s4);//false

        System.out.println(s3 == s1);//false

        System.out.println(1 % 10);
    }
}


