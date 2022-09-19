package chapter2;

public class GirlFriendTest {
    public static void main(String[] args) {
        GirlFriend gf1 = new GirlFriend();
        gf1.setName("小诗诗");
        gf1.setAge(18);


        //写一个变量去接收gf1.setAge的赋值。
//        int g1Age = gf1.getAge();
        //或者直接打印
        System.out.println(gf1.getAge());
        System.out.println(gf1.getName());
    }
}
