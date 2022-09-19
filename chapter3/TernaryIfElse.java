package chapter3;

import java.nio.charset.StandardCharsets;

public class TernaryIfElse {
    static int ternary(int i){
        return i < 10 ? i*100 : i*10;
    }

    static int standardIfLese(int i){
        if(i < 10)
            return i * 100;
        else
            return i * 10;
//        if(i <10){
//            return i*100;
//        }else{
//            return i*10;
//        }

        }

    public static void main(String[] args){
        System.out.println(ternary(9));
        System.out.println(ternary(10));
        System.out.println(standardIfLese(9));
        System.out.println(standardIfLese(10));
    }
}
