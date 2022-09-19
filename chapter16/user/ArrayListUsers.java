package chapter16.user;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListUsers {
    public static void main(String[] args) {
        ArrayList<user> listUser = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            user u = new user();
            System.out.println("请输入用户ID");
            int id = sc.nextInt();
            System.out.println("请输入用户姓名");
            String name = sc.next();
            System.out.println("请输入用户密码");
            String password = sc.next();

            u.setId(id);
            u.setName(name);
            u.setPassword(password);

            listUser.add(u);
        }

        System.out.println(findUsers(listUser, 2));
    }

    public static boolean findUsers(ArrayList<user> listUser, int id) {
        for (int i = 0; i < listUser.size(); i++) {
            user x = listUser.get(i);
            if (x.getId() == id) {
                System.out.println(x.getId() + ", " + x.getName() + ", " + x.getPassword());
                return true;
            }
        }
        return false;
    }
}
