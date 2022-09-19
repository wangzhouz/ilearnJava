package chapter3;
import java.util.*;

public class Bool {
    public static void main(String[] args){
        Random rand = new Random(47);
        //由Random.nextInet(100)产生0至100之间的一个值。
        int i = rand.nextInt(100);
        int j = rand.nextInt(100);

        System.out.println("i = " + i);
        System.out.println("j = " + j);
    }

}
