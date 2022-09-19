package chapter16;

import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("AAA");
        list.add("BBB");
        list.add("CCC");
        list.add("DDD");

        System.out.print("[");
        for (int i = 0; i < list.size(); i++) {
            if(i == list.size() -1){
                System.out.print(list.get(i));
            }else {
                System.out.print(list.get(i) + ", ");
            }
        }
        System.out.println("]");
    }
}
