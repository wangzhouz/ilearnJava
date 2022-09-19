package chapter3;

import java.awt.*;
import java.util.Random;

public class Coin {
    public static void main(String[] args){
        Random rand = new Random();
//        int i =  rand.nextInt(10);
//
//        System.out.println(i);
//
//        if(i<5){
//            System.out.println("Coin heads");
//        }else{
//            System.out.println("tails");
//        }
        boolean flip = rand.nextBoolean();
        System.out.println("OUTCOME: ");
        System.out.println(flip ? "HEAD" : "TAIL");
    }
}
