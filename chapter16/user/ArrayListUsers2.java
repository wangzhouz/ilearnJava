package chapter16.user;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListUsers2 {
    public static void main(String[] args) {
        ArrayList<user> listUser = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        user u1 = new user(3, "张三", "123");
        user u2 = new user(4, "李四", "456");
        user u3 = new user(5, "王五", "789");

        listUser.add(u1);
        listUser.add(u2);
        listUser.add(u3);

        /*for (int i = 0; i < listUser.size(); i++) {
            user x = listUser.get(i);
            System.out.println(x.getId() + ", " + x.getName() + ", " + x.getPassword());
        }*/

        System.out.println(getIndex(listUser, 5));
    }

    public static int getIndex(ArrayList<user> listUser, int id) {
        for (int i = 0; i < listUser.size(); i++) {
            user x = listUser.get(i);
            if (x.getId() == id) {
                return i;
            }
        }
        return -1;
    }
}
